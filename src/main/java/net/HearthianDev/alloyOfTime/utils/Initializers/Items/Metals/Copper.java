package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class Copper {
    public static final Item COPPER_DUST;

    public static void init() {
        Register.item("copper_dust", COPPER_DUST);
    }

    static {
        COPPER_DUST = new Item(new FabricItemSettings());
    }
}
