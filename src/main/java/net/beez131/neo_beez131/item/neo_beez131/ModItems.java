package net.beez131.neo_beez131.item.neo_beez131;

import net.beez131.neo_beez131.Neo_Beez131;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Neo_Beez131.MOD_ID);

    public static final DeferredItem<Item> ENDERITE_INGOT = ITEMS.registerItem(
            "enderite_ingot",
            Item::new, // The factory that the properties will be passed into.
            new Item.Properties() // The properties to use.
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}