package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class Iron {
    public static final Item IRON_DUST;

    public static void init() {
        Register.item("iron_dust", IRON_DUST);
    }

    static {
        IRON_DUST = new Item(new FabricItemSettings());
    }
}
