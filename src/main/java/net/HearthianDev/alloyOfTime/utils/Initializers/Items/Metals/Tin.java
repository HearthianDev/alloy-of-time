package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Tin {
    public static final Item RAW_TIN, TIN_INGOT, TIN_DUST;
    public static final Block TIN_ORE, DEEPSLATE_TIN_ORE, RAW_TIN_BLOCK, TIN_BLOCK;

    public static void init() {
        Register.item("raw_tin", RAW_TIN);
        Register.item("tin_ingot", TIN_INGOT);
        Register.item("tin_dust", TIN_DUST);
        Register.blockItem("tin_ore", TIN_ORE);
        Register.blockItem("deepslate_tin_ore", DEEPSLATE_TIN_ORE);
        Register.blockItem("raw_tin_block", RAW_TIN_BLOCK);
        Register.blockItem("tin_block", TIN_BLOCK);
    }

    static {
        RAW_TIN = new Item(new FabricItemSettings());
        TIN_INGOT = new Item(new FabricItemSettings());
        TIN_DUST = new Item(new FabricItemSettings());
        TIN_ORE = new Block(FabricBlockSettings.create());
        DEEPSLATE_TIN_ORE = new Block(FabricBlockSettings.create());
        RAW_TIN_BLOCK = new Block(FabricBlockSettings.create());
        TIN_BLOCK = new Block(FabricBlockSettings.create());
    }
}
