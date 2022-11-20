package de.artemis.flowerpots.common.registration;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.items.GardeningToolItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static void register() {
    }

    public static final RegistryObject<GardeningToolItem> GARDENING_SHOVEL = Registration.ITEMS.register("gardening_shovel",
            () -> new GardeningToolItem(0, new Item.Properties().tab(FlowerPots.INVENTORY_TAB).durability(238)));

    public static final RegistryObject<GardeningToolItem> GARDENING_SHEARS = Registration.ITEMS.register("gardening_shears",
            () -> new GardeningToolItem(1, new Item.Properties().tab(FlowerPots.INVENTORY_TAB).durability(238)));

}
