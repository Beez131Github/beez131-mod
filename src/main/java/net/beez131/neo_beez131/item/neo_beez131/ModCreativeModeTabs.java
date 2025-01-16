package net.beez131.neo_beez131.item.neo_beez131;

import net.beez131.neo_beez131.Neo_Beez131;
import net.beez131.neo_beez131.block.neo_beez131.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Neo_Beez131.MOD_ID);

    public static final Supplier<CreativeModeTab> NEO_BEEZ131_TAB = CREATIVE_MODE_TAB.register("neo_beez131_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENDERITE_INGOT.get()))
                    .title(Component.translatable("creativetab.neo_beez131.neo_beez131_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                      output.accept(ModItems.ENDERITE_INGOT);
                      output.accept(ModBlocks.ENDERITE_BLOCK);
                      output.accept(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE);
                      output.accept(ModItems.ENDER_APPLE);
                    })


            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
