package de.artemis.flowerpots.common.registration;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.blocks.SmallFlowerPotBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.AIR;

public class ModBlocks {

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().tab(FlowerPots.INVENTORY_TAB)));

        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, Supplier<? extends BlockItem> item) {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, item);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        return toReturn;
    }

    public static boolean never(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return false;
    }

    public static void register() {
    }

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT = register("small_flower_pot",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_UNFIRED_FLOWER_POT = register("small_unfired_flower_pot",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_OAK_SAPLING = register("small_flower_pot_oak_sapling",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_SPRUCE_SAPLING = register("small_flower_pot_spruce_sapling",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_BIRCH_SAPLING = register("small_flower_pot_birch_sapling",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_JUNGLE_SAPLING = register("small_flower_pot_jungle_sapling",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_ACACIA_SAPLING = register("small_flower_pot_acacia_sapling",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_DARK_OAK_SAPLING = register("small_flower_pot_dark_oak_sapling",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_MANGROVE_SAPLING = register("small_flower_pot_mangrove_sapling",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_FERN = register("small_flower_pot_fern",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_DANDELION = register("small_flower_pot_dandelion",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_POPPY = register("small_flower_pot_poppy",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_BLUE_ORCHID = register("small_flower_pot_blue_orchid",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_ALLIUM = register("small_flower_pot_allium",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_AZURE_BLUET = register("small_flower_pot_azure_bluet",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_RED_TULIP = register("small_flower_pot_red_tulip",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_ORANGE_TULIP = register("small_flower_pot_orange_tulip",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_WHITE_TULIP = register("small_flower_pot_white_tulip",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_PINK_TULIP = register("small_flower_pot_pink_tulip",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_OXEYE_DAISY = register("small_flower_pot_oxeye_daisy",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_CORNFLOWER = register("small_flower_pot_cornflower",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_LILY_OF_THE_VALLEY = register("small_flower_pot_lily_of_the_valley",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_WITHER_ROSE = register("small_flower_pot_wither_rose",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_RED_MUSHROOM = register("small_flower_pot_red_mushroom",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_BROWN_MUSHROOM = register("small_flower_pot_brown_mushroom",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_DEAD_BUSH = register("small_flower_pot_dead_bush",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_CACTUS = register("small_flower_pot_cactus",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_BAMBOO = register("small_flower_pot_bamboo",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_CRIMSON_FUNGUS = register("small_flower_pot_crimson_fungus",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_WARPED_FUNGUS = register("small_flower_pot_warped_fungus",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_CRIMSON_ROOTS = register("small_flower_pot_crimson_roots",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_WARPED_ROOTS = register("small_flower_pot_warped_roots",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_AZALEA = register("small_flower_pot_azalea",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<SmallFlowerPotBlock> SMALL_FLOWER_POT_FLOWERING_AZALEA = register("small_flower_pot_flowering_azalea",
            () -> new SmallFlowerPotBlock(AIR, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

}
