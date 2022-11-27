package de.artemis.flowerpots.common.data;

import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class RecipesProvider extends RecipeProvider implements IConditionBuilder {

    public RecipesProvider(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.SMALL_UNFIRED_FLOWER_POT.get()), ModBlocks.SMALL_FLOWER_POT.get().asItem(), 0.35F, 200).unlockedBy("has_small_unfired_flower_pot", has(ModBlocks.SMALL_UNFIRED_FLOWER_POT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.SMALL_UNFIRED_FLOWER_POT.get()).define('A', Items.CLAY_BALL).pattern("A A").pattern(" A ").unlockedBy("has_clay_ball", has(Items.CLAY_BALL)).save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.SMALL_TALL_UNFIRED_FLOWER_POT.get()), ModBlocks.SMALL_TALL_FLOWER_POT.get().asItem(), 0.35F, 200).unlockedBy("has_small_tall_unfired_flower_pot", has(ModBlocks.SMALL_TALL_UNFIRED_FLOWER_POT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.SMALL_TALL_UNFIRED_FLOWER_POT.get()).define('A', Items.CLAY_BALL).pattern("A A").pattern("A A").pattern(" A ").unlockedBy("has_clay_ball", has(Items.CLAY_BALL)).save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.LARGE_UNFIRED_FLOWER_POT.get()), ModBlocks.LARGE_FLOWER_POT.get().asItem(), 0.35F, 200).unlockedBy("has_large_unfired_flower_pot", has(ModBlocks.LARGE_UNFIRED_FLOWER_POT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LARGE_UNFIRED_FLOWER_POT.get()).define('A', Items.CLAY_BALL).define('B', Blocks.CLAY).pattern("A A").pattern(" B ").unlockedBy("has_clay_ball", has(Items.CLAY_BALL)).save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.LARGE_TALL_UNFIRED_FLOWER_POT.get()), ModBlocks.LARGE_TALL_FLOWER_POT.get().asItem(), 0.35F, 200).unlockedBy("has_large_tall_unfired_flower_pot", has(ModBlocks.LARGE_TALL_UNFIRED_FLOWER_POT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LARGE_TALL_UNFIRED_FLOWER_POT.get()).define('A', Items.CLAY_BALL).define('B', Blocks.CLAY).pattern("A A").pattern("A A").pattern(" B ").unlockedBy("has_clay_ball", has(Items.CLAY_BALL)).save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.GARDENING_SHOVEL.get()).define('A', Items.STICK).define('B', Items.IRON_INGOT).pattern("B").pattern("A").unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.GARDENING_SHEARS.get()).define('A', Items.IRON_INGOT).define('B', Items.STICK).pattern("  A").pattern(" A ").pattern("B  ").unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(consumer);
    }
}
