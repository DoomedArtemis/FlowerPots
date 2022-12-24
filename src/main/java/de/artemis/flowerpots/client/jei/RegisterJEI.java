package de.artemis.flowerpots.client.jei;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.blocks.FlowerPotBlock;
import de.artemis.flowerpots.common.registration.ModBlocks;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

@JeiPlugin
public class RegisterJEI implements IModPlugin {

    @NotNull
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(FlowerPots.MODID, "jei");
    }

    @Override
    public void registerRecipes(@NotNull IRecipeRegistration registration) {
        ArrayList<ItemStack> stacks = new ArrayList<>();
        FlowerPotBlock[] flowerPotBlocks = {
                ModBlocks.SMALL_FLOWER_POT_OAK_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_SPRUCE_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_BIRCH_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_JUNGLE_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_ACACIA_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_DARK_OAK_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_MANGROVE_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_FERN.get(), ModBlocks.SMALL_FLOWER_POT_DANDELION.get(), ModBlocks.SMALL_FLOWER_POT_POPPY.get(), ModBlocks.SMALL_FLOWER_POT_BLUE_ORCHID.get(), ModBlocks.SMALL_FLOWER_POT_ALLIUM.get(), ModBlocks.SMALL_FLOWER_POT_AZURE_BLUET.get(), ModBlocks.SMALL_FLOWER_POT_RED_TULIP.get(), ModBlocks.SMALL_FLOWER_POT_ORANGE_TULIP.get(), ModBlocks.SMALL_FLOWER_POT_WHITE_TULIP.get(), ModBlocks.SMALL_FLOWER_POT_PINK_TULIP.get(), ModBlocks.SMALL_FLOWER_POT_OXEYE_DAISY.get(), ModBlocks.SMALL_FLOWER_POT_CORNFLOWER.get(), ModBlocks.SMALL_FLOWER_POT_LILY_OF_THE_VALLEY.get(), ModBlocks.SMALL_FLOWER_POT_WITHER_ROSE.get(), ModBlocks.SMALL_FLOWER_POT_RED_MUSHROOM.get(), ModBlocks.SMALL_FLOWER_POT_BROWN_MUSHROOM.get(), ModBlocks.SMALL_FLOWER_POT_DEAD_BUSH.get(), ModBlocks.SMALL_FLOWER_POT_CACTUS.get(), ModBlocks.SMALL_FLOWER_POT_BAMBOO.get(), ModBlocks.SMALL_FLOWER_POT_CRIMSON_FUNGUS.get(), ModBlocks.SMALL_FLOWER_POT_WARPED_FUNGUS.get(), ModBlocks.SMALL_FLOWER_POT_CRIMSON_ROOTS.get(), ModBlocks.SMALL_FLOWER_POT_WARPED_ROOTS.get(), ModBlocks.SMALL_FLOWER_POT_AZALEA.get(), ModBlocks.SMALL_FLOWER_POT_FLOWERING_AZALEA.get(), ModBlocks.SMALL_FLOWER_POT_BIG_DRIPLEAF.get(), ModBlocks.SMALL_FLOWER_POT_GRASS.get(), ModBlocks.SMALL_FLOWER_POT_LILAC.get(), ModBlocks.SMALL_FLOWER_POT_ROSE_BUSH.get(), ModBlocks.SMALL_FLOWER_POT_PEONY.get(), ModBlocks.SMALL_FLOWER_POT_TALL_GRASS.get(), ModBlocks.SMALL_FLOWER_POT_LARGE_FERN.get(), ModBlocks.SMALL_FLOWER_POT_OAK_LEAVES.get(), ModBlocks.SMALL_FLOWER_POT_SPRUCE_LEAVES.get(), ModBlocks.SMALL_FLOWER_POT_BIRCH_LEAVES.get(), ModBlocks.SMALL_FLOWER_POT_DARK_OAK_LEAVES.get(), ModBlocks.SMALL_FLOWER_POT_ACACIA_LEAVES.get(), ModBlocks.SMALL_FLOWER_POT_JUNGLE_LEAVES.get(), ModBlocks.SMALL_FLOWER_POT_MANGROVE_LEAVES.get(), ModBlocks.SMALL_FLOWER_POT_AZALEA_LEAVES.get(), ModBlocks.SMALL_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(),
                ModBlocks.SMALL_TALL_FLOWER_POT_OAK_SAPLING.get(), ModBlocks.SMALL_TALL_FLOWER_POT_SPRUCE_SAPLING.get(), ModBlocks.SMALL_TALL_FLOWER_POT_BIRCH_SAPLING.get(), ModBlocks.SMALL_TALL_FLOWER_POT_JUNGLE_SAPLING.get(), ModBlocks.SMALL_TALL_FLOWER_POT_ACACIA_SAPLING.get(), ModBlocks.SMALL_TALL_FLOWER_POT_DARK_OAK_SAPLING.get(), ModBlocks.SMALL_TALL_FLOWER_POT_MANGROVE_SAPLING.get(), ModBlocks.SMALL_TALL_FLOWER_POT_FERN.get(), ModBlocks.SMALL_TALL_FLOWER_POT_DANDELION.get(), ModBlocks.SMALL_TALL_FLOWER_POT_POPPY.get(), ModBlocks.SMALL_TALL_FLOWER_POT_BLUE_ORCHID.get(), ModBlocks.SMALL_TALL_FLOWER_POT_ALLIUM.get(), ModBlocks.SMALL_TALL_FLOWER_POT_AZURE_BLUET.get(), ModBlocks.SMALL_TALL_FLOWER_POT_RED_TULIP.get(), ModBlocks.SMALL_TALL_FLOWER_POT_ORANGE_TULIP.get(), ModBlocks.SMALL_TALL_FLOWER_POT_WHITE_TULIP.get(), ModBlocks.SMALL_TALL_FLOWER_POT_PINK_TULIP.get(), ModBlocks.SMALL_TALL_FLOWER_POT_OXEYE_DAISY.get(), ModBlocks.SMALL_TALL_FLOWER_POT_CORNFLOWER.get(), ModBlocks.SMALL_TALL_FLOWER_POT_LILY_OF_THE_VALLEY.get(), ModBlocks.SMALL_TALL_FLOWER_POT_WITHER_ROSE.get(), ModBlocks.SMALL_TALL_FLOWER_POT_RED_MUSHROOM.get(), ModBlocks.SMALL_TALL_FLOWER_POT_BROWN_MUSHROOM.get(), ModBlocks.SMALL_TALL_FLOWER_POT_DEAD_BUSH.get(), ModBlocks.SMALL_TALL_FLOWER_POT_CACTUS.get(), ModBlocks.SMALL_TALL_FLOWER_POT_BAMBOO.get(), ModBlocks.SMALL_TALL_FLOWER_POT_CRIMSON_FUNGUS.get(), ModBlocks.SMALL_TALL_FLOWER_POT_WARPED_FUNGUS.get(), ModBlocks.SMALL_TALL_FLOWER_POT_CRIMSON_ROOTS.get(), ModBlocks.SMALL_TALL_FLOWER_POT_WARPED_ROOTS.get(), ModBlocks.SMALL_TALL_FLOWER_POT_AZALEA.get(), ModBlocks.SMALL_TALL_FLOWER_POT_FLOWERING_AZALEA.get(), ModBlocks.SMALL_TALL_FLOWER_POT_BIG_DRIPLEAF.get(), ModBlocks.SMALL_TALL_FLOWER_POT_GRASS.get(), ModBlocks.SMALL_TALL_FLOWER_POT_LILAC.get(), ModBlocks.SMALL_TALL_FLOWER_POT_ROSE_BUSH.get(), ModBlocks.SMALL_TALL_FLOWER_POT_PEONY.get(), ModBlocks.SMALL_TALL_FLOWER_POT_TALL_GRASS.get(), ModBlocks.SMALL_TALL_FLOWER_POT_LARGE_FERN.get(), ModBlocks.SMALL_TALL_FLOWER_POT_OAK_LEAVES.get(), ModBlocks.SMALL_TALL_FLOWER_POT_SPRUCE_LEAVES.get(), ModBlocks.SMALL_TALL_FLOWER_POT_BIRCH_LEAVES.get(), ModBlocks.SMALL_TALL_FLOWER_POT_DARK_OAK_LEAVES.get(), ModBlocks.SMALL_TALL_FLOWER_POT_ACACIA_LEAVES.get(), ModBlocks.SMALL_TALL_FLOWER_POT_JUNGLE_LEAVES.get(), ModBlocks.SMALL_TALL_FLOWER_POT_MANGROVE_LEAVES.get(), ModBlocks.SMALL_TALL_FLOWER_POT_AZALEA_LEAVES.get(), ModBlocks.SMALL_TALL_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(),
                ModBlocks.LARGE_FLOWER_POT_OAK_SAPLING.get(), ModBlocks.LARGE_FLOWER_POT_SPRUCE_SAPLING.get(), ModBlocks.LARGE_FLOWER_POT_BIRCH_SAPLING.get(), ModBlocks.LARGE_FLOWER_POT_JUNGLE_SAPLING.get(), ModBlocks.LARGE_FLOWER_POT_ACACIA_SAPLING.get(), ModBlocks.LARGE_FLOWER_POT_DARK_OAK_SAPLING.get(), ModBlocks.LARGE_FLOWER_POT_MANGROVE_SAPLING.get(), ModBlocks.LARGE_FLOWER_POT_FERN.get(), ModBlocks.LARGE_FLOWER_POT_DANDELION.get(), ModBlocks.LARGE_FLOWER_POT_POPPY.get(), ModBlocks.LARGE_FLOWER_POT_BLUE_ORCHID.get(), ModBlocks.LARGE_FLOWER_POT_ALLIUM.get(), ModBlocks.LARGE_FLOWER_POT_AZURE_BLUET.get(), ModBlocks.LARGE_FLOWER_POT_RED_TULIP.get(), ModBlocks.LARGE_FLOWER_POT_ORANGE_TULIP.get(), ModBlocks.LARGE_FLOWER_POT_WHITE_TULIP.get(), ModBlocks.LARGE_FLOWER_POT_PINK_TULIP.get(), ModBlocks.LARGE_FLOWER_POT_OXEYE_DAISY.get(), ModBlocks.LARGE_FLOWER_POT_CORNFLOWER.get(), ModBlocks.LARGE_FLOWER_POT_LILY_OF_THE_VALLEY.get(), ModBlocks.LARGE_FLOWER_POT_WITHER_ROSE.get(), ModBlocks.LARGE_FLOWER_POT_RED_MUSHROOM.get(), ModBlocks.LARGE_FLOWER_POT_BROWN_MUSHROOM.get(), ModBlocks.LARGE_FLOWER_POT_DEAD_BUSH.get(), ModBlocks.LARGE_FLOWER_POT_CACTUS.get(), ModBlocks.LARGE_FLOWER_POT_BAMBOO.get(), ModBlocks.LARGE_FLOWER_POT_CRIMSON_FUNGUS.get(), ModBlocks.LARGE_FLOWER_POT_WARPED_FUNGUS.get(), ModBlocks.LARGE_FLOWER_POT_CRIMSON_ROOTS.get(), ModBlocks.LARGE_FLOWER_POT_WARPED_ROOTS.get(), ModBlocks.LARGE_FLOWER_POT_AZALEA.get(), ModBlocks.LARGE_FLOWER_POT_FLOWERING_AZALEA.get(), ModBlocks.LARGE_FLOWER_POT_BIG_DRIPLEAF.get(), ModBlocks.LARGE_FLOWER_POT_GRASS.get(), ModBlocks.LARGE_FLOWER_POT_LILAC.get(), ModBlocks.LARGE_FLOWER_POT_ROSE_BUSH.get(), ModBlocks.LARGE_FLOWER_POT_PEONY.get(), ModBlocks.LARGE_FLOWER_POT_TALL_GRASS.get(), ModBlocks.LARGE_FLOWER_POT_LARGE_FERN.get(), ModBlocks.LARGE_FLOWER_POT_OAK_LEAVES.get(), ModBlocks.LARGE_FLOWER_POT_SPRUCE_LEAVES.get(), ModBlocks.LARGE_FLOWER_POT_BIRCH_LEAVES.get(), ModBlocks.LARGE_FLOWER_POT_DARK_OAK_LEAVES.get(), ModBlocks.LARGE_FLOWER_POT_ACACIA_LEAVES.get(), ModBlocks.LARGE_FLOWER_POT_JUNGLE_LEAVES.get(), ModBlocks.LARGE_FLOWER_POT_MANGROVE_LEAVES.get(), ModBlocks.LARGE_FLOWER_POT_AZALEA_LEAVES.get(), ModBlocks.LARGE_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(),
                ModBlocks.LARGE_TALL_FLOWER_POT_OAK_SAPLING.get(), ModBlocks.LARGE_TALL_FLOWER_POT_SPRUCE_SAPLING.get(), ModBlocks.LARGE_TALL_FLOWER_POT_BIRCH_SAPLING.get(), ModBlocks.LARGE_TALL_FLOWER_POT_JUNGLE_SAPLING.get(), ModBlocks.LARGE_TALL_FLOWER_POT_ACACIA_SAPLING.get(), ModBlocks.LARGE_TALL_FLOWER_POT_DARK_OAK_SAPLING.get(), ModBlocks.LARGE_TALL_FLOWER_POT_MANGROVE_SAPLING.get(), ModBlocks.LARGE_TALL_FLOWER_POT_FERN.get(), ModBlocks.LARGE_TALL_FLOWER_POT_DANDELION.get(), ModBlocks.LARGE_TALL_FLOWER_POT_POPPY.get(), ModBlocks.LARGE_TALL_FLOWER_POT_BLUE_ORCHID.get(), ModBlocks.LARGE_TALL_FLOWER_POT_ALLIUM.get(), ModBlocks.LARGE_TALL_FLOWER_POT_AZURE_BLUET.get(), ModBlocks.LARGE_TALL_FLOWER_POT_RED_TULIP.get(), ModBlocks.LARGE_TALL_FLOWER_POT_ORANGE_TULIP.get(), ModBlocks.LARGE_TALL_FLOWER_POT_WHITE_TULIP.get(), ModBlocks.LARGE_TALL_FLOWER_POT_PINK_TULIP.get(), ModBlocks.LARGE_TALL_FLOWER_POT_OXEYE_DAISY.get(), ModBlocks.LARGE_TALL_FLOWER_POT_CORNFLOWER.get(), ModBlocks.LARGE_TALL_FLOWER_POT_LILY_OF_THE_VALLEY.get(), ModBlocks.LARGE_TALL_FLOWER_POT_WITHER_ROSE.get(), ModBlocks.LARGE_TALL_FLOWER_POT_RED_MUSHROOM.get(), ModBlocks.LARGE_TALL_FLOWER_POT_BROWN_MUSHROOM.get(), ModBlocks.LARGE_TALL_FLOWER_POT_DEAD_BUSH.get(), ModBlocks.LARGE_TALL_FLOWER_POT_CACTUS.get(), ModBlocks.LARGE_TALL_FLOWER_POT_BAMBOO.get(), ModBlocks.LARGE_TALL_FLOWER_POT_CRIMSON_FUNGUS.get(), ModBlocks.LARGE_TALL_FLOWER_POT_WARPED_FUNGUS.get(), ModBlocks.LARGE_TALL_FLOWER_POT_CRIMSON_ROOTS.get(), ModBlocks.LARGE_TALL_FLOWER_POT_WARPED_ROOTS.get(), ModBlocks.LARGE_TALL_FLOWER_POT_AZALEA.get(), ModBlocks.LARGE_TALL_FLOWER_POT_FLOWERING_AZALEA.get(), ModBlocks.LARGE_TALL_FLOWER_POT_BIG_DRIPLEAF.get(), ModBlocks.LARGE_TALL_FLOWER_POT_GRASS.get(), ModBlocks.LARGE_TALL_FLOWER_POT_LILAC.get(), ModBlocks.LARGE_TALL_FLOWER_POT_ROSE_BUSH.get(), ModBlocks.LARGE_TALL_FLOWER_POT_PEONY.get(), ModBlocks.LARGE_TALL_FLOWER_POT_TALL_GRASS.get(), ModBlocks.LARGE_TALL_FLOWER_POT_LARGE_FERN.get(), ModBlocks.LARGE_TALL_FLOWER_POT_OAK_LEAVES.get(), ModBlocks.LARGE_TALL_FLOWER_POT_SPRUCE_LEAVES.get(), ModBlocks.LARGE_TALL_FLOWER_POT_BIRCH_LEAVES.get(), ModBlocks.LARGE_TALL_FLOWER_POT_DARK_OAK_LEAVES.get(), ModBlocks.LARGE_TALL_FLOWER_POT_ACACIA_LEAVES.get(), ModBlocks.LARGE_TALL_FLOWER_POT_JUNGLE_LEAVES.get(), ModBlocks.LARGE_TALL_FLOWER_POT_MANGROVE_LEAVES.get(), ModBlocks.LARGE_TALL_FLOWER_POT_AZALEA_LEAVES.get(), ModBlocks.LARGE_TALL_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(),
                ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_OAK_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_SPRUCE_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BIRCH_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_JUNGLE_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ACACIA_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_DARK_OAK_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_MANGROVE_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_FERN.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_DANDELION.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_POPPY.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BLUE_ORCHID.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ALLIUM.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_AZURE_BLUET.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_RED_TULIP.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ORANGE_TULIP.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_WHITE_TULIP.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_PINK_TULIP.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_OXEYE_DAISY.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_CORNFLOWER.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_LILY_OF_THE_VALLEY.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_WITHER_ROSE.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_RED_MUSHROOM.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BROWN_MUSHROOM.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_DEAD_BUSH.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_CACTUS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BAMBOO.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_CRIMSON_FUNGUS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_WARPED_FUNGUS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_CRIMSON_ROOTS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_WARPED_ROOTS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_AZALEA.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_FLOWERING_AZALEA.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BIG_DRIPLEAF.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_GRASS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_LILAC.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ROSE_BUSH.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_PEONY.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_TALL_GRASS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_LARGE_FERN.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_OAK_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_SPRUCE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BIRCH_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_DARK_OAK_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ACACIA_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_JUNGLE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_MANGROVE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_AZALEA_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_FLOWERING_AZALEA_LEAVES.get(),
                ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_OAK_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_SPRUCE_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BIRCH_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_JUNGLE_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ACACIA_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_DARK_OAK_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_MANGROVE_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_FERN.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_DANDELION.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_POPPY.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BLUE_ORCHID.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ALLIUM.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_AZURE_BLUET.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_RED_TULIP.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ORANGE_TULIP.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_WHITE_TULIP.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_PINK_TULIP.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_OXEYE_DAISY.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_CORNFLOWER.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_LILY_OF_THE_VALLEY.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_WITHER_ROSE.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_RED_MUSHROOM.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BROWN_MUSHROOM.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_DEAD_BUSH.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_CACTUS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BAMBOO.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_CRIMSON_FUNGUS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_WARPED_FUNGUS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_CRIMSON_ROOTS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_WARPED_ROOTS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_AZALEA.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_FLOWERING_AZALEA.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BIG_DRIPLEAF.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_GRASS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_LILAC.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ROSE_BUSH.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_PEONY.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_TALL_GRASS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_LARGE_FERN.get(),  ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_OAK_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_SPRUCE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BIRCH_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_DARK_OAK_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ACACIA_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_JUNGLE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_MANGROVE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_AZALEA_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_FLOWERING_AZALEA_LEAVES.get(),
                ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_OAK_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_SPRUCE_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BIRCH_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_JUNGLE_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ACACIA_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_DARK_OAK_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_MANGROVE_SAPLING.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_FERN.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_DANDELION.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_POPPY.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BLUE_ORCHID.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ALLIUM.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_AZURE_BLUET.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_RED_TULIP.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ORANGE_TULIP.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_WHITE_TULIP.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_PINK_TULIP.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_OXEYE_DAISY.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_CORNFLOWER.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_LILY_OF_THE_VALLEY.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_WITHER_ROSE.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_RED_MUSHROOM.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BROWN_MUSHROOM.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_DEAD_BUSH.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_CACTUS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BAMBOO.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_CRIMSON_FUNGUS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_WARPED_FUNGUS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_CRIMSON_ROOTS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_WARPED_ROOTS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_AZALEA.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_FLOWERING_AZALEA.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BIG_DRIPLEAF.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_GRASS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_LILAC.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ROSE_BUSH.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_PEONY.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_TALL_GRASS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_LARGE_FERN.get(),  ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_OAK_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_SPRUCE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BIRCH_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_DARK_OAK_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ACACIA_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_JUNGLE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_MANGROVE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_AZALEA_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_FLOWERING_AZALEA_LEAVES.get()
        };
        for (FlowerPotBlock flowerPotBlock : flowerPotBlocks) {
            stacks.add(new ItemStack(flowerPotBlock));
        }

        registration.getIngredientManager().removeIngredientsAtRuntime(VanillaTypes.ITEM_STACK, stacks);
        IModPlugin.super.registerRecipes(registration);
    }
}
