package net.HearthianDev.alloyOfTime.utils.Initializers.Items.Metals;

import net.HearthianDev.alloyOfTime.utils.Initializers.Items.Register;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class Gold {
    public static final Item GOLD_DUST;

    public static void init() {
        Register.item("gold_dust", GOLD_DUST);
    }

    static {
        GOLD_DUST = new Item(new FabricItemSettings());
    }
}
