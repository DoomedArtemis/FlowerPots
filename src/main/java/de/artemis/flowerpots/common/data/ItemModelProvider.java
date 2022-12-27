package de.artemis.flowerpots.common.data;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {
    public ItemModelProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, FlowerPots.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.GARDENING_SHOVEL.get());
        simpleItem(ModItems.GARDENING_SHEARS.get());

        simpleItem(ModItems.DESERT_POTTERY_FRAGMENT.get());
        simpleItem(ModItems.JUNGLE_POTTERY_FRAGMENT.get());
        simpleItem(ModItems.NETHER_POTTERY_FRAGMENT.get());
        simpleItem(ModItems.END_POTTERY_FRAGMENT.get());

        simpleItem(ModBlocks.SMALL_DESERT_FLOWER_POT.get().asItem());
        simpleItem(ModBlocks.SMALL_JUNGLE_FLOWER_POT.get().asItem());
        simpleItem(ModBlocks.SMALL_NETHER_FLOWER_POT.get().asItem());
        simpleItem(ModBlocks.SMALL_END_FLOWER_POT.get().asItem());

        simpleItem(ModBlocks.SMALL_FLOWER_POT.get().asItem());
        simpleItem(ModBlocks.SMALL_UNFIRED_FLOWER_POT.get().asItem());

        simpleItem(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN.get().asItem());
        simpleItem(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN.get().asItem());
        simpleItem(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN.get().asItem());

        simpleItem(ModBlocks.SMALL_TALL_FLOWER_POT.get().asItem());
        simpleItem(ModBlocks.SMALL_TALL_UNFIRED_FLOWER_POT.get().asItem());

        simpleItem(ModBlocks.LARGE_FLOWER_POT.get().asItem());
        simpleItem(ModBlocks.LARGE_UNFIRED_FLOWER_POT.get().asItem());

        simpleItem(ModBlocks.LARGE_TALL_FLOWER_POT.get().asItem());
        simpleItem(ModBlocks.LARGE_TALL_UNFIRED_FLOWER_POT.get().asItem());
    }

    private void simpleItem(Item item) {
        withExistingParent(DataProvider.getRegistryName(item), "item/generated").texture("layer0", new ResourceLocation(this.modid, "item/" +
                DataProvider.getRawRegistryName(item)));
    }
}
