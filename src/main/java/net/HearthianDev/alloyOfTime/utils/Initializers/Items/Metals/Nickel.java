package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Nickel {
    public static final Item RAW_NICKEL, NICKEL_INGOT, NICKEL_DUST;
    public static final Block NICKEL_ORE, DEEPSLATE_NICKEL_ORE, RAW_NICKEL_BLOCK, NICKEL_BLOCK;

    public static void init() {
        Register.item("raw_nickel", RAW_NICKEL);
        Register.item("nickel_ingot", NICKEL_INGOT);
        Register.item("nickel_dust", NICKEL_DUST);
        Register.blockItem("nickel_ore", NICKEL_ORE);
        Register.blockItem("deepslate_nickel_ore", DEEPSLATE_NICKEL_ORE);
        Register.blockItem("raw_nickel_block", RAW_NICKEL_BLOCK);
        Register.blockItem("nickel_block", NICKEL_BLOCK);
    }

    static {
        RAW_NICKEL = new Item(new FabricItemSettings());
        NICKEL_INGOT = new Item(new FabricItemSettings());
        NICKEL_DUST = new Item(new FabricItemSettings());
        NICKEL_ORE = new Block(FabricBlockSettings.create());
        DEEPSLATE_NICKEL_ORE = new Block(FabricBlockSettings.create());
        RAW_NICKEL_BLOCK = new Block(FabricBlockSettings.create());
        NICKEL_BLOCK = new Block(FabricBlockSettings.create());
    }
}
