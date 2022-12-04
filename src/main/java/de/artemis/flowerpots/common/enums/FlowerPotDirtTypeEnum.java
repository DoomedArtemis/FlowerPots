package de.artemis.flowerpots.common.enums;

import net.minecraft.util.StringRepresentable;

public enum FlowerPotDirtTypeEnum implements StringRepresentable {
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
    CLAY("clay"),
    SOUL_SAND("soul_sand");

    private final String name;

    private FlowerPotDirtTypeEnum(String string) {
        this.name = string;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }

    public FlowerPotDirtTypeEnum getNext() {
        FlowerPotDirtTypeEnum[] values = values();
        int i = 0;
        for(; values[i] != this; i++);

        i++;
        i %= values.length;
        return values[i];
    }
}
