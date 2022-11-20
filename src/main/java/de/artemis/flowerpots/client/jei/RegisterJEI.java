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
        FlowerPotBlock[] flowerPotBlocks = {ModBlocks.SMALL_FLOWER_POT_OAK_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_SPRUCE_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_BIRCH_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_JUNGLE_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_ACACIA_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_DARK_OAK_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_MANGROVE_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_FERN.get(), ModBlocks.SMALL_FLOWER_POT_DANDELION.get(), ModBlocks.SMALL_FLOWER_POT_POPPY.get(), ModBlocks.SMALL_FLOWER_POT_BLUE_ORCHID.get(), ModBlocks.SMALL_FLOWER_POT_ALLIUM.get(), ModBlocks.SMALL_FLOWER_POT_AZURE_BLUET.get(), ModBlocks.SMALL_FLOWER_POT_RED_TULIP.get(), ModBlocks.SMALL_FLOWER_POT_ORANGE_TULIP.get(), ModBlocks.SMALL_FLOWER_POT_WHITE_TULIP.get(), ModBlocks.SMALL_FLOWER_POT_PINK_TULIP.get(), ModBlocks.SMALL_FLOWER_POT_OXEYE_DAISY.get(), ModBlocks.SMALL_FLOWER_POT_CORNFLOWER.get(), ModBlocks.SMALL_FLOWER_POT_LILY_OF_THE_VALLEY.get(), ModBlocks.SMALL_FLOWER_POT_WITHER_ROSE.get(), ModBlocks.SMALL_FLOWER_POT_RED_MUSHROOM.get(), ModBlocks.SMALL_FLOWER_POT_BROWN_MUSHROOM.get(), ModBlocks.SMALL_FLOWER_POT_DEAD_BUSH.get(), ModBlocks.SMALL_FLOWER_POT_CACTUS.get(), ModBlocks.SMALL_FLOWER_POT_BAMBOO.get(), ModBlocks.SMALL_FLOWER_POT_CRIMSON_FUNGUS.get(), ModBlocks.SMALL_FLOWER_POT_WARPED_FUNGUS.get(), ModBlocks.SMALL_FLOWER_POT_CRIMSON_ROOTS.get(), ModBlocks.SMALL_FLOWER_POT_WARPED_ROOTS.get(), ModBlocks.SMALL_FLOWER_POT_AZALEA.get(), ModBlocks.SMALL_FLOWER_POT_FLOWERING_AZALEA.get(), ModBlocks.TALL_FLOWER_POT_OAK_SAPLING.get(), ModBlocks.TALL_FLOWER_POT_SPRUCE_SAPLING.get(), ModBlocks.TALL_FLOWER_POT_BIRCH_SAPLING.get(), ModBlocks.TALL_FLOWER_POT_JUNGLE_SAPLING.get(), ModBlocks.TALL_FLOWER_POT_ACACIA_SAPLING.get(), ModBlocks.TALL_FLOWER_POT_DARK_OAK_SAPLING.get(), ModBlocks.TALL_FLOWER_POT_MANGROVE_SAPLING.get(), ModBlocks.TALL_FLOWER_POT_FERN.get(), ModBlocks.TALL_FLOWER_POT_DANDELION.get(), ModBlocks.TALL_FLOWER_POT_POPPY.get(), ModBlocks.TALL_FLOWER_POT_BLUE_ORCHID.get(), ModBlocks.TALL_FLOWER_POT_ALLIUM.get(), ModBlocks.TALL_FLOWER_POT_AZURE_BLUET.get(), ModBlocks.TALL_FLOWER_POT_RED_TULIP.get(), ModBlocks.TALL_FLOWER_POT_ORANGE_TULIP.get(), ModBlocks.TALL_FLOWER_POT_WHITE_TULIP.get(), ModBlocks.TALL_FLOWER_POT_PINK_TULIP.get(), ModBlocks.TALL_FLOWER_POT_OXEYE_DAISY.get(), ModBlocks.TALL_FLOWER_POT_CORNFLOWER.get(), ModBlocks.TALL_FLOWER_POT_LILY_OF_THE_VALLEY.get(), ModBlocks.TALL_FLOWER_POT_WITHER_ROSE.get(), ModBlocks.TALL_FLOWER_POT_RED_MUSHROOM.get(), ModBlocks.TALL_FLOWER_POT_BROWN_MUSHROOM.get(), ModBlocks.TALL_FLOWER_POT_DEAD_BUSH.get(), ModBlocks.TALL_FLOWER_POT_CACTUS.get(), ModBlocks.TALL_FLOWER_POT_BAMBOO.get(), ModBlocks.TALL_FLOWER_POT_CRIMSON_FUNGUS.get(), ModBlocks.TALL_FLOWER_POT_WARPED_FUNGUS.get(), ModBlocks.TALL_FLOWER_POT_CRIMSON_ROOTS.get(), ModBlocks.TALL_FLOWER_POT_WARPED_ROOTS.get(), ModBlocks.TALL_FLOWER_POT_AZALEA.get(), ModBlocks.TALL_FLOWER_POT_FLOWERING_AZALEA.get()};
        for (FlowerPotBlock flowerPotBlock : flowerPotBlocks) {
            stacks.add(new ItemStack(flowerPotBlock));
        }
        registration.getIngredientManager().removeIngredientsAtRuntime(VanillaTypes.ITEM_STACK, stacks);
        IModPlugin.super.registerRecipes(registration);
    }
}
