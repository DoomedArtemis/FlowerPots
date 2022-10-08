package de.artemis.flowerpots.common.blocks;

import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.ModItems;
import de.artemis.flowerpots.common.util.FlowerPotDirtVariant;
import de.artemis.flowerpots.common.util.FlowerPotPlant;
import de.artemis.flowerpots.common.util.FlowerPotPlantVariant;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import static de.artemis.flowerpots.common.util.ModBlockStateProperties.*;
import static net.minecraft.world.InteractionResult.FAIL;
import static net.minecraft.world.InteractionResult.SUCCESS;

public class SmallFlowerPotBlock extends FlowerPotBlock {
    public SmallFlowerPotBlock(Block block, Properties properties) {
        super(block, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FLOWER_POT_PLANT_VARIANT, FlowerPotPlantVariant.DEFAULT).setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.DIRT));
    }

    public @NotNull InteractionResult use(@NotNull BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos, Player player, @NotNull InteractionHand interactionHand, @NotNull BlockHitResult blockHitResult) {
        ItemStack itemInHand = player.getItemInHand(interactionHand);
        boolean success = false;

        if (itemInHand.getItem().equals(Blocks.OAK_SAPLING.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_OAK_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.OAK_SAPLING), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.SPRUCE_SAPLING.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_SPRUCE_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.SPRUCE_SAPLING).setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.PODZOL), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.BIRCH_SAPLING.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_BIRCH_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.BIRCH_SAPLING), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.JUNGLE_SAPLING.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_JUNGLE_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.JUNGLE_SAPLING), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.ACACIA_SAPLING.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_ACACIA_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.ACACIA_SAPLING), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.DARK_OAK_SAPLING.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_DARK_OAK_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.DARK_OAK_SAPLING), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.MANGROVE_PROPAGULE.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_MANGROVE_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.MANGROVE_SAPLING).setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.MUD), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.FERN.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_FERN.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.FERN), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.DANDELION.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_DANDELION.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.DANDELION), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.POPPY.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_POPPY.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.POPPY), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.BLUE_ORCHID.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_BLUE_ORCHID.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.BLUE_ORCHID), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.ALLIUM.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_ALLIUM.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.ALLIUM), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.AZURE_BLUET.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_AZURE_BLUET.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.AZURE_BLUET), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.RED_TULIP.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_RED_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.RED_TULIP), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.ORANGE_TULIP.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_ORANGE_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.ORANGE_TULIP), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.WHITE_TULIP.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_WHITE_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.WHITE_TULIP), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.PINK_TULIP.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_PINK_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.PINK_TULIP), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.OXEYE_DAISY.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_OXEYE_DAISY.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.OXEYE_DAISY), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.CORNFLOWER.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_CORNFLOWER.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.CORNFLOWER), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.LILY_OF_THE_VALLEY.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_LILY_OF_THE_VALLEY.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.LILY_OF_THE_VALLEY), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.WITHER_ROSE.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_WITHER_ROSE.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.WITHER_ROSE), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.RED_MUSHROOM.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_RED_MUSHROOM.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.RED_MUSHROOM).setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.MYCELIUM), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.BROWN_MUSHROOM.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_BROWN_MUSHROOM.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.BROWN_MUSHROOM).setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.MYCELIUM), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.DEAD_BUSH.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_DEAD_BUSH.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.DEAD_BUSH).setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.SAND), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.CACTUS.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_CACTUS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.CACTUS).setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.SAND), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.BAMBOO.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_BAMBOO.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.BAMBOO).setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.PODZOL), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.CRIMSON_FUNGUS.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_CRIMSON_FUNGUS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.CRIMSON_FUNGUS).setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.CRIMSON_NYLIUM), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.WARPED_FUNGUS.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_WARPED_FUNGUS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.WARPED_FUNGUS).setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.WARPED_NYLIUM), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.CRIMSON_ROOTS.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_CRIMSON_ROOTS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.CRIMSON_ROOTS).setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.CRIMSON_NYLIUM), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.WARPED_ROOTS.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_WARPED_ROOTS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.WARPED_ROOTS).setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.WARPED_NYLIUM), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.AZALEA.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_AZALEA.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.AZALEA).setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.MOSS), 3);
            success = true;
        } else if (itemInHand.getItem().equals(Blocks.FLOWERING_AZALEA.asItem()) && blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_FLOWERING_AZALEA.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlant.FLOWRING_AZALEA).setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.MOSS), 3);
            success = true;
        }

        if (itemInHand.getItem().equals(ModItems.GARDENING_SHOVEL.get())) {
            if (blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get()) || blockState.getBlock().equals(ModBlocks.SMALL_UNFIRED_FLOWER_POT.get())) {
                success = false;
            } else if (blockState.getValue(FLOWER_POT_DIRT_VARIANT).equals(FlowerPotDirtVariant.GRASS_BLOCK)) {
                blockState = blockState.setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.DIRT);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            } else if (blockState.getValue(FLOWER_POT_DIRT_VARIANT).equals(FlowerPotDirtVariant.DIRT)) {
                blockState = blockState.setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.COARSE_DIRT);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            } else if (blockState.getValue(FLOWER_POT_DIRT_VARIANT).equals(FlowerPotDirtVariant.COARSE_DIRT)) {
                blockState = blockState.setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.PODZOL);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            } else if (blockState.getValue(FLOWER_POT_DIRT_VARIANT).equals(FlowerPotDirtVariant.PODZOL)) {
                blockState = blockState.setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.ROOTED_DIRT);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            } else if (blockState.getValue(FLOWER_POT_DIRT_VARIANT).equals(FlowerPotDirtVariant.ROOTED_DIRT)) {
                blockState = blockState.setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.MUD);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            } else if (blockState.getValue(FLOWER_POT_DIRT_VARIANT).equals(FlowerPotDirtVariant.MUD)) {
                blockState = blockState.setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.CRIMSON_NYLIUM);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            } else if (blockState.getValue(FLOWER_POT_DIRT_VARIANT).equals(FlowerPotDirtVariant.CRIMSON_NYLIUM)) {
                blockState = blockState.setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.WARPED_NYLIUM);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            } else if (blockState.getValue(FLOWER_POT_DIRT_VARIANT).equals(FlowerPotDirtVariant.WARPED_NYLIUM)) {
                blockState = blockState.setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.SAND);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            } else if (blockState.getValue(FLOWER_POT_DIRT_VARIANT).equals(FlowerPotDirtVariant.SAND)) {
                blockState = blockState.setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.RED_SAND);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            } else if (blockState.getValue(FLOWER_POT_DIRT_VARIANT).equals(FlowerPotDirtVariant.RED_SAND)) {
                blockState = blockState.setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.MYCELIUM);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            } else if (blockState.getValue(FLOWER_POT_DIRT_VARIANT).equals(FlowerPotDirtVariant.MYCELIUM)) {
                blockState = blockState.setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.MOSS);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            } else if (blockState.getValue(FLOWER_POT_DIRT_VARIANT).equals(FlowerPotDirtVariant.MOSS)) {
                blockState = blockState.setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.CLAY);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            } else if (blockState.getValue(FLOWER_POT_DIRT_VARIANT).equals(FlowerPotDirtVariant.CLAY)) {
                blockState = blockState.setValue(FLOWER_POT_DIRT_VARIANT, FlowerPotDirtVariant.GRASS_BLOCK);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            }
        }

        if (itemInHand.getItem().equals(Items.SHEARS)) {
            if (blockState.getBlock().equals(ModBlocks.SMALL_FLOWER_POT.get()) || blockState.getBlock().equals(ModBlocks.SMALL_UNFIRED_FLOWER_POT.get())) {
                success = false;
            } else if (blockState.getValue(FLOWER_POT_PLANT_VARIANT).equals(FlowerPotPlantVariant.DEFAULT)) {
                blockState = blockState.setValue(FLOWER_POT_PLANT_VARIANT, FlowerPotPlantVariant.VARIANT_0);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            } else if (blockState.getValue(FLOWER_POT_PLANT_VARIANT).equals(FlowerPotPlantVariant.VARIANT_0)) {
                blockState = blockState.setValue(FLOWER_POT_PLANT_VARIANT, FlowerPotPlantVariant.VARIANT_1);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            } else if (blockState.getValue(FLOWER_POT_PLANT_VARIANT).equals(FlowerPotPlantVariant.VARIANT_1)) {
                blockState = blockState.setValue(FLOWER_POT_PLANT_VARIANT, FlowerPotPlantVariant.VARIANT_2);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            } else if (blockState.getValue(FLOWER_POT_PLANT_VARIANT).equals(FlowerPotPlantVariant.VARIANT_2)) {
                blockState = blockState.setValue(FLOWER_POT_PLANT_VARIANT, FlowerPotPlantVariant.DEFAULT);
                level.setBlockAndUpdate(blockPos, blockState);
                success = true;
            }
        }

        if (success) {
            if (itemInHand.is(ModItems.GARDENING_SHOVEL.get())) {
                level.playSound(player, blockPos, SoundEvents.ROOTED_DIRT_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
            } else if (itemInHand.is(Tags.Items.SHEARS)) {
                level.playSound(player, blockPos, SoundEvents.MOSS_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
            }

            if (!player.isCreative()) {
                if (itemInHand.is(ModItems.GARDENING_SHOVEL.get()) || itemInHand.is(Tags.Items.SHEARS)) {
                    itemInHand.hurt(1, RandomSource.create(), null);
                } else {
                    itemInHand.shrink(1);
                }
            }

            return SUCCESS;
        }

        return FAIL;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder.add(FLOWER_POT_PLANT_VARIANT).add(FLOWER_POT_DIRT_VARIANT).add(FLOWER_POT_PLANT));
    }
}
