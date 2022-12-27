package de.artemis.flowerpots.common.data;

import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.Registration;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class BlockLootTables extends BlockLootSubProvider {

    protected BlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.SMALL_FLOWER_POT.get());
        dropSelf(ModBlocks.SMALL_UNFIRED_FLOWER_POT.get());
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_OAK_SAPLING.get(), Blocks.OAK_SAPLING.asItem());
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_SPRUCE_SAPLING.get(), Blocks.SPRUCE_SAPLING);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_BIRCH_SAPLING.get(), Blocks.BIRCH_SAPLING);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_JUNGLE_SAPLING.get(), Blocks.JUNGLE_SAPLING);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_ACACIA_SAPLING.get(), Blocks.ACACIA_SAPLING);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_DARK_OAK_SAPLING.get(), Blocks.DARK_OAK_SAPLING);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_MANGROVE_SAPLING.get(), Blocks.MANGROVE_PROPAGULE);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_FERN.get(), Blocks.FERN);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_DANDELION.get(), Blocks.DANDELION);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_POPPY.get(), Blocks.POPPY);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_BLUE_ORCHID.get(), Blocks.BLUE_ORCHID);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_ALLIUM.get(), Blocks.ALLIUM);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_AZURE_BLUET.get(), Blocks.AZURE_BLUET);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_RED_TULIP.get(), Blocks.RED_TULIP);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_ORANGE_TULIP.get(), Blocks.ORANGE_TULIP);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_WHITE_TULIP.get(), Blocks.WHITE_TULIP);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_PINK_TULIP.get(), Blocks.PINK_TULIP);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_OXEYE_DAISY.get(), Blocks.OXEYE_DAISY);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_CORNFLOWER.get(), Blocks.CORNFLOWER);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_LILY_OF_THE_VALLEY.get(), Blocks.LILY_OF_THE_VALLEY);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_WITHER_ROSE.get(), Blocks.WITHER_ROSE);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_RED_MUSHROOM.get(), Blocks.RED_MUSHROOM);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_BROWN_MUSHROOM.get(), Blocks.BROWN_MUSHROOM);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_DEAD_BUSH.get(), Blocks.DEAD_BUSH);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_CACTUS.get(), Blocks.CACTUS);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_BAMBOO.get(), Blocks.BAMBOO);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_CRIMSON_FUNGUS.get(), Blocks.CRIMSON_FUNGUS);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_WARPED_FUNGUS.get(), Blocks.WARPED_FUNGUS);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_CRIMSON_ROOTS.get(), Blocks.CRIMSON_ROOTS);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_WARPED_ROOTS.get(), Blocks.WARPED_ROOTS);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_AZALEA.get(), Blocks.AZALEA);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_FLOWERING_AZALEA.get(), Blocks.FLOWERING_AZALEA);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_BIG_DRIPLEAF.get(), Blocks.BIG_DRIPLEAF);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_GRASS.get(), Blocks.GRASS);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_LILAC.get(), Blocks.LILAC);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_ROSE_BUSH.get(), Blocks.ROSE_BUSH);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_PEONY.get(), Blocks.PEONY);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_TALL_GRASS.get(), Blocks.TALL_GRASS);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_LARGE_FERN.get(), Blocks.LARGE_FERN);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_OAK_LEAVES.get(), Blocks.OAK_LEAVES);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_SPRUCE_LEAVES.get(), Blocks.SPRUCE_LEAVES);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_BIRCH_LEAVES.get(), Blocks.BIRCH_LEAVES);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_DARK_OAK_LEAVES.get(), Blocks.DARK_OAK_LEAVES);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_ACACIA_LEAVES.get(), Blocks.ACACIA_LEAVES);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_JUNGLE_LEAVES.get(), Blocks.JUNGLE_LEAVES);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_MANGROVE_LEAVES.get(), Blocks.MANGROVE_LEAVES);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_AZALEA_LEAVES.get(), Blocks.AZALEA_LEAVES);
        dropSmallFlowerPot(ModBlocks.SMALL_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(), Blocks.FLOWERING_AZALEA_LEAVES);

        dropSelf(ModBlocks.SMALL_DESERT_FLOWER_POT.get());
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_OAK_SAPLING.get(), Blocks.OAK_SAPLING.asItem());
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_SPRUCE_SAPLING.get(), Blocks.SPRUCE_SAPLING);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_BIRCH_SAPLING.get(), Blocks.BIRCH_SAPLING);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_JUNGLE_SAPLING.get(), Blocks.JUNGLE_SAPLING);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_ACACIA_SAPLING.get(), Blocks.ACACIA_SAPLING);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_DARK_OAK_SAPLING.get(), Blocks.DARK_OAK_SAPLING);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_MANGROVE_SAPLING.get(), Blocks.MANGROVE_PROPAGULE);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_FERN.get(), Blocks.FERN);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_DANDELION.get(), Blocks.DANDELION);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_POPPY.get(), Blocks.POPPY);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_BLUE_ORCHID.get(), Blocks.BLUE_ORCHID);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_ALLIUM.get(), Blocks.ALLIUM);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_AZURE_BLUET.get(), Blocks.AZURE_BLUET);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_RED_TULIP.get(), Blocks.RED_TULIP);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_ORANGE_TULIP.get(), Blocks.ORANGE_TULIP);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_WHITE_TULIP.get(), Blocks.WHITE_TULIP);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_PINK_TULIP.get(), Blocks.PINK_TULIP);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_OXEYE_DAISY.get(), Blocks.OXEYE_DAISY);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_CORNFLOWER.get(), Blocks.CORNFLOWER);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_LILY_OF_THE_VALLEY.get(), Blocks.LILY_OF_THE_VALLEY);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_WITHER_ROSE.get(), Blocks.WITHER_ROSE);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_RED_MUSHROOM.get(), Blocks.RED_MUSHROOM);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_BROWN_MUSHROOM.get(), Blocks.BROWN_MUSHROOM);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_DEAD_BUSH.get(), Blocks.DEAD_BUSH);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_CACTUS.get(), Blocks.CACTUS);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_BAMBOO.get(), Blocks.BAMBOO);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_CRIMSON_FUNGUS.get(), Blocks.CRIMSON_FUNGUS);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_WARPED_FUNGUS.get(), Blocks.WARPED_FUNGUS);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_CRIMSON_ROOTS.get(), Blocks.CRIMSON_ROOTS);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_WARPED_ROOTS.get(), Blocks.WARPED_ROOTS);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_AZALEA.get(), Blocks.AZALEA);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_FLOWERING_AZALEA.get(), Blocks.FLOWERING_AZALEA);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_BIG_DRIPLEAF.get(), Blocks.BIG_DRIPLEAF);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_GRASS.get(), Blocks.GRASS);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_LILAC.get(), Blocks.LILAC);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_ROSE_BUSH.get(), Blocks.ROSE_BUSH);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_PEONY.get(), Blocks.PEONY);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_TALL_GRASS.get(), Blocks.TALL_GRASS);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_LARGE_FERN.get(), Blocks.LARGE_FERN);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_OAK_LEAVES.get(), Blocks.OAK_LEAVES);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_SPRUCE_LEAVES.get(), Blocks.SPRUCE_LEAVES);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_BIRCH_LEAVES.get(), Blocks.BIRCH_LEAVES);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_DARK_OAK_LEAVES.get(), Blocks.DARK_OAK_LEAVES);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_ACACIA_LEAVES.get(), Blocks.ACACIA_LEAVES);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_JUNGLE_LEAVES.get(), Blocks.JUNGLE_LEAVES);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_MANGROVE_LEAVES.get(), Blocks.MANGROVE_LEAVES);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_AZALEA_LEAVES.get(), Blocks.AZALEA_LEAVES);
        dropSmallDesertFlowerPot(ModBlocks.SMALL_DESERT_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(), Blocks.FLOWERING_AZALEA_LEAVES);

        dropSelf(ModBlocks.SMALL_JUNGLE_FLOWER_POT.get());
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_OAK_SAPLING.get(), Blocks.OAK_SAPLING.asItem());
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_SPRUCE_SAPLING.get(), Blocks.SPRUCE_SAPLING);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_BIRCH_SAPLING.get(), Blocks.BIRCH_SAPLING);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_JUNGLE_SAPLING.get(), Blocks.JUNGLE_SAPLING);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_ACACIA_SAPLING.get(), Blocks.ACACIA_SAPLING);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_DARK_OAK_SAPLING.get(), Blocks.DARK_OAK_SAPLING);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_MANGROVE_SAPLING.get(), Blocks.MANGROVE_PROPAGULE);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_FERN.get(), Blocks.FERN);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_DANDELION.get(), Blocks.DANDELION);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_POPPY.get(), Blocks.POPPY);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_BLUE_ORCHID.get(), Blocks.BLUE_ORCHID);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_ALLIUM.get(), Blocks.ALLIUM);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_AZURE_BLUET.get(), Blocks.AZURE_BLUET);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_RED_TULIP.get(), Blocks.RED_TULIP);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_ORANGE_TULIP.get(), Blocks.ORANGE_TULIP);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_WHITE_TULIP.get(), Blocks.WHITE_TULIP);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_PINK_TULIP.get(), Blocks.PINK_TULIP);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_OXEYE_DAISY.get(), Blocks.OXEYE_DAISY);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_CORNFLOWER.get(), Blocks.CORNFLOWER);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_LILY_OF_THE_VALLEY.get(), Blocks.LILY_OF_THE_VALLEY);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_WITHER_ROSE.get(), Blocks.WITHER_ROSE);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_RED_MUSHROOM.get(), Blocks.RED_MUSHROOM);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_BROWN_MUSHROOM.get(), Blocks.BROWN_MUSHROOM);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_DEAD_BUSH.get(), Blocks.DEAD_BUSH);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_CACTUS.get(), Blocks.CACTUS);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_BAMBOO.get(), Blocks.BAMBOO);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_CRIMSON_FUNGUS.get(), Blocks.CRIMSON_FUNGUS);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_WARPED_FUNGUS.get(), Blocks.WARPED_FUNGUS);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_CRIMSON_ROOTS.get(), Blocks.CRIMSON_ROOTS);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_WARPED_ROOTS.get(), Blocks.WARPED_ROOTS);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_AZALEA.get(), Blocks.AZALEA);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_FLOWERING_AZALEA.get(), Blocks.FLOWERING_AZALEA);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_BIG_DRIPLEAF.get(), Blocks.BIG_DRIPLEAF);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_GRASS.get(), Blocks.GRASS);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_LILAC.get(), Blocks.LILAC);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_ROSE_BUSH.get(), Blocks.ROSE_BUSH);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_PEONY.get(), Blocks.PEONY);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_TALL_GRASS.get(), Blocks.TALL_GRASS);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_LARGE_FERN.get(), Blocks.LARGE_FERN);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_OAK_LEAVES.get(), Blocks.OAK_LEAVES);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_SPRUCE_LEAVES.get(), Blocks.SPRUCE_LEAVES);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_BIRCH_LEAVES.get(), Blocks.BIRCH_LEAVES);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_DARK_OAK_LEAVES.get(), Blocks.DARK_OAK_LEAVES);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_ACACIA_LEAVES.get(), Blocks.ACACIA_LEAVES);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_JUNGLE_LEAVES.get(), Blocks.JUNGLE_LEAVES);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_MANGROVE_LEAVES.get(), Blocks.MANGROVE_LEAVES);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_AZALEA_LEAVES.get(), Blocks.AZALEA_LEAVES);
        dropSmallJungleFlowerPot(ModBlocks.SMALL_JUNGLE_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(), Blocks.FLOWERING_AZALEA_LEAVES);

        dropSelf(ModBlocks.SMALL_NETHER_FLOWER_POT.get());
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_OAK_SAPLING.get(), Blocks.OAK_SAPLING.asItem());
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_SPRUCE_SAPLING.get(), Blocks.SPRUCE_SAPLING);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_BIRCH_SAPLING.get(), Blocks.BIRCH_SAPLING);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_JUNGLE_SAPLING.get(), Blocks.JUNGLE_SAPLING);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_ACACIA_SAPLING.get(), Blocks.ACACIA_SAPLING);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_DARK_OAK_SAPLING.get(), Blocks.DARK_OAK_SAPLING);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_MANGROVE_SAPLING.get(), Blocks.MANGROVE_PROPAGULE);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_FERN.get(), Blocks.FERN);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_DANDELION.get(), Blocks.DANDELION);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_POPPY.get(), Blocks.POPPY);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_BLUE_ORCHID.get(), Blocks.BLUE_ORCHID);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_ALLIUM.get(), Blocks.ALLIUM);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_AZURE_BLUET.get(), Blocks.AZURE_BLUET);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_RED_TULIP.get(), Blocks.RED_TULIP);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_ORANGE_TULIP.get(), Blocks.ORANGE_TULIP);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_WHITE_TULIP.get(), Blocks.WHITE_TULIP);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_PINK_TULIP.get(), Blocks.PINK_TULIP);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_OXEYE_DAISY.get(), Blocks.OXEYE_DAISY);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_CORNFLOWER.get(), Blocks.CORNFLOWER);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_LILY_OF_THE_VALLEY.get(), Blocks.LILY_OF_THE_VALLEY);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_WITHER_ROSE.get(), Blocks.WITHER_ROSE);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_RED_MUSHROOM.get(), Blocks.RED_MUSHROOM);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_BROWN_MUSHROOM.get(), Blocks.BROWN_MUSHROOM);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_DEAD_BUSH.get(), Blocks.DEAD_BUSH);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_CACTUS.get(), Blocks.CACTUS);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_BAMBOO.get(), Blocks.BAMBOO);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_CRIMSON_FUNGUS.get(), Blocks.CRIMSON_FUNGUS);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_WARPED_FUNGUS.get(), Blocks.WARPED_FUNGUS);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_CRIMSON_ROOTS.get(), Blocks.CRIMSON_ROOTS);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_WARPED_ROOTS.get(), Blocks.WARPED_ROOTS);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_AZALEA.get(), Blocks.AZALEA);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_FLOWERING_AZALEA.get(), Blocks.FLOWERING_AZALEA);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_BIG_DRIPLEAF.get(), Blocks.BIG_DRIPLEAF);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_GRASS.get(), Blocks.GRASS);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_LILAC.get(), Blocks.LILAC);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_ROSE_BUSH.get(), Blocks.ROSE_BUSH);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_PEONY.get(), Blocks.PEONY);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_TALL_GRASS.get(), Blocks.TALL_GRASS);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_LARGE_FERN.get(), Blocks.LARGE_FERN);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_OAK_LEAVES.get(), Blocks.OAK_LEAVES);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_SPRUCE_LEAVES.get(), Blocks.SPRUCE_LEAVES);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_BIRCH_LEAVES.get(), Blocks.BIRCH_LEAVES);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_DARK_OAK_LEAVES.get(), Blocks.DARK_OAK_LEAVES);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_ACACIA_LEAVES.get(), Blocks.ACACIA_LEAVES);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_JUNGLE_LEAVES.get(), Blocks.JUNGLE_LEAVES);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_MANGROVE_LEAVES.get(), Blocks.MANGROVE_LEAVES);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_AZALEA_LEAVES.get(), Blocks.AZALEA_LEAVES);
        dropSmallNetherFlowerPot(ModBlocks.SMALL_NETHER_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(), Blocks.FLOWERING_AZALEA_LEAVES);

        dropSelf(ModBlocks.SMALL_END_FLOWER_POT.get());
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_OAK_SAPLING.get(), Blocks.OAK_SAPLING.asItem());
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_SPRUCE_SAPLING.get(), Blocks.SPRUCE_SAPLING);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_BIRCH_SAPLING.get(), Blocks.BIRCH_SAPLING);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_JUNGLE_SAPLING.get(), Blocks.JUNGLE_SAPLING);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_ACACIA_SAPLING.get(), Blocks.ACACIA_SAPLING);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_DARK_OAK_SAPLING.get(), Blocks.DARK_OAK_SAPLING);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_MANGROVE_SAPLING.get(), Blocks.MANGROVE_PROPAGULE);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_FERN.get(), Blocks.FERN);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_DANDELION.get(), Blocks.DANDELION);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_POPPY.get(), Blocks.POPPY);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_BLUE_ORCHID.get(), Blocks.BLUE_ORCHID);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_ALLIUM.get(), Blocks.ALLIUM);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_AZURE_BLUET.get(), Blocks.AZURE_BLUET);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_RED_TULIP.get(), Blocks.RED_TULIP);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_ORANGE_TULIP.get(), Blocks.ORANGE_TULIP);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_WHITE_TULIP.get(), Blocks.WHITE_TULIP);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_PINK_TULIP.get(), Blocks.PINK_TULIP);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_OXEYE_DAISY.get(), Blocks.OXEYE_DAISY);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_CORNFLOWER.get(), Blocks.CORNFLOWER);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_LILY_OF_THE_VALLEY.get(), Blocks.LILY_OF_THE_VALLEY);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_WITHER_ROSE.get(), Blocks.WITHER_ROSE);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_RED_MUSHROOM.get(), Blocks.RED_MUSHROOM);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_BROWN_MUSHROOM.get(), Blocks.BROWN_MUSHROOM);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_DEAD_BUSH.get(), Blocks.DEAD_BUSH);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_CACTUS.get(), Blocks.CACTUS);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_BAMBOO.get(), Blocks.BAMBOO);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_CRIMSON_FUNGUS.get(), Blocks.CRIMSON_FUNGUS);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_WARPED_FUNGUS.get(), Blocks.WARPED_FUNGUS);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_CRIMSON_ROOTS.get(), Blocks.CRIMSON_ROOTS);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_WARPED_ROOTS.get(), Blocks.WARPED_ROOTS);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_AZALEA.get(), Blocks.AZALEA);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_FLOWERING_AZALEA.get(), Blocks.FLOWERING_AZALEA);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_BIG_DRIPLEAF.get(), Blocks.BIG_DRIPLEAF);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_GRASS.get(), Blocks.GRASS);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_LILAC.get(), Blocks.LILAC);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_ROSE_BUSH.get(), Blocks.ROSE_BUSH);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_PEONY.get(), Blocks.PEONY);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_TALL_GRASS.get(), Blocks.TALL_GRASS);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_LARGE_FERN.get(), Blocks.LARGE_FERN);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_OAK_LEAVES.get(), Blocks.OAK_LEAVES);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_SPRUCE_LEAVES.get(), Blocks.SPRUCE_LEAVES);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_BIRCH_LEAVES.get(), Blocks.BIRCH_LEAVES);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_DARK_OAK_LEAVES.get(), Blocks.DARK_OAK_LEAVES);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_ACACIA_LEAVES.get(), Blocks.ACACIA_LEAVES);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_JUNGLE_LEAVES.get(), Blocks.JUNGLE_LEAVES);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_MANGROVE_LEAVES.get(), Blocks.MANGROVE_LEAVES);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_AZALEA_LEAVES.get(), Blocks.AZALEA_LEAVES);
        dropSmallEndFlowerPot(ModBlocks.SMALL_END_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(), Blocks.FLOWERING_AZALEA_LEAVES);

        dropSelf(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN.get());
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_OAK_SAPLING.get(), Blocks.OAK_SAPLING.asItem());
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_SPRUCE_SAPLING.get(), Blocks.SPRUCE_SAPLING);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BIRCH_SAPLING.get(), Blocks.BIRCH_SAPLING);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_JUNGLE_SAPLING.get(), Blocks.JUNGLE_SAPLING);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ACACIA_SAPLING.get(), Blocks.ACACIA_SAPLING);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_DARK_OAK_SAPLING.get(), Blocks.DARK_OAK_SAPLING);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_MANGROVE_SAPLING.get(), Blocks.MANGROVE_PROPAGULE);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_FERN.get(), Blocks.FERN);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_DANDELION.get(), Blocks.DANDELION);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_POPPY.get(), Blocks.POPPY);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BLUE_ORCHID.get(), Blocks.BLUE_ORCHID);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ALLIUM.get(), Blocks.ALLIUM);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_AZURE_BLUET.get(), Blocks.AZURE_BLUET);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_RED_TULIP.get(), Blocks.RED_TULIP);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ORANGE_TULIP.get(), Blocks.ORANGE_TULIP);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_WHITE_TULIP.get(), Blocks.WHITE_TULIP);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_PINK_TULIP.get(), Blocks.PINK_TULIP);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_OXEYE_DAISY.get(), Blocks.OXEYE_DAISY);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_CORNFLOWER.get(), Blocks.CORNFLOWER);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_LILY_OF_THE_VALLEY.get(), Blocks.LILY_OF_THE_VALLEY);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_WITHER_ROSE.get(), Blocks.WITHER_ROSE);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_RED_MUSHROOM.get(), Blocks.RED_MUSHROOM);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BROWN_MUSHROOM.get(), Blocks.BROWN_MUSHROOM);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_DEAD_BUSH.get(), Blocks.DEAD_BUSH);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_CACTUS.get(), Blocks.CACTUS);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BAMBOO.get(), Blocks.BAMBOO);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_CRIMSON_FUNGUS.get(), Blocks.CRIMSON_FUNGUS);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_WARPED_FUNGUS.get(), Blocks.WARPED_FUNGUS);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_CRIMSON_ROOTS.get(), Blocks.CRIMSON_ROOTS);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_WARPED_ROOTS.get(), Blocks.WARPED_ROOTS);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_AZALEA.get(), Blocks.AZALEA);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_FLOWERING_AZALEA.get(), Blocks.FLOWERING_AZALEA);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BIG_DRIPLEAF.get(), Blocks.BIG_DRIPLEAF);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_GRASS.get(), Blocks.GRASS);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_LILAC.get(), Blocks.LILAC);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ROSE_BUSH.get(), Blocks.ROSE_BUSH);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_PEONY.get(), Blocks.PEONY);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_TALL_GRASS.get(), Blocks.TALL_GRASS);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_LARGE_FERN.get(), Blocks.LARGE_FERN);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_OAK_LEAVES.get(), Blocks.OAK_LEAVES);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_SPRUCE_LEAVES.get(), Blocks.SPRUCE_LEAVES);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BIRCH_LEAVES.get(), Blocks.BIRCH_LEAVES);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_DARK_OAK_LEAVES.get(), Blocks.DARK_OAK_LEAVES);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ACACIA_LEAVES.get(), Blocks.ACACIA_LEAVES);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_JUNGLE_LEAVES.get(), Blocks.JUNGLE_LEAVES);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_MANGROVE_LEAVES.get(), Blocks.MANGROVE_LEAVES);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_AZALEA_LEAVES.get(), Blocks.AZALEA_LEAVES);
        dropSmallHangingFlowerPotIronChain(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_FLOWERING_AZALEA_LEAVES.get(), Blocks.FLOWERING_AZALEA_LEAVES);

        dropSelf(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN.get());
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_OAK_SAPLING.get(), Blocks.OAK_SAPLING.asItem());
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_SPRUCE_SAPLING.get(), Blocks.SPRUCE_SAPLING);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BIRCH_SAPLING.get(), Blocks.BIRCH_SAPLING);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_JUNGLE_SAPLING.get(), Blocks.JUNGLE_SAPLING);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ACACIA_SAPLING.get(), Blocks.ACACIA_SAPLING);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_DARK_OAK_SAPLING.get(), Blocks.DARK_OAK_SAPLING);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_MANGROVE_SAPLING.get(), Blocks.MANGROVE_PROPAGULE);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_FERN.get(), Blocks.FERN);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_DANDELION.get(), Blocks.DANDELION);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_POPPY.get(), Blocks.POPPY);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BLUE_ORCHID.get(), Blocks.BLUE_ORCHID);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ALLIUM.get(), Blocks.ALLIUM);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_AZURE_BLUET.get(), Blocks.AZURE_BLUET);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_RED_TULIP.get(), Blocks.RED_TULIP);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ORANGE_TULIP.get(), Blocks.ORANGE_TULIP);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_WHITE_TULIP.get(), Blocks.WHITE_TULIP);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_PINK_TULIP.get(), Blocks.PINK_TULIP);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_OXEYE_DAISY.get(), Blocks.OXEYE_DAISY);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_CORNFLOWER.get(), Blocks.CORNFLOWER);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_LILY_OF_THE_VALLEY.get(), Blocks.LILY_OF_THE_VALLEY);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_WITHER_ROSE.get(), Blocks.WITHER_ROSE);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_RED_MUSHROOM.get(), Blocks.RED_MUSHROOM);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BROWN_MUSHROOM.get(), Blocks.BROWN_MUSHROOM);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_DEAD_BUSH.get(), Blocks.DEAD_BUSH);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_CACTUS.get(), Blocks.CACTUS);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BAMBOO.get(), Blocks.BAMBOO);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_CRIMSON_FUNGUS.get(), Blocks.CRIMSON_FUNGUS);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_WARPED_FUNGUS.get(), Blocks.WARPED_FUNGUS);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_CRIMSON_ROOTS.get(), Blocks.CRIMSON_ROOTS);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_WARPED_ROOTS.get(), Blocks.WARPED_ROOTS);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_AZALEA.get(), Blocks.AZALEA);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_FLOWERING_AZALEA.get(), Blocks.FLOWERING_AZALEA);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BIG_DRIPLEAF.get(), Blocks.BIG_DRIPLEAF);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_GRASS.get(), Blocks.GRASS);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_LILAC.get(), Blocks.LILAC);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ROSE_BUSH.get(), Blocks.ROSE_BUSH);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_PEONY.get(), Blocks.PEONY);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_TALL_GRASS.get(), Blocks.TALL_GRASS);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_LARGE_FERN.get(), Blocks.LARGE_FERN);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_OAK_LEAVES.get(), Blocks.OAK_LEAVES);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_SPRUCE_LEAVES.get(), Blocks.SPRUCE_LEAVES);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BIRCH_LEAVES.get(), Blocks.BIRCH_LEAVES);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_DARK_OAK_LEAVES.get(), Blocks.DARK_OAK_LEAVES);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ACACIA_LEAVES.get(), Blocks.ACACIA_LEAVES);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_JUNGLE_LEAVES.get(), Blocks.JUNGLE_LEAVES);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_MANGROVE_LEAVES.get(), Blocks.MANGROVE_LEAVES);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_AZALEA_LEAVES.get(), Blocks.AZALEA_LEAVES);
        dropSmallHangingFlowerPotGoldChain(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_FLOWERING_AZALEA_LEAVES.get(), Blocks.FLOWERING_AZALEA_LEAVES);

        dropSelf(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN.get());
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_OAK_SAPLING.get(), Blocks.OAK_SAPLING.asItem());
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_SPRUCE_SAPLING.get(), Blocks.SPRUCE_SAPLING);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BIRCH_SAPLING.get(), Blocks.BIRCH_SAPLING);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_JUNGLE_SAPLING.get(), Blocks.JUNGLE_SAPLING);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ACACIA_SAPLING.get(), Blocks.ACACIA_SAPLING);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_DARK_OAK_SAPLING.get(), Blocks.DARK_OAK_SAPLING);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_MANGROVE_SAPLING.get(), Blocks.MANGROVE_PROPAGULE);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_FERN.get(), Blocks.FERN);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_DANDELION.get(), Blocks.DANDELION);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_POPPY.get(), Blocks.POPPY);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BLUE_ORCHID.get(), Blocks.BLUE_ORCHID);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ALLIUM.get(), Blocks.ALLIUM);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_AZURE_BLUET.get(), Blocks.AZURE_BLUET);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_RED_TULIP.get(), Blocks.RED_TULIP);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ORANGE_TULIP.get(), Blocks.ORANGE_TULIP);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_WHITE_TULIP.get(), Blocks.WHITE_TULIP);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_PINK_TULIP.get(), Blocks.PINK_TULIP);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_OXEYE_DAISY.get(), Blocks.OXEYE_DAISY);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_CORNFLOWER.get(), Blocks.CORNFLOWER);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_LILY_OF_THE_VALLEY.get(), Blocks.LILY_OF_THE_VALLEY);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_WITHER_ROSE.get(), Blocks.WITHER_ROSE);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_RED_MUSHROOM.get(), Blocks.RED_MUSHROOM);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BROWN_MUSHROOM.get(), Blocks.BROWN_MUSHROOM);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_DEAD_BUSH.get(), Blocks.DEAD_BUSH);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_CACTUS.get(), Blocks.CACTUS);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BAMBOO.get(), Blocks.BAMBOO);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_CRIMSON_FUNGUS.get(), Blocks.CRIMSON_FUNGUS);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_WARPED_FUNGUS.get(), Blocks.WARPED_FUNGUS);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_CRIMSON_ROOTS.get(), Blocks.CRIMSON_ROOTS);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_WARPED_ROOTS.get(), Blocks.WARPED_ROOTS);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_AZALEA.get(), Blocks.AZALEA);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_FLOWERING_AZALEA.get(), Blocks.FLOWERING_AZALEA);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BIG_DRIPLEAF.get(), Blocks.BIG_DRIPLEAF);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_GRASS.get(), Blocks.GRASS);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_LILAC.get(), Blocks.LILAC);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ROSE_BUSH.get(), Blocks.ROSE_BUSH);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_PEONY.get(), Blocks.PEONY);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_TALL_GRASS.get(), Blocks.TALL_GRASS);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_LARGE_FERN.get(), Blocks.LARGE_FERN);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_OAK_LEAVES.get(), Blocks.OAK_LEAVES);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_SPRUCE_LEAVES.get(), Blocks.SPRUCE_LEAVES);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BIRCH_LEAVES.get(), Blocks.BIRCH_LEAVES);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_DARK_OAK_LEAVES.get(), Blocks.DARK_OAK_LEAVES);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ACACIA_LEAVES.get(), Blocks.ACACIA_LEAVES);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_JUNGLE_LEAVES.get(), Blocks.JUNGLE_LEAVES);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_MANGROVE_LEAVES.get(), Blocks.MANGROVE_LEAVES);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_AZALEA_LEAVES.get(), Blocks.AZALEA_LEAVES);
        dropSmallHangingFlowerPotCopperChain(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_FLOWERING_AZALEA_LEAVES.get(), Blocks.FLOWERING_AZALEA_LEAVES);

        dropSelf(ModBlocks.SMALL_TALL_FLOWER_POT.get());
        dropSelf(ModBlocks.SMALL_TALL_UNFIRED_FLOWER_POT.get());
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_OAK_SAPLING.get(), Blocks.OAK_SAPLING.asItem());
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_SPRUCE_SAPLING.get(), Blocks.SPRUCE_SAPLING);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_BIRCH_SAPLING.get(), Blocks.BIRCH_SAPLING);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_JUNGLE_SAPLING.get(), Blocks.JUNGLE_SAPLING);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_ACACIA_SAPLING.get(), Blocks.ACACIA_SAPLING);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_DARK_OAK_SAPLING.get(), Blocks.DARK_OAK_SAPLING);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_MANGROVE_SAPLING.get(), Blocks.MANGROVE_PROPAGULE);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_FERN.get(), Blocks.FERN);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_DANDELION.get(), Blocks.DANDELION);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_POPPY.get(), Blocks.POPPY);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_BLUE_ORCHID.get(), Blocks.BLUE_ORCHID);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_ALLIUM.get(), Blocks.ALLIUM);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_AZURE_BLUET.get(), Blocks.AZURE_BLUET);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_RED_TULIP.get(), Blocks.RED_TULIP);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_ORANGE_TULIP.get(), Blocks.ORANGE_TULIP);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_WHITE_TULIP.get(), Blocks.WHITE_TULIP);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_PINK_TULIP.get(), Blocks.PINK_TULIP);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_OXEYE_DAISY.get(), Blocks.OXEYE_DAISY);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_CORNFLOWER.get(), Blocks.CORNFLOWER);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_LILY_OF_THE_VALLEY.get(), Blocks.LILY_OF_THE_VALLEY);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_WITHER_ROSE.get(), Blocks.WITHER_ROSE);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_RED_MUSHROOM.get(), Blocks.RED_MUSHROOM);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_BROWN_MUSHROOM.get(), Blocks.BROWN_MUSHROOM);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_DEAD_BUSH.get(), Blocks.DEAD_BUSH);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_CACTUS.get(), Blocks.CACTUS);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_BAMBOO.get(), Blocks.BAMBOO);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_CRIMSON_FUNGUS.get(), Blocks.CRIMSON_FUNGUS);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_WARPED_FUNGUS.get(), Blocks.WARPED_FUNGUS);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_CRIMSON_ROOTS.get(), Blocks.CRIMSON_ROOTS);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_WARPED_ROOTS.get(), Blocks.WARPED_ROOTS);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_AZALEA.get(), Blocks.AZALEA);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_FLOWERING_AZALEA.get(), Blocks.FLOWERING_AZALEA);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_BIG_DRIPLEAF.get(), Blocks.BIG_DRIPLEAF);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_GRASS.get(), Blocks.GRASS);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_LILAC.get(), Blocks.LILAC);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_ROSE_BUSH.get(), Blocks.ROSE_BUSH);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_PEONY.get(), Blocks.PEONY);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_TALL_GRASS.get(), Blocks.TALL_GRASS);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_LARGE_FERN.get(), Blocks.LARGE_FERN);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_OAK_LEAVES.get(), Blocks.OAK_LEAVES);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_SPRUCE_LEAVES.get(), Blocks.SPRUCE_LEAVES);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_BIRCH_LEAVES.get(), Blocks.BIRCH_LEAVES);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_DARK_OAK_LEAVES.get(), Blocks.DARK_OAK_LEAVES);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_ACACIA_LEAVES.get(), Blocks.ACACIA_LEAVES);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_JUNGLE_LEAVES.get(), Blocks.JUNGLE_LEAVES);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_MANGROVE_LEAVES.get(), Blocks.MANGROVE_LEAVES);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_AZALEA_LEAVES.get(), Blocks.AZALEA_LEAVES);
        dropSmallTallFlowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(), Blocks.FLOWERING_AZALEA_LEAVES);

        dropSelf(ModBlocks.LARGE_FLOWER_POT.get());
        dropSelf(ModBlocks.LARGE_UNFIRED_FLOWER_POT.get());
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_OAK_SAPLING.get(), Blocks.OAK_SAPLING.asItem());
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_SPRUCE_SAPLING.get(), Blocks.SPRUCE_SAPLING);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_BIRCH_SAPLING.get(), Blocks.BIRCH_SAPLING);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_JUNGLE_SAPLING.get(), Blocks.JUNGLE_SAPLING);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_ACACIA_SAPLING.get(), Blocks.ACACIA_SAPLING);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_DARK_OAK_SAPLING.get(), Blocks.DARK_OAK_SAPLING);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_MANGROVE_SAPLING.get(), Blocks.MANGROVE_PROPAGULE);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_FERN.get(), Blocks.FERN);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_DANDELION.get(), Blocks.DANDELION);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_POPPY.get(), Blocks.POPPY);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_BLUE_ORCHID.get(), Blocks.BLUE_ORCHID);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_ALLIUM.get(), Blocks.ALLIUM);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_AZURE_BLUET.get(), Blocks.AZURE_BLUET);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_RED_TULIP.get(), Blocks.RED_TULIP);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_ORANGE_TULIP.get(), Blocks.ORANGE_TULIP);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_WHITE_TULIP.get(), Blocks.WHITE_TULIP);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_PINK_TULIP.get(), Blocks.PINK_TULIP);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_OXEYE_DAISY.get(), Blocks.OXEYE_DAISY);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_CORNFLOWER.get(), Blocks.CORNFLOWER);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_LILY_OF_THE_VALLEY.get(), Blocks.LILY_OF_THE_VALLEY);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_WITHER_ROSE.get(), Blocks.WITHER_ROSE);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_RED_MUSHROOM.get(), Blocks.RED_MUSHROOM);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_BROWN_MUSHROOM.get(), Blocks.BROWN_MUSHROOM);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_DEAD_BUSH.get(), Blocks.DEAD_BUSH);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_CACTUS.get(), Blocks.CACTUS);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_BAMBOO.get(), Blocks.BAMBOO);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_CRIMSON_FUNGUS.get(), Blocks.CRIMSON_FUNGUS);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_WARPED_FUNGUS.get(), Blocks.WARPED_FUNGUS);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_CRIMSON_ROOTS.get(), Blocks.CRIMSON_ROOTS);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_WARPED_ROOTS.get(), Blocks.WARPED_ROOTS);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_AZALEA.get(), Blocks.AZALEA);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_FLOWERING_AZALEA.get(), Blocks.FLOWERING_AZALEA);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_BIG_DRIPLEAF.get(), Blocks.BIG_DRIPLEAF);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_GRASS.get(), Blocks.GRASS);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_LILAC.get(), Blocks.LILAC);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_ROSE_BUSH.get(), Blocks.ROSE_BUSH);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_PEONY.get(), Blocks.PEONY);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_TALL_GRASS.get(), Blocks.TALL_GRASS);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_LARGE_FERN.get(), Blocks.LARGE_FERN);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_OAK_LEAVES.get(), Blocks.OAK_LEAVES);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_SPRUCE_LEAVES.get(), Blocks.SPRUCE_LEAVES);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_BIRCH_LEAVES.get(), Blocks.BIRCH_LEAVES);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_DARK_OAK_LEAVES.get(), Blocks.DARK_OAK_LEAVES);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_ACACIA_LEAVES.get(), Blocks.ACACIA_LEAVES);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_JUNGLE_LEAVES.get(), Blocks.JUNGLE_LEAVES);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_MANGROVE_LEAVES.get(), Blocks.MANGROVE_LEAVES);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_AZALEA_LEAVES.get(), Blocks.AZALEA_LEAVES);
        dropLargeFlowerPot(ModBlocks.LARGE_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(), Blocks.FLOWERING_AZALEA_LEAVES);

        dropSelf(ModBlocks.LARGE_TALL_FLOWER_POT.get());
        dropSelf(ModBlocks.LARGE_TALL_UNFIRED_FLOWER_POT.get());
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_OAK_SAPLING.get(), Blocks.OAK_SAPLING.asItem());
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_SPRUCE_SAPLING.get(), Blocks.SPRUCE_SAPLING);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_BIRCH_SAPLING.get(), Blocks.BIRCH_SAPLING);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_JUNGLE_SAPLING.get(), Blocks.JUNGLE_SAPLING);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_ACACIA_SAPLING.get(), Blocks.ACACIA_SAPLING);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_DARK_OAK_SAPLING.get(), Blocks.DARK_OAK_SAPLING);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_MANGROVE_SAPLING.get(), Blocks.MANGROVE_PROPAGULE);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_FERN.get(), Blocks.FERN);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_DANDELION.get(), Blocks.DANDELION);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_POPPY.get(), Blocks.POPPY);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_BLUE_ORCHID.get(), Blocks.BLUE_ORCHID);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_ALLIUM.get(), Blocks.ALLIUM);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_AZURE_BLUET.get(), Blocks.AZURE_BLUET);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_RED_TULIP.get(), Blocks.RED_TULIP);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_ORANGE_TULIP.get(), Blocks.ORANGE_TULIP);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_WHITE_TULIP.get(), Blocks.WHITE_TULIP);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_PINK_TULIP.get(), Blocks.PINK_TULIP);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_OXEYE_DAISY.get(), Blocks.OXEYE_DAISY);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_CORNFLOWER.get(), Blocks.CORNFLOWER);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_LILY_OF_THE_VALLEY.get(), Blocks.LILY_OF_THE_VALLEY);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_WITHER_ROSE.get(), Blocks.WITHER_ROSE);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_RED_MUSHROOM.get(), Blocks.RED_MUSHROOM);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_BROWN_MUSHROOM.get(), Blocks.BROWN_MUSHROOM);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_DEAD_BUSH.get(), Blocks.DEAD_BUSH);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_CACTUS.get(), Blocks.CACTUS);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_BAMBOO.get(), Blocks.BAMBOO);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_CRIMSON_FUNGUS.get(), Blocks.CRIMSON_FUNGUS);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_WARPED_FUNGUS.get(), Blocks.WARPED_FUNGUS);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_CRIMSON_ROOTS.get(), Blocks.CRIMSON_ROOTS);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_WARPED_ROOTS.get(), Blocks.WARPED_ROOTS);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_AZALEA.get(), Blocks.AZALEA);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_FLOWERING_AZALEA.get(), Blocks.FLOWERING_AZALEA);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_BIG_DRIPLEAF.get(), Blocks.BIG_DRIPLEAF);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_GRASS.get(), Blocks.GRASS);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_LILAC.get(), Blocks.LILAC);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_ROSE_BUSH.get(), Blocks.ROSE_BUSH);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_PEONY.get(), Blocks.PEONY);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_TALL_GRASS.get(), Blocks.TALL_GRASS);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_LARGE_FERN.get(), Blocks.LARGE_FERN);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_OAK_LEAVES.get(), Blocks.OAK_LEAVES);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_SPRUCE_LEAVES.get(), Blocks.SPRUCE_LEAVES);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_BIRCH_LEAVES.get(), Blocks.BIRCH_LEAVES);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_DARK_OAK_LEAVES.get(), Blocks.DARK_OAK_LEAVES);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_ACACIA_LEAVES.get(), Blocks.ACACIA_LEAVES);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_JUNGLE_LEAVES.get(), Blocks.JUNGLE_LEAVES);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_MANGROVE_LEAVES.get(), Blocks.MANGROVE_LEAVES);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_AZALEA_LEAVES.get(), Blocks.AZALEA_LEAVES);
        dropLargeTallFlowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(), Blocks.FLOWERING_AZALEA_LEAVES);

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    public void dropSmallFlowerPot(Block block, ItemLike itemLike) {
        this.add(block, createSmallFlowerPotItemTable(itemLike));
    }

    public void dropSmallHangingFlowerPotIronChain(Block block, ItemLike itemLike) {
        this.add(block, createSmallHangingFlowerPotIronChainItemTable(itemLike));
    }

    public void dropSmallHangingFlowerPotGoldChain(Block block, ItemLike itemLike) {
        this.add(block, createSmallHangingFlowerPotGoldChainItemTable(itemLike));
    }

    public void dropSmallHangingFlowerPotCopperChain(Block block, ItemLike itemLike) {
        this.add(block, createSmallHangingFlowerPotCopperChainItemTable(itemLike));
    }

    public void dropSmallTallFlowerPot(Block block, ItemLike itemLike) {
        this.add(block, createSmallTallFlowerPotItemTable(itemLike));
    }

    public void dropLargeFlowerPot(Block block, ItemLike itemLike) {
        this.add(block, createLargeFlowerPotItemTable(itemLike));
    }

    public void dropLargeTallFlowerPot(Block block, ItemLike itemLike) {
        this.add(block, createLargeTallFlowerPotItemTable(itemLike));
    }

    public void dropSmallDesertFlowerPot(Block block, ItemLike itemLike) {
        this.add(block, createSmallDesertFlowerPotItemTable(itemLike));
    }

    public void dropSmallJungleFlowerPot(Block block, ItemLike itemLike) {
        this.add(block, createSmallJungleFlowerPotItemTable(itemLike));
    }

    public void dropSmallNetherFlowerPot(Block block, ItemLike itemLike) {
        this.add(block, createSmallNetherFlowerPotItemTable(itemLike));
    }

    public void dropSmallEndFlowerPot(Block block, ItemLike itemLike) {
        this.add(block, createSmallEndFlowerPotItemTable(itemLike));
    }

    protected LootTable.Builder createSmallFlowerPotItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.SMALL_FLOWER_POT.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.SMALL_FLOWER_POT.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

    protected LootTable.Builder createSmallHangingFlowerPotIronChainItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

    protected LootTable.Builder createSmallHangingFlowerPotGoldChainItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

    protected LootTable.Builder createSmallHangingFlowerPotCopperChainItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

    protected LootTable.Builder createSmallTallFlowerPotItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.SMALL_TALL_FLOWER_POT.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.SMALL_TALL_FLOWER_POT.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

    protected LootTable.Builder createLargeFlowerPotItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.LARGE_FLOWER_POT.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.LARGE_FLOWER_POT.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

    protected LootTable.Builder createLargeTallFlowerPotItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.LARGE_TALL_FLOWER_POT.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.LARGE_TALL_FLOWER_POT.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

    protected LootTable.Builder createSmallDesertFlowerPotItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.SMALL_DESERT_FLOWER_POT.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.SMALL_DESERT_FLOWER_POT.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

    protected LootTable.Builder createSmallJungleFlowerPotItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.SMALL_JUNGLE_FLOWER_POT.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.SMALL_JUNGLE_FLOWER_POT.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

    protected LootTable.Builder createSmallNetherFlowerPotItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.SMALL_NETHER_FLOWER_POT.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.SMALL_NETHER_FLOWER_POT.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

    protected LootTable.Builder createSmallEndFlowerPotItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.SMALL_END_FLOWER_POT.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.SMALL_END_FLOWER_POT.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

}
