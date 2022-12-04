package de.artemis.flowerpots.common.enums;

import net.minecraft.util.StringRepresentable;

public enum FlowerPotPlantTypeVariantEnum implements StringRepresentable {
    DEFAULT("default"),
    VARIANT_0("variant_0"),
    VARIANT_1("variant_1"),
    VARIANT_2("variant_2");

    private final String name;

    private FlowerPotPlantTypeVariantEnum(String string) {
        this.name = string;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }

    public FlowerPotPlantTypeVariantEnum getNext() {
        FlowerPotPlantTypeVariantEnum[] values = values();
        int i = 0;
        for (; values[i] != this; i++) ;

        i++;
        i %= values.length;
        return values[i];
    }
}
