package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Bronze {
    public static final Item BRONZE_INGOT, BRONZE_DUST;
    public static final Block BRONZE_BLOCK;

    public static void init() {
        Register.item("bronze_ingot", BRONZE_INGOT);
        Register.item("bronze_dust", BRONZE_DUST);
        Register.blockItem("bronze_block", BRONZE_BLOCK);
    }

    static {
        BRONZE_INGOT = new Item(new FabricItemSettings());
        BRONZE_DUST = new Item(new FabricItemSettings());
        BRONZE_BLOCK = new Block(FabricBlockSettings.create());
    }
}
