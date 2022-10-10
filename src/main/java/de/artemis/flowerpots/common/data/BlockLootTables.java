package de.artemis.flowerpots.common.data;

import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.Registration;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
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

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    public void dropSmallFlowerPot(Block block, ItemLike itemLike) {
        this.add(block, createSmallFlowerPotItemTable(itemLike));
    }

    protected static LootTable.Builder createSmallFlowerPotItemTable(ItemLike itemLike) {
        return LootTable.lootTable().withPool(applyExplosionCondition(ModBlocks.SMALL_FLOWER_POT.get(), LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModBlocks.SMALL_FLOWER_POT.get())))).withPool(applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }

}
