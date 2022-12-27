package de.artemis.flowerpots.common.data;

import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class RecipesProvider extends RecipeProvider implements IConditionBuilder {

    public RecipesProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.SMALL_UNFIRED_FLOWER_POT.get()),RecipeCategory.DECORATIONS, ModBlocks.SMALL_FLOWER_POT.get().asItem(), 0.35F, 200).unlockedBy("has_small_unfired_flower_pot", has(ModBlocks.SMALL_UNFIRED_FLOWER_POT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SMALL_UNFIRED_FLOWER_POT.get()).define('A', Items.CLAY_BALL).pattern("A A").pattern(" A ").unlockedBy("has_clay_ball", has(Items.CLAY_BALL)).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN.get()).define('A', ModBlocks.SMALL_FLOWER_POT.get()).define('B', Items.CHAIN).define('C', Items.IRON_INGOT).pattern("C").pattern("B").pattern("A").unlockedBy("has_small_flower_pot", has(ModBlocks.SMALL_FLOWER_POT.get())).unlockedBy("has_chain", has(Items.CHAIN)).unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN.get()).define('A', ModBlocks.SMALL_FLOWER_POT.get()).define('B', Items.CHAIN).define('C', Items.GOLD_INGOT).pattern("C").pattern("B").pattern("A").unlockedBy("has_small_flower_pot", has(ModBlocks.SMALL_FLOWER_POT.get())).unlockedBy("has_chain", has(Items.CHAIN)).unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN.get()).define('A', ModBlocks.SMALL_FLOWER_POT.get()).define('B', Items.CHAIN).define('C', Items.COPPER_INGOT).pattern("C").pattern("B").pattern("A").unlockedBy("has_small_flower_pot", has(ModBlocks.SMALL_FLOWER_POT.get())).unlockedBy("has_chain", has(Items.CHAIN)).unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.SMALL_TALL_UNFIRED_FLOWER_POT.get()),RecipeCategory.DECORATIONS, ModBlocks.SMALL_TALL_FLOWER_POT.get().asItem(), 0.35F, 200).unlockedBy("has_small_tall_unfired_flower_pot", has(ModBlocks.SMALL_TALL_UNFIRED_FLOWER_POT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,ModBlocks.SMALL_TALL_UNFIRED_FLOWER_POT.get()).define('A', Items.CLAY_BALL).pattern("A A").pattern("A A").pattern(" A ").unlockedBy("has_clay_ball", has(Items.CLAY_BALL)).save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.LARGE_UNFIRED_FLOWER_POT.get()),RecipeCategory.DECORATIONS, ModBlocks.LARGE_FLOWER_POT.get().asItem(), 0.35F, 200).unlockedBy("has_large_unfired_flower_pot", has(ModBlocks.LARGE_UNFIRED_FLOWER_POT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,ModBlocks.LARGE_UNFIRED_FLOWER_POT.get()).define('A', Items.CLAY_BALL).define('B', Blocks.CLAY).pattern("A A").pattern(" B ").unlockedBy("has_clay_ball", has(Items.CLAY_BALL)).save(consumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.LARGE_TALL_UNFIRED_FLOWER_POT.get()),RecipeCategory.DECORATIONS, ModBlocks.LARGE_TALL_FLOWER_POT.get().asItem(), 0.35F, 200).unlockedBy("has_large_tall_unfired_flower_pot", has(ModBlocks.LARGE_TALL_UNFIRED_FLOWER_POT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,ModBlocks.LARGE_TALL_UNFIRED_FLOWER_POT.get()).define('A', Items.CLAY_BALL).define('B', Blocks.CLAY).pattern("A A").pattern("A A").pattern(" B ").unlockedBy("has_clay_ball", has(Items.CLAY_BALL)).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,ModItems.GARDENING_SHOVEL.get()).define('A', Items.STICK).define('B', Items.IRON_INGOT).pattern("B").pattern("A").unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,ModItems.GARDENING_SHEARS.get()).define('A', Items.IRON_INGOT).define('B', Items.STICK).pattern("  A").pattern(" A ").pattern("B  ").unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,ModBlocks.SMALL_DESERT_FLOWER_POT.get()).define('A', ModItems.DESERT_POTTERY_FRAGMENT.get()).pattern("A A").pattern(" A ").unlockedBy("has_desert_pottery_fragment", has(ModItems.DESERT_POTTERY_FRAGMENT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,ModBlocks.SMALL_JUNGLE_FLOWER_POT.get()).define('A', ModItems.JUNGLE_POTTERY_FRAGMENT.get()).pattern("A A").pattern(" A ").unlockedBy("has_jungle_pottery_fragment", has(ModItems.JUNGLE_POTTERY_FRAGMENT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,ModBlocks.SMALL_NETHER_FLOWER_POT.get()).define('A', ModItems.NETHER_POTTERY_FRAGMENT.get()).pattern("A A").pattern(" A ").unlockedBy("has_nether_pottery_fragment", has(ModItems.NETHER_POTTERY_FRAGMENT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,ModBlocks.SMALL_END_FLOWER_POT.get()).define('A', ModItems.END_POTTERY_FRAGMENT.get()).pattern("A A").pattern(" A ").unlockedBy("has_end_pottery_fragment", has(ModItems.END_POTTERY_FRAGMENT.get())).save(consumer);
    }
}
