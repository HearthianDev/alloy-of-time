package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Cobalt {
    public static final Item RAW_COBALT, COBALT_INGOT, COBALT_DUST;
    public static final Block COBALT_ORE, DEEPSLATE_COBALT_ORE, RAW_COBALT_BLOCK, COBALT_BLOCK;

    public static void init() {
        Register.item("raw_cobalt", RAW_COBALT);
        Register.item("cobalt_ingot", COBALT_INGOT);
        Register.item("cobalt_dust", COBALT_DUST);
        Register.blockItem("cobalt_ore", COBALT_ORE);
        Register.blockItem("deepslate_cobalt_ore", DEEPSLATE_COBALT_ORE);
        Register.blockItem("raw_cobalt_block", RAW_COBALT_BLOCK);
        Register.blockItem("cobalt_block", COBALT_BLOCK);
    }

    static {
        RAW_COBALT = new Item(new FabricItemSettings());
        COBALT_INGOT = new Item(new FabricItemSettings());
        COBALT_DUST = new Item(new FabricItemSettings());
        COBALT_ORE = new Block(FabricBlockSettings.create());
        DEEPSLATE_COBALT_ORE = new Block(FabricBlockSettings.create());
        RAW_COBALT_BLOCK = new Block(FabricBlockSettings.create());
        COBALT_BLOCK = new Block(FabricBlockSettings.create());
    }
}
