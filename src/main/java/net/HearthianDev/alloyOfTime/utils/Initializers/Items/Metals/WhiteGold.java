package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class WhiteGold {
    public static final Item WHITE_GOLD_INGOT, WHITE_GOLD_DUST;
    public static final Block WHITE_GOLD_BLOCK;

    public static void init() {
        Register.item("white_gold_ingot", WHITE_GOLD_INGOT);
        Register.item("white_gold_dust", WHITE_GOLD_DUST);
        Register.blockItem("white_gold_block", WHITE_GOLD_BLOCK);
    }

    static {
        WHITE_GOLD_INGOT = new Item(new FabricItemSettings());
        WHITE_GOLD_DUST = new Item(new FabricItemSettings());
        WHITE_GOLD_BLOCK = new Block(FabricBlockSettings.create());
    }
}
