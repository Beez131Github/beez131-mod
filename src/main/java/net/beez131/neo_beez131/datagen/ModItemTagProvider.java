package net.beez131.neo_beez131.datagen;

import net.beez131.neo_beez131.Neo_Beez131;
import net.beez131.neo_beez131.item.neo_beez131.ModItems;
import net.beez131.neo_beez131.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, blockTags, Neo_Beez131.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Vanilla tool tags
        tag(ItemTags.SWORDS)
                .add(ModItems.ENDERITE_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.ENDERITE_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.ENDERITE_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.ENDERITE_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.ENDERITE_HOE.get());

        // Custom tag for repairing Enderite tools
        this.tag(ModTags.Items.ENDERITE_REPAIR)
                .add(ModItems.ENDERITE_INGOT.get());
    }
}
