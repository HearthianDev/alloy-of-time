package net.HearthianDev.alloyOfTime;

import net.fabricmc.api.ModInitializer;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.HearthianDev.alloyOfTime.utils.Initializer.*;

public class AlloyOfTime implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MODID = "alloyoftime";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		initItems();
		initBlocks();
		Registry.register(Registries.ITEM_GROUP, new Identifier(MODID, "alloyoftime"), ITEM_GROUP);
	}
}
