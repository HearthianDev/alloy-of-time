package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Invar {
    public static final Item INVAR_INGOT, INVAR_DUST;
    public static final Block INVAR_BLOCK;

    public static void init() {
        Register.item("invar_ingot", INVAR_INGOT);
        Register.item("invar_dust", INVAR_DUST);
        Register.blockItem("invar_block", INVAR_BLOCK);
    }

    static {
        INVAR_INGOT = new Item(new FabricItemSettings());
        INVAR_DUST = new Item(new FabricItemSettings());
        INVAR_BLOCK = new Block(FabricBlockSettings.create());
    }
}
