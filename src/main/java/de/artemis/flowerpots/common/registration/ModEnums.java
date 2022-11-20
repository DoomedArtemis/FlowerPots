package de.artemis.flowerpots.common.registration;

import de.artemis.flowerpots.common.enums.FlowerPotDirtTypeEnum;
import de.artemis.flowerpots.common.enums.FlowerPotPlantTypeEnum;
import de.artemis.flowerpots.common.enums.FlowerPotPlantTypeVariantEnum;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class ModEnums {

    public static final EnumProperty<FlowerPotPlantTypeVariantEnum> FLOWER_POT_PLANT_VARIANT = EnumProperty.create("flower_pot_plant_variant", FlowerPotPlantTypeVariantEnum.class);
    public static final EnumProperty<FlowerPotDirtTypeEnum> FLOWER_POT_DIRT = EnumProperty.create("flower_pot_dirt", FlowerPotDirtTypeEnum.class);
    public static final EnumProperty<FlowerPotPlantTypeEnum> FLOWER_POT_PLANT = EnumProperty.create("flower_pot_plant", FlowerPotPlantTypeEnum.class);

}
