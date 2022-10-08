package de.artemis.flowerpots.common.util;

import net.minecraft.util.StringRepresentable;

public enum FlowerPotDirtVariant implements StringRepresentable {
    GRASS_BLOCK("grass_block"),
    DIRT("dirt"),
    COARSE_DIRT("coarse_dirt"),
    PODZOL("podzol"),
    ROOTED_DIRT("rooted_dirt"),
    MUD("mud"),
    CRIMSON_NYLIUM("crimson_nylium"),
    WARPED_NYLIUM("warped_nylium"),
    SAND("sand"),
    RED_SAND("red_sand"),
    MYCELIUM("mycelium"),
    MOSS("moss"),
    CLAY("clay");

    private final String name;

    private FlowerPotDirtVariant(String string) {
        this.name = string;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}
