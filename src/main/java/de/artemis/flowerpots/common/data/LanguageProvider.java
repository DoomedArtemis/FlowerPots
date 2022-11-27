package de.artemis.flowerpots.common.data;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.ModItems;
import net.minecraft.data.DataGenerator;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {
    public LanguageProvider(DataGenerator gen, String locale) {
        super(gen, FlowerPots.MODID, locale);
    }

    @Override
    protected void addTranslations() {

        add("itemGroup.flowerpots", "Artemis' Flower Pots");

        add("keybind.flowerpots.category", "Artemis' Flower Pots");
        add("keybind.flowerpots.toggle_description_keybind", "Show Description");

        add("tooltip.flowerpots.gardeningshovel", "You can use this Gardening Shovel to change the dirt of any flower pot. Simply rightclick to cycle between every available variant.");
        add("tooltip.flowerpots.gardeningshears", "You can use these Gardening Shears to change the look of plants and flowers of any flower pot. Simply rightclick to cycle between every available variant.");

        add(ModItems.GARDENING_SHOVEL.get(), "Gardening Shovel");
        add(ModItems.GARDENING_SHEARS.get(), "Gardening Shears");

        add(ModBlocks.SMALL_FLOWER_POT.get(), "Small Flower Pot");
        add(ModBlocks.SMALL_UNFIRED_FLOWER_POT.get(), "Small Unfired Flower Pot");
        add(ModBlocks.SMALL_TALL_FLOWER_POT.get(), "Small Tall Flower Pot");
        add(ModBlocks.SMALL_TALL_UNFIRED_FLOWER_POT.get(), "Small Tall Unfired Flower Pot");
        add(ModBlocks.LARGE_FLOWER_POT.get(), "Large Flower Pot");
        add(ModBlocks.LARGE_UNFIRED_FLOWER_POT.get(), "Large Unfired Flower Pot");
        add(ModBlocks.LARGE_TALL_FLOWER_POT.get(), "Large Tall Flower Pot");
        add(ModBlocks.LARGE_TALL_UNFIRED_FLOWER_POT.get(), "Large Tall Unfired Flower Pot");
    }
}
