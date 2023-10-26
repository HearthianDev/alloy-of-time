package net.HearthianDev.alloyOfTime.utils.Initializers.Items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.HearthianDev.alloyOfTime.AlloyOfTime.MODID;

public class Register {
    public static void item(String path, Item item) {
        Registry.register(Registries.ITEM, new Identifier(MODID, path), item);
    }

    public static void blockItem(String path, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(MODID, path), block);
        item(path, new BlockItem(block, new Item.Settings()));
    }
}
