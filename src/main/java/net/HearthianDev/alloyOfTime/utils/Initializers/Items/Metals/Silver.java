package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Silver {
    public static final Item RAW_SILVER, SILVER_INGOT, SILVER_DUST;
    public static final Block SILVER_ORE, DEEPSLATE_SILVER_ORE, RAW_SILVER_BLOCK, SILVER_BLOCK;

    public static void init() {
        Register.item("raw_silver", RAW_SILVER);
        Register.item("silver_ingot", SILVER_INGOT);
        Register.item("silver_dust", SILVER_DUST);
        Register.blockItem("silver_ore", SILVER_ORE);
        Register.blockItem("deepslate_silver_ore", DEEPSLATE_SILVER_ORE);
        Register.blockItem("raw_silver_block", RAW_SILVER_BLOCK);
        Register.blockItem("silver_block", SILVER_BLOCK);
    }

    static {
        RAW_SILVER = new Item(new FabricItemSettings());
        SILVER_INGOT = new Item(new FabricItemSettings());
        SILVER_DUST = new Item(new FabricItemSettings());
        SILVER_ORE = new Block(FabricBlockSettings.create());
        DEEPSLATE_SILVER_ORE = new Block(FabricBlockSettings.create());
        RAW_SILVER_BLOCK = new Block(FabricBlockSettings.create());
        SILVER_BLOCK = new Block(FabricBlockSettings.create());
    }
}
