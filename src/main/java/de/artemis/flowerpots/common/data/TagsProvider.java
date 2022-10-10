package de.artemis.flowerpots.common.data;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.tags.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;

public class TagsProvider extends net.minecraft.data.tags.TagsProvider<Item> {
    private DataGenerator generator;

    @SuppressWarnings("deprecation")
    protected TagsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Registry.ITEM, FlowerPots.MODID, existingFileHelper);
        this.generator = generator;
    }

    @Override
    protected void addTags() {
        tag(ModTags.Item.MAY_APPLIE_ON_FLOWER_POT).add(Blocks.OAK_SAPLING.asItem().asItem(), Blocks.SPRUCE_SAPLING.asItem(), Blocks.BIRCH_SAPLING.asItem(), Blocks.JUNGLE_SAPLING.asItem(), Blocks.ACACIA_SAPLING.asItem(), Blocks.DARK_OAK_SAPLING.asItem(), Blocks.MANGROVE_PROPAGULE.asItem(), Blocks.FERN.asItem(), Blocks.DANDELION.asItem(), Blocks.POPPY.asItem(), Blocks.BLUE_ORCHID.asItem(), Blocks.ALLIUM.asItem(), Blocks.AZURE_BLUET.asItem(), Blocks.RED_TULIP.asItem(), Blocks.ORANGE_TULIP.asItem(), Blocks.WHITE_TULIP.asItem(), Blocks.PINK_TULIP.asItem(), Blocks.OXEYE_DAISY.asItem(), Blocks.CORNFLOWER.asItem(), Blocks.LILY_OF_THE_VALLEY.asItem(), Blocks.WITHER_ROSE.asItem(), Blocks.RED_MUSHROOM.asItem(), Blocks.BROWN_MUSHROOM.asItem(), Blocks.DEAD_BUSH.asItem(), Blocks.CACTUS.asItem(), Blocks.BAMBOO.asItem(), Blocks.CRIMSON_FUNGUS.asItem(), Blocks.WARPED_FUNGUS.asItem(), Blocks.CRIMSON_ROOTS.asItem(), Blocks.WARPED_ROOTS.asItem(), Blocks.AZALEA.asItem(), Blocks.FLOWERING_AZALEA.asItem());
    }

    @NotNull
    @Override
    protected Path getPath(ResourceLocation location) {
        return this.generator.getOutputFolder().resolve("data/" + location.getNamespace() + "/tags/items/" + location.getPath() + ".json");
    }

    @NotNull
    @Override
    public String getName() {
        return "Item tags";
    }
}