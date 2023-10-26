package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Brass {
    public static final Item BRASS_INGOT, BRASS_DUST;
    public static final Block BRASS_BLOCK;

    public static void init() {
        Register.item("brass_ingot", BRASS_INGOT);
        Register.item("brass_dust", BRASS_DUST);
        Register.blockItem("brass_block", BRASS_BLOCK);
    }

    static {
        BRASS_INGOT = new Item(new FabricItemSettings());
        BRASS_DUST = new Item(new FabricItemSettings());
        BRASS_BLOCK = new Block(FabricBlockSettings.create());
    }
}
