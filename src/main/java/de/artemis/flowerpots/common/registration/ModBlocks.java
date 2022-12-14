package de.artemis.flowerpots.common.registration;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.blocks.FlowerPotBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.AIR;

public class ModBlocks {

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties()));

        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerWithTab(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().tab(FlowerPots.INVENTORY_TAB)));

        return toReturn;
    }

    public static void register() {
    }

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT = registerWithTab("small_flower_pot",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_UNFIRED_FLOWER_POT = registerWithTab("small_unfired_flower_pot",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_OAK_SAPLING = register("small_flower_pot_oak_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_SPRUCE_SAPLING = register("small_flower_pot_spruce_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_BIRCH_SAPLING = register("small_flower_pot_birch_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_JUNGLE_SAPLING = register("small_flower_pot_jungle_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_ACACIA_SAPLING = register("small_flower_pot_acacia_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_DARK_OAK_SAPLING = register("small_flower_pot_dark_oak_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_MANGROVE_SAPLING = register("small_flower_pot_mangrove_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_FERN = register("small_flower_pot_fern",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_DANDELION = register("small_flower_pot_dandelion",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_POPPY = register("small_flower_pot_poppy",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_BLUE_ORCHID = register("small_flower_pot_blue_orchid",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_ALLIUM = register("small_flower_pot_allium",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_AZURE_BLUET = register("small_flower_pot_azure_bluet",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_RED_TULIP = register("small_flower_pot_red_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_ORANGE_TULIP = register("small_flower_pot_orange_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_WHITE_TULIP = register("small_flower_pot_white_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_PINK_TULIP = register("small_flower_pot_pink_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_OXEYE_DAISY = register("small_flower_pot_oxeye_daisy",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_CORNFLOWER = register("small_flower_pot_cornflower",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_LILY_OF_THE_VALLEY = register("small_flower_pot_lily_of_the_valley",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_WITHER_ROSE = register("small_flower_pot_wither_rose",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_RED_MUSHROOM = register("small_flower_pot_red_mushroom",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_BROWN_MUSHROOM = register("small_flower_pot_brown_mushroom",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_DEAD_BUSH = register("small_flower_pot_dead_bush",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_CACTUS = register("small_flower_pot_cactus",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_BAMBOO = register("small_flower_pot_bamboo",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_CRIMSON_FUNGUS = register("small_flower_pot_crimson_fungus",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_WARPED_FUNGUS = register("small_flower_pot_warped_fungus",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_CRIMSON_ROOTS = register("small_flower_pot_crimson_roots",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_WARPED_ROOTS = register("small_flower_pot_warped_roots",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_AZALEA = register("small_flower_pot_azalea",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_FLOWER_POT_FLOWERING_AZALEA = register("small_flower_pot_flowering_azalea",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT = registerWithTab("small_tall_flower_pot",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_UNFIRED_FLOWER_POT = registerWithTab("small_tall_unfired_flower_pot",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_OAK_SAPLING = register("small_tall_flower_pot_oak_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_SPRUCE_SAPLING = register("small_tall_flower_pot_spruce_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_BIRCH_SAPLING = register("small_tall_flower_pot_birch_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_JUNGLE_SAPLING = register("small_tall_flower_pot_jungle_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_ACACIA_SAPLING = register("small_tall_flower_pot_acacia_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_DARK_OAK_SAPLING = register("small_tall_flower_pot_dark_oak_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_MANGROVE_SAPLING = register("small_tall_flower_pot_mangrove_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_FERN = register("small_tall_flower_pot_fern",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_DANDELION = register("small_tall_flower_pot_dandelion",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_POPPY = register("small_tall_flower_pot_poppy",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_BLUE_ORCHID = register("small_tall_flower_pot_blue_orchid",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_ALLIUM = register("small_tall_flower_pot_allium",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_AZURE_BLUET = register("small_tall_flower_pot_azure_bluet",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_RED_TULIP = register("small_tall_flower_pot_red_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_ORANGE_TULIP = register("small_tall_flower_pot_orange_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_WHITE_TULIP = register("small_tall_flower_pot_white_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_PINK_TULIP = register("small_tall_flower_pot_pink_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_OXEYE_DAISY = register("small_tall_flower_pot_oxeye_daisy",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_CORNFLOWER = register("small_tall_flower_pot_cornflower",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_LILY_OF_THE_VALLEY = register("small_tall_flower_pot_lily_of_the_valley",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_WITHER_ROSE = register("small_tall_flower_pot_wither_rose",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_RED_MUSHROOM = register("small_tall_flower_pot_red_mushroom",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_BROWN_MUSHROOM = register("small_tall_flower_pot_brown_mushroom",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_DEAD_BUSH = register("small_tall_flower_pot_dead_bush",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_CACTUS = register("small_tall_flower_pot_cactus",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_BAMBOO = register("small_tall_flower_pot_bamboo",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_CRIMSON_FUNGUS = register("small_tall_flower_pot_crimson_fungus",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_WARPED_FUNGUS = register("small_tall_flower_pot_warped_fungus",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_CRIMSON_ROOTS = register("small_tall_flower_pot_crimson_roots",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_WARPED_ROOTS = register("small_tall_flower_pot_warped_roots",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_AZALEA = register("small_tall_flower_pot_azalea",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_TALL_FLOWER_POT_FLOWERING_AZALEA = register("small_tall_flower_pot_flowering_azalea",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT = registerWithTab("large_flower_pot",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_UNFIRED_FLOWER_POT = registerWithTab("large_unfired_flower_pot",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_OAK_SAPLING = register("large_flower_pot_oak_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_SPRUCE_SAPLING = register("large_flower_pot_spruce_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_BIRCH_SAPLING = register("large_flower_pot_birch_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_JUNGLE_SAPLING = register("large_flower_pot_jungle_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_ACACIA_SAPLING = register("large_flower_pot_acacia_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_DARK_OAK_SAPLING = register("large_flower_pot_dark_oak_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_MANGROVE_SAPLING = register("large_flower_pot_mangrove_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_FERN = register("large_flower_pot_fern",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_DANDELION = register("large_flower_pot_dandelion",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_POPPY = register("large_flower_pot_poppy",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_BLUE_ORCHID = register("large_flower_pot_blue_orchid",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_ALLIUM = register("large_flower_pot_allium",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_AZURE_BLUET = register("large_flower_pot_azure_bluet",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_RED_TULIP = register("large_flower_pot_red_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_ORANGE_TULIP = register("large_flower_pot_orange_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_WHITE_TULIP = register("large_flower_pot_white_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_PINK_TULIP = register("large_flower_pot_pink_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_OXEYE_DAISY = register("large_flower_pot_oxeye_daisy",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_CORNFLOWER = register("large_flower_pot_cornflower",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_LILY_OF_THE_VALLEY = register("large_flower_pot_lily_of_the_valley",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_WITHER_ROSE = register("large_flower_pot_wither_rose",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_RED_MUSHROOM = register("large_flower_pot_red_mushroom",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_BROWN_MUSHROOM = register("large_flower_pot_brown_mushroom",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_DEAD_BUSH = register("large_flower_pot_dead_bush",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_CACTUS = register("large_flower_pot_cactus",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_BAMBOO = register("large_flower_pot_bamboo",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_CRIMSON_FUNGUS = register("large_flower_pot_crimson_fungus",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_WARPED_FUNGUS = register("large_flower_pot_warped_fungus",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_CRIMSON_ROOTS = register("large_flower_pot_crimson_roots",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_WARPED_ROOTS = register("large_flower_pot_warped_roots",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_AZALEA = register("large_flower_pot_azalea",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_FLOWER_POT_FLOWERING_AZALEA = register("large_flower_pot_flowering_azalea",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT = registerWithTab("large_tall_flower_pot",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_UNFIRED_FLOWER_POT = registerWithTab("large_tall_unfired_flower_pot",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_OAK_SAPLING = register("large_tall_flower_pot_oak_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_SPRUCE_SAPLING = register("large_tall_flower_pot_spruce_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_BIRCH_SAPLING = register("large_tall_flower_pot_birch_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_JUNGLE_SAPLING = register("large_tall_flower_pot_jungle_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_ACACIA_SAPLING = register("large_tall_flower_pot_acacia_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_DARK_OAK_SAPLING = register("large_tall_flower_pot_dark_oak_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_MANGROVE_SAPLING = register("large_tall_flower_pot_mangrove_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_FERN = register("large_tall_flower_pot_fern",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_DANDELION = register("large_tall_flower_pot_dandelion",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_POPPY = register("large_tall_flower_pot_poppy",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_BLUE_ORCHID = register("large_tall_flower_pot_blue_orchid",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_ALLIUM = register("large_tall_flower_pot_allium",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_AZURE_BLUET = register("large_tall_flower_pot_azure_bluet",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_RED_TULIP = register("large_tall_flower_pot_red_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_ORANGE_TULIP = register("large_tall_flower_pot_orange_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_WHITE_TULIP = register("large_tall_flower_pot_white_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_PINK_TULIP = register("large_tall_flower_pot_pink_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_OXEYE_DAISY = register("large_tall_flower_pot_oxeye_daisy",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_CORNFLOWER = register("large_tall_flower_pot_cornflower",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_LILY_OF_THE_VALLEY = register("large_tall_flower_pot_lily_of_the_valley",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_WITHER_ROSE = register("large_tall_flower_pot_wither_rose",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_RED_MUSHROOM = register("large_tall_flower_pot_red_mushroom",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_BROWN_MUSHROOM = register("large_tall_flower_pot_brown_mushroom",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_DEAD_BUSH = register("large_tall_flower_pot_dead_bush",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_CACTUS = register("large_tall_flower_pot_cactus",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_BAMBOO = register("large_tall_flower_pot_bamboo",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_CRIMSON_FUNGUS = register("large_tall_flower_pot_crimson_fungus",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_WARPED_FUNGUS = register("large_tall_flower_pot_warped_fungus",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_CRIMSON_ROOTS = register("large_tall_flower_pot_crimson_roots",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_WARPED_ROOTS = register("large_tall_flower_pot_warped_roots",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_AZALEA = register("large_tall_flower_pot_azalea",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> LARGE_TALL_FLOWER_POT_FLOWERING_AZALEA = register("large_tall_flower_pot_flowering_azalea",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT = registerWithTab("small_hanging_flower_pot",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_OAK_SAPLING = register("small_hanging_flower_pot_oak_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_SPRUCE_SAPLING = register("small_hanging_flower_pot_spruce_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_BIRCH_SAPLING = register("small_hanging_flower_pot_birch_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_JUNGLE_SAPLING = register("small_hanging_flower_pot_jungle_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_ACACIA_SAPLING = register("small_hanging_flower_pot_acacia_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_DARK_OAK_SAPLING = register("small_hanging_flower_pot_dark_oak_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_MANGROVE_SAPLING = register("small_hanging_flower_pot_mangrove_sapling",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_FERN = register("small_hanging_flower_pot_fern",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_DANDELION = register("small_hanging_flower_pot_dandelion",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_POPPY = register("small_hanging_flower_pot_poppy",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_BLUE_ORCHID = register("small_hanging_flower_pot_blue_orchid",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_ALLIUM = register("small_hanging_flower_pot_allium",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_AZURE_BLUET = register("small_hanging_flower_pot_azure_bluet",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_RED_TULIP = register("small_hanging_flower_pot_red_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_ORANGE_TULIP = register("small_hanging_flower_pot_orange_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_WHITE_TULIP = register("small_hanging_flower_pot_white_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_PINK_TULIP = register("small_hanging_flower_pot_pink_tulip",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_OXEYE_DAISY = register("small_hanging_flower_pot_oxeye_daisy",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_CORNFLOWER = register("small_hanging_flower_pot_cornflower",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_LILY_OF_THE_VALLEY = register("small_hanging_flower_pot_lily_of_the_valley",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_WITHER_ROSE = register("small_hanging_flower_pot_wither_rose",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_RED_MUSHROOM = register("small_hanging_flower_pot_red_mushroom",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_BROWN_MUSHROOM = register("small_hanging_flower_pot_brown_mushroom",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_DEAD_BUSH = register("small_hanging_flower_pot_dead_bush",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_CACTUS = register("small_hanging_flower_pot_cactus",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_BAMBOO = register("small_hanging_flower_pot_bamboo",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_CRIMSON_FUNGUS = register("small_hanging_flower_pot_crimson_fungus",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_WARPED_FUNGUS = register("small_hanging_flower_pot_warped_fungus",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_CRIMSON_ROOTS = register("small_hanging_flower_pot_crimson_roots",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_WARPED_ROOTS = register("small_hanging_flower_pot_warped_roots",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_AZALEA = register("small_hanging_flower_pot_azalea",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<FlowerPotBlock> SMALL_HANGING_FLOWER_POT_FLOWERING_AZALEA = register("small_hanging_flower_pot_flowering_azalea",
            () -> new FlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));


}
