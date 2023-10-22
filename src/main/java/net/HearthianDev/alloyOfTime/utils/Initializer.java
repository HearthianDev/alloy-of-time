package net.HearthianDev.alloyOfTime.utils;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import static net.HearthianDev.alloyOfTime.AlloyOfTime.MODID;

public class Initializer {
    public static final Item RAW_TIN,
        RAW_ALUMINIUM,
        RAW_LEAD,
        RAW_COBALT,
        RAW_PLATINUM,
        RAW_NICKEL,
        RAW_ZINC,
        RAW_SILVER,
        TIN_INGOT,
        ALUMINIUM_INGOT,
        LEAD_INGOT,
        COBALT_INGOT,
        PLATINUM_INGOT,
        NICKEL_INGOT,
        ZINC_INGOT,
        SILVER_INGOT,
        STEEL_INGOT,
        BRASS_INGOT,
        BRONZE_INGOT,
        WHITE_GOLD_INGOT,
        ELECTRUM_INGOT,
        INVAR_INGOT,
        TIN_DUST,
        ALUMINIUM_DUST,
        LEAD_DUST,
        COBALT_DUST,
        PLATINUM_DUST,
        NICKEL_DUST,
        ZINC_DUST,
        SILVER_DUST,
        STEEL_DUST,
        BRASS_DUST,
        BRONZE_DUST,
        WHITE_GOLD_DUST,
        ELECTRUM_DUST,
        INVAR_DUST,
        IRON_DUST,
        GOLD_DUST,
        COPPER_DUST;

    public static final Block TIN_ORE,
        ALUMINIUM_ORE,
        LEAD_ORE,
        COBALT_ORE,
        PLATINUM_ORE,
        NICKEL_ORE,
        ZINC_ORE,
        SILVER_ORE,
        DEEPSLATE_TIN_ORE,
        DEEPSLATE_ALUMINIUM_ORE,
        DEEPSLATE_LEAD_ORE,
        DEEPSLATE_COBALT_ORE,
        DEEPSLATE_PLATINUM_ORE,
        DEEPSLATE_NICKEL_ORE,
        DEEPSLATE_ZINC_ORE,
        DEEPSLATE_SILVER_ORE,
        RAW_TIN_BLOCK,
        RAW_ALUMINIUM_BLOCK,
        RAW_LEAD_BLOCK,
        RAW_COBALT_BLOCK,
        RAW_PLATINUM_BLOCK,
        RAW_NICKEL_BLOCK,
        RAW_ZINC_BLOCK,
        RAW_SILVER_BLOCK,
        TIN_BLOCK,
        ALUMINIUM_BLOCK,
        LEAD_BLOCK,
        COBALT_BLOCK,
        PLATINUM_BLOCK,
        NICKEL_BLOCK,
        ZINC_BLOCK,
        SILVER_BLOCK,
        STEEL_BLOCK,
        BRASS_BLOCK,
        BRONZE_BLOCK,
        WHITE_GOLD_BLOCK,
        ELECTRUM_BLOCK,
        INVAR_BLOCK;

    public static final ItemGroup ITEM_GROUP;

    private static void registerItem(String path, Item item) {
        Registry.register(Registries.ITEM, new Identifier(MODID, path), item);
    }
    private static void registerBlockItem(String path, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(MODID, path), block);
        registerItem(path, new BlockItem(block, new Item.Settings()));
    }

    public static void initItems() {
        registerItem("raw_tin", RAW_TIN);
        registerItem("raw_aluminium", RAW_ALUMINIUM);
        registerItem("raw_lead", RAW_LEAD);
        registerItem("raw_cobalt", RAW_COBALT);
        registerItem("raw_platinum", RAW_PLATINUM);
        registerItem("raw_nickel", RAW_NICKEL);
        registerItem("raw_zinc", RAW_ZINC);
        registerItem("raw_silver", RAW_SILVER);
        registerItem("tin_ingot", TIN_INGOT);
        registerItem("aluminium_ingot", ALUMINIUM_INGOT);
        registerItem("lead_ingot", LEAD_INGOT);
        registerItem("cobalt_ingot", COBALT_INGOT);
        registerItem("platinum_ingot", PLATINUM_INGOT);
        registerItem("nickel_ingot", NICKEL_INGOT);
        registerItem("zinc_ingot", ZINC_INGOT);
        registerItem("silver_ingot", SILVER_INGOT);
        registerItem("steel_ingot", STEEL_INGOT);
        registerItem("brass_ingot", BRASS_INGOT);
        registerItem("bronze_ingot", BRONZE_INGOT);
        registerItem("white_gold_ingot", WHITE_GOLD_INGOT);
        registerItem("electrum_ingot", ELECTRUM_INGOT);
        registerItem("invar_ingot", INVAR_INGOT);
        registerItem("tin_dust", TIN_DUST);
        registerItem("aluminium_dust", ALUMINIUM_DUST);
        registerItem("lead_dust", LEAD_DUST);
        registerItem("cobalt_dust", COBALT_DUST);
        registerItem("platinum_dust", PLATINUM_DUST);
        registerItem("nickel_dust", NICKEL_DUST);
        registerItem("zinc_dust", ZINC_DUST);
        registerItem("silver_dust", SILVER_DUST);
        registerItem("steel_dust", STEEL_DUST);
        registerItem("brass_dust", BRASS_DUST);
        registerItem("bronze_dust", BRONZE_DUST);
        registerItem("white_gold_dust", WHITE_GOLD_DUST);
        registerItem("electrum_dust", ELECTRUM_DUST);
        registerItem("invar_dust", INVAR_DUST);
        registerItem("iron_dust", IRON_DUST);
        registerItem("gold_dust", GOLD_DUST);
        registerItem("copper_dust", COPPER_DUST);
    }

    public static void initBlocks() {
        registerBlockItem("tin_ore", TIN_ORE);
        registerBlockItem("aluminium_ore", ALUMINIUM_ORE);
        registerBlockItem("lead_ore", LEAD_ORE);
        registerBlockItem("cobalt_ore", COBALT_ORE);
        registerBlockItem("platinum_ore", PLATINUM_ORE);
        registerBlockItem("nickel_ore", NICKEL_ORE);
        registerBlockItem("zinc_ore", ZINC_ORE);
        registerBlockItem("silver_ore", SILVER_ORE);
        registerBlockItem("deepslate_tin_ore", DEEPSLATE_TIN_ORE);
        registerBlockItem("deepslate_aluminium_ore", DEEPSLATE_ALUMINIUM_ORE);
        registerBlockItem("deepslate_lead_ore", DEEPSLATE_LEAD_ORE);
        registerBlockItem("deepslate_cobalt_ore", DEEPSLATE_COBALT_ORE);
        registerBlockItem("deepslate_platinum_ore", DEEPSLATE_PLATINUM_ORE);
        registerBlockItem("deepslate_nickel_ore", DEEPSLATE_NICKEL_ORE);
        registerBlockItem("deepslate_zinc_ore", DEEPSLATE_ZINC_ORE);
        registerBlockItem("deepslate_silver_ore", DEEPSLATE_SILVER_ORE);
        registerBlockItem("raw_tin_block", RAW_TIN_BLOCK);
        registerBlockItem("raw_aluminium_block", RAW_ALUMINIUM_BLOCK);
        registerBlockItem("raw_lead_block", RAW_LEAD_BLOCK);
        registerBlockItem("raw_cobalt_block", RAW_COBALT_BLOCK);
        registerBlockItem("raw_platinum_block", RAW_PLATINUM_BLOCK);
        registerBlockItem("raw_nickel_block", RAW_NICKEL_BLOCK);
        registerBlockItem("raw_zinc_block", RAW_ZINC_BLOCK);
        registerBlockItem("raw_silver_block", RAW_SILVER_BLOCK);
        registerBlockItem("tin_block", TIN_BLOCK);
        registerBlockItem("aluminium_block", ALUMINIUM_BLOCK);
        registerBlockItem("lead_block", LEAD_BLOCK);
        registerBlockItem("cobalt_block", COBALT_BLOCK);
        registerBlockItem("platinum_block", PLATINUM_BLOCK);
        registerBlockItem("nickel_block", NICKEL_BLOCK);
        registerBlockItem("zinc_block", ZINC_BLOCK);
        registerBlockItem("silver_block", SILVER_BLOCK);
        registerBlockItem("steel_block", STEEL_BLOCK);
        registerBlockItem("brass_block", BRASS_BLOCK);
        registerBlockItem("bronze_block", BRONZE_BLOCK);
        registerBlockItem("white_gold_block", WHITE_GOLD_BLOCK);
        registerBlockItem("electrum_block", ELECTRUM_BLOCK);
        registerBlockItem("invar_block", INVAR_BLOCK);
    }

    private static void addEntry(ItemGroup.DisplayContext displayContext, ItemGroup.@NotNull Entries entries) {
        entries.add(RAW_TIN);
        entries.add(RAW_ALUMINIUM);
        entries.add(RAW_LEAD);
        entries.add(RAW_COBALT);
        entries.add(RAW_PLATINUM);
        entries.add(RAW_NICKEL);
        entries.add(RAW_ZINC);
        entries.add(RAW_SILVER);
        entries.add(TIN_INGOT);
        entries.add(ALUMINIUM_INGOT);
        entries.add(LEAD_INGOT);
        entries.add(COBALT_INGOT);
        entries.add(PLATINUM_INGOT);
        entries.add(NICKEL_INGOT);
        entries.add(ZINC_INGOT);
        entries.add(SILVER_INGOT);
        entries.add(STEEL_INGOT);
        entries.add(BRASS_INGOT);
        entries.add(BRONZE_INGOT);
        entries.add(WHITE_GOLD_INGOT);
        entries.add(ELECTRUM_INGOT);
        entries.add(INVAR_INGOT);
        entries.add(TIN_DUST);
        entries.add(ALUMINIUM_DUST);
        entries.add(LEAD_DUST);
        entries.add(COBALT_DUST);
        entries.add(PLATINUM_DUST);
        entries.add(NICKEL_DUST);
        entries.add(ZINC_DUST);
        entries.add(SILVER_DUST);
        entries.add(STEEL_DUST);
        entries.add(BRASS_DUST);
        entries.add(BRONZE_DUST);
        entries.add(WHITE_GOLD_DUST);
        entries.add(ELECTRUM_DUST);
        entries.add(INVAR_DUST);
        entries.add(IRON_DUST);
        entries.add(GOLD_DUST);
        entries.add(COPPER_DUST);

        entries.add(TIN_ORE);
        entries.add(ALUMINIUM_ORE);
        entries.add(LEAD_ORE);
        entries.add(COBALT_ORE);
        entries.add(PLATINUM_ORE);
        entries.add(NICKEL_ORE);
        entries.add(ZINC_ORE);
        entries.add(SILVER_ORE);
        entries.add(DEEPSLATE_TIN_ORE);
        entries.add(DEEPSLATE_ALUMINIUM_ORE);
        entries.add(DEEPSLATE_LEAD_ORE);
        entries.add(DEEPSLATE_COBALT_ORE);
        entries.add(DEEPSLATE_PLATINUM_ORE);
        entries.add(DEEPSLATE_NICKEL_ORE);
        entries.add(DEEPSLATE_ZINC_ORE);
        entries.add(DEEPSLATE_SILVER_ORE);
        entries.add(RAW_TIN_BLOCK);
        entries.add(RAW_ALUMINIUM_BLOCK);
        entries.add(RAW_LEAD_BLOCK);
        entries.add(RAW_COBALT_BLOCK);
        entries.add(RAW_PLATINUM_BLOCK);
        entries.add(RAW_NICKEL_BLOCK);
        entries.add(RAW_ZINC_BLOCK);
        entries.add(RAW_SILVER_BLOCK);
        entries.add(TIN_BLOCK);
        entries.add(ALUMINIUM_BLOCK);
        entries.add(LEAD_BLOCK);
        entries.add(COBALT_BLOCK);
        entries.add(PLATINUM_BLOCK);
        entries.add(NICKEL_BLOCK);
        entries.add(ZINC_BLOCK);
        entries.add(SILVER_BLOCK);
        entries.add(STEEL_BLOCK);
        entries.add(BRASS_BLOCK);
        entries.add(BRONZE_BLOCK);
        entries.add(WHITE_GOLD_BLOCK);
        entries.add(ELECTRUM_BLOCK);
        entries.add(INVAR_BLOCK);
    }

    static {
        RAW_TIN = new Item(new FabricItemSettings());
        RAW_ALUMINIUM = new Item(new FabricItemSettings());
        RAW_LEAD = new Item(new FabricItemSettings());
        RAW_COBALT = new Item(new FabricItemSettings());
        RAW_PLATINUM = new Item(new FabricItemSettings());
        RAW_NICKEL = new Item(new FabricItemSettings());
        RAW_ZINC = new Item(new FabricItemSettings());
        RAW_SILVER = new Item(new FabricItemSettings());

        TIN_INGOT = new Item(new FabricItemSettings());
        ALUMINIUM_INGOT = new Item(new FabricItemSettings());
        LEAD_INGOT = new Item(new FabricItemSettings());
        COBALT_INGOT = new Item(new FabricItemSettings());
        PLATINUM_INGOT = new Item(new FabricItemSettings());
        NICKEL_INGOT = new Item(new FabricItemSettings());
        ZINC_INGOT = new Item(new FabricItemSettings());
        SILVER_INGOT = new Item(new FabricItemSettings());
        STEEL_INGOT = new Item(new FabricItemSettings());
        BRASS_INGOT = new Item(new FabricItemSettings());
        BRONZE_INGOT = new Item(new FabricItemSettings());
        WHITE_GOLD_INGOT = new Item(new FabricItemSettings());
        ELECTRUM_INGOT = new Item(new FabricItemSettings());
        INVAR_INGOT = new Item(new FabricItemSettings());

        TIN_DUST = new Item(new FabricItemSettings());
        ALUMINIUM_DUST = new Item(new FabricItemSettings());
        LEAD_DUST = new Item(new FabricItemSettings());
        COBALT_DUST = new Item(new FabricItemSettings());
        PLATINUM_DUST = new Item(new FabricItemSettings());
        NICKEL_DUST = new Item(new FabricItemSettings());
        ZINC_DUST = new Item(new FabricItemSettings());
        SILVER_DUST = new Item(new FabricItemSettings());
        STEEL_DUST = new Item(new FabricItemSettings());
        BRASS_DUST = new Item(new FabricItemSettings());
        BRONZE_DUST = new Item(new FabricItemSettings());
        WHITE_GOLD_DUST = new Item(new FabricItemSettings());
        ELECTRUM_DUST = new Item(new FabricItemSettings());
        INVAR_DUST = new Item(new FabricItemSettings());
        IRON_DUST = new Item(new FabricItemSettings());
        GOLD_DUST = new Item(new FabricItemSettings());
        COPPER_DUST = new Item(new FabricItemSettings());

        TIN_ORE = new Block(FabricBlockSettings.create());
        ALUMINIUM_ORE = new Block(FabricBlockSettings.create());
        LEAD_ORE = new Block(FabricBlockSettings.create());
        COBALT_ORE = new Block(FabricBlockSettings.create());
        PLATINUM_ORE = new Block(FabricBlockSettings.create());
        NICKEL_ORE = new Block(FabricBlockSettings.create());
        ZINC_ORE = new Block(FabricBlockSettings.create());
        SILVER_ORE = new Block(FabricBlockSettings.create());

        DEEPSLATE_TIN_ORE = new Block(FabricBlockSettings.create());
        DEEPSLATE_ALUMINIUM_ORE = new Block(FabricBlockSettings.create());
        DEEPSLATE_LEAD_ORE = new Block(FabricBlockSettings.create());
        DEEPSLATE_COBALT_ORE = new Block(FabricBlockSettings.create());
        DEEPSLATE_PLATINUM_ORE = new Block(FabricBlockSettings.create());
        DEEPSLATE_NICKEL_ORE = new Block(FabricBlockSettings.create());
        DEEPSLATE_ZINC_ORE = new Block(FabricBlockSettings.create());
        DEEPSLATE_SILVER_ORE = new Block(FabricBlockSettings.create());

        RAW_TIN_BLOCK = new Block(FabricBlockSettings.create());
        RAW_ALUMINIUM_BLOCK = new Block(FabricBlockSettings.create());
        RAW_LEAD_BLOCK = new Block(FabricBlockSettings.create());
        RAW_COBALT_BLOCK = new Block(FabricBlockSettings.create());
        RAW_PLATINUM_BLOCK = new Block(FabricBlockSettings.create());
        RAW_NICKEL_BLOCK = new Block(FabricBlockSettings.create());
        RAW_ZINC_BLOCK = new Block(FabricBlockSettings.create());
        RAW_SILVER_BLOCK = new Block(FabricBlockSettings.create());

        TIN_BLOCK = new Block(FabricBlockSettings.create());
        ALUMINIUM_BLOCK = new Block(FabricBlockSettings.create());
        LEAD_BLOCK = new Block(FabricBlockSettings.create());
        COBALT_BLOCK = new Block(FabricBlockSettings.create());
        PLATINUM_BLOCK = new Block(FabricBlockSettings.create());
        NICKEL_BLOCK = new Block(FabricBlockSettings.create());
        ZINC_BLOCK = new Block(FabricBlockSettings.create());
        SILVER_BLOCK = new Block(FabricBlockSettings.create());
        STEEL_BLOCK = new Block(FabricBlockSettings.create());
        BRASS_BLOCK = new Block(FabricBlockSettings.create());
        BRONZE_BLOCK = new Block(FabricBlockSettings.create());
        WHITE_GOLD_BLOCK = new Block(FabricBlockSettings.create());
        ELECTRUM_BLOCK = new Block(FabricBlockSettings.create());
        INVAR_BLOCK = new Block(FabricBlockSettings.create());

        ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(TIN_INGOT))
            .displayName(Text.translatable("itemGroup.alloyoftime"))
            .entries(Initializer::addEntry)
            .build();
    }
}
