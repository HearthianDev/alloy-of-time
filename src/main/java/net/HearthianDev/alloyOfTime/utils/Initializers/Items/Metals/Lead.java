package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Lead {
    public static final Item RAW_LEAD, LEAD_INGOT, LEAD_DUST;
    public static final Block LEAD_ORE, DEEPSLATE_LEAD_ORE, RAW_LEAD_BLOCK, LEAD_BLOCK;

    public static void init() {
        Register.item("raw_lead", RAW_LEAD);
        Register.item("lead_ingot", LEAD_INGOT);
        Register.item("lead_dust", LEAD_DUST);
        Register.blockItem("lead_ore", LEAD_ORE);
        Register.blockItem("deepslate_lead_ore", DEEPSLATE_LEAD_ORE);
        Register.blockItem("raw_lead_block", RAW_LEAD_BLOCK);
        Register.blockItem("lead_block", LEAD_BLOCK);
    }

    static {
        RAW_LEAD = new Item(new FabricItemSettings());
        LEAD_INGOT = new Item(new FabricItemSettings());
        LEAD_DUST = new Item(new FabricItemSettings());
        LEAD_ORE = new Block(FabricBlockSettings.create());
        DEEPSLATE_LEAD_ORE = new Block(FabricBlockSettings.create());
        RAW_LEAD_BLOCK = new Block(FabricBlockSettings.create());
        LEAD_BLOCK = new Block(FabricBlockSettings.create());
    }
}
