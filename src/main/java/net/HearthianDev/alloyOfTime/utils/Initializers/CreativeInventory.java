package net.HearthianDev.alloyOfTime.utils.Initializers;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;

import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Aluminium.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Brass.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Bronze.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Cobalt.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Copper.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Electrum.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Gold.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Invar.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Iron.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Lead.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Nickel.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Platinum.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Silver.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Steel.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Tin.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.WhiteGold.*;
import static net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals.Zinc.*;

public class CreativeInventory {
    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
        .icon(() -> new ItemStack(TIN_INGOT))
        .displayName(Text.translatable("itemGroup.alloyoftime"))
        .entries(CreativeInventory::addEntry)
        .build();

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
}
