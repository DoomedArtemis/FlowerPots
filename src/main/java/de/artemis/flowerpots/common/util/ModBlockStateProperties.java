package de.artemis.flowerpots.common.util;

import net.minecraft.world.level.block.state.properties.EnumProperty;

public class ModBlockStateProperties {

    public static final EnumProperty<FlowerPotPlantVariant> FLOWER_POT_PLANT_VARIANT = EnumProperty.create("flower_pot_plant_variant", FlowerPotPlantVariant.class);
    public static final EnumProperty<FlowerPotDirtVariant> FLOWER_POT_DIRT_VARIANT = EnumProperty.create("flower_pot_dirt_variant", FlowerPotDirtVariant.class);
    public static final EnumProperty<FlowerPotPlant> FLOWER_POT_PLANT = EnumProperty.create("flower_pot_plant", FlowerPotPlant.class);

}
