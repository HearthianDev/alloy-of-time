package net.HearthianDev.alloyOfTime.utils.Initializers;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

import static net.HearthianDev.alloyOfTime.AlloyOfTime.MODID;


public class OreGeneration {
    public static final RegistryKey<PlacedFeature> ALUMINIUM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MODID,"ore_aluminium"));

    public static void initOreGeneration() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ALUMINIUM_ORE_PLACED_KEY);

    }
}
