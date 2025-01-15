package net.beez131.neo_beez131.block.neo_beez131;

import net.beez131.neo_beez131.Neo_Beez131;
import net.beez131.neo_beez131.item.neo_beez131.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Neo_Beez131.MOD_ID);

    public static final DeferredBlock<Block> ENDERITE_BLOCK = registerBlock("enderite_block", () -> new Block(BlockBehaviour.Properties.of()
                    .strength(20f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK).setId(ResourceKey.create(Registries.BLOCK, rl("enderite_block")))),
            new Item.Properties().fireResistant()); // Add fire-resistant properties here

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block, Item.Properties itemProperties) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, itemProperties);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block, Item.Properties itemProperties) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), itemProperties.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Neo_Beez131.MOD_ID, name)))));
    }

    public static ResourceLocation rl(String name) {
        return ResourceLocation.fromNamespaceAndPath(Neo_Beez131.MOD_ID, name);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
