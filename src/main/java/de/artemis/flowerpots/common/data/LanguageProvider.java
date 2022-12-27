package de.artemis.flowerpots.common.data;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.ModItems;
import de.artemis.flowerpots.common.registration.ModVillagers;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.entity.npc.VillagerProfession;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {
    public LanguageProvider(PackOutput packOutput, String locale) {
        super(packOutput, FlowerPots.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {

        add("itemGroup.flowerpots", "Artemis' Flower Pots");
        add("flowerpots.name", FlowerPots.NAME);

        add("keybind.flowerpots.category", "Artemis' Flower Pots");
        add("keybind.flowerpots.toggle_description_keybind", "Show Description");

        add("tooltip.flowerpots.gardeningshovel", "You can use this Gardening Shovel to change the dirt of any flower pot. Simply rightclick to cycle between every available variant.");
        add("tooltip.flowerpots.gardeningshears", "You can use these Gardening Shears to change the look of plants and flowers of any flower pot. Simply rightclick to cycle between every available variant.");

        add(ModVillagers.FLORIST, "Florist");

        add(ModItems.GARDENING_SHOVEL.get(), "Gardening Shovel");
        add(ModItems.GARDENING_SHEARS.get(), "Gardening Shears");

        add(ModItems.DESERT_POTTERY_FRAGMENT.get(), "Desert Pottery Fragment");
        add(ModItems.JUNGLE_POTTERY_FRAGMENT.get(), "Jungle Pottery Fragment");
        add(ModItems.NETHER_POTTERY_FRAGMENT.get(), "Nether Pottery Fragment");
        add(ModItems.END_POTTERY_FRAGMENT.get(), "End Pottery Fragment");
        add(ModBlocks.SMALL_DESERT_FLOWER_POT.get(), "Small Desert Flower Pot");
        add(ModBlocks.SMALL_JUNGLE_FLOWER_POT.get(), "Small Jungle Flower Pot");
        add(ModBlocks.SMALL_NETHER_FLOWER_POT.get(), "Small Nether Flower Pot");
        add(ModBlocks.SMALL_END_FLOWER_POT.get(), "Small End Flower Pot");

        add(ModBlocks.SMALL_FLOWER_POT.get(), "Small Flower Pot");
        add(ModBlocks.SMALL_UNFIRED_FLOWER_POT.get(), "Small Unfired Flower Pot");
        add(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN.get(), "Small Hanging Flower Pot (Iron Chain)");
        add(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN.get(), "Small Hanging Flower Pot (Gold Chain)");
        add(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN.get(), "Small Hanging Flower Pot (Copper Chain)");
        add(ModBlocks.SMALL_TALL_FLOWER_POT.get(), "Small Tall Flower Pot");
        add(ModBlocks.SMALL_TALL_UNFIRED_FLOWER_POT.get(), "Small Tall Unfired Flower Pot");
        add(ModBlocks.LARGE_FLOWER_POT.get(), "Large Flower Pot");
        add(ModBlocks.LARGE_UNFIRED_FLOWER_POT.get(), "Large Unfired Flower Pot");
        add(ModBlocks.LARGE_TALL_FLOWER_POT.get(), "Large Tall Flower Pot");
        add(ModBlocks.LARGE_TALL_UNFIRED_FLOWER_POT.get(), "Large Tall Unfired Flower Pot");
    }

    private void add(@NotNull Supplier<VillagerProfession> key, @NotNull String name) {
        add("entity.minecraft.villager." + FlowerPots.MOD_ID + "." + key.get().name().split(":")[1], name);
    }
}
