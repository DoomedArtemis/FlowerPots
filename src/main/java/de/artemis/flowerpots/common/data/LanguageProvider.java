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

        add(ModItems.GARDENING_SHOVEL.get(), "Gardening Shovel");

        add(ModBlocks.SMALL_FLOWER_POT.get(), "Small Flower Pot");
        add(ModBlocks.SMALL_UNFIRED_FLOWER_POT.get(), "Small Unfired Flower Pot");
    }
}
