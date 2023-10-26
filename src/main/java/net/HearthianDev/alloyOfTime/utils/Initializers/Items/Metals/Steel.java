package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Steel {
    public static final Item STEEL_INGOT, STEEL_DUST;
    public static final Block STEEL_BLOCK;

    public static void init() {
        Register.item("steel_ingot", STEEL_INGOT);
        Register.item("steel_dust", STEEL_DUST);
        Register.blockItem("steel_block", STEEL_BLOCK);
    }

    static {
        STEEL_INGOT = new Item(new FabricItemSettings());
        STEEL_DUST = new Item(new FabricItemSettings());
        STEEL_BLOCK = new Block(FabricBlockSettings.create());
    }
}
