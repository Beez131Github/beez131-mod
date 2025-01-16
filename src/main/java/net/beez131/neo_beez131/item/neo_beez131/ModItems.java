package net.beez131.neo_beez131.item.neo_beez131;

import net.beez131.neo_beez131.Neo_Beez131;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Neo_Beez131.MOD_ID);

    public static final DeferredItem<Item> ENDERITE_INGOT = ITEMS.registerItem(
            "enderite_ingot",
            Item::new,
            new Item.Properties().fireResistant()
    );

    public static final DeferredItem<Item> ENDERITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.registerItem(
            "enderite_upgrade_smithing_template",
            Item::new,
            new Item.Properties().rarity(Rarity.UNCOMMON)
    );

    public static final DeferredItem<Item> ENDER_APPLE = ITEMS.registerItem(
            "ender_apple",
            Item::new,
            new Item.Properties().food(ModFoodProperties.ENDER_APPLE));

    public static final DeferredItem<SwordItem> ENDERITE_SWORD = ITEMS.register("enderite_sword",
            () -> new SwordItem(ModToolTiers.ENDERITE, 5, -2.4f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Neo_Beez131.MOD_ID, "enderite_sword")))));
    public static final DeferredItem<PickaxeItem> ENDERITE_PICKAXE = ITEMS.register("enderite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENDERITE, 1.0F, -2.8f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Neo_Beez131.MOD_ID, "enderite_pickaxe")))));
    public static final DeferredItem<ShovelItem> ENDERITE_SHOVEL = ITEMS.register("enderite_shovel",
            () -> new ShovelItem(ModToolTiers.ENDERITE, 1.5F, -3.0f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Neo_Beez131.MOD_ID, "enderite_shovel")))));
    public static final DeferredItem<AxeItem> ENDERITE_AXE = ITEMS.register("enderite_axe",
            () -> new AxeItem(ModToolTiers.ENDERITE, 6.0F, -3.0f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Neo_Beez131.MOD_ID, "enderite_axe")))));
    public static final DeferredItem<HoeItem> ENDERITE_HOE = ITEMS.register("enderite_hoe",
            () -> new HoeItem(ModToolTiers.ENDERITE, -6F, 0.0f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Neo_Beez131.MOD_ID, "enderite_hoe")))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}