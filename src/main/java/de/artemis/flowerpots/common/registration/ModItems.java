package de.artemis.flowerpots.common.registration;

import de.artemis.flowerpots.FlowerPots;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static void register() {
    }

    public static final RegistryObject<Item> GARDENING_SHOVEL = Registration.ITEMS.register("gardening_shovel",
            () -> new Item(new Item.Properties().tab(FlowerPots.INVENTORY_TAB).durability(238)));

}
