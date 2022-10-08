package de.artemis.flowerpots.common.util;

import net.minecraft.util.StringRepresentable;

public enum FlowerPotPlantVariant implements StringRepresentable {
    DEFAULT("default"),
    VARIANT_0("variant_0"),
    VARIANT_1("variant_1"),
    VARIANT_2("variant_2");

    private final String name;

    private FlowerPotPlantVariant(String string) {
        this.name = string;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}
