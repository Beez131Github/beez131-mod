package net.beez131.neo_beez131.item.neo_beez131;

import net.beez131.neo_beez131.Neo_Beez131;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Neo_Beez131.MOD_ID);

    public static final DeferredItem<Item> ENDERITE_INGOT = ITEMS.registerItem(
            "enderite_ingot",
            Item::new, // The factory that the properties will be passed into.
            new Item.Properties().fireResistant() // The properties to use.
    );

    public static final DeferredItem<Item> ENDERITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.registerItem(
            "enderite_upgrade_smithing_template",
            Item::new, // The factory that the properties will be passed into.
            new Item.Properties().rarity(Rarity.UNCOMMON) // The properties to use.
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}