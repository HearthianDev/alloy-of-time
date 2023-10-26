package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Zinc {
    public static final Item RAW_ZINC, ZINC_INGOT, ZINC_DUST;
    public static final Block ZINC_ORE, DEEPSLATE_ZINC_ORE, RAW_ZINC_BLOCK, ZINC_BLOCK;

    public static void init() {
        Register.item("raw_zinc", RAW_ZINC);
        Register.item("zinc_ingot", ZINC_INGOT);
        Register.item("zinc_dust", ZINC_DUST);
        Register.blockItem("zinc_ore", ZINC_ORE);
        Register.blockItem("deepslate_zinc_ore", DEEPSLATE_ZINC_ORE);
        Register.blockItem("raw_zinc_block", RAW_ZINC_BLOCK);
        Register.blockItem("zinc_block", ZINC_BLOCK);
    }

    static {
        RAW_ZINC = new Item(new FabricItemSettings());
        ZINC_INGOT = new Item(new FabricItemSettings());
        ZINC_DUST = new Item(new FabricItemSettings());
        ZINC_ORE = new Block(FabricBlockSettings.create());
        DEEPSLATE_ZINC_ORE = new Block(FabricBlockSettings.create());
        RAW_ZINC_BLOCK = new Block(FabricBlockSettings.create());
        ZINC_BLOCK = new Block(FabricBlockSettings.create());
    }
}
