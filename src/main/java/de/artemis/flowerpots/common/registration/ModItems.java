package de.artemis.flowerpots.common.registration;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.items.GardeningToolItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static void register() {
    }

    public static final RegistryObject<GardeningToolItem> GARDENING_SHOVEL = Registration.ITEMS.register("gardening_shovel",
            () -> new GardeningToolItem(0, new Item.Properties().tab(FlowerPots.INVENTORY_TAB).durability(238)));

    public static final RegistryObject<GardeningToolItem> GARDENING_SHEARS = Registration.ITEMS.register("gardening_shears",
            () -> new GardeningToolItem(1, new Item.Properties().tab(FlowerPots.INVENTORY_TAB).durability(238)));

    public static final RegistryObject<Item> DESERT_POTTERY_FRAGMENT = Registration.ITEMS.register("desert_pottery_fragment",
            () -> new Item(new Item.Properties().tab(FlowerPots.INVENTORY_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> JUNGLE_POTTERY_FRAGMENT = Registration.ITEMS.register("jungle_pottery_fragment",
            () -> new Item(new Item.Properties().tab(FlowerPots.INVENTORY_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> NETHER_POTTERY_FRAGMENT = Registration.ITEMS.register("nether_pottery_fragment",
            () -> new Item(new Item.Properties().tab(FlowerPots.INVENTORY_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> END_POTTERY_FRAGMENT = Registration.ITEMS.register("end_pottery_fragment",
            () -> new Item(new Item.Properties().tab(FlowerPots.INVENTORY_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<BlockItem> SMALL_DESERT_FLOWER_POT = Registration.ITEMS.register("small_desert_flower_pot",
            () -> new BlockItem(ModBlocks.SMALL_DESERT_FLOWER_POT.get(), (new Item.Properties()).tab(FlowerPots.INVENTORY_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<BlockItem> SMALL_JUNGLE_FLOWER_POT = Registration.ITEMS.register("small_jungle_flower_pot",
            () -> new BlockItem(ModBlocks.SMALL_JUNGLE_FLOWER_POT.get(), (new Item.Properties()).tab(FlowerPots.INVENTORY_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<BlockItem> SMALL_NETHER_FLOWER_POT = Registration.ITEMS.register("small_nether_flower_pot",
            () -> new BlockItem(ModBlocks.SMALL_NETHER_FLOWER_POT.get(), (new Item.Properties()).tab(FlowerPots.INVENTORY_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<BlockItem> SMALL_END_FLOWER_POT = Registration.ITEMS.register("small_end_flower_pot",
            () -> new BlockItem(ModBlocks.SMALL_END_FLOWER_POT.get(), (new Item.Properties()).tab(FlowerPots.INVENTORY_TAB).rarity(Rarity.UNCOMMON)));

}
