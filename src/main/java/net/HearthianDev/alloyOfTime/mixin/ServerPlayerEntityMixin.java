package net.HearthianDev.alloyOfTime.mixin;

import com.mojang.authlib.GameProfile;
import net.HearthianDev.alloyOfTime.Interfaces.AotPlayer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Optional;
import java.util.Random;

@Mixin(ServerPlayerEntity.class)
public class ServerPlayerEntityMixin extends PlayerEntity implements AotPlayer {
	@Unique
	private Integer metal;
	@Unique
	private Boolean awaken = false;

	@Unique
	Random random = new Random();

	public ServerPlayerEntityMixin(World world, BlockPos pos, float yaw, GameProfile gameProfile) {
		super(world, pos, yaw, gameProfile);
	}

	@Inject(method = "writeCustomDataToNbt", at = @At("TAIL"))
	private void writeCustomDataToNbtMixin(NbtCompound tag, CallbackInfo ci) {
		NbtCompound metalTag = new NbtCompound();
		if (aot_getMetal().isPresent()) {
			metalTag.putInt("metal", this.metal);
		}
		metalTag.putBoolean("awaken", this.awaken);

		tag.put("alloyoftime", metalTag);

	}

	@Inject(method = "readCustomDataFromNbt", at = @At("TAIL"))
	private void readCustomDataFromNbtMixin(NbtCompound tag, CallbackInfo ci) {
		NbtCompound metalTag = tag.getCompound("alloyoftime");
		this.metal = metalTag.contains("metal") ? metalTag.getInt("metal") : null;
		this.awaken = metalTag.contains("awaken") && metalTag.getBoolean("awaken");
	}

	@Unique
	private Optional<Integer> aot_getMetal() {
		return Optional.ofNullable(this.metal);
	}

	@Override
	public Integer aot_initPlayer() {
		if (this.metal == null) {
			this.metal = random.nextInt(3);
			this.awaken = false;
		}

		return this.metal;
	}

	@Override
	public Boolean aot_hasAwaken() {
		return this.awaken;
	}

	@Override
	public void aot_awaken() {
		this.awaken = true;
	}

	@Shadow
	public boolean isSpectator() {
		return false;
	}

	@Shadow
	public boolean isCreative() {
		return false;
	}
}