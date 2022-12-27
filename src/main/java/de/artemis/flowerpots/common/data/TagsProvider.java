package de.artemis.flowerpots.common.data;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.blocks.FlowerPotBlock;
import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class TagsProvider {
    public static class ItemTagsProvider extends net.minecraft.data.tags.TagsProvider<Item> {
        private final DeferredRegister<Item> blockRegistry;
        private PackOutput packOutput;

        @SuppressWarnings("deprecation")
        protected ItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper, DeferredRegister<Item> registry) {
            super(packOutput, ForgeRegistries.ITEMS.getRegistryKey(), future, FlowerPots.MOD_ID, existingFileHelper);
            this.packOutput = packOutput;
            this.blockRegistry = registry;
        }

        @Override
        protected void addTags(@NotNull HolderLookup.Provider provider) {
            tag(ModTags.Item.MAY_APPLY_ON_FLOWER_POT).add(getResourceKey(Blocks.OAK_SAPLING.asItem()), getResourceKey(Blocks.SPRUCE_SAPLING.asItem()), getResourceKey(Blocks.BIRCH_SAPLING.asItem()), getResourceKey(Blocks.JUNGLE_SAPLING.asItem()), getResourceKey(Blocks.ACACIA_SAPLING.asItem()), getResourceKey(Blocks.DARK_OAK_SAPLING.asItem()), getResourceKey(Blocks.MANGROVE_PROPAGULE.asItem()), getResourceKey(Blocks.FERN.asItem()), getResourceKey(Blocks.DANDELION.asItem()), getResourceKey(Blocks.POPPY.asItem()), getResourceKey(Blocks.BLUE_ORCHID.asItem()), getResourceKey(Blocks.ALLIUM.asItem()), getResourceKey(Blocks.AZURE_BLUET.asItem()), getResourceKey(Blocks.RED_TULIP.asItem()), getResourceKey(Blocks.ORANGE_TULIP.asItem()), getResourceKey(Blocks.WHITE_TULIP.asItem()), getResourceKey(Blocks.PINK_TULIP.asItem()), getResourceKey(Blocks.OXEYE_DAISY.asItem()), getResourceKey(Blocks.CORNFLOWER.asItem()), getResourceKey(Blocks.LILY_OF_THE_VALLEY.asItem()), getResourceKey(Blocks.WITHER_ROSE.asItem()), getResourceKey(Blocks.RED_MUSHROOM.asItem()), getResourceKey(Blocks.BROWN_MUSHROOM.asItem()), getResourceKey(Blocks.DEAD_BUSH.asItem()), getResourceKey(Blocks.CACTUS.asItem()), getResourceKey(Blocks.BAMBOO.asItem()), getResourceKey(Blocks.CRIMSON_FUNGUS.asItem()), getResourceKey(Blocks.WARPED_FUNGUS.asItem()), getResourceKey(Blocks.CRIMSON_ROOTS.asItem()), getResourceKey(Blocks.WARPED_ROOTS.asItem()), getResourceKey(Blocks.AZALEA.asItem()), getResourceKey(Blocks.FLOWERING_AZALEA.asItem()), getResourceKey(Blocks.BIG_DRIPLEAF.asItem()), getResourceKey(Blocks.GRASS.asItem()), getResourceKey(Blocks.LILAC.asItem()), getResourceKey(Blocks.ROSE_BUSH.asItem()), getResourceKey(Blocks.PEONY.asItem()), getResourceKey(Blocks.TALL_GRASS.asItem()), getResourceKey(Blocks.LARGE_FERN.asItem()), getResourceKey(Blocks.OAK_LEAVES.asItem()), getResourceKey(Blocks.SPRUCE_LEAVES.asItem()), getResourceKey(Blocks.BIRCH_LEAVES.asItem()), getResourceKey(Blocks.DARK_OAK_LEAVES.asItem()), getResourceKey(Blocks.ACACIA_LEAVES.asItem()), getResourceKey(Blocks.JUNGLE_LEAVES.asItem()), getResourceKey(Blocks.MANGROVE_LEAVES.asItem()), getResourceKey(Blocks.AZALEA_LEAVES.asItem()), getResourceKey(Blocks.FLOWERING_AZALEA_LEAVES.asItem()));
        }

        @NotNull
        @Override
        protected Path getPath(ResourceLocation location) {
            return this.packOutput.getOutputFolder().resolve("data/" + location.getNamespace() + "/tags/items/" + location.getPath() + ".json");
        }

        @NotNull
        @Override
        public String getName() {
            return "Item tags";
        }

        public ResourceKey<Item> getResourceKey(Item item) {
            return ForgeRegistries.ITEMS.getResourceKey(item).get();
        }
    }

    public static class BlockTagsProvider extends net.minecraft.data.tags.TagsProvider<Block> {
        private final DeferredRegister<Block> blockRegistry;
        private PackOutput packOutput;

        @SuppressWarnings("deprecation")
        protected BlockTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper, DeferredRegister<Block> registry) {
            super(packOutput, ForgeRegistries.BLOCKS.getRegistryKey(), future, FlowerPots.MOD_ID, existingFileHelper);
            this.packOutput = packOutput;
            this.blockRegistry = registry;
        }

        @Override
        protected void addTags(@NotNull HolderLookup.Provider provider) {
            tag(ModTags.Block.EMPTY_FLOWER_POT).add(getResourceKey(ModBlocks.SMALL_FLOWER_POT), getResourceKey(ModBlocks.SMALL_TALL_FLOWER_POT), getResourceKey(ModBlocks.LARGE_FLOWER_POT), getResourceKey(ModBlocks.LARGE_TALL_FLOWER_POT), getResourceKey(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN), getResourceKey(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN), getResourceKey(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN));
            tag(ModTags.Block.UNFIRED_FLOWER_POT).add(getResourceKey(ModBlocks.SMALL_UNFIRED_FLOWER_POT), getResourceKey(ModBlocks.SMALL_TALL_UNFIRED_FLOWER_POT), getResourceKey(ModBlocks.LARGE_UNFIRED_FLOWER_POT), getResourceKey(ModBlocks.LARGE_TALL_UNFIRED_FLOWER_POT));
            tag(ModTags.Block.FLOWER_POT_NO_VARIANTS).add(getResourceKey(ModBlocks.SMALL_FLOWER_POT_LARGE_FERN), getResourceKey(ModBlocks.SMALL_TALL_FLOWER_POT_LARGE_FERN), getResourceKey(ModBlocks.LARGE_FLOWER_POT_LARGE_FERN), getResourceKey(ModBlocks.LARGE_TALL_FLOWER_POT_LARGE_FERN), getResourceKey(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_LARGE_FERN), getResourceKey(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_LARGE_FERN), getResourceKey(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_LARGE_FERN), getResourceKey(ModBlocks.SMALL_FLOWER_POT_TALL_GRASS), getResourceKey(ModBlocks.SMALL_TALL_FLOWER_POT_TALL_GRASS), getResourceKey(ModBlocks.LARGE_FLOWER_POT_TALL_GRASS), getResourceKey(ModBlocks.LARGE_TALL_FLOWER_POT_TALL_GRASS), getResourceKey(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_TALL_GRASS), getResourceKey(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_TALL_GRASS), getResourceKey(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_TALL_GRASS));
        }

        @NotNull
        @Override
        protected Path getPath(ResourceLocation location) {
            return this.packOutput.getOutputFolder().resolve("data/" + location.getNamespace() + "/tags/blocks/" + location.getPath() + ".json");
        }

        @NotNull
        @Override
        public String getName() {
            return "Block tags";
        }

        public ResourceKey<Block> getResourceKey(RegistryObject<FlowerPotBlock> block) {
            return ForgeRegistries.BLOCKS.getResourceKey(block.get()).get();
        }
    }
}
