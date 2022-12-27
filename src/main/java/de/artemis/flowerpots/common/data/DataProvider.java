package de.artemis.flowerpots.common.data;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.registration.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.Util;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.registries.VanillaRegistries;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = FlowerPots.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataProvider {

    @SubscribeEvent
    public static void onDataGen(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> completablefuture = CompletableFuture.supplyAsync(VanillaRegistries::createLookup, Util.backgroundExecutor());

        generator.addProvider(true, new ModelAndBlockStateProvider(generator.getPackOutput(), existingFileHelper));
        generator.addProvider(true, new ItemModelProvider(generator.getPackOutput(), existingFileHelper));
        generator.addProvider(true, new LanguageProvider(generator.getPackOutput(), "en_us"));
        generator.addProvider(true, new BlockLootTablesProvider(generator.getPackOutput()));
        generator.addProvider(true, new RecipesProvider(generator.getPackOutput()));
        generator.addProvider(true, new TagsProvider.ItemTagsProvider(generator.getPackOutput(), completablefuture, existingFileHelper, Registration.ITEMS));
        generator.addProvider(true, new TagsProvider.BlockTagsProvider(generator.getPackOutput(), completablefuture, existingFileHelper, Registration.BLOCKS));
        generator.addProvider(true, new PoiTypeTagsProvider(generator.getPackOutput(), completablefuture, existingFileHelper));
    }

    public static String getRegistryName(Item item) {
        return item.builtInRegistryHolder().key().location().toString();
    }

    public static String getRawRegistryName(Item item) {
        return item.builtInRegistryHolder().key().location().getPath().toString();
    }
}
