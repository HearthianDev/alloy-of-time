package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Aluminium {
    public static final Item RAW_ALUMINIUM, ALUMINIUM_INGOT, ALUMINIUM_DUST;
    public static final Block ALUMINIUM_ORE, DEEPSLATE_ALUMINIUM_ORE, RAW_ALUMINIUM_BLOCK, ALUMINIUM_BLOCK;

    public static void init() {
        Register.item("raw_aluminium", RAW_ALUMINIUM);
        Register.item("aluminium_ingot", ALUMINIUM_INGOT);
        Register.item("aluminium_dust", ALUMINIUM_DUST);
        Register.blockItem("aluminium_ore", ALUMINIUM_ORE);
        Register.blockItem("deepslate_aluminium_ore", DEEPSLATE_ALUMINIUM_ORE);
        Register.blockItem("raw_aluminium_block", RAW_ALUMINIUM_BLOCK);
        Register.blockItem("aluminium_block", ALUMINIUM_BLOCK);
    }

    static {
        RAW_ALUMINIUM = new Item(new FabricItemSettings());
        ALUMINIUM_INGOT = new Item(new FabricItemSettings());
        ALUMINIUM_DUST = new Item(new FabricItemSettings());
        ALUMINIUM_ORE = new Block(FabricBlockSettings.create());
        DEEPSLATE_ALUMINIUM_ORE = new Block(FabricBlockSettings.create());
        RAW_ALUMINIUM_BLOCK = new Block(FabricBlockSettings.create());
        ALUMINIUM_BLOCK = new Block(FabricBlockSettings.create());
    }
}
