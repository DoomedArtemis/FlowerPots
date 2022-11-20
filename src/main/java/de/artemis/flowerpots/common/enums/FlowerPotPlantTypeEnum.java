package de.artemis.flowerpots.common.enums;

import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum FlowerPotPlantTypeEnum implements StringRepresentable {
    DEFAULT(Blocks.AIR::asItem),
    ALLIUM(Blocks.ALLIUM::asItem),
    OAK_SAPLING(Blocks.OAK_SAPLING::asItem),
    SPRUCE_SAPLING(Blocks.SPRUCE_SAPLING::asItem),
    BIRCH_SAPLING(Blocks.BIRCH_SAPLING::asItem),
    JUNGLE_SAPLING(Blocks.JUNGLE_SAPLING::asItem),
    ACACIA_SAPLING(Blocks.ACACIA_SAPLING::asItem),
    DARK_OAK_SAPLING(Blocks.DARK_OAK_SAPLING::asItem),
    MANGROVE_SAPLING(Blocks.MANGROVE_PROPAGULE::asItem),
    FERN(Blocks.FERN::asItem),
    DANDELION(Blocks.DANDELION::asItem),
    POPPY(Blocks.POPPY::asItem),
    BLUE_ORCHID(Blocks.BLUE_ORCHID::asItem),
    AZURE_BLUET(Blocks.AZURE_BLUET::asItem),
    RED_TULIP(Blocks.RED_TULIP::asItem),
    ORANGE_TULIP(Blocks.ORANGE_TULIP::asItem),
    WHITE_TULIP(Blocks.WHITE_TULIP::asItem),
    PINK_TULIP(Blocks.PINK_TULIP::asItem),
    OXEYE_DAISY(Blocks.OXEYE_DAISY::asItem),
    CORNFLOWER(Blocks.CORNFLOWER::asItem),
    LILY_OF_THE_VALLEY(Blocks.LILY_OF_THE_VALLEY::asItem),
    WITHER_ROSE(Blocks.WITHER_ROSE::asItem),
    RED_MUSHROOM(Blocks.RED_MUSHROOM::asItem),
    BROWN_MUSHROOM(Blocks.BROWN_MUSHROOM::asItem),
    DEAD_BUSH(Blocks.DEAD_BUSH::asItem),
    CACTUS(Blocks.CACTUS::asItem),
    BAMBOO(Blocks.BAMBOO::asItem),
    CRIMSON_FUNGUS(Blocks.CRIMSON_FUNGUS::asItem),
    WARPED_FUNGUS(Blocks.WARPED_FUNGUS::asItem),
    CRIMSON_ROOTS(Blocks.CRIMSON_ROOTS::asItem),
    WARPED_ROOTS(Blocks.WARPED_ROOTS::asItem),
    AZALEA(Blocks.AZALEA::asItem),
    FLOWRING_AZALEA(Blocks.FLOWERING_AZALEA::asItem);

    private final Supplier<Item> item;

    FlowerPotPlantTypeEnum(Supplier<Item> item) {
        this.item = item;
    }

    public Supplier<Item> getItem() {
        return item;
    }

    @NotNull
    @Override
    public String getSerializedName() {
        return getItem().get().asItem().toString();
    }
}
