package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Platinum {
    public static final Item RAW_PLATINUM, PLATINUM_INGOT, PLATINUM_DUST;
    public static final Block PLATINUM_ORE, DEEPSLATE_PLATINUM_ORE, RAW_PLATINUM_BLOCK, PLATINUM_BLOCK;

    public static void init() {
        Register.item("raw_platinum", RAW_PLATINUM);
        Register.item("platinum_ingot", PLATINUM_INGOT);
        Register.item("platinum_dust", PLATINUM_DUST);
        Register.blockItem("platinum_ore", PLATINUM_ORE);
        Register.blockItem("deepslate_platinum_ore", DEEPSLATE_PLATINUM_ORE);
        Register.blockItem("raw_platinum_block", RAW_PLATINUM_BLOCK);
        Register.blockItem("platinum_block", PLATINUM_BLOCK);
    }

    static {
        RAW_PLATINUM = new Item(new FabricItemSettings());
        PLATINUM_INGOT = new Item(new FabricItemSettings());
        PLATINUM_DUST = new Item(new FabricItemSettings());
        PLATINUM_ORE = new Block(FabricBlockSettings.create());
        DEEPSLATE_PLATINUM_ORE = new Block(FabricBlockSettings.create());
        RAW_PLATINUM_BLOCK = new Block(FabricBlockSettings.create());
        PLATINUM_BLOCK = new Block(FabricBlockSettings.create());
    }
}
