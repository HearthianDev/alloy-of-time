package net.HearthianDev.alloyOfTime.mixin;

import net.HearthianDev.alloyOfTime.Interfaces.AotPlayer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    @Shadow
    public ItemStack getStackInHand(Hand hand) {
        return null;
    }

    @Inject(method = "tryUseTotem", at = @At("HEAD"))
    public void awaken(DamageSource source, CallbackInfoReturnable<Boolean> cir) {
        ItemStack itemStack = null;

        for (Hand hand : Hand.values()) {
            ItemStack itemStack2 = this.getStackInHand(hand);
            if (!itemStack2.isOf(Items.TOTEM_OF_UNDYING)) continue;
            itemStack = itemStack2.copy();
            break;
        }

        if (itemStack != null && !((AotPlayer) this).aot_hasAwaken()) {
            ((AotPlayer) this).aot_awaken();
        }
    }
}
