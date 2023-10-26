package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Electrum {
    public static final Item ELECTRUM_INGOT, ELECTRUM_DUST;
    public static final Block ELECTRUM_BLOCK;

    public static void init() {
        Register.item("electrum_ingot", ELECTRUM_INGOT);
        Register.item("electrum_dust", ELECTRUM_DUST);
        Register.blockItem("electrum_block", ELECTRUM_BLOCK);
    }

    static {
        ELECTRUM_INGOT = new Item(new FabricItemSettings());
        ELECTRUM_DUST = new Item(new FabricItemSettings());
        ELECTRUM_BLOCK = new Block(FabricBlockSettings.create());
    }
}
