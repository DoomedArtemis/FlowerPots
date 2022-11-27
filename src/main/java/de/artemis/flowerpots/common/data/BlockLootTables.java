package de.artemis.flowerpots.common.data;

import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.Registration;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

public class BlockLootTables extends BlockLoot {

    @Override
    protected void addTables() {
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

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    public void dropSmallFlowerPot(Block block, ItemLike itemLike) {
        this.add(block, createSmallFlowerPotItemTable(itemLike));
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

    protected static LootTable.Builder createSmallFlowerPotItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.SMALL_FLOWER_POT.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.SMALL_FLOWER_POT.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

    protected static LootTable.Builder createSmallTallFlowerPotItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.SMALL_TALL_FLOWER_POT.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.SMALL_TALL_FLOWER_POT.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

    protected static LootTable.Builder createLargeFlowerPotItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.LARGE_FLOWER_POT.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.LARGE_FLOWER_POT.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

    protected static LootTable.Builder createLargeTallFlowerPotItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.LARGE_TALL_FLOWER_POT.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.LARGE_TALL_FLOWER_POT.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

}
