package net.HearthianDev.alloyOfTime;

import net.HearthianDev.alloyOfTime.Interfaces.AotPlayer;
import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.*;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.HearthianDev.alloyOfTime.utils.Initializers.CreativeInventory.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.OreGeneration.initOreGeneration;

public class AlloyOfTime implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MODID = "alloyoftime";

	public static final Identifier DEBUG_LOG = new Identifier(MODID, "initial_sync");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Aluminium.init();
		Brass.init();
		Bronze.init();
		Cobalt.init();
		Copper.init();
		Electrum.init();
		Gold.init();
		Invar.init();
		Iron.init();
		Lead.init();
		Nickel.init();
		Platinum.init();
		Silver.init();
		Steel.init();
		Tin.init();
		WhiteGold.init();
		Zinc.init();

		initOreGeneration();

		Registry.register(Registries.ITEM_GROUP, new Identifier(MODID, "alloyoftime"), ITEM_GROUP);

		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			PacketByteBuf data = PacketByteBufs.create();
			data.writeInt(((AotPlayer) handler.getPlayer()).aot_initPlayer());
			data.writeBoolean(((AotPlayer) handler.getPlayer()).aot_hasAwaken());
			server.execute(() -> ServerPlayNetworking.send(handler.getPlayer(), DEBUG_LOG, data));
		});
	}
}
