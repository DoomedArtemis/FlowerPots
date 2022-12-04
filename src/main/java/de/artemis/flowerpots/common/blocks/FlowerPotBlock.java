package de.artemis.flowerpots.common.blocks;

import de.artemis.flowerpots.common.enums.FlowerPotDirtTypeEnum;
import de.artemis.flowerpots.common.enums.FlowerPotPlantTypeEnum;
import de.artemis.flowerpots.common.enums.FlowerPotPlantTypeVariantEnum;
import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.ModItems;
import de.artemis.flowerpots.common.registration.ModTags;
import de.artemis.flowerpots.common.util.FlowerPotUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import static de.artemis.flowerpots.common.registration.ModEnums.*;
import static net.minecraft.world.InteractionResult.*;

public class FlowerPotBlock extends net.minecraft.world.level.block.FlowerPotBlock {
    protected static final VoxelShape SHAPE_SMALL = Block.box(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);
    protected static final VoxelShape SHAPE_SMALL_TALL = Block.box(5.0D, 0.0D, 5.0D, 11.0D, 11.0D, 11.0D);
    protected static final VoxelShape SHAPE_LARGE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 6.0D, 13.0D);
    protected static final VoxelShape SHAPE_LARGE_TALL = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 11.0D, 13.0D);

    public FlowerPotBlock(Block block, Properties properties) {
        super(block, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FLOWER_POT_PLANT_VARIANT, FlowerPotPlantTypeVariantEnum.DEFAULT).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.DIRT).setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.DEFAULT));
    }

    @NotNull
    @Override
    public VoxelShape getShape(BlockState blockState, @NotNull BlockGetter blockGetter, @NotNull BlockPos blockPos, @NotNull CollisionContext collisionContext) {
        VoxelShape voxelShape = SHAPE_SMALL;

        if (ForgeRegistries.BLOCKS.getKey(blockState.getBlock()).toString().contains("small")) {
            if (ForgeRegistries.BLOCKS.getKey(blockState.getBlock()).toString().contains("tall")) {
                voxelShape = SHAPE_SMALL_TALL;
            }
        } else if (ForgeRegistries.BLOCKS.getKey(blockState.getBlock()).toString().contains("large")) {
            if (ForgeRegistries.BLOCKS.getKey(blockState.getBlock()).toString().contains("tall")) {
                voxelShape = SHAPE_LARGE_TALL;
            } else {
                voxelShape = SHAPE_LARGE;
            }
        }
        return voxelShape;
    }

    @NotNull
    @Override
    public InteractionResult use(@NotNull BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos, @NotNull Player player, @NotNull InteractionHand interactionHand, @NotNull BlockHitResult blockHitResult) {
        if (interactionHand == InteractionHand.OFF_HAND) {
            return PASS;
        }

        if (level.isClientSide) {
            ItemStack itemStackInHand = player.getItemInHand(interactionHand);
            Block content = Block.byItem(blockState.getValue(FLOWER_POT_PLANT).getItem().get());

            if (!blockState.is(ModTags.Block.UNFIRED_FLOWER_POT)) {
                if (itemStackInHand.is(ModItems.GARDENING_SHOVEL.get()) && !blockState.is(ModTags.Block.EMPTY_FLOWER_POT)) {
                    FlowerPotDirtTypeEnum[] dirtTypeEnums = FlowerPotDirtTypeEnum.values();
                    Block[] blocks = {Blocks.DIRT, Blocks.COARSE_DIRT, Blocks.PODZOL, Blocks.ROOTED_DIRT, Blocks.MUD, Blocks.CRIMSON_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.SAND, Blocks.RED_SAND, Blocks.MYCELIUM, Blocks.MOSS_BLOCK, Blocks.CLAY, Blocks.SOUL_SAND, Blocks.GRASS_BLOCK};

                    FlowerPotDirtTypeEnum currentDirtType = blockState.getValue(FLOWER_POT_DIRT);
                    for (int i = 0; i < dirtTypeEnums.length; i++) {
                        FlowerPotDirtTypeEnum loopCurrentDirtType = dirtTypeEnums[i];
                        if (loopCurrentDirtType.equals(currentDirtType)) {
                            level.playLocalSound(blockPos.getX(), blockPos.getY(), blockPos.getZ(), blocks[i].getSoundType(blockState).getPlaceSound(), SoundSource.BLOCKS, 1.0F, 1.0F, false);
                        }
                    }
                } else if (itemStackInHand.is(ModItems.GARDENING_SHEARS.get()) && !blockState.is(ModTags.Block.EMPTY_FLOWER_POT)) {
                    SoundEvent soundEvent = content.getSoundType(blockState).getPlaceSound();
                    level.playSound(player, blockPos, soundEvent, SoundSource.BLOCKS, 1.0F, 1.0F);
                } else if (itemStackInHand.isEmpty() && !blockState.is(ModTags.Block.EMPTY_FLOWER_POT)) {
                    if (!blockState.getValue(FLOWER_POT_PLANT).equals(FlowerPotPlantTypeEnum.DEFAULT)) {
                        SoundEvent soundEvent = content.getSoundType(blockState).getBreakSound();
                        level.playSound(player, blockPos, soundEvent, SoundSource.BLOCKS, 1.0F, 1.0F);
                    }
                } else if (itemStackInHand.is(ModTags.Item.MAY_APPLY_ON_FLOWER_POT) && blockState.getValue(FLOWER_POT_PLANT).equals(FlowerPotPlantTypeEnum.DEFAULT)) {
                    if (itemStackInHand.getItem() instanceof BlockItem blockItem) {
                        SoundEvent soundEvent = blockItem.getBlock().getSoundType(blockState).getPlaceSound();
                        level.playSound(player, blockPos, soundEvent, SoundSource.BLOCKS, 1.0F, 1.0F);
                    }
                }

                level.gameEvent(player, GameEvent.BLOCK_CHANGE, blockPos);
            }
        }

        Block block = blockState.getBlock();
        ItemStack itemStackInHand = player.getItemInHand(interactionHand);
        Item itemInHand = itemStackInHand.getItem();
        boolean success = false;

        if (itemInHand.equals(Blocks.OAK_SAPLING.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_OAK_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.OAK_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.SPRUCE_SAPLING.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_SPRUCE_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.SPRUCE_SAPLING).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.PODZOL), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BIRCH_SAPLING.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_BIRCH_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BIRCH_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.JUNGLE_SAPLING.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_JUNGLE_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.JUNGLE_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.ACACIA_SAPLING.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_ACACIA_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.ACACIA_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.DARK_OAK_SAPLING.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_DARK_OAK_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.DARK_OAK_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.MANGROVE_PROPAGULE.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_MANGROVE_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.MANGROVE_SAPLING).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MUD), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.FERN.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_FERN.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.FERN), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.DANDELION.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_DANDELION.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.DANDELION), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.POPPY.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_POPPY.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.POPPY), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BLUE_ORCHID.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_BLUE_ORCHID.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BLUE_ORCHID), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.ALLIUM.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_ALLIUM.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.ALLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.AZURE_BLUET.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_AZURE_BLUET.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.AZURE_BLUET), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.RED_TULIP.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_RED_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.RED_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.ORANGE_TULIP.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_ORANGE_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.ORANGE_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WHITE_TULIP.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_WHITE_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WHITE_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.PINK_TULIP.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_PINK_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.PINK_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.OXEYE_DAISY.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_OXEYE_DAISY.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.OXEYE_DAISY), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CORNFLOWER.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_CORNFLOWER.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CORNFLOWER), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.LILY_OF_THE_VALLEY.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_LILY_OF_THE_VALLEY.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.LILY_OF_THE_VALLEY), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WITHER_ROSE.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_WITHER_ROSE.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WITHER_ROSE).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.SOUL_SAND), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.RED_MUSHROOM.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_RED_MUSHROOM.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.RED_MUSHROOM).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MYCELIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BROWN_MUSHROOM.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_BROWN_MUSHROOM.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BROWN_MUSHROOM).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MYCELIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.DEAD_BUSH.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_DEAD_BUSH.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.DEAD_BUSH).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.SAND), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CACTUS.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_CACTUS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CACTUS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.SAND), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BAMBOO.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_BAMBOO.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BAMBOO).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.PODZOL), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CRIMSON_FUNGUS.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_CRIMSON_FUNGUS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CRIMSON_FUNGUS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.CRIMSON_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WARPED_FUNGUS.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_WARPED_FUNGUS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WARPED_FUNGUS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.WARPED_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CRIMSON_ROOTS.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_CRIMSON_ROOTS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CRIMSON_ROOTS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.CRIMSON_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WARPED_ROOTS.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_WARPED_ROOTS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WARPED_ROOTS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.WARPED_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.AZALEA.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_AZALEA.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.AZALEA).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MOSS), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.FLOWERING_AZALEA.asItem()) && block.equals(ModBlocks.SMALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT_FLOWERING_AZALEA.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.FLOWRING_AZALEA).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MOSS), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.OAK_SAPLING.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_OAK_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.OAK_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.SPRUCE_SAPLING.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_SPRUCE_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.SPRUCE_SAPLING).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.PODZOL), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BIRCH_SAPLING.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_BIRCH_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BIRCH_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.JUNGLE_SAPLING.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_JUNGLE_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.JUNGLE_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.ACACIA_SAPLING.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_ACACIA_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.ACACIA_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.DARK_OAK_SAPLING.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_DARK_OAK_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.DARK_OAK_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.MANGROVE_PROPAGULE.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_MANGROVE_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.MANGROVE_SAPLING).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MUD), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.FERN.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_FERN.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.FERN), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.DANDELION.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_DANDELION.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.DANDELION), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.POPPY.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_POPPY.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.POPPY), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BLUE_ORCHID.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_BLUE_ORCHID.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BLUE_ORCHID), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.ALLIUM.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_ALLIUM.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.ALLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.AZURE_BLUET.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_AZURE_BLUET.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.AZURE_BLUET), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.RED_TULIP.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_RED_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.RED_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.ORANGE_TULIP.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_ORANGE_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.ORANGE_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WHITE_TULIP.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_WHITE_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WHITE_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.PINK_TULIP.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_PINK_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.PINK_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.OXEYE_DAISY.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_OXEYE_DAISY.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.OXEYE_DAISY), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CORNFLOWER.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_CORNFLOWER.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CORNFLOWER), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.LILY_OF_THE_VALLEY.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_LILY_OF_THE_VALLEY.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.LILY_OF_THE_VALLEY), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WITHER_ROSE.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_WITHER_ROSE.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WITHER_ROSE).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.SOUL_SAND), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.RED_MUSHROOM.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_RED_MUSHROOM.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.RED_MUSHROOM).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MYCELIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BROWN_MUSHROOM.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_BROWN_MUSHROOM.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BROWN_MUSHROOM).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MYCELIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.DEAD_BUSH.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_DEAD_BUSH.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.DEAD_BUSH).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.SAND), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CACTUS.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_CACTUS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CACTUS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.SAND), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BAMBOO.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_BAMBOO.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BAMBOO).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.PODZOL), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CRIMSON_FUNGUS.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_CRIMSON_FUNGUS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CRIMSON_FUNGUS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.CRIMSON_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WARPED_FUNGUS.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_WARPED_FUNGUS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WARPED_FUNGUS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.WARPED_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CRIMSON_ROOTS.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_CRIMSON_ROOTS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CRIMSON_ROOTS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.CRIMSON_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WARPED_ROOTS.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_WARPED_ROOTS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WARPED_ROOTS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.WARPED_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.AZALEA.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_AZALEA.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.AZALEA).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MOSS), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.FLOWERING_AZALEA.asItem()) && block.equals(ModBlocks.SMALL_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT_FLOWERING_AZALEA.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.FLOWRING_AZALEA).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MOSS), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.OAK_SAPLING.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_OAK_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.OAK_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.SPRUCE_SAPLING.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_SPRUCE_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.SPRUCE_SAPLING).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.PODZOL), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BIRCH_SAPLING.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_BIRCH_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BIRCH_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.JUNGLE_SAPLING.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_JUNGLE_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.JUNGLE_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.ACACIA_SAPLING.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_ACACIA_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.ACACIA_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.DARK_OAK_SAPLING.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_DARK_OAK_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.DARK_OAK_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.MANGROVE_PROPAGULE.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_MANGROVE_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.MANGROVE_SAPLING).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MUD), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.FERN.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_FERN.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.FERN), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.DANDELION.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_DANDELION.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.DANDELION), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.POPPY.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_POPPY.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.POPPY), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BLUE_ORCHID.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_BLUE_ORCHID.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BLUE_ORCHID), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.ALLIUM.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_ALLIUM.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.ALLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.AZURE_BLUET.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_AZURE_BLUET.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.AZURE_BLUET), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.RED_TULIP.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_RED_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.RED_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.ORANGE_TULIP.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_ORANGE_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.ORANGE_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WHITE_TULIP.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_WHITE_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WHITE_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.PINK_TULIP.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_PINK_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.PINK_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.OXEYE_DAISY.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_OXEYE_DAISY.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.OXEYE_DAISY), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CORNFLOWER.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_CORNFLOWER.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CORNFLOWER), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.LILY_OF_THE_VALLEY.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_LILY_OF_THE_VALLEY.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.LILY_OF_THE_VALLEY), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WITHER_ROSE.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_WITHER_ROSE.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WITHER_ROSE).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.SOUL_SAND), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.RED_MUSHROOM.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_RED_MUSHROOM.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.RED_MUSHROOM).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MYCELIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BROWN_MUSHROOM.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_BROWN_MUSHROOM.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BROWN_MUSHROOM).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MYCELIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.DEAD_BUSH.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_DEAD_BUSH.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.DEAD_BUSH).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.SAND), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CACTUS.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_CACTUS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CACTUS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.SAND), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BAMBOO.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_BAMBOO.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BAMBOO).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.PODZOL), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CRIMSON_FUNGUS.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_CRIMSON_FUNGUS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CRIMSON_FUNGUS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.CRIMSON_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WARPED_FUNGUS.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_WARPED_FUNGUS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WARPED_FUNGUS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.WARPED_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CRIMSON_ROOTS.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_CRIMSON_ROOTS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CRIMSON_ROOTS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.CRIMSON_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WARPED_ROOTS.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_WARPED_ROOTS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WARPED_ROOTS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.WARPED_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.AZALEA.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_AZALEA.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.AZALEA).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MOSS), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.FLOWERING_AZALEA.asItem()) && block.equals(ModBlocks.LARGE_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT_FLOWERING_AZALEA.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.FLOWRING_AZALEA).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MOSS), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.OAK_SAPLING.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_OAK_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.OAK_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.SPRUCE_SAPLING.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_SPRUCE_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.SPRUCE_SAPLING).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.PODZOL), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BIRCH_SAPLING.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_BIRCH_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BIRCH_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.JUNGLE_SAPLING.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_JUNGLE_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.JUNGLE_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.ACACIA_SAPLING.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_ACACIA_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.ACACIA_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.DARK_OAK_SAPLING.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_DARK_OAK_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.DARK_OAK_SAPLING), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.MANGROVE_PROPAGULE.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_MANGROVE_SAPLING.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.MANGROVE_SAPLING).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MUD), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.FERN.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_FERN.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.FERN), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.DANDELION.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_DANDELION.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.DANDELION), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.POPPY.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_POPPY.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.POPPY), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BLUE_ORCHID.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_BLUE_ORCHID.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BLUE_ORCHID), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.ALLIUM.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_ALLIUM.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.ALLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.AZURE_BLUET.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_AZURE_BLUET.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.AZURE_BLUET), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.RED_TULIP.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_RED_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.RED_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.ORANGE_TULIP.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_ORANGE_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.ORANGE_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WHITE_TULIP.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_WHITE_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WHITE_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.PINK_TULIP.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_PINK_TULIP.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.PINK_TULIP), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.OXEYE_DAISY.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_OXEYE_DAISY.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.OXEYE_DAISY), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CORNFLOWER.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_CORNFLOWER.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CORNFLOWER), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.LILY_OF_THE_VALLEY.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_LILY_OF_THE_VALLEY.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.LILY_OF_THE_VALLEY), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WITHER_ROSE.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_WITHER_ROSE.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WITHER_ROSE).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.SOUL_SAND), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.RED_MUSHROOM.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_RED_MUSHROOM.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.RED_MUSHROOM).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MYCELIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BROWN_MUSHROOM.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_BROWN_MUSHROOM.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BROWN_MUSHROOM).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MYCELIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.DEAD_BUSH.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_DEAD_BUSH.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.DEAD_BUSH).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.SAND), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CACTUS.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_CACTUS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CACTUS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.SAND), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.BAMBOO.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_BAMBOO.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.BAMBOO).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.PODZOL), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CRIMSON_FUNGUS.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_CRIMSON_FUNGUS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CRIMSON_FUNGUS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.CRIMSON_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WARPED_FUNGUS.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_WARPED_FUNGUS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WARPED_FUNGUS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.WARPED_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.CRIMSON_ROOTS.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_CRIMSON_ROOTS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.CRIMSON_ROOTS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.CRIMSON_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.WARPED_ROOTS.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_WARPED_ROOTS.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.WARPED_ROOTS).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.WARPED_NYLIUM), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.AZALEA.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_AZALEA.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.AZALEA).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MOSS), 3);
            success = true;
        } else if (itemInHand.equals(Blocks.FLOWERING_AZALEA.asItem()) && block.equals(ModBlocks.LARGE_TALL_FLOWER_POT.get())) {
            level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT_FLOWERING_AZALEA.get().defaultBlockState().setValue(FLOWER_POT_PLANT, FlowerPotPlantTypeEnum.FLOWRING_AZALEA).setValue(FLOWER_POT_DIRT, FlowerPotDirtTypeEnum.MOSS), 3);
            success = true;
        }

        if (itemStackInHand.is(ModItems.GARDENING_SHOVEL.get()) && !blockState.is(ModTags.Block.EMPTY_FLOWER_POT) && !blockState.is(ModTags.Block.UNFIRED_FLOWER_POT)) {
            blockState = blockState.setValue(FLOWER_POT_DIRT, blockState.getValue(FLOWER_POT_DIRT).getNext());
            level.setBlockAndUpdate(blockPos, blockState);
            success = true;
        }

        if (itemStackInHand.is(ModItems.GARDENING_SHEARS.get()) && !blockState.is(ModTags.Block.EMPTY_FLOWER_POT) && !blockState.is(ModTags.Block.UNFIRED_FLOWER_POT)) {
            blockState = blockState.setValue(FLOWER_POT_PLANT_VARIANT, blockState.getValue(FLOWER_POT_PLANT_VARIANT).getNext());
            level.setBlockAndUpdate(blockPos, blockState);
            success = true;
        }

        if (itemStackInHand.isEmpty() && !blockState.is(ModTags.Block.EMPTY_FLOWER_POT) && !blockState.is(ModTags.Block.UNFIRED_FLOWER_POT)) {
            Item plant = blockState.getValue(FLOWER_POT_PLANT).getItem().get();
            success = true;

            if (FlowerPotUtil.getBlocks("small").contains(block)) {
                if (FlowerPotUtil.getBlocks("tall").contains(block)) {
                    level.setBlock(blockPos, ModBlocks.SMALL_TALL_FLOWER_POT.get().defaultBlockState(), 3);
                } else {
                    level.setBlock(blockPos, ModBlocks.SMALL_FLOWER_POT.get().defaultBlockState(), 3);
                }
            } else if (FlowerPotUtil.getBlocks("large").contains(block)) {
                if (FlowerPotUtil.getBlocks("large_tall").contains(block)) {
                    level.setBlock(blockPos, ModBlocks.LARGE_TALL_FLOWER_POT.get().defaultBlockState(), 3);
                } else {
                    level.setBlock(blockPos, ModBlocks.LARGE_FLOWER_POT.get().defaultBlockState(), 3);
                }
            }

            if (!player.isCreative()) {
                if (player.canTakeItem(new ItemStack(plant))) {
                    player.addItem(new ItemStack(plant));
                } else {
                    ItemEntity itementity = new ItemEntity(level, blockPos.getX() + 0.5F, blockPos.getY(), blockPos.getZ() + 0.5F, new ItemStack(plant));
                    itementity.setDefaultPickUpDelay();
                    level.addFreshEntity(itementity);
                }
            }
        }

        if (success) {
            if (!player.isCreative()) {
                if (itemStackInHand.is(ModItems.GARDENING_SHOVEL.get()) || itemStackInHand.is(ModItems.GARDENING_SHEARS.get())) {
                    itemStackInHand.hurt(1, RandomSource.create(), null);
                } else {
                    itemStackInHand.shrink(1);
                }
            }

            return SUCCESS;
        }

        return FAIL;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder.add(FLOWER_POT_PLANT_VARIANT).add(FLOWER_POT_DIRT).add(FLOWER_POT_PLANT));
    }

}
