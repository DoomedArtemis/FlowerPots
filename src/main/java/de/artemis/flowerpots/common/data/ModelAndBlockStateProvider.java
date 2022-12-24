package de.artemis.flowerpots.common.data;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.ModEnums;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModelAndBlockStateProvider extends BlockStateProvider {
    public ModelAndBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, FlowerPots.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        flowerPotEmpty(ModBlocks.SMALL_FLOWER_POT.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_empty"), new ResourceLocation("block/flower_pot"));
        flowerPotEmpty(ModBlocks.SMALL_UNFIRED_FLOWER_POT.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_empty"), new ResourceLocation("block/clay"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_ALLIUM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/allium"), new ResourceLocation("flowerpots:block/allium_variant_0"), new ResourceLocation("flowerpots:block/allium_variant_1"), new ResourceLocation("flowerpots:block/allium_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/oak_sapling"), new ResourceLocation("flowerpots:block/oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/oak_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_SPRUCE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/spruce_sapling"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_0"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_1"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_BIRCH_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/birch_sapling"), new ResourceLocation("flowerpots:block/birch_sapling_variant_0"), new ResourceLocation("flowerpots:block/birch_sapling_variant_1"), new ResourceLocation("flowerpots:block/birch_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_JUNGLE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/jungle_sapling"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_0"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_1"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_ACACIA_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/acacia_sapling"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_0"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_1"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_DARK_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/dark_oak_sapling"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_2"));
        flowerPotConfigurableModel(ModBlocks.SMALL_FLOWER_POT_MANGROVE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_mangrove_propagule_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_mangrove_propagule_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_mangrove_propagule_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_mangrove_propagule_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/mangrove_propagule"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_0"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_1"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_FERN.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross_tint"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/fern"), new ResourceLocation("flowerpots:block/fern_variant_0"), new ResourceLocation("flowerpots:block/fern_variant_1"), new ResourceLocation("flowerpots:block/fern_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_DANDELION.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/dandelion"), new ResourceLocation("flowerpots:block/dandelion_variant_0"), new ResourceLocation("flowerpots:block/dandelion_variant_1"), new ResourceLocation("flowerpots:block/dandelion_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_POPPY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/poppy"), new ResourceLocation("flowerpots:block/poppy_variant_0"), new ResourceLocation("flowerpots:block/poppy_variant_1"), new ResourceLocation("flowerpots:block/poppy_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_BLUE_ORCHID.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/blue_orchid"), new ResourceLocation("flowerpots:block/blue_orchid_variant_0"), new ResourceLocation("flowerpots:block/blue_orchid_variant_1"), new ResourceLocation("flowerpots:block/blue_orchid_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_AZURE_BLUET.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/azure_bluet"), new ResourceLocation("flowerpots:block/azure_bluet_variant_0"), new ResourceLocation("flowerpots:block/azure_bluet_variant_1"), new ResourceLocation("flowerpots:block/azure_bluet_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_RED_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/red_tulip"), new ResourceLocation("flowerpots:block/red_tulip_variant_0"), new ResourceLocation("flowerpots:block/red_tulip_variant_1"), new ResourceLocation("flowerpots:block/red_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_ORANGE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/orange_tulip"), new ResourceLocation("flowerpots:block/orange_tulip_variant_0"), new ResourceLocation("flowerpots:block/orange_tulip_variant_1"), new ResourceLocation("flowerpots:block/orange_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_WHITE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/white_tulip"), new ResourceLocation("flowerpots:block/white_tulip_variant_0"), new ResourceLocation("flowerpots:block/white_tulip_variant_1"), new ResourceLocation("flowerpots:block/white_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_PINK_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/pink_tulip"), new ResourceLocation("flowerpots:block/pink_tulip_variant_0"), new ResourceLocation("flowerpots:block/pink_tulip_variant_1"), new ResourceLocation("flowerpots:block/pink_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_OXEYE_DAISY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/oxeye_daisy"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_0"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_1"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_CORNFLOWER.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/cornflower"), new ResourceLocation("flowerpots:block/cornflower_variant_0"), new ResourceLocation("flowerpots:block/cornflower_variant_1"), new ResourceLocation("flowerpots:block/cornflower_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_LILY_OF_THE_VALLEY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/lily_of_the_valley"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_0"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_1"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_WITHER_ROSE.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/wither_rose"), new ResourceLocation("flowerpots:block/wither_rose_variant_0"), new ResourceLocation("flowerpots:block/wither_rose_variant_1"), new ResourceLocation("flowerpots:block/wither_rose_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_RED_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/red_mushroom"), new ResourceLocation("flowerpots:block/red_mushroom_variant_0"), new ResourceLocation("flowerpots:block/red_mushroom_variant_1"), new ResourceLocation("flowerpots:block/red_mushroom_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_BROWN_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/brown_mushroom"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_0"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_1"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_DEAD_BUSH.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/dead_bush"), new ResourceLocation("flowerpots:block/dead_bush_variant_0"), new ResourceLocation("flowerpots:block/dead_bush_variant_1"), new ResourceLocation("flowerpots:block/dead_bush_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_FLOWER_POT_CACTUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cactus_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cactus_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cactus_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cactus_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_FLOWER_POT_BAMBOO.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_bamboo_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_bamboo_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_bamboo_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_bamboo_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_CRIMSON_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/crimson_fungus"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_0"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_1"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_WARPED_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/warped_fungus"), new ResourceLocation("flowerpots:block/warped_fungus_variant_0"), new ResourceLocation("flowerpots:block/warped_fungus_variant_1"), new ResourceLocation("flowerpots:block/warped_fungus_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_CRIMSON_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/crimson_roots_pot"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_2"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_WARPED_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/warped_roots_pot"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_FLOWER_POT_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/potted_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_FLOWER_POT_FLOWERING_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/potted_flowering_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_2"));
        flowerPotDripLeaf(ModBlocks.SMALL_FLOWER_POT_BIG_DRIPLEAF.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_big_dripleaf"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_big_dripleaf_partial_tilt"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_big_dripleaf_full_tilt"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/big_dripleaf_stem"), new ResourceLocation("block/big_dripleaf_top"), new ResourceLocation("block/big_dripleaf_tip"), new ResourceLocation("block/big_dripleaf_side"));
        flowerPot(ModBlocks.SMALL_FLOWER_POT_GRASS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross_tint"), new ResourceLocation("block/flower_pot"), new ResourceLocation("flowerpots:block/grass_default"), new ResourceLocation("flowerpots:block/grass_variant_0"), new ResourceLocation("flowerpots:block/grass_variant_1"), new ResourceLocation("flowerpots:block/grass_variant_2"));
        flowerPotTallPlant(ModBlocks.SMALL_FLOWER_POT_LILAC.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross_tall"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/lilac_top"), new ResourceLocation("flowerpots:block/lilac_top_variant_0"), new ResourceLocation("flowerpots:block/lilac_top_variant_1"), new ResourceLocation("flowerpots:block/lilac_top_variant_2"), new ResourceLocation("block/lilac_bottom"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_0"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_1"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_2"));
        flowerPotTallPlant(ModBlocks.SMALL_FLOWER_POT_ROSE_BUSH.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross_tall"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/rose_bush_top"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_0"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_1"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_2"), new ResourceLocation("block/rose_bush_bottom"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_0"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_1"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_2"));
        flowerPotTallPlant(ModBlocks.SMALL_FLOWER_POT_PEONY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross_tall"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/peony_top"), new ResourceLocation("flowerpots:block/peony_top_variant_0"), new ResourceLocation("flowerpots:block/peony_top_variant_1"), new ResourceLocation("flowerpots:block/peony_top_variant_2"), new ResourceLocation("block/peony_bottom"), new ResourceLocation("flowerpots:block/peony_bottom_variant_0"), new ResourceLocation("flowerpots:block/peony_bottom_variant_1"), new ResourceLocation("flowerpots:block/peony_bottom_variant_2"));
        flowerPotTallPlantNoVariants(ModBlocks.SMALL_FLOWER_POT_TALL_GRASS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross_tint_tall"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/tall_grass_top"), new ResourceLocation("block/tall_grass_bottom"));
        flowerPotTallPlantNoVariants(ModBlocks.SMALL_FLOWER_POT_LARGE_FERN.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross_tint_tall"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/large_fern_top"), new ResourceLocation("block/large_fern_bottom"));
        flowerPotConfigurableModel(ModBlocks.SMALL_FLOWER_POT_OAK_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_FLOWER_POT_SPRUCE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_FLOWER_POT_BIRCH_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_FLOWER_POT_DARK_OAK_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_FLOWER_POT_ACACIA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_FLOWER_POT_JUNGLE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_FLOWER_POT_MANGROVE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_tint_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_FLOWER_POT_AZALEA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_leaves_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"));

        flowerPotEmpty(ModBlocks.SMALL_TALL_FLOWER_POT.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_empty"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"));
        flowerPotEmpty(ModBlocks.SMALL_TALL_UNFIRED_FLOWER_POT.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_empty"), new ResourceLocation("block/clay"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_ALLIUM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/allium"), new ResourceLocation("flowerpots:block/allium_variant_0"), new ResourceLocation("flowerpots:block/allium_variant_1"), new ResourceLocation("flowerpots:block/allium_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/oak_sapling"), new ResourceLocation("flowerpots:block/oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/oak_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_SPRUCE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/spruce_sapling"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_0"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_1"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_BIRCH_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/birch_sapling"), new ResourceLocation("flowerpots:block/birch_sapling_variant_0"), new ResourceLocation("flowerpots:block/birch_sapling_variant_1"), new ResourceLocation("flowerpots:block/birch_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_JUNGLE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/jungle_sapling"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_0"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_1"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_ACACIA_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/acacia_sapling"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_0"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_1"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_DARK_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/dark_oak_sapling"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_2"));
        flowerPotConfigurableModel(ModBlocks.SMALL_TALL_FLOWER_POT_MANGROVE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_mangrove_propagule_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_mangrove_propagule_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_mangrove_propagule_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_mangrove_propagule_variant_2"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/mangrove_propagule"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_0"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_1"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_FERN.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross_tint"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/fern"), new ResourceLocation("flowerpots:block/fern_variant_0"), new ResourceLocation("flowerpots:block/fern_variant_1"), new ResourceLocation("flowerpots:block/fern_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_DANDELION.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/dandelion"), new ResourceLocation("flowerpots:block/dandelion_variant_0"), new ResourceLocation("flowerpots:block/dandelion_variant_1"), new ResourceLocation("flowerpots:block/dandelion_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_POPPY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/poppy"), new ResourceLocation("flowerpots:block/poppy_variant_0"), new ResourceLocation("flowerpots:block/poppy_variant_1"), new ResourceLocation("flowerpots:block/poppy_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_BLUE_ORCHID.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/blue_orchid"), new ResourceLocation("flowerpots:block/blue_orchid_variant_0"), new ResourceLocation("flowerpots:block/blue_orchid_variant_1"), new ResourceLocation("flowerpots:block/blue_orchid_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_AZURE_BLUET.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/azure_bluet"), new ResourceLocation("flowerpots:block/azure_bluet_variant_0"), new ResourceLocation("flowerpots:block/azure_bluet_variant_1"), new ResourceLocation("flowerpots:block/azure_bluet_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_RED_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/red_tulip"), new ResourceLocation("flowerpots:block/red_tulip_variant_0"), new ResourceLocation("flowerpots:block/red_tulip_variant_1"), new ResourceLocation("flowerpots:block/red_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_ORANGE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/orange_tulip"), new ResourceLocation("flowerpots:block/orange_tulip_variant_0"), new ResourceLocation("flowerpots:block/orange_tulip_variant_1"), new ResourceLocation("flowerpots:block/orange_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_WHITE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/white_tulip"), new ResourceLocation("flowerpots:block/white_tulip_variant_0"), new ResourceLocation("flowerpots:block/white_tulip_variant_1"), new ResourceLocation("flowerpots:block/white_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_PINK_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/pink_tulip"), new ResourceLocation("flowerpots:block/pink_tulip_variant_0"), new ResourceLocation("flowerpots:block/pink_tulip_variant_1"), new ResourceLocation("flowerpots:block/pink_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_OXEYE_DAISY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/oxeye_daisy"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_0"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_1"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_CORNFLOWER.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/cornflower"), new ResourceLocation("flowerpots:block/cornflower_variant_0"), new ResourceLocation("flowerpots:block/cornflower_variant_1"), new ResourceLocation("flowerpots:block/cornflower_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_LILY_OF_THE_VALLEY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/lily_of_the_valley"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_0"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_1"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_WITHER_ROSE.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/wither_rose"), new ResourceLocation("flowerpots:block/wither_rose_variant_0"), new ResourceLocation("flowerpots:block/wither_rose_variant_1"), new ResourceLocation("flowerpots:block/wither_rose_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_RED_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/red_mushroom"), new ResourceLocation("flowerpots:block/red_mushroom_variant_0"), new ResourceLocation("flowerpots:block/red_mushroom_variant_1"), new ResourceLocation("flowerpots:block/red_mushroom_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_BROWN_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/brown_mushroom"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_0"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_1"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_DEAD_BUSH.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/dead_bush"), new ResourceLocation("flowerpots:block/dead_bush_variant_0"), new ResourceLocation("flowerpots:block/dead_bush_variant_1"), new ResourceLocation("flowerpots:block/dead_bush_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_TALL_FLOWER_POT_CACTUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cactus_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cactus_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cactus_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cactus_variant_2"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_TALL_FLOWER_POT_BAMBOO.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_bamboo_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_bamboo_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_bamboo_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_bamboo_variant_2"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_CRIMSON_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/crimson_fungus"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_0"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_1"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_WARPED_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/warped_fungus"), new ResourceLocation("flowerpots:block/warped_fungus_variant_0"), new ResourceLocation("flowerpots:block/warped_fungus_variant_1"), new ResourceLocation("flowerpots:block/warped_fungus_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_CRIMSON_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/crimson_roots_pot"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_2"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_WARPED_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/warped_roots_pot"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_TALL_FLOWER_POT_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_azalea_variant_2"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/potted_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_TALL_FLOWER_POT_FLOWERING_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_azalea_variant_2"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/potted_flowering_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_2"));
        flowerPotDripLeaf(ModBlocks.SMALL_TALL_FLOWER_POT_BIG_DRIPLEAF.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_big_dripleaf"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_big_dripleaf_partial_tilt"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_big_dripleaf_full_tilt"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/big_dripleaf_stem"), new ResourceLocation("block/big_dripleaf_top"), new ResourceLocation("block/big_dripleaf_tip"), new ResourceLocation("block/big_dripleaf_side"));
        flowerPot(ModBlocks.SMALL_TALL_FLOWER_POT_GRASS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross_tint"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("flowerpots:block/grass_default"), new ResourceLocation("flowerpots:block/grass_variant_0"), new ResourceLocation("flowerpots:block/grass_variant_1"), new ResourceLocation("flowerpots:block/grass_variant_2"));
        flowerPotTallPlant(ModBlocks.SMALL_TALL_FLOWER_POT_LILAC.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/lilac_top"), new ResourceLocation("flowerpots:block/lilac_top_variant_0"), new ResourceLocation("flowerpots:block/lilac_top_variant_1"), new ResourceLocation("flowerpots:block/lilac_top_variant_2"), new ResourceLocation("block/lilac_bottom"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_0"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_1"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_2"));
        flowerPotTallPlant(ModBlocks.SMALL_TALL_FLOWER_POT_ROSE_BUSH.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/rose_bush_top"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_0"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_1"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_2"), new ResourceLocation("block/rose_bush_bottom"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_0"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_1"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_2"));
        flowerPotTallPlant(ModBlocks.SMALL_TALL_FLOWER_POT_PEONY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/peony_top"), new ResourceLocation("flowerpots:block/peony_top_variant_0"), new ResourceLocation("flowerpots:block/peony_top_variant_1"), new ResourceLocation("flowerpots:block/peony_top_variant_2"), new ResourceLocation("block/peony_bottom"), new ResourceLocation("flowerpots:block/peony_bottom_variant_0"), new ResourceLocation("flowerpots:block/peony_bottom_variant_1"), new ResourceLocation("flowerpots:block/peony_bottom_variant_2"));
        flowerPotTallPlantNoVariants(ModBlocks.SMALL_TALL_FLOWER_POT_TALL_GRASS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross_tint_tall"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/tall_grass_top"), new ResourceLocation("block/tall_grass_bottom"));
        flowerPotTallPlantNoVariants(ModBlocks.SMALL_TALL_FLOWER_POT_LARGE_FERN.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_cross_tint_tall"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/large_fern_top"), new ResourceLocation("block/large_fern_bottom"));
        flowerPotConfigurableModel(ModBlocks.SMALL_TALL_FLOWER_POT_OAK_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_TALL_FLOWER_POT_SPRUCE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_TALL_FLOWER_POT_BIRCH_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_TALL_FLOWER_POT_DARK_OAK_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_TALL_FLOWER_POT_ACACIA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_TALL_FLOWER_POT_JUNGLE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_TALL_FLOWER_POT_MANGROVE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_TALL_FLOWER_POT_AZALEA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_variant_2"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_TALL_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_tall_flower_pot_leaves_variant_2"), new ResourceLocation("flowerpots:block/small_tall_flower_pot"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"));

        flowerPotEmpty(ModBlocks.LARGE_FLOWER_POT.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_empty"), new ResourceLocation("flowerpots:block/large_flower_pot"));
        flowerPotEmpty(ModBlocks.LARGE_UNFIRED_FLOWER_POT.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_unfired"), new ResourceLocation("block/clay"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_ALLIUM.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/allium"), new ResourceLocation("flowerpots:block/allium_variant_0"), new ResourceLocation("flowerpots:block/allium_variant_1"), new ResourceLocation("flowerpots:block/allium_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/oak_sapling"), new ResourceLocation("flowerpots:block/oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/oak_sapling_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_SPRUCE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/spruce_sapling"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_0"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_1"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_BIRCH_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/birch_sapling"), new ResourceLocation("flowerpots:block/birch_sapling_variant_0"), new ResourceLocation("flowerpots:block/birch_sapling_variant_1"), new ResourceLocation("flowerpots:block/birch_sapling_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_JUNGLE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/jungle_sapling"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_0"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_1"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_ACACIA_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/acacia_sapling"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_0"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_1"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_DARK_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/dark_oak_sapling"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_2"));
        flowerPotConfigurableModel(ModBlocks.LARGE_FLOWER_POT_MANGROVE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_mangrove_propagule_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_mangrove_propagule_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_mangrove_propagule_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_mangrove_propagule_variant_2"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/mangrove_propagule"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_0"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_1"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_FERN.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross_tint"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/fern"), new ResourceLocation("flowerpots:block/fern_variant_0"), new ResourceLocation("flowerpots:block/fern_variant_1"), new ResourceLocation("flowerpots:block/fern_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_DANDELION.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/dandelion"), new ResourceLocation("flowerpots:block/dandelion_variant_0"), new ResourceLocation("flowerpots:block/dandelion_variant_1"), new ResourceLocation("flowerpots:block/dandelion_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_POPPY.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/poppy"), new ResourceLocation("flowerpots:block/poppy_variant_0"), new ResourceLocation("flowerpots:block/poppy_variant_1"), new ResourceLocation("flowerpots:block/poppy_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_BLUE_ORCHID.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/blue_orchid"), new ResourceLocation("flowerpots:block/blue_orchid_variant_0"), new ResourceLocation("flowerpots:block/blue_orchid_variant_1"), new ResourceLocation("flowerpots:block/blue_orchid_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_AZURE_BLUET.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/azure_bluet"), new ResourceLocation("flowerpots:block/azure_bluet_variant_0"), new ResourceLocation("flowerpots:block/azure_bluet_variant_1"), new ResourceLocation("flowerpots:block/azure_bluet_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_RED_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/red_tulip"), new ResourceLocation("flowerpots:block/red_tulip_variant_0"), new ResourceLocation("flowerpots:block/red_tulip_variant_1"), new ResourceLocation("flowerpots:block/red_tulip_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_ORANGE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/orange_tulip"), new ResourceLocation("flowerpots:block/orange_tulip_variant_0"), new ResourceLocation("flowerpots:block/orange_tulip_variant_1"), new ResourceLocation("flowerpots:block/orange_tulip_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_WHITE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/white_tulip"), new ResourceLocation("flowerpots:block/white_tulip_variant_0"), new ResourceLocation("flowerpots:block/white_tulip_variant_1"), new ResourceLocation("flowerpots:block/white_tulip_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_PINK_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/pink_tulip"), new ResourceLocation("flowerpots:block/pink_tulip_variant_0"), new ResourceLocation("flowerpots:block/pink_tulip_variant_1"), new ResourceLocation("flowerpots:block/pink_tulip_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_OXEYE_DAISY.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/oxeye_daisy"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_0"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_1"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_CORNFLOWER.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/cornflower"), new ResourceLocation("flowerpots:block/cornflower_variant_0"), new ResourceLocation("flowerpots:block/cornflower_variant_1"), new ResourceLocation("flowerpots:block/cornflower_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_LILY_OF_THE_VALLEY.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/lily_of_the_valley"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_0"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_1"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_WITHER_ROSE.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/wither_rose"), new ResourceLocation("flowerpots:block/wither_rose_variant_0"), new ResourceLocation("flowerpots:block/wither_rose_variant_1"), new ResourceLocation("flowerpots:block/wither_rose_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_RED_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/red_mushroom"), new ResourceLocation("flowerpots:block/red_mushroom_variant_0"), new ResourceLocation("flowerpots:block/red_mushroom_variant_1"), new ResourceLocation("flowerpots:block/red_mushroom_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_BROWN_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/brown_mushroom"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_0"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_1"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_DEAD_BUSH.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/dead_bush"), new ResourceLocation("flowerpots:block/dead_bush_variant_0"), new ResourceLocation("flowerpots:block/dead_bush_variant_1"), new ResourceLocation("flowerpots:block/dead_bush_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.LARGE_FLOWER_POT_CACTUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cactus_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cactus_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cactus_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cactus_variant_2"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"));
        flowerPotConfigurableTexture(ModBlocks.LARGE_FLOWER_POT_BAMBOO.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_bamboo_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_bamboo_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_bamboo_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_bamboo_variant_2"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_CRIMSON_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/crimson_fungus"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_0"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_1"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_WARPED_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/warped_fungus"), new ResourceLocation("flowerpots:block/warped_fungus_variant_0"), new ResourceLocation("flowerpots:block/warped_fungus_variant_1"), new ResourceLocation("flowerpots:block/warped_fungus_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_CRIMSON_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/crimson_roots_pot"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_2"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_WARPED_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/warped_roots_pot"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.LARGE_FLOWER_POT_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_azalea_variant_2"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/potted_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.LARGE_FLOWER_POT_FLOWERING_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_azalea_variant_2"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/potted_flowering_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_2"));
        flowerPotDripLeaf(ModBlocks.LARGE_FLOWER_POT_BIG_DRIPLEAF.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_big_dripleaf"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_big_dripleaf_partial_tilt"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_big_dripleaf_full_tilt"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/big_dripleaf_stem"), new ResourceLocation("block/big_dripleaf_top"), new ResourceLocation("block/big_dripleaf_tip"), new ResourceLocation("block/big_dripleaf_side"));
        flowerPot(ModBlocks.LARGE_FLOWER_POT_GRASS.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross_tint"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("flowerpots:block/grass_default"), new ResourceLocation("flowerpots:block/grass_variant_0"), new ResourceLocation("flowerpots:block/grass_variant_1"), new ResourceLocation("flowerpots:block/grass_variant_2"));
        flowerPotTallPlant(ModBlocks.LARGE_FLOWER_POT_LILAC.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/lilac_top"), new ResourceLocation("flowerpots:block/lilac_top_variant_0"), new ResourceLocation("flowerpots:block/lilac_top_variant_1"), new ResourceLocation("flowerpots:block/lilac_top_variant_2"), new ResourceLocation("block/lilac_bottom"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_0"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_1"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_2"));
        flowerPotTallPlant(ModBlocks.LARGE_FLOWER_POT_ROSE_BUSH.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/rose_bush_top"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_0"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_1"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_2"), new ResourceLocation("block/rose_bush_bottom"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_0"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_1"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_2"));
        flowerPotTallPlant(ModBlocks.LARGE_FLOWER_POT_PEONY.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/peony_top"), new ResourceLocation("flowerpots:block/peony_top_variant_0"), new ResourceLocation("flowerpots:block/peony_top_variant_1"), new ResourceLocation("flowerpots:block/peony_top_variant_2"), new ResourceLocation("block/peony_bottom"), new ResourceLocation("flowerpots:block/peony_bottom_variant_0"), new ResourceLocation("flowerpots:block/peony_bottom_variant_1"), new ResourceLocation("flowerpots:block/peony_bottom_variant_2"));
        flowerPotTallPlantNoVariants(ModBlocks.LARGE_FLOWER_POT_TALL_GRASS.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross_tint_tall"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/tall_grass_top"), new ResourceLocation("block/tall_grass_bottom"));
        flowerPotTallPlantNoVariants(ModBlocks.LARGE_FLOWER_POT_LARGE_FERN.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_cross_tint_tall"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/large_fern_top"), new ResourceLocation("block/large_fern_bottom"));
        flowerPotConfigurableModel(ModBlocks.LARGE_FLOWER_POT_OAK_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_FLOWER_POT_SPRUCE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_FLOWER_POT_BIRCH_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_FLOWER_POT_DARK_OAK_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_FLOWER_POT_ACACIA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_FLOWER_POT_JUNGLE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_FLOWER_POT_MANGROVE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_FLOWER_POT_AZALEA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_variant_2"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_flower_pot_leaves_variant_2"), new ResourceLocation("flowerpots:block/large_flower_pot"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"));

        flowerPotEmpty(ModBlocks.LARGE_TALL_FLOWER_POT.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_empty"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"));
        flowerPotEmpty(ModBlocks.LARGE_TALL_UNFIRED_FLOWER_POT.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_unfired"), new ResourceLocation("block/clay"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_ALLIUM.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/allium"), new ResourceLocation("flowerpots:block/allium_variant_0"), new ResourceLocation("flowerpots:block/allium_variant_1"), new ResourceLocation("flowerpots:block/allium_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/oak_sapling"), new ResourceLocation("flowerpots:block/oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/oak_sapling_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_SPRUCE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/spruce_sapling"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_0"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_1"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_BIRCH_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/birch_sapling"), new ResourceLocation("flowerpots:block/birch_sapling_variant_0"), new ResourceLocation("flowerpots:block/birch_sapling_variant_1"), new ResourceLocation("flowerpots:block/birch_sapling_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_JUNGLE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/jungle_sapling"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_0"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_1"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_ACACIA_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/acacia_sapling"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_0"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_1"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_DARK_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/dark_oak_sapling"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_2"));
        flowerPotConfigurableModel(ModBlocks.LARGE_TALL_FLOWER_POT_MANGROVE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_mangrove_propagule_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_mangrove_propagule_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_mangrove_propagule_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_mangrove_propagule_variant_2"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/mangrove_propagule"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_0"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_1"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_FERN.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross_tint"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/fern"), new ResourceLocation("flowerpots:block/fern_variant_0"), new ResourceLocation("flowerpots:block/fern_variant_1"), new ResourceLocation("flowerpots:block/fern_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_DANDELION.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/dandelion"), new ResourceLocation("flowerpots:block/dandelion_variant_0"), new ResourceLocation("flowerpots:block/dandelion_variant_1"), new ResourceLocation("flowerpots:block/dandelion_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_POPPY.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/poppy"), new ResourceLocation("flowerpots:block/poppy_variant_0"), new ResourceLocation("flowerpots:block/poppy_variant_1"), new ResourceLocation("flowerpots:block/poppy_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_BLUE_ORCHID.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/blue_orchid"), new ResourceLocation("flowerpots:block/blue_orchid_variant_0"), new ResourceLocation("flowerpots:block/blue_orchid_variant_1"), new ResourceLocation("flowerpots:block/blue_orchid_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_AZURE_BLUET.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/azure_bluet"), new ResourceLocation("flowerpots:block/azure_bluet_variant_0"), new ResourceLocation("flowerpots:block/azure_bluet_variant_1"), new ResourceLocation("flowerpots:block/azure_bluet_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_RED_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/red_tulip"), new ResourceLocation("flowerpots:block/red_tulip_variant_0"), new ResourceLocation("flowerpots:block/red_tulip_variant_1"), new ResourceLocation("flowerpots:block/red_tulip_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_ORANGE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/orange_tulip"), new ResourceLocation("flowerpots:block/orange_tulip_variant_0"), new ResourceLocation("flowerpots:block/orange_tulip_variant_1"), new ResourceLocation("flowerpots:block/orange_tulip_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_WHITE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/white_tulip"), new ResourceLocation("flowerpots:block/white_tulip_variant_0"), new ResourceLocation("flowerpots:block/white_tulip_variant_1"), new ResourceLocation("flowerpots:block/white_tulip_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_PINK_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/pink_tulip"), new ResourceLocation("flowerpots:block/pink_tulip_variant_0"), new ResourceLocation("flowerpots:block/pink_tulip_variant_1"), new ResourceLocation("flowerpots:block/pink_tulip_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_OXEYE_DAISY.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/oxeye_daisy"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_0"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_1"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_CORNFLOWER.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/cornflower"), new ResourceLocation("flowerpots:block/cornflower_variant_0"), new ResourceLocation("flowerpots:block/cornflower_variant_1"), new ResourceLocation("flowerpots:block/cornflower_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_LILY_OF_THE_VALLEY.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/lily_of_the_valley"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_0"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_1"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_WITHER_ROSE.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/wither_rose"), new ResourceLocation("flowerpots:block/wither_rose_variant_0"), new ResourceLocation("flowerpots:block/wither_rose_variant_1"), new ResourceLocation("flowerpots:block/wither_rose_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_RED_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/red_mushroom"), new ResourceLocation("flowerpots:block/red_mushroom_variant_0"), new ResourceLocation("flowerpots:block/red_mushroom_variant_1"), new ResourceLocation("flowerpots:block/red_mushroom_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_BROWN_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/brown_mushroom"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_0"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_1"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_DEAD_BUSH.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/dead_bush"), new ResourceLocation("flowerpots:block/dead_bush_variant_0"), new ResourceLocation("flowerpots:block/dead_bush_variant_1"), new ResourceLocation("flowerpots:block/dead_bush_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.LARGE_TALL_FLOWER_POT_CACTUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cactus_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cactus_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cactus_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cactus_variant_2"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"));
        flowerPotConfigurableTexture(ModBlocks.LARGE_TALL_FLOWER_POT_BAMBOO.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_bamboo_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_bamboo_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_bamboo_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_bamboo_variant_2"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_CRIMSON_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/crimson_fungus"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_0"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_1"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_WARPED_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/warped_fungus"), new ResourceLocation("flowerpots:block/warped_fungus_variant_0"), new ResourceLocation("flowerpots:block/warped_fungus_variant_1"), new ResourceLocation("flowerpots:block/warped_fungus_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_CRIMSON_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/crimson_roots_pot"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_2"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_WARPED_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/warped_roots_pot"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.LARGE_TALL_FLOWER_POT_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_azalea_variant_2"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/potted_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.LARGE_TALL_FLOWER_POT_FLOWERING_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_azalea_variant_2"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/potted_flowering_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_2"));
        flowerPotDripLeaf(ModBlocks.LARGE_TALL_FLOWER_POT_BIG_DRIPLEAF.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_big_dripleaf"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_big_dripleaf_partial_tilt"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_big_dripleaf_full_tilt"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/big_dripleaf_stem"), new ResourceLocation("block/big_dripleaf_top"), new ResourceLocation("block/big_dripleaf_tip"), new ResourceLocation("block/big_dripleaf_side"));
        flowerPot(ModBlocks.LARGE_TALL_FLOWER_POT_GRASS.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross_tint"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("flowerpots:block/grass_default"), new ResourceLocation("flowerpots:block/grass_variant_0"), new ResourceLocation("flowerpots:block/grass_variant_1"), new ResourceLocation("flowerpots:block/grass_variant_2"));
        flowerPotTallPlant(ModBlocks.LARGE_TALL_FLOWER_POT_LILAC.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/lilac_top"), new ResourceLocation("flowerpots:block/lilac_top_variant_0"), new ResourceLocation("flowerpots:block/lilac_top_variant_1"), new ResourceLocation("flowerpots:block/lilac_top_variant_2"), new ResourceLocation("block/lilac_bottom"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_0"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_1"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_2"));
        flowerPotTallPlant(ModBlocks.LARGE_TALL_FLOWER_POT_ROSE_BUSH.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/rose_bush_top"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_0"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_1"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_2"), new ResourceLocation("block/rose_bush_bottom"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_0"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_1"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_2"));
        flowerPotTallPlant(ModBlocks.LARGE_TALL_FLOWER_POT_PEONY.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/peony_top"), new ResourceLocation("flowerpots:block/peony_top_variant_0"), new ResourceLocation("flowerpots:block/peony_top_variant_1"), new ResourceLocation("flowerpots:block/peony_top_variant_2"), new ResourceLocation("block/peony_bottom"), new ResourceLocation("flowerpots:block/peony_bottom_variant_0"), new ResourceLocation("flowerpots:block/peony_bottom_variant_1"), new ResourceLocation("flowerpots:block/peony_bottom_variant_2"));
        flowerPotTallPlantNoVariants(ModBlocks.LARGE_TALL_FLOWER_POT_TALL_GRASS.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross_tint_tall"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/tall_grass_top"), new ResourceLocation("block/tall_grass_bottom"));
        flowerPotTallPlantNoVariants(ModBlocks.LARGE_TALL_FLOWER_POT_LARGE_FERN.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_cross_tint_tall"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/large_fern_top"), new ResourceLocation("block/large_fern_bottom"));
        flowerPotConfigurableModel(ModBlocks.LARGE_TALL_FLOWER_POT_OAK_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_TALL_FLOWER_POT_SPRUCE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_TALL_FLOWER_POT_BIRCH_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_TALL_FLOWER_POT_DARK_OAK_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_TALL_FLOWER_POT_ACACIA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_TALL_FLOWER_POT_JUNGLE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_TALL_FLOWER_POT_MANGROVE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_TALL_FLOWER_POT_AZALEA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_variant_2"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"));
        flowerPotConfigurableModel(ModBlocks.LARGE_TALL_FLOWER_POT_FLOWERING_AZALEA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_default"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/large_tall_flower_pot_leaves_variant_2"), new ResourceLocation("flowerpots:block/large_tall_flower_pot"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"));

        flowerPotEmpty(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_empty"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ALLIUM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/allium"), new ResourceLocation("flowerpots:block/allium_variant_0"), new ResourceLocation("flowerpots:block/allium_variant_1"), new ResourceLocation("flowerpots:block/allium_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/oak_sapling"), new ResourceLocation("flowerpots:block/oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/oak_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_SPRUCE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/spruce_sapling"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_0"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_1"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BIRCH_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/birch_sapling"), new ResourceLocation("flowerpots:block/birch_sapling_variant_0"), new ResourceLocation("flowerpots:block/birch_sapling_variant_1"), new ResourceLocation("flowerpots:block/birch_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_JUNGLE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/jungle_sapling"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_0"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_1"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ACACIA_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/acacia_sapling"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_0"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_1"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_DARK_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/dark_oak_sapling"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_2"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_MANGROVE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_mangrove_propagule_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_mangrove_propagule_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_mangrove_propagule_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_mangrove_propagule_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/mangrove_propagule"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_0"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_1"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_FERN.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tint"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/fern"), new ResourceLocation("flowerpots:block/fern_variant_0"), new ResourceLocation("flowerpots:block/fern_variant_1"), new ResourceLocation("flowerpots:block/fern_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_DANDELION.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/dandelion"), new ResourceLocation("flowerpots:block/dandelion_variant_0"), new ResourceLocation("flowerpots:block/dandelion_variant_1"), new ResourceLocation("flowerpots:block/dandelion_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_POPPY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/poppy"), new ResourceLocation("flowerpots:block/poppy_variant_0"), new ResourceLocation("flowerpots:block/poppy_variant_1"), new ResourceLocation("flowerpots:block/poppy_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BLUE_ORCHID.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/blue_orchid"), new ResourceLocation("flowerpots:block/blue_orchid_variant_0"), new ResourceLocation("flowerpots:block/blue_orchid_variant_1"), new ResourceLocation("flowerpots:block/blue_orchid_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_AZURE_BLUET.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/azure_bluet"), new ResourceLocation("flowerpots:block/azure_bluet_variant_0"), new ResourceLocation("flowerpots:block/azure_bluet_variant_1"), new ResourceLocation("flowerpots:block/azure_bluet_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_RED_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/red_tulip"), new ResourceLocation("flowerpots:block/red_tulip_variant_0"), new ResourceLocation("flowerpots:block/red_tulip_variant_1"), new ResourceLocation("flowerpots:block/red_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ORANGE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/orange_tulip"), new ResourceLocation("flowerpots:block/orange_tulip_variant_0"), new ResourceLocation("flowerpots:block/orange_tulip_variant_1"), new ResourceLocation("flowerpots:block/orange_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_WHITE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/white_tulip"), new ResourceLocation("flowerpots:block/white_tulip_variant_0"), new ResourceLocation("flowerpots:block/white_tulip_variant_1"), new ResourceLocation("flowerpots:block/white_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_PINK_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/pink_tulip"), new ResourceLocation("flowerpots:block/pink_tulip_variant_0"), new ResourceLocation("flowerpots:block/pink_tulip_variant_1"), new ResourceLocation("flowerpots:block/pink_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_OXEYE_DAISY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/oxeye_daisy"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_0"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_1"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_CORNFLOWER.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/cornflower"), new ResourceLocation("flowerpots:block/cornflower_variant_0"), new ResourceLocation("flowerpots:block/cornflower_variant_1"), new ResourceLocation("flowerpots:block/cornflower_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_LILY_OF_THE_VALLEY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/lily_of_the_valley"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_0"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_1"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_WITHER_ROSE.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/wither_rose"), new ResourceLocation("flowerpots:block/wither_rose_variant_0"), new ResourceLocation("flowerpots:block/wither_rose_variant_1"), new ResourceLocation("flowerpots:block/wither_rose_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_RED_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/red_mushroom"), new ResourceLocation("flowerpots:block/red_mushroom_variant_0"), new ResourceLocation("flowerpots:block/red_mushroom_variant_1"), new ResourceLocation("flowerpots:block/red_mushroom_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BROWN_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/brown_mushroom"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_0"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_1"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_DEAD_BUSH.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/dead_bush"), new ResourceLocation("flowerpots:block/dead_bush_variant_0"), new ResourceLocation("flowerpots:block/dead_bush_variant_1"), new ResourceLocation("flowerpots:block/dead_bush_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_CACTUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cactus_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cactus_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cactus_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cactus_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BAMBOO.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_bamboo_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_bamboo_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_bamboo_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_bamboo_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_CRIMSON_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/crimson_fungus"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_0"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_1"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_WARPED_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/warped_fungus"), new ResourceLocation("flowerpots:block/warped_fungus_variant_0"), new ResourceLocation("flowerpots:block/warped_fungus_variant_1"), new ResourceLocation("flowerpots:block/warped_fungus_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_CRIMSON_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/crimson_roots_pot"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_WARPED_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/warped_roots_pot"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/potted_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_FLOWERING_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/potted_flowering_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_2"));
        flowerPotDripLeaf(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BIG_DRIPLEAF.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_big_dripleaf"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_big_dripleaf_partial_tilt"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_big_dripleaf_full_tilt"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/big_dripleaf_stem"), new ResourceLocation("block/big_dripleaf_top"), new ResourceLocation("block/big_dripleaf_tip"), new ResourceLocation("block/big_dripleaf_side"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_GRASS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tint"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("flowerpots:block/grass_default"), new ResourceLocation("flowerpots:block/grass_variant_0"), new ResourceLocation("flowerpots:block/grass_variant_1"), new ResourceLocation("flowerpots:block/grass_variant_2"));
        flowerPotTallPlant(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_LILAC.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/lilac_top"), new ResourceLocation("flowerpots:block/lilac_top_variant_0"), new ResourceLocation("flowerpots:block/lilac_top_variant_1"), new ResourceLocation("flowerpots:block/lilac_top_variant_2"), new ResourceLocation("block/lilac_bottom"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_0"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_1"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_2"));
        flowerPotTallPlant(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ROSE_BUSH.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/rose_bush_top"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_0"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_1"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_2"), new ResourceLocation("block/rose_bush_bottom"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_0"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_1"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_2"));
        flowerPotTallPlant(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_PEONY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/peony_top"), new ResourceLocation("flowerpots:block/peony_top_variant_0"), new ResourceLocation("flowerpots:block/peony_top_variant_1"), new ResourceLocation("flowerpots:block/peony_top_variant_2"), new ResourceLocation("block/peony_bottom"), new ResourceLocation("flowerpots:block/peony_bottom_variant_0"), new ResourceLocation("flowerpots:block/peony_bottom_variant_1"), new ResourceLocation("flowerpots:block/peony_bottom_variant_2"));
        flowerPotTallPlantNoVariants(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_TALL_GRASS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tint_tall"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/tall_grass_top"), new ResourceLocation("block/tall_grass_bottom"));
        flowerPotTallPlantNoVariants(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_LARGE_FERN.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tint_tall"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/large_fern_top"), new ResourceLocation("block/large_fern_bottom"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_OAK_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_SPRUCE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BIRCH_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_DARK_OAK_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ACACIA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_JUNGLE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_MANGROVE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_AZALEA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_FLOWERING_AZALEA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_iron_chain"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"));

        flowerPotEmpty(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_empty"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ALLIUM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/allium"), new ResourceLocation("flowerpots:block/allium_variant_0"), new ResourceLocation("flowerpots:block/allium_variant_1"), new ResourceLocation("flowerpots:block/allium_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/oak_sapling"), new ResourceLocation("flowerpots:block/oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/oak_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_SPRUCE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/spruce_sapling"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_0"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_1"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BIRCH_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/birch_sapling"), new ResourceLocation("flowerpots:block/birch_sapling_variant_0"), new ResourceLocation("flowerpots:block/birch_sapling_variant_1"), new ResourceLocation("flowerpots:block/birch_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_JUNGLE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/jungle_sapling"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_0"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_1"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ACACIA_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/acacia_sapling"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_0"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_1"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_DARK_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/dark_oak_sapling"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_2"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_MANGROVE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_mangrove_propagule_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_mangrove_propagule_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_mangrove_propagule_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_mangrove_propagule_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/mangrove_propagule"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_0"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_1"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_FERN.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tint"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/fern"), new ResourceLocation("flowerpots:block/fern_variant_0"), new ResourceLocation("flowerpots:block/fern_variant_1"), new ResourceLocation("flowerpots:block/fern_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_DANDELION.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/dandelion"), new ResourceLocation("flowerpots:block/dandelion_variant_0"), new ResourceLocation("flowerpots:block/dandelion_variant_1"), new ResourceLocation("flowerpots:block/dandelion_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_POPPY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/poppy"), new ResourceLocation("flowerpots:block/poppy_variant_0"), new ResourceLocation("flowerpots:block/poppy_variant_1"), new ResourceLocation("flowerpots:block/poppy_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BLUE_ORCHID.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/blue_orchid"), new ResourceLocation("flowerpots:block/blue_orchid_variant_0"), new ResourceLocation("flowerpots:block/blue_orchid_variant_1"), new ResourceLocation("flowerpots:block/blue_orchid_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_AZURE_BLUET.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/azure_bluet"), new ResourceLocation("flowerpots:block/azure_bluet_variant_0"), new ResourceLocation("flowerpots:block/azure_bluet_variant_1"), new ResourceLocation("flowerpots:block/azure_bluet_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_RED_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/red_tulip"), new ResourceLocation("flowerpots:block/red_tulip_variant_0"), new ResourceLocation("flowerpots:block/red_tulip_variant_1"), new ResourceLocation("flowerpots:block/red_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ORANGE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/orange_tulip"), new ResourceLocation("flowerpots:block/orange_tulip_variant_0"), new ResourceLocation("flowerpots:block/orange_tulip_variant_1"), new ResourceLocation("flowerpots:block/orange_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_WHITE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/white_tulip"), new ResourceLocation("flowerpots:block/white_tulip_variant_0"), new ResourceLocation("flowerpots:block/white_tulip_variant_1"), new ResourceLocation("flowerpots:block/white_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_PINK_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/pink_tulip"), new ResourceLocation("flowerpots:block/pink_tulip_variant_0"), new ResourceLocation("flowerpots:block/pink_tulip_variant_1"), new ResourceLocation("flowerpots:block/pink_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_OXEYE_DAISY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/oxeye_daisy"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_0"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_1"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_CORNFLOWER.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/cornflower"), new ResourceLocation("flowerpots:block/cornflower_variant_0"), new ResourceLocation("flowerpots:block/cornflower_variant_1"), new ResourceLocation("flowerpots:block/cornflower_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_LILY_OF_THE_VALLEY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/lily_of_the_valley"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_0"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_1"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_WITHER_ROSE.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/wither_rose"), new ResourceLocation("flowerpots:block/wither_rose_variant_0"), new ResourceLocation("flowerpots:block/wither_rose_variant_1"), new ResourceLocation("flowerpots:block/wither_rose_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_RED_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/red_mushroom"), new ResourceLocation("flowerpots:block/red_mushroom_variant_0"), new ResourceLocation("flowerpots:block/red_mushroom_variant_1"), new ResourceLocation("flowerpots:block/red_mushroom_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BROWN_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/brown_mushroom"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_0"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_1"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_DEAD_BUSH.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/dead_bush"), new ResourceLocation("flowerpots:block/dead_bush_variant_0"), new ResourceLocation("flowerpots:block/dead_bush_variant_1"), new ResourceLocation("flowerpots:block/dead_bush_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_CACTUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cactus_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cactus_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cactus_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cactus_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BAMBOO.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_bamboo_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_bamboo_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_bamboo_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_bamboo_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_CRIMSON_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/crimson_fungus"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_0"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_1"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_WARPED_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/warped_fungus"), new ResourceLocation("flowerpots:block/warped_fungus_variant_0"), new ResourceLocation("flowerpots:block/warped_fungus_variant_1"), new ResourceLocation("flowerpots:block/warped_fungus_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_CRIMSON_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/crimson_roots_pot"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_WARPED_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/warped_roots_pot"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/potted_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_FLOWERING_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/potted_flowering_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_2"));
        flowerPotDripLeaf(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BIG_DRIPLEAF.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_big_dripleaf"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_big_dripleaf_partial_tilt"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_big_dripleaf_full_tilt"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/big_dripleaf_stem"), new ResourceLocation("block/big_dripleaf_top"), new ResourceLocation("block/big_dripleaf_tip"), new ResourceLocation("block/big_dripleaf_side"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_GRASS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tint"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("flowerpots:block/grass_default"), new ResourceLocation("flowerpots:block/grass_variant_0"), new ResourceLocation("flowerpots:block/grass_variant_1"), new ResourceLocation("flowerpots:block/grass_variant_2"));
        flowerPotTallPlant(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_LILAC.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/lilac_top"), new ResourceLocation("flowerpots:block/lilac_top_variant_0"), new ResourceLocation("flowerpots:block/lilac_top_variant_1"), new ResourceLocation("flowerpots:block/lilac_top_variant_2"), new ResourceLocation("block/lilac_bottom"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_0"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_1"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_2"));
        flowerPotTallPlant(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ROSE_BUSH.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/rose_bush_top"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_0"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_1"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_2"), new ResourceLocation("block/rose_bush_bottom"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_0"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_1"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_2"));
        flowerPotTallPlant(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_PEONY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/peony_top"), new ResourceLocation("flowerpots:block/peony_top_variant_0"), new ResourceLocation("flowerpots:block/peony_top_variant_1"), new ResourceLocation("flowerpots:block/peony_top_variant_2"), new ResourceLocation("block/peony_bottom"), new ResourceLocation("flowerpots:block/peony_bottom_variant_0"), new ResourceLocation("flowerpots:block/peony_bottom_variant_1"), new ResourceLocation("flowerpots:block/peony_bottom_variant_2"));
        flowerPotTallPlantNoVariants(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_TALL_GRASS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tint_tall"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/tall_grass_top"), new ResourceLocation("block/tall_grass_bottom"));
        flowerPotTallPlantNoVariants(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_LARGE_FERN.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tint_tall"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/large_fern_top"), new ResourceLocation("block/large_fern_bottom"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_OAK_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_SPRUCE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BIRCH_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_DARK_OAK_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ACACIA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_JUNGLE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_MANGROVE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_AZALEA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_FLOWERING_AZALEA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_gold_chain"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"));

        flowerPotEmpty(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_empty"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ALLIUM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/allium"), new ResourceLocation("flowerpots:block/allium_variant_0"), new ResourceLocation("flowerpots:block/allium_variant_1"), new ResourceLocation("flowerpots:block/allium_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/oak_sapling"), new ResourceLocation("flowerpots:block/oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/oak_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_SPRUCE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/spruce_sapling"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_0"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_1"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BIRCH_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/birch_sapling"), new ResourceLocation("flowerpots:block/birch_sapling_variant_0"), new ResourceLocation("flowerpots:block/birch_sapling_variant_1"), new ResourceLocation("flowerpots:block/birch_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_JUNGLE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/jungle_sapling"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_0"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_1"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ACACIA_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/acacia_sapling"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_0"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_1"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_DARK_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/dark_oak_sapling"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_2"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_MANGROVE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_mangrove_propagule_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_mangrove_propagule_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_mangrove_propagule_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_mangrove_propagule_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/mangrove_propagule"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_0"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_1"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_FERN.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tint"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/fern"), new ResourceLocation("flowerpots:block/fern_variant_0"), new ResourceLocation("flowerpots:block/fern_variant_1"), new ResourceLocation("flowerpots:block/fern_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_DANDELION.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/dandelion"), new ResourceLocation("flowerpots:block/dandelion_variant_0"), new ResourceLocation("flowerpots:block/dandelion_variant_1"), new ResourceLocation("flowerpots:block/dandelion_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_POPPY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/poppy"), new ResourceLocation("flowerpots:block/poppy_variant_0"), new ResourceLocation("flowerpots:block/poppy_variant_1"), new ResourceLocation("flowerpots:block/poppy_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BLUE_ORCHID.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/blue_orchid"), new ResourceLocation("flowerpots:block/blue_orchid_variant_0"), new ResourceLocation("flowerpots:block/blue_orchid_variant_1"), new ResourceLocation("flowerpots:block/blue_orchid_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_AZURE_BLUET.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/azure_bluet"), new ResourceLocation("flowerpots:block/azure_bluet_variant_0"), new ResourceLocation("flowerpots:block/azure_bluet_variant_1"), new ResourceLocation("flowerpots:block/azure_bluet_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_RED_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/red_tulip"), new ResourceLocation("flowerpots:block/red_tulip_variant_0"), new ResourceLocation("flowerpots:block/red_tulip_variant_1"), new ResourceLocation("flowerpots:block/red_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ORANGE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/orange_tulip"), new ResourceLocation("flowerpots:block/orange_tulip_variant_0"), new ResourceLocation("flowerpots:block/orange_tulip_variant_1"), new ResourceLocation("flowerpots:block/orange_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_WHITE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/white_tulip"), new ResourceLocation("flowerpots:block/white_tulip_variant_0"), new ResourceLocation("flowerpots:block/white_tulip_variant_1"), new ResourceLocation("flowerpots:block/white_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_PINK_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/pink_tulip"), new ResourceLocation("flowerpots:block/pink_tulip_variant_0"), new ResourceLocation("flowerpots:block/pink_tulip_variant_1"), new ResourceLocation("flowerpots:block/pink_tulip_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_OXEYE_DAISY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/oxeye_daisy"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_0"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_1"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_CORNFLOWER.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/cornflower"), new ResourceLocation("flowerpots:block/cornflower_variant_0"), new ResourceLocation("flowerpots:block/cornflower_variant_1"), new ResourceLocation("flowerpots:block/cornflower_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_LILY_OF_THE_VALLEY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/lily_of_the_valley"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_0"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_1"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_WITHER_ROSE.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/wither_rose"), new ResourceLocation("flowerpots:block/wither_rose_variant_0"), new ResourceLocation("flowerpots:block/wither_rose_variant_1"), new ResourceLocation("flowerpots:block/wither_rose_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_RED_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/red_mushroom"), new ResourceLocation("flowerpots:block/red_mushroom_variant_0"), new ResourceLocation("flowerpots:block/red_mushroom_variant_1"), new ResourceLocation("flowerpots:block/red_mushroom_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BROWN_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/brown_mushroom"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_0"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_1"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_DEAD_BUSH.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/dead_bush"), new ResourceLocation("flowerpots:block/dead_bush_variant_0"), new ResourceLocation("flowerpots:block/dead_bush_variant_1"), new ResourceLocation("flowerpots:block/dead_bush_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_CACTUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cactus_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cactus_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cactus_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cactus_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BAMBOO.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_bamboo_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_bamboo_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_bamboo_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_bamboo_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_CRIMSON_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/crimson_fungus"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_0"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_1"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_WARPED_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/warped_fungus"), new ResourceLocation("flowerpots:block/warped_fungus_variant_0"), new ResourceLocation("flowerpots:block/warped_fungus_variant_1"), new ResourceLocation("flowerpots:block/warped_fungus_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_CRIMSON_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/crimson_roots_pot"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_2"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_WARPED_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/warped_roots_pot"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/potted_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_2"));
        flowerPotConfigurableTexture(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_FLOWERING_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_azalea_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/potted_flowering_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_2"));
        flowerPotDripLeaf(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BIG_DRIPLEAF.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_big_dripleaf"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_big_dripleaf_partial_tilt"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_big_dripleaf_full_tilt"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/big_dripleaf_stem"), new ResourceLocation("block/big_dripleaf_top"), new ResourceLocation("block/big_dripleaf_tip"), new ResourceLocation("block/big_dripleaf_side"));
        flowerPot(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_GRASS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tint"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("flowerpots:block/grass_default"), new ResourceLocation("flowerpots:block/grass_variant_0"), new ResourceLocation("flowerpots:block/grass_variant_1"), new ResourceLocation("flowerpots:block/grass_variant_2"));
        flowerPotTallPlant(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_LILAC.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/lilac_top"), new ResourceLocation("flowerpots:block/lilac_top_variant_0"), new ResourceLocation("flowerpots:block/lilac_top_variant_1"), new ResourceLocation("flowerpots:block/lilac_top_variant_2"), new ResourceLocation("block/lilac_bottom"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_0"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_1"), new ResourceLocation("flowerpots:block/lilac_bottom_variant_2"));
        flowerPotTallPlant(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ROSE_BUSH.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/rose_bush_top"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_0"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_1"), new ResourceLocation("flowerpots:block/rose_bush_top_variant_2"), new ResourceLocation("block/rose_bush_bottom"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_0"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_1"), new ResourceLocation("flowerpots:block/rose_bush_bottom_variant_2"));
        flowerPotTallPlant(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_PEONY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tall"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/peony_top"), new ResourceLocation("flowerpots:block/peony_top_variant_0"), new ResourceLocation("flowerpots:block/peony_top_variant_1"), new ResourceLocation("flowerpots:block/peony_top_variant_2"), new ResourceLocation("block/peony_bottom"), new ResourceLocation("flowerpots:block/peony_bottom_variant_0"), new ResourceLocation("flowerpots:block/peony_bottom_variant_1"), new ResourceLocation("flowerpots:block/peony_bottom_variant_2"));
        flowerPotTallPlantNoVariants(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_TALL_GRASS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tint_tall"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/tall_grass_top"), new ResourceLocation("block/tall_grass_bottom"));
        flowerPotTallPlantNoVariants(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_LARGE_FERN.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_cross_tint_tall"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/large_fern_top"), new ResourceLocation("block/large_fern_bottom"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_OAK_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"), new ResourceLocation("block/oak_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_SPRUCE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"), new ResourceLocation("block/spruce_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BIRCH_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"), new ResourceLocation("block/birch_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_DARK_OAK_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"), new ResourceLocation("block/dark_oak_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ACACIA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"), new ResourceLocation("block/acacia_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_JUNGLE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"), new ResourceLocation("block/jungle_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_MANGROVE_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_tint_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"), new ResourceLocation("block/mangrove_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_AZALEA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"), new ResourceLocation("block/azalea_leaves"));
        flowerPotConfigurableModel(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_FLOWERING_AZALEA_LEAVES.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_hanging_flower_pot_leaves_variant_2"), new ResourceLocation("flowerpots:block/small_hanging_flower_pot_copper_chain"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"), new ResourceLocation("block/flowering_azalea_leaves"));

    }

    //region flowerPotEmpty
    public void flowerPotEmpty(Block block, ResourceLocation block_model, ResourceLocation block_texture) {
        ModelFile flower_pot_empty = models().withExistingParent(DataProvider.getRegistryName(block.asItem()),
                block_model).texture("flower_pot", block_texture).texture("particle", block_texture).renderType("cutout");

        flowerPotEmpty(block, flower_pot_empty);
    }

    public void flowerPotEmpty(Block block, ModelFile flower_pot_empty) {
        getVariantBuilder(block).forAllStates(state -> ConfiguredModel.builder()
                .modelFile(flower_pot_empty)
                .build());
    }
    //endregion

    //region flowerPotConfigurableTexture
    public void flowerPotConfigurableTexture(Block block, ResourceLocation block_model_default, ResourceLocation block_model_variant_0, ResourceLocation block_model_variant_1, ResourceLocation block_model_variant_2, ResourceLocation texture_pot, ResourceLocation texture_plant_default, ResourceLocation texture_plant_variant_0, ResourceLocation texture_plant_variant_1, ResourceLocation texture_plant_variant_2, ResourceLocation texture_plant_side_default, ResourceLocation texture_plant_side_variant_0, ResourceLocation texture_plant_side_variant_1, ResourceLocation texture_plant_side_variant_2, ResourceLocation texture_plant_top_default, ResourceLocation texture_plant_top_variant_0, ResourceLocation texture_plant_top_variant_1, ResourceLocation texture_plant_top_variant_2) {

        ModelFile flower_pot_default_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_dirt",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_dirt",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_dirt",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_dirt",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_coarse_dirt",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_coarse_dirt",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_coarse_dirt",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_coarse_dirt",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_grass_block",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_grass_block",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_grass_block",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_grass_block",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_podzol",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_podzol",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_podzol",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_podzol",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_rooted_dirt",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_rooted_dirt",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_rooted_dirt",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_rooted_dirt",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mud",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_mud",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_mud",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_mud",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_crimson_nylium",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_crimson_nylium",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_crimson_nylium",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_crimson_nylium",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_warped_nylium",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_warped_nylium",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_warped_nylium",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_warped_nylium",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_sand",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_sand",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_sand",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_sand",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_red_sand",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_red_sand",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_red_sand",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_red_sand",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mycelium",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_mycelium",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_mycelium",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_mycelium",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_moss",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_moss",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_moss",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_moss",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_clay",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_clay",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_clay",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_clay",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_soul_sand",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_soul_sand",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_soul_sand",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_soul_sand",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        flowerPotConfigurableTexture(block, flower_pot_default_dirt, flower_pot_variant_0_dirt, flower_pot_variant_1_dirt, flower_pot_variant_2_dirt,
                flower_pot_default_coarse_dirt, flower_pot_variant_0_coarse_dirt, flower_pot_variant_1_coarse_dirt, flower_pot_variant_2_coarse_dirt,
                flower_pot_default_grass_block, flower_pot_variant_0_grass_block, flower_pot_variant_1_grass_block, flower_pot_variant_2_grass_block,
                flower_pot_default_podzol, flower_pot_variant_0_podzol, flower_pot_variant_1_podzol, flower_pot_variant_2_podzol,
                flower_pot_default_rooted_dirt, flower_pot_variant_0_rooted_dirt, flower_pot_variant_1_rooted_dirt, flower_pot_variant_2_rooted_dirt,
                flower_pot_default_mud, flower_pot_variant_0_mud, flower_pot_variant_1_mud, flower_pot_variant_2_mud,
                flower_pot_default_crimson_nylium, flower_pot_variant_0_crimson_nylium, flower_pot_variant_1_crimson_nylium, flower_pot_variant_2_crimson_nylium,
                flower_pot_default_warped_nylium, flower_pot_variant_0_warped_nylium, flower_pot_variant_1_warped_nylium, flower_pot_variant_2_warped_nylium,
                flower_pot_default_sand, flower_pot_variant_0_sand, flower_pot_variant_1_sand, flower_pot_variant_2_sand,
                flower_pot_default_red_sand, flower_pot_variant_0_red_sand, flower_pot_variant_1_red_sand, flower_pot_variant_2_red_sand,
                flower_pot_default_mycelium, flower_pot_variant_0_mycelium, flower_pot_variant_1_mycelium, flower_pot_variant_2_mycelium,
                flower_pot_default_moss, flower_pot_variant_0_moss, flower_pot_variant_1_moss, flower_pot_variant_2_moss,
                flower_pot_default_clay, flower_pot_variant_0_clay, flower_pot_variant_1_clay, flower_pot_variant_2_clay,
                flower_pot_default_soul_sand, flower_pot_variant_0_soul_sand, flower_pot_variant_1_soul_sand, flower_pot_variant_2_soul_sand);
    }

    public void flowerPotConfigurableTexture(Block block, ModelFile flower_pot_default_dirt, ModelFile flower_pot_variant_0_dirt, ModelFile flower_pot_variant_1_dirt, ModelFile flower_pot_variant_2_dirt,
                                             ModelFile flower_pot_default_coarse_dirt, ModelFile flower_pot_variant_0_coarse_dirt, ModelFile flower_pot_variant_1_coarse_dirt, ModelFile flower_pot_variant_2_coarse_dirt,
                                             ModelFile flower_pot_default_grass_block, ModelFile flower_pot_variant_0_grass_block, ModelFile flower_pot_variant_1_grass_block, ModelFile flower_pot_variant_2_grass_block,
                                             ModelFile flower_pot_default_podzol, ModelFile flower_pot_variant_0_podzol, ModelFile flower_pot_variant_1_podzol, ModelFile flower_pot_variant_2_podzol,
                                             ModelFile flower_pot_default_rooted_dirt, ModelFile flower_pot_variant_0_rooted_dirt, ModelFile flower_pot_variant_1_rooted_dirt, ModelFile flower_pot_variant_2_rooted_dirt,
                                             ModelFile flower_pot_default_mud, ModelFile flower_pot_variant_0_mud, ModelFile flower_pot_variant_1_mud, ModelFile flower_pot_variant_2_mud,
                                             ModelFile flower_pot_default_crimson_nylium, ModelFile flower_pot_variant_0_crimson_nylium, ModelFile flower_pot_variant_1_crimson_nylium, ModelFile flower_pot_variant_2_crimson_nylium,
                                             ModelFile flower_pot_default_warped_nylium, ModelFile flower_pot_variant_0_warped_nylium, ModelFile flower_pot_variant_1_warped_nylium, ModelFile flower_pot_variant_2_warped_nylium,
                                             ModelFile flower_pot_default_sand, ModelFile flower_pot_variant_0_sand, ModelFile flower_pot_variant_1_sand, ModelFile flower_pot_variant_2_sand,
                                             ModelFile flower_pot_default_red_sand, ModelFile flower_pot_variant_0_red_sand, ModelFile flower_pot_variant_1_red_sand, ModelFile flower_pot_variant_2_red_sand,
                                             ModelFile flower_pot_default_mycelium, ModelFile flower_pot_variant_0_mycelium, ModelFile flower_pot_variant_1_mycelium, ModelFile flower_pot_variant_2_mycelium,
                                             ModelFile flower_pot_default_moss, ModelFile flower_pot_variant_0_moss, ModelFile flower_pot_variant_1_moss, ModelFile flower_pot_variant_2_moss,
                                             ModelFile flower_pot_default_clay, ModelFile flower_pot_variant_0_clay, ModelFile flower_pot_variant_1_clay, ModelFile flower_pot_variant_2_clay,
                                             ModelFile flower_pot_default_soul_sand, ModelFile flower_pot_variant_0_soul_sand, ModelFile flower_pot_variant_1_soul_sand, ModelFile flower_pot_variant_2_soul_sand) {

        getVariantBuilder(block).forAllStates(state -> {
            ModelFile finalModel = switch (state.getValue(ModEnums.FLOWER_POT_DIRT)) {
                case GRASS_BLOCK -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_grass_block;
                    case VARIANT_1 -> flower_pot_variant_1_grass_block;
                    case VARIANT_2 -> flower_pot_variant_2_grass_block;
                    default -> flower_pot_default_grass_block;
                };
                case DIRT -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_dirt;
                    case VARIANT_1 -> flower_pot_variant_1_dirt;
                    case VARIANT_2 -> flower_pot_variant_2_dirt;
                    default -> flower_pot_default_dirt;
                };
                case COARSE_DIRT -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_coarse_dirt;
                    case VARIANT_1 -> flower_pot_variant_1_coarse_dirt;
                    case VARIANT_2 -> flower_pot_variant_2_coarse_dirt;
                    default -> flower_pot_default_coarse_dirt;
                };
                case PODZOL -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_podzol;
                    case VARIANT_1 -> flower_pot_variant_1_podzol;
                    case VARIANT_2 -> flower_pot_variant_2_podzol;
                    default -> flower_pot_default_podzol;
                };
                case ROOTED_DIRT -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_rooted_dirt;
                    case VARIANT_1 -> flower_pot_variant_1_rooted_dirt;
                    case VARIANT_2 -> flower_pot_variant_2_rooted_dirt;
                    default -> flower_pot_default_rooted_dirt;
                };
                case MUD -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_mud;
                    case VARIANT_1 -> flower_pot_variant_1_mud;
                    case VARIANT_2 -> flower_pot_variant_2_mud;
                    default -> flower_pot_default_mud;
                };
                case CRIMSON_NYLIUM -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_crimson_nylium;
                    case VARIANT_1 -> flower_pot_variant_1_crimson_nylium;
                    case VARIANT_2 -> flower_pot_variant_2_crimson_nylium;
                    default -> flower_pot_default_crimson_nylium;
                };
                case WARPED_NYLIUM -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_warped_nylium;
                    case VARIANT_1 -> flower_pot_variant_1_warped_nylium;
                    case VARIANT_2 -> flower_pot_variant_2_warped_nylium;
                    default -> flower_pot_default_warped_nylium;
                };
                case SAND -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_sand;
                    case VARIANT_1 -> flower_pot_variant_1_sand;
                    case VARIANT_2 -> flower_pot_variant_2_sand;
                    default -> flower_pot_default_sand;
                };
                case RED_SAND -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_red_sand;
                    case VARIANT_1 -> flower_pot_variant_1_red_sand;
                    case VARIANT_2 -> flower_pot_variant_2_red_sand;
                    default -> flower_pot_default_red_sand;
                };
                case MYCELIUM -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_mycelium;
                    case VARIANT_1 -> flower_pot_variant_1_mycelium;
                    case VARIANT_2 -> flower_pot_variant_2_mycelium;
                    default -> flower_pot_default_mycelium;
                };
                case MOSS -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_moss;
                    case VARIANT_1 -> flower_pot_variant_1_moss;
                    case VARIANT_2 -> flower_pot_variant_2_moss;
                    default -> flower_pot_default_moss;
                };
                case CLAY -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_clay;
                    case VARIANT_1 -> flower_pot_variant_1_clay;
                    case VARIANT_2 -> flower_pot_variant_2_clay;
                    default -> flower_pot_default_clay;
                };
                case SOUL_SAND -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_soul_sand;
                    case VARIANT_1 -> flower_pot_variant_1_soul_sand;
                    case VARIANT_2 -> flower_pot_variant_2_soul_sand;
                    default -> flower_pot_default_soul_sand;
                };

            };
            return ConfiguredModel.builder()
                    .modelFile(finalModel)
                    .build();
        });
    }
    //endregion

    //region flowerPotConfigurableModel
    public void flowerPotConfigurableModel(Block block, ResourceLocation block_model_default, ResourceLocation block_model_variant_0, ResourceLocation block_model_variant_1, ResourceLocation block_model_variant_2, ResourceLocation texture_pot, ResourceLocation texture_plant_default, ResourceLocation texture_plant_variant_0, ResourceLocation texture_plant_variant_1, ResourceLocation texture_plant_variant_2) {

        ModelFile flower_pot_default_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_dirt",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_dirt",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_dirt",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_dirt",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_coarse_dirt",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_coarse_dirt",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_coarse_dirt",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_coarse_dirt",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_grass_block",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_grass_block",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_grass_block",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_grass_block",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_podzol",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_podzol",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_podzol",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_podzol",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_rooted_dirt",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_rooted_dirt",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_rooted_dirt",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_rooted_dirt",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mud",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_mud",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_mud",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_mud",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_crimson_nylium",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_crimson_nylium",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_crimson_nylium",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_crimson_nylium",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_warped_nylium",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_warped_nylium",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_warped_nylium",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_warped_nylium",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_sand",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_sand",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_sand",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_sand",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_red_sand",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_red_sand",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_red_sand",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_red_sand",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mycelium",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_mycelium",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_mycelium",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_mycelium",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_moss",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_moss",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_moss",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_moss",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_clay",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_clay",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_clay",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_clay",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_soul_sand",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_soul_sand",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_soul_sand",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_soul_sand",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        flowerPotConfigurableModel(block, flower_pot_default_dirt, flower_pot_variant_0_dirt, flower_pot_variant_1_dirt, flower_pot_variant_2_dirt,
                flower_pot_default_coarse_dirt, flower_pot_variant_0_coarse_dirt, flower_pot_variant_1_coarse_dirt, flower_pot_variant_2_coarse_dirt,
                flower_pot_default_grass_block, flower_pot_variant_0_grass_block, flower_pot_variant_1_grass_block, flower_pot_variant_2_grass_block,
                flower_pot_default_podzol, flower_pot_variant_0_podzol, flower_pot_variant_1_podzol, flower_pot_variant_2_podzol,
                flower_pot_default_rooted_dirt, flower_pot_variant_0_rooted_dirt, flower_pot_variant_1_rooted_dirt, flower_pot_variant_2_rooted_dirt,
                flower_pot_default_mud, flower_pot_variant_0_mud, flower_pot_variant_1_mud, flower_pot_variant_2_mud,
                flower_pot_default_crimson_nylium, flower_pot_variant_0_crimson_nylium, flower_pot_variant_1_crimson_nylium, flower_pot_variant_2_crimson_nylium,
                flower_pot_default_warped_nylium, flower_pot_variant_0_warped_nylium, flower_pot_variant_1_warped_nylium, flower_pot_variant_2_warped_nylium,
                flower_pot_default_sand, flower_pot_variant_0_sand, flower_pot_variant_1_sand, flower_pot_variant_2_sand,
                flower_pot_default_red_sand, flower_pot_variant_0_red_sand, flower_pot_variant_1_red_sand, flower_pot_variant_2_red_sand,
                flower_pot_default_mycelium, flower_pot_variant_0_mycelium, flower_pot_variant_1_mycelium, flower_pot_variant_2_mycelium,
                flower_pot_default_moss, flower_pot_variant_0_moss, flower_pot_variant_1_moss, flower_pot_variant_2_moss,
                flower_pot_default_clay, flower_pot_variant_0_clay, flower_pot_variant_1_clay, flower_pot_variant_2_clay,
                flower_pot_default_soul_sand, flower_pot_variant_0_soul_sand, flower_pot_variant_1_soul_sand, flower_pot_variant_2_soul_sand);
    }

    public void flowerPotConfigurableModel(Block block, ModelFile flower_pot_default_dirt, ModelFile flower_pot_variant_0_dirt, ModelFile flower_pot_variant_1_dirt, ModelFile flower_pot_variant_2_dirt,
                                           ModelFile flower_pot_default_coarse_dirt, ModelFile flower_pot_variant_0_coarse_dirt, ModelFile flower_pot_variant_1_coarse_dirt, ModelFile flower_pot_variant_2_coarse_dirt,
                                           ModelFile flower_pot_default_grass_block, ModelFile flower_pot_variant_0_grass_block, ModelFile flower_pot_variant_1_grass_block, ModelFile flower_pot_variant_2_grass_block,
                                           ModelFile flower_pot_default_podzol, ModelFile flower_pot_variant_0_podzol, ModelFile flower_pot_variant_1_podzol, ModelFile flower_pot_variant_2_podzol,
                                           ModelFile flower_pot_default_rooted_dirt, ModelFile flower_pot_variant_0_rooted_dirt, ModelFile flower_pot_variant_1_rooted_dirt, ModelFile flower_pot_variant_2_rooted_dirt,
                                           ModelFile flower_pot_default_mud, ModelFile flower_pot_variant_0_mud, ModelFile flower_pot_variant_1_mud, ModelFile flower_pot_variant_2_mud,
                                           ModelFile flower_pot_default_crimson_nylium, ModelFile flower_pot_variant_0_crimson_nylium, ModelFile flower_pot_variant_1_crimson_nylium, ModelFile flower_pot_variant_2_crimson_nylium,
                                           ModelFile flower_pot_default_warped_nylium, ModelFile flower_pot_variant_0_warped_nylium, ModelFile flower_pot_variant_1_warped_nylium, ModelFile flower_pot_variant_2_warped_nylium,
                                           ModelFile flower_pot_default_sand, ModelFile flower_pot_variant_0_sand, ModelFile flower_pot_variant_1_sand, ModelFile flower_pot_variant_2_sand,
                                           ModelFile flower_pot_default_red_sand, ModelFile flower_pot_variant_0_red_sand, ModelFile flower_pot_variant_1_red_sand, ModelFile flower_pot_variant_2_red_sand,
                                           ModelFile flower_pot_default_mycelium, ModelFile flower_pot_variant_0_mycelium, ModelFile flower_pot_variant_1_mycelium, ModelFile flower_pot_variant_2_mycelium,
                                           ModelFile flower_pot_default_moss, ModelFile flower_pot_variant_0_moss, ModelFile flower_pot_variant_1_moss, ModelFile flower_pot_variant_2_moss,
                                           ModelFile flower_pot_default_clay, ModelFile flower_pot_variant_0_clay, ModelFile flower_pot_variant_1_clay, ModelFile flower_pot_variant_2_clay,
                                           ModelFile flower_pot_default_soul_sand, ModelFile flower_pot_variant_0_soul_sand, ModelFile flower_pot_variant_1_soul_sand, ModelFile flower_pot_variant_2_soul_sand) {

        getVariantBuilder(block).forAllStates(state -> {
            ModelFile finalModel = switch (state.getValue(ModEnums.FLOWER_POT_DIRT)) {
                case GRASS_BLOCK -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_grass_block;
                    case VARIANT_1 -> flower_pot_variant_1_grass_block;
                    case VARIANT_2 -> flower_pot_variant_2_grass_block;
                    default -> flower_pot_default_grass_block;
                };
                case DIRT -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_dirt;
                    case VARIANT_1 -> flower_pot_variant_1_dirt;
                    case VARIANT_2 -> flower_pot_variant_2_dirt;
                    default -> flower_pot_default_dirt;
                };
                case COARSE_DIRT -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_coarse_dirt;
                    case VARIANT_1 -> flower_pot_variant_1_coarse_dirt;
                    case VARIANT_2 -> flower_pot_variant_2_coarse_dirt;
                    default -> flower_pot_default_coarse_dirt;
                };
                case PODZOL -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_podzol;
                    case VARIANT_1 -> flower_pot_variant_1_podzol;
                    case VARIANT_2 -> flower_pot_variant_2_podzol;
                    default -> flower_pot_default_podzol;
                };
                case ROOTED_DIRT -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_rooted_dirt;
                    case VARIANT_1 -> flower_pot_variant_1_rooted_dirt;
                    case VARIANT_2 -> flower_pot_variant_2_rooted_dirt;
                    default -> flower_pot_default_rooted_dirt;
                };
                case MUD -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_mud;
                    case VARIANT_1 -> flower_pot_variant_1_mud;
                    case VARIANT_2 -> flower_pot_variant_2_mud;
                    default -> flower_pot_default_mud;
                };
                case CRIMSON_NYLIUM -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_crimson_nylium;
                    case VARIANT_1 -> flower_pot_variant_1_crimson_nylium;
                    case VARIANT_2 -> flower_pot_variant_2_crimson_nylium;
                    default -> flower_pot_default_crimson_nylium;
                };
                case WARPED_NYLIUM -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_warped_nylium;
                    case VARIANT_1 -> flower_pot_variant_1_warped_nylium;
                    case VARIANT_2 -> flower_pot_variant_2_warped_nylium;
                    default -> flower_pot_default_warped_nylium;
                };
                case SAND -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_sand;
                    case VARIANT_1 -> flower_pot_variant_1_sand;
                    case VARIANT_2 -> flower_pot_variant_2_sand;
                    default -> flower_pot_default_sand;
                };
                case RED_SAND -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_red_sand;
                    case VARIANT_1 -> flower_pot_variant_1_red_sand;
                    case VARIANT_2 -> flower_pot_variant_2_red_sand;
                    default -> flower_pot_default_red_sand;
                };
                case MYCELIUM -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_mycelium;
                    case VARIANT_1 -> flower_pot_variant_1_mycelium;
                    case VARIANT_2 -> flower_pot_variant_2_mycelium;
                    default -> flower_pot_default_mycelium;
                };
                case MOSS -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_moss;
                    case VARIANT_1 -> flower_pot_variant_1_moss;
                    case VARIANT_2 -> flower_pot_variant_2_moss;
                    default -> flower_pot_default_moss;
                };
                case CLAY -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_clay;
                    case VARIANT_1 -> flower_pot_variant_1_clay;
                    case VARIANT_2 -> flower_pot_variant_2_clay;
                    default -> flower_pot_default_clay;
                };
                case SOUL_SAND -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_soul_sand;
                    case VARIANT_1 -> flower_pot_variant_1_soul_sand;
                    case VARIANT_2 -> flower_pot_variant_2_soul_sand;
                    default -> flower_pot_default_soul_sand;
                };

            };
            return ConfiguredModel.builder()
                    .modelFile(finalModel)
                    .build();
        });
    }
    //endregion

    //region flowerPot
    public void flowerPot(Block block, ResourceLocation block_model, ResourceLocation texture_pot, ResourceLocation texture_plant_default, ResourceLocation texture_plant_variant_0, ResourceLocation texture_plant_variant_1, ResourceLocation texture_plant_variant_2) {

        ModelFile flower_pot_default_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_coarse_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_coarse_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_coarse_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_coarse_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_grass_block",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_grass_block",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_grass_block",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_grass_block",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_podzol",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_podzol",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_podzol",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_podzol",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_rooted_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_rooted_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_rooted_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_rooted_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mud",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_mud",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_mud",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_mud",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_crimson_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_crimson_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_crimson_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_crimson_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_warped_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_warped_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_warped_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_warped_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_red_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_red_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_red_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_red_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mycelium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_mycelium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_mycelium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_mycelium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_moss",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_moss",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_moss",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_moss",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_clay",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_clay",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_clay",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_clay",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_soul_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_soul_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_soul_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_soul_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        flowerPot(block, flower_pot_default_dirt, flower_pot_variant_0_dirt, flower_pot_variant_1_dirt, flower_pot_variant_2_dirt,
                flower_pot_default_coarse_dirt, flower_pot_variant_0_coarse_dirt, flower_pot_variant_1_coarse_dirt, flower_pot_variant_2_coarse_dirt,
                flower_pot_default_grass_block, flower_pot_variant_0_grass_block, flower_pot_variant_1_grass_block, flower_pot_variant_2_grass_block,
                flower_pot_default_podzol, flower_pot_variant_0_podzol, flower_pot_variant_1_podzol, flower_pot_variant_2_podzol,
                flower_pot_default_rooted_dirt, flower_pot_variant_0_rooted_dirt, flower_pot_variant_1_rooted_dirt, flower_pot_variant_2_rooted_dirt,
                flower_pot_default_mud, flower_pot_variant_0_mud, flower_pot_variant_1_mud, flower_pot_variant_2_mud,
                flower_pot_default_crimson_nylium, flower_pot_variant_0_crimson_nylium, flower_pot_variant_1_crimson_nylium, flower_pot_variant_2_crimson_nylium,
                flower_pot_default_warped_nylium, flower_pot_variant_0_warped_nylium, flower_pot_variant_1_warped_nylium, flower_pot_variant_2_warped_nylium,
                flower_pot_default_sand, flower_pot_variant_0_sand, flower_pot_variant_1_sand, flower_pot_variant_2_sand,
                flower_pot_default_red_sand, flower_pot_variant_0_red_sand, flower_pot_variant_1_red_sand, flower_pot_variant_2_red_sand,
                flower_pot_default_mycelium, flower_pot_variant_0_mycelium, flower_pot_variant_1_mycelium, flower_pot_variant_2_mycelium,
                flower_pot_default_moss, flower_pot_variant_0_moss, flower_pot_variant_1_moss, flower_pot_variant_2_moss,
                flower_pot_default_clay, flower_pot_variant_0_clay, flower_pot_variant_1_clay, flower_pot_variant_2_clay,
                flower_pot_default_soul_sand, flower_pot_variant_0_soul_sand, flower_pot_variant_1_soul_sand, flower_pot_variant_2_soul_sand);
    }

    public void flowerPot(Block block, ModelFile flower_pot_default_dirt, ModelFile flower_pot_variant_0_dirt, ModelFile flower_pot_variant_1_dirt, ModelFile flower_pot_variant_2_dirt,
                          ModelFile flower_pot_default_coarse_dirt, ModelFile flower_pot_variant_0_coarse_dirt, ModelFile flower_pot_variant_1_coarse_dirt, ModelFile flower_pot_variant_2_coarse_dirt,
                          ModelFile flower_pot_default_grass_block, ModelFile flower_pot_variant_0_grass_block, ModelFile flower_pot_variant_1_grass_block, ModelFile flower_pot_variant_2_grass_block,
                          ModelFile flower_pot_default_podzol, ModelFile flower_pot_variant_0_podzol, ModelFile flower_pot_variant_1_podzol, ModelFile flower_pot_variant_2_podzol,
                          ModelFile flower_pot_default_rooted_dirt, ModelFile flower_pot_variant_0_rooted_dirt, ModelFile flower_pot_variant_1_rooted_dirt, ModelFile flower_pot_variant_2_rooted_dirt,
                          ModelFile flower_pot_default_mud, ModelFile flower_pot_variant_0_mud, ModelFile flower_pot_variant_1_mud, ModelFile flower_pot_variant_2_mud,
                          ModelFile flower_pot_default_crimson_nylium, ModelFile flower_pot_variant_0_crimson_nylium, ModelFile flower_pot_variant_1_crimson_nylium, ModelFile flower_pot_variant_2_crimson_nylium,
                          ModelFile flower_pot_default_warped_nylium, ModelFile flower_pot_variant_0_warped_nylium, ModelFile flower_pot_variant_1_warped_nylium, ModelFile flower_pot_variant_2_warped_nylium,
                          ModelFile flower_pot_default_sand, ModelFile flower_pot_variant_0_sand, ModelFile flower_pot_variant_1_sand, ModelFile flower_pot_variant_2_sand,
                          ModelFile flower_pot_default_red_sand, ModelFile flower_pot_variant_0_red_sand, ModelFile flower_pot_variant_1_red_sand, ModelFile flower_pot_variant_2_red_sand,
                          ModelFile flower_pot_default_mycelium, ModelFile flower_pot_variant_0_mycelium, ModelFile flower_pot_variant_1_mycelium, ModelFile flower_pot_variant_2_mycelium,
                          ModelFile flower_pot_default_moss, ModelFile flower_pot_variant_0_moss, ModelFile flower_pot_variant_1_moss, ModelFile flower_pot_variant_2_moss,
                          ModelFile flower_pot_default_clay, ModelFile flower_pot_variant_0_clay, ModelFile flower_pot_variant_1_clay, ModelFile flower_pot_variant_2_clay,
                          ModelFile flower_pot_default_soul_sand, ModelFile flower_pot_variant_0_soul_sand, ModelFile flower_pot_variant_1_soul_sand, ModelFile flower_pot_variant_2_soul_sand) {

        getVariantBuilder(block).forAllStates(state -> {
            ModelFile finalModel = switch (state.getValue(ModEnums.FLOWER_POT_DIRT)) {
                case GRASS_BLOCK -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_grass_block;
                    case VARIANT_1 -> flower_pot_variant_1_grass_block;
                    case VARIANT_2 -> flower_pot_variant_2_grass_block;
                    default -> flower_pot_default_grass_block;
                };
                case DIRT -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_dirt;
                    case VARIANT_1 -> flower_pot_variant_1_dirt;
                    case VARIANT_2 -> flower_pot_variant_2_dirt;
                    default -> flower_pot_default_dirt;
                };
                case COARSE_DIRT -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_coarse_dirt;
                    case VARIANT_1 -> flower_pot_variant_1_coarse_dirt;
                    case VARIANT_2 -> flower_pot_variant_2_coarse_dirt;
                    default -> flower_pot_default_coarse_dirt;
                };
                case PODZOL -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_podzol;
                    case VARIANT_1 -> flower_pot_variant_1_podzol;
                    case VARIANT_2 -> flower_pot_variant_2_podzol;
                    default -> flower_pot_default_podzol;
                };
                case ROOTED_DIRT -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_rooted_dirt;
                    case VARIANT_1 -> flower_pot_variant_1_rooted_dirt;
                    case VARIANT_2 -> flower_pot_variant_2_rooted_dirt;
                    default -> flower_pot_default_rooted_dirt;
                };
                case MUD -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_mud;
                    case VARIANT_1 -> flower_pot_variant_1_mud;
                    case VARIANT_2 -> flower_pot_variant_2_mud;
                    default -> flower_pot_default_mud;
                };
                case CRIMSON_NYLIUM -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_crimson_nylium;
                    case VARIANT_1 -> flower_pot_variant_1_crimson_nylium;
                    case VARIANT_2 -> flower_pot_variant_2_crimson_nylium;
                    default -> flower_pot_default_crimson_nylium;
                };
                case WARPED_NYLIUM -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_warped_nylium;
                    case VARIANT_1 -> flower_pot_variant_1_warped_nylium;
                    case VARIANT_2 -> flower_pot_variant_2_warped_nylium;
                    default -> flower_pot_default_warped_nylium;
                };
                case SAND -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_sand;
                    case VARIANT_1 -> flower_pot_variant_1_sand;
                    case VARIANT_2 -> flower_pot_variant_2_sand;
                    default -> flower_pot_default_sand;
                };
                case RED_SAND -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_red_sand;
                    case VARIANT_1 -> flower_pot_variant_1_red_sand;
                    case VARIANT_2 -> flower_pot_variant_2_red_sand;
                    default -> flower_pot_default_red_sand;
                };
                case MYCELIUM -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_mycelium;
                    case VARIANT_1 -> flower_pot_variant_1_mycelium;
                    case VARIANT_2 -> flower_pot_variant_2_mycelium;
                    default -> flower_pot_default_mycelium;
                };
                case MOSS -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_moss;
                    case VARIANT_1 -> flower_pot_variant_1_moss;
                    case VARIANT_2 -> flower_pot_variant_2_moss;
                    default -> flower_pot_default_moss;
                };
                case CLAY -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_clay;
                    case VARIANT_1 -> flower_pot_variant_1_clay;
                    case VARIANT_2 -> flower_pot_variant_2_clay;
                    default -> flower_pot_default_clay;
                };
                case SOUL_SAND -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_soul_sand;
                    case VARIANT_1 -> flower_pot_variant_1_soul_sand;
                    case VARIANT_2 -> flower_pot_variant_2_soul_sand;
                    default -> flower_pot_default_soul_sand;
                };
            };
            return ConfiguredModel.builder()
                    .modelFile(finalModel)
                    .build();
        });
    }
    //endregion

    //region flowerPotTallPlantNoVariants
    public void flowerPotTallPlantNoVariants(Block block, ResourceLocation block_model, ResourceLocation texture_pot, ResourceLocation texture_plant_top, ResourceLocation texture_plant_bottom) {

        ModelFile flower_pot_default_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant_top", texture_plant_top).texture("plant_bottom", texture_plant_bottom).texture("particle", texture_pot);

        ModelFile flower_pot_default_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_coarse_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant_top", texture_plant_top).texture("plant_bottom", texture_plant_bottom).texture("particle", texture_pot);

        ModelFile flower_pot_default_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_grass_block",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant_top", texture_plant_top).texture("plant_bottom", texture_plant_bottom).texture("particle", texture_pot);

        ModelFile flower_pot_default_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_podzol",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant_top", texture_plant_top).texture("plant_bottom", texture_plant_bottom).texture("particle", texture_pot);

        ModelFile flower_pot_default_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_rooted_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant_top", texture_plant_top).texture("plant_bottom", texture_plant_bottom).texture("particle", texture_pot);

        ModelFile flower_pot_default_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mud",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant_top", texture_plant_top).texture("plant_bottom", texture_plant_bottom).texture("particle", texture_pot);

        ModelFile flower_pot_default_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_crimson_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant_top", texture_plant_top).texture("plant_bottom", texture_plant_bottom).texture("particle", texture_pot);

        ModelFile flower_pot_default_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_warped_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant_top", texture_plant_top).texture("plant_bottom", texture_plant_bottom).texture("particle", texture_pot);

        ModelFile flower_pot_default_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant_top", texture_plant_top).texture("plant_bottom", texture_plant_bottom).texture("particle", texture_pot);

        ModelFile flower_pot_default_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_red_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant_top", texture_plant_top).texture("plant_bottom", texture_plant_bottom).texture("particle", texture_pot);

        ModelFile flower_pot_default_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mycelium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant_top", texture_plant_top).texture("plant_bottom", texture_plant_bottom).texture("particle", texture_pot);

        ModelFile flower_pot_default_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_moss",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant_top", texture_plant_top).texture("plant_bottom", texture_plant_bottom).texture("particle", texture_pot);

        ModelFile flower_pot_default_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_clay",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant_top", texture_plant_top).texture("plant_bottom", texture_plant_bottom).texture("particle", texture_pot);

        ModelFile flower_pot_default_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_soul_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant_top", texture_plant_top).texture("plant_bottom", texture_plant_bottom).texture("particle", texture_pot);

        flowerPotTallPlantNoVariants(block, flower_pot_default_dirt, flower_pot_default_coarse_dirt, flower_pot_default_grass_block, flower_pot_default_podzol, flower_pot_default_rooted_dirt, flower_pot_default_mud, flower_pot_default_crimson_nylium, flower_pot_default_warped_nylium, flower_pot_default_sand, flower_pot_default_red_sand, flower_pot_default_mycelium, flower_pot_default_moss, flower_pot_default_clay, flower_pot_default_soul_sand);
    }

    public void flowerPotTallPlantNoVariants(Block block, ModelFile flower_pot_default_dirt, ModelFile flower_pot_default_coarse_dirt, ModelFile flower_pot_default_grass_block, ModelFile flower_pot_default_podzol, ModelFile flower_pot_default_rooted_dirt, ModelFile flower_pot_default_mud, ModelFile flower_pot_default_crimson_nylium, ModelFile flower_pot_default_warped_nylium, ModelFile flower_pot_default_sand, ModelFile flower_pot_default_red_sand, ModelFile flower_pot_default_mycelium, ModelFile flower_pot_default_moss, ModelFile flower_pot_default_clay, ModelFile flower_pot_default_soul_sand) {

        getVariantBuilder(block).forAllStates(state -> {
            ModelFile finalModel = switch (state.getValue(ModEnums.FLOWER_POT_DIRT)) {
                case GRASS_BLOCK -> flower_pot_default_grass_block;
                case DIRT -> flower_pot_default_dirt;
                case COARSE_DIRT -> flower_pot_default_coarse_dirt;
                case PODZOL -> flower_pot_default_podzol;
                case ROOTED_DIRT -> flower_pot_default_rooted_dirt;
                case MUD -> flower_pot_default_mud;
                case CRIMSON_NYLIUM -> flower_pot_default_crimson_nylium;
                case WARPED_NYLIUM -> flower_pot_default_warped_nylium;
                case SAND -> flower_pot_default_sand;
                case RED_SAND -> flower_pot_default_red_sand;
                case MYCELIUM -> flower_pot_default_mycelium;
                case MOSS -> flower_pot_default_moss;
                case CLAY -> flower_pot_default_clay;
                case SOUL_SAND -> flower_pot_default_soul_sand;
            };
            return ConfiguredModel.builder()
                    .modelFile(finalModel)
                    .build();
        });
    }
    //endregion

    //region flowerPotTallPlant
    public void flowerPotTallPlant(Block block, ResourceLocation block_model, ResourceLocation texture_pot, ResourceLocation texture_plant_top_default, ResourceLocation texture_plant_top_variant_0, ResourceLocation texture_plant_top_variant_1, ResourceLocation texture_plant_top_variant_2, ResourceLocation texture_plant_bottom_default, ResourceLocation texture_plant_bottom_variant_0, ResourceLocation texture_plant_bottom_variant_1, ResourceLocation texture_plant_bottom_variant_2) {

        ModelFile flower_pot_default_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant_top", texture_plant_top_default).texture("plant_bottom", texture_plant_bottom_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant_top", texture_plant_top_variant_0).texture("plant_bottom", texture_plant_bottom_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant_top", texture_plant_top_variant_1).texture("plant_bottom", texture_plant_bottom_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant_top", texture_plant_top_variant_2).texture("plant_bottom", texture_plant_bottom_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_coarse_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant_top", texture_plant_top_default).texture("plant_bottom", texture_plant_bottom_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_coarse_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant_top", texture_plant_top_variant_0).texture("plant_bottom", texture_plant_bottom_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_coarse_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant_top", texture_plant_top_variant_1).texture("plant_bottom", texture_plant_bottom_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_coarse_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant_top", texture_plant_top_variant_2).texture("plant_bottom", texture_plant_bottom_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_grass_block",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant_top", texture_plant_top_default).texture("plant_bottom", texture_plant_bottom_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_grass_block",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant_top", texture_plant_top_variant_0).texture("plant_bottom", texture_plant_bottom_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_grass_block",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant_top", texture_plant_top_variant_1).texture("plant_bottom", texture_plant_bottom_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_grass_block",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant_top", texture_plant_top_variant_2).texture("plant_bottom", texture_plant_bottom_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_podzol",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant_top", texture_plant_top_default).texture("plant_bottom", texture_plant_bottom_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_podzol",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant_top", texture_plant_top_variant_0).texture("plant_bottom", texture_plant_bottom_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_podzol",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant_top", texture_plant_top_variant_1).texture("plant_bottom", texture_plant_bottom_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_podzol",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant_top", texture_plant_top_variant_2).texture("plant_bottom", texture_plant_bottom_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_rooted_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant_top", texture_plant_top_default).texture("plant_bottom", texture_plant_bottom_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_rooted_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant_top", texture_plant_top_variant_0).texture("plant_bottom", texture_plant_bottom_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_rooted_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant_top", texture_plant_top_variant_1).texture("plant_bottom", texture_plant_bottom_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_rooted_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant_top", texture_plant_top_variant_2).texture("plant_bottom", texture_plant_bottom_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mud",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant_top", texture_plant_top_default).texture("plant_bottom", texture_plant_bottom_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_mud",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant_top", texture_plant_top_variant_0).texture("plant_bottom", texture_plant_bottom_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_mud",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant_top", texture_plant_top_variant_1).texture("plant_bottom", texture_plant_bottom_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_mud",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant_top", texture_plant_top_variant_2).texture("plant_bottom", texture_plant_bottom_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_crimson_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant_top", texture_plant_top_default).texture("plant_bottom", texture_plant_bottom_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_crimson_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant_top", texture_plant_top_variant_0).texture("plant_bottom", texture_plant_bottom_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_crimson_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant_top", texture_plant_top_variant_1).texture("plant_bottom", texture_plant_bottom_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_crimson_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant_top", texture_plant_top_variant_2).texture("plant_bottom", texture_plant_bottom_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_warped_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant_top", texture_plant_top_default).texture("plant_bottom", texture_plant_bottom_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_warped_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant_top", texture_plant_top_variant_0).texture("plant_bottom", texture_plant_bottom_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_warped_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant_top", texture_plant_top_variant_1).texture("plant_bottom", texture_plant_bottom_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_warped_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant_top", texture_plant_top_variant_2).texture("plant_bottom", texture_plant_bottom_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant_top", texture_plant_top_default).texture("plant_bottom", texture_plant_bottom_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant_top", texture_plant_top_variant_0).texture("plant_bottom", texture_plant_bottom_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant_top", texture_plant_top_variant_1).texture("plant_bottom", texture_plant_bottom_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant_top", texture_plant_top_variant_2).texture("plant_bottom", texture_plant_bottom_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_red_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant_top", texture_plant_top_default).texture("plant_bottom", texture_plant_bottom_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_red_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant_top", texture_plant_top_variant_0).texture("plant_bottom", texture_plant_bottom_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_red_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant_top", texture_plant_top_variant_1).texture("plant_bottom", texture_plant_bottom_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_red_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant_top", texture_plant_top_variant_2).texture("plant_bottom", texture_plant_bottom_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mycelium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant_top", texture_plant_top_default).texture("plant_bottom", texture_plant_bottom_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_mycelium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant_top", texture_plant_top_variant_0).texture("plant_bottom", texture_plant_bottom_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_mycelium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant_top", texture_plant_top_variant_1).texture("plant_bottom", texture_plant_bottom_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_mycelium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant_top", texture_plant_top_variant_2).texture("plant_bottom", texture_plant_bottom_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_moss",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant_top", texture_plant_top_default).texture("plant_bottom", texture_plant_bottom_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_moss",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant_top", texture_plant_top_variant_0).texture("plant_bottom", texture_plant_bottom_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_moss",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant_top", texture_plant_top_variant_1).texture("plant_bottom", texture_plant_bottom_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_moss",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant_top", texture_plant_top_variant_2).texture("plant_bottom", texture_plant_bottom_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_clay",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant_top", texture_plant_top_default).texture("plant_bottom", texture_plant_bottom_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_clay",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant_top", texture_plant_top_variant_0).texture("plant_bottom", texture_plant_bottom_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_clay",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant_top", texture_plant_top_variant_1).texture("plant_bottom", texture_plant_bottom_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_clay",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant_top", texture_plant_top_variant_2).texture("plant_bottom", texture_plant_bottom_variant_2).texture("particle", texture_pot);

        ModelFile flower_pot_default_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_soul_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant_top", texture_plant_top_default).texture("plant_bottom", texture_plant_bottom_default).texture("particle", texture_pot);

        ModelFile flower_pot_variant_0_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_soul_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant_top", texture_plant_top_variant_0).texture("plant_bottom", texture_plant_bottom_variant_0).texture("particle", texture_pot);

        ModelFile flower_pot_variant_1_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_soul_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant_top", texture_plant_top_variant_1).texture("plant_bottom", texture_plant_bottom_variant_1).texture("particle", texture_pot);

        ModelFile flower_pot_variant_2_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_soul_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("plant_top", texture_plant_top_variant_2).texture("plant_bottom", texture_plant_bottom_variant_2).texture("particle", texture_pot);

        flowerPotTallPlant(block, flower_pot_default_dirt, flower_pot_variant_0_dirt, flower_pot_variant_1_dirt, flower_pot_variant_2_dirt,
                flower_pot_default_coarse_dirt, flower_pot_variant_0_coarse_dirt, flower_pot_variant_1_coarse_dirt, flower_pot_variant_2_coarse_dirt,
                flower_pot_default_grass_block, flower_pot_variant_0_grass_block, flower_pot_variant_1_grass_block, flower_pot_variant_2_grass_block,
                flower_pot_default_podzol, flower_pot_variant_0_podzol, flower_pot_variant_1_podzol, flower_pot_variant_2_podzol,
                flower_pot_default_rooted_dirt, flower_pot_variant_0_rooted_dirt, flower_pot_variant_1_rooted_dirt, flower_pot_variant_2_rooted_dirt,
                flower_pot_default_mud, flower_pot_variant_0_mud, flower_pot_variant_1_mud, flower_pot_variant_2_mud,
                flower_pot_default_crimson_nylium, flower_pot_variant_0_crimson_nylium, flower_pot_variant_1_crimson_nylium, flower_pot_variant_2_crimson_nylium,
                flower_pot_default_warped_nylium, flower_pot_variant_0_warped_nylium, flower_pot_variant_1_warped_nylium, flower_pot_variant_2_warped_nylium,
                flower_pot_default_sand, flower_pot_variant_0_sand, flower_pot_variant_1_sand, flower_pot_variant_2_sand,
                flower_pot_default_red_sand, flower_pot_variant_0_red_sand, flower_pot_variant_1_red_sand, flower_pot_variant_2_red_sand,
                flower_pot_default_mycelium, flower_pot_variant_0_mycelium, flower_pot_variant_1_mycelium, flower_pot_variant_2_mycelium,
                flower_pot_default_moss, flower_pot_variant_0_moss, flower_pot_variant_1_moss, flower_pot_variant_2_moss,
                flower_pot_default_clay, flower_pot_variant_0_clay, flower_pot_variant_1_clay, flower_pot_variant_2_clay,
                flower_pot_default_soul_sand, flower_pot_variant_0_soul_sand, flower_pot_variant_1_soul_sand, flower_pot_variant_2_soul_sand);
    }

    public void flowerPotTallPlant(Block block, ModelFile flower_pot_default_dirt, ModelFile flower_pot_variant_0_dirt, ModelFile flower_pot_variant_1_dirt, ModelFile flower_pot_variant_2_dirt,
                                   ModelFile flower_pot_default_coarse_dirt, ModelFile flower_pot_variant_0_coarse_dirt, ModelFile flower_pot_variant_1_coarse_dirt, ModelFile flower_pot_variant_2_coarse_dirt,
                                   ModelFile flower_pot_default_grass_block, ModelFile flower_pot_variant_0_grass_block, ModelFile flower_pot_variant_1_grass_block, ModelFile flower_pot_variant_2_grass_block,
                                   ModelFile flower_pot_default_podzol, ModelFile flower_pot_variant_0_podzol, ModelFile flower_pot_variant_1_podzol, ModelFile flower_pot_variant_2_podzol,
                                   ModelFile flower_pot_default_rooted_dirt, ModelFile flower_pot_variant_0_rooted_dirt, ModelFile flower_pot_variant_1_rooted_dirt, ModelFile flower_pot_variant_2_rooted_dirt,
                                   ModelFile flower_pot_default_mud, ModelFile flower_pot_variant_0_mud, ModelFile flower_pot_variant_1_mud, ModelFile flower_pot_variant_2_mud,
                                   ModelFile flower_pot_default_crimson_nylium, ModelFile flower_pot_variant_0_crimson_nylium, ModelFile flower_pot_variant_1_crimson_nylium, ModelFile flower_pot_variant_2_crimson_nylium,
                                   ModelFile flower_pot_default_warped_nylium, ModelFile flower_pot_variant_0_warped_nylium, ModelFile flower_pot_variant_1_warped_nylium, ModelFile flower_pot_variant_2_warped_nylium,
                                   ModelFile flower_pot_default_sand, ModelFile flower_pot_variant_0_sand, ModelFile flower_pot_variant_1_sand, ModelFile flower_pot_variant_2_sand,
                                   ModelFile flower_pot_default_red_sand, ModelFile flower_pot_variant_0_red_sand, ModelFile flower_pot_variant_1_red_sand, ModelFile flower_pot_variant_2_red_sand,
                                   ModelFile flower_pot_default_mycelium, ModelFile flower_pot_variant_0_mycelium, ModelFile flower_pot_variant_1_mycelium, ModelFile flower_pot_variant_2_mycelium,
                                   ModelFile flower_pot_default_moss, ModelFile flower_pot_variant_0_moss, ModelFile flower_pot_variant_1_moss, ModelFile flower_pot_variant_2_moss,
                                   ModelFile flower_pot_default_clay, ModelFile flower_pot_variant_0_clay, ModelFile flower_pot_variant_1_clay, ModelFile flower_pot_variant_2_clay,
                                   ModelFile flower_pot_default_soul_sand, ModelFile flower_pot_variant_0_soul_sand, ModelFile flower_pot_variant_1_soul_sand, ModelFile flower_pot_variant_2_soul_sand) {

        getVariantBuilder(block).forAllStates(state -> {
            ModelFile finalModel = switch (state.getValue(ModEnums.FLOWER_POT_DIRT)) {
                case GRASS_BLOCK -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_grass_block;
                    case VARIANT_1 -> flower_pot_variant_1_grass_block;
                    case VARIANT_2 -> flower_pot_variant_2_grass_block;
                    default -> flower_pot_default_grass_block;
                };
                case DIRT -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_dirt;
                    case VARIANT_1 -> flower_pot_variant_1_dirt;
                    case VARIANT_2 -> flower_pot_variant_2_dirt;
                    default -> flower_pot_default_dirt;
                };
                case COARSE_DIRT -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_coarse_dirt;
                    case VARIANT_1 -> flower_pot_variant_1_coarse_dirt;
                    case VARIANT_2 -> flower_pot_variant_2_coarse_dirt;
                    default -> flower_pot_default_coarse_dirt;
                };
                case PODZOL -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_podzol;
                    case VARIANT_1 -> flower_pot_variant_1_podzol;
                    case VARIANT_2 -> flower_pot_variant_2_podzol;
                    default -> flower_pot_default_podzol;
                };
                case ROOTED_DIRT -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_rooted_dirt;
                    case VARIANT_1 -> flower_pot_variant_1_rooted_dirt;
                    case VARIANT_2 -> flower_pot_variant_2_rooted_dirt;
                    default -> flower_pot_default_rooted_dirt;
                };
                case MUD -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_mud;
                    case VARIANT_1 -> flower_pot_variant_1_mud;
                    case VARIANT_2 -> flower_pot_variant_2_mud;
                    default -> flower_pot_default_mud;
                };
                case CRIMSON_NYLIUM -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_crimson_nylium;
                    case VARIANT_1 -> flower_pot_variant_1_crimson_nylium;
                    case VARIANT_2 -> flower_pot_variant_2_crimson_nylium;
                    default -> flower_pot_default_crimson_nylium;
                };
                case WARPED_NYLIUM -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_warped_nylium;
                    case VARIANT_1 -> flower_pot_variant_1_warped_nylium;
                    case VARIANT_2 -> flower_pot_variant_2_warped_nylium;
                    default -> flower_pot_default_warped_nylium;
                };
                case SAND -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_sand;
                    case VARIANT_1 -> flower_pot_variant_1_sand;
                    case VARIANT_2 -> flower_pot_variant_2_sand;
                    default -> flower_pot_default_sand;
                };
                case RED_SAND -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_red_sand;
                    case VARIANT_1 -> flower_pot_variant_1_red_sand;
                    case VARIANT_2 -> flower_pot_variant_2_red_sand;
                    default -> flower_pot_default_red_sand;
                };
                case MYCELIUM -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_mycelium;
                    case VARIANT_1 -> flower_pot_variant_1_mycelium;
                    case VARIANT_2 -> flower_pot_variant_2_mycelium;
                    default -> flower_pot_default_mycelium;
                };
                case MOSS -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_moss;
                    case VARIANT_1 -> flower_pot_variant_1_moss;
                    case VARIANT_2 -> flower_pot_variant_2_moss;
                    default -> flower_pot_default_moss;
                };
                case CLAY -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_clay;
                    case VARIANT_1 -> flower_pot_variant_1_clay;
                    case VARIANT_2 -> flower_pot_variant_2_clay;
                    default -> flower_pot_default_clay;
                };
                case SOUL_SAND -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_variant_0_soul_sand;
                    case VARIANT_1 -> flower_pot_variant_1_soul_sand;
                    case VARIANT_2 -> flower_pot_variant_2_soul_sand;
                    default -> flower_pot_default_soul_sand;
                };
            };
            return ConfiguredModel.builder()
                    .modelFile(finalModel)
                    .build();
        });
    }
    //endregion

    //region flowerPotDripLeaf
    public void flowerPotDripLeaf(Block block, ResourceLocation block_model_default, ResourceLocation block_model_partial_tilt, ResourceLocation block_model_full_tilt, ResourceLocation texture_pot, ResourceLocation texture_stem, ResourceLocation texture_top, ResourceLocation texture_tip, ResourceLocation texture_side) {

        ModelFile flower_pot_default_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_dirt",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_partial_tilt_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_partial_tilt_dirt",
                        block_model_partial_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_full_tilt_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_full_tilt_dirt",
                        block_model_full_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_default_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_coarse_dirt",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_partial_tilt_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_partial_tilt_coarse_dirt",
                        block_model_partial_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_full_tilt_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_full_tilt_coarse_dirt",
                        block_model_full_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_default_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_grass_block",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_partial_tilt_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_partial_tilt_grass_block",
                        block_model_partial_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_full_tilt_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_full_tilt_grass_block",
                        block_model_full_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_default_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_podzol",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_partial_tilt_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_partial_tilt_podzol",
                        block_model_partial_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_full_tilt_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_full_tilt_podzol",
                        block_model_full_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_default_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_rooted_dirt",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_partial_tilt_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_partial_tilt_rooted_dirt",
                        block_model_partial_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_full_tilt_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_full_tilt_rooted_dirt",
                        block_model_full_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_default_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mud",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_partial_tilt_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_partial_tilt_mud",
                        block_model_partial_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_full_tilt_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_full_tilt_mud",
                        block_model_full_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_default_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_crimson_nylium",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_partial_tilt_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_partial_tilt_crimson_nylium",
                        block_model_partial_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_full_tilt_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_full_tilt_crimson_nylium",
                        block_model_full_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_default_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_warped_nylium",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_partial_tilt_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_partial_tilt_warped_nylium",
                        block_model_partial_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_full_tilt_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_full_tilt_warped_nylium",
                        block_model_full_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_default_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_sand",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_partial_tilt_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_partial_tilt_sand",
                        block_model_partial_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_full_tilt_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_full_tilt_sand",
                        block_model_full_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_default_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_red_sand",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_partial_tilt_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_partial_tilt_red_sand",
                        block_model_partial_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_full_tilt_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_full_tilt_red_sand",
                        block_model_full_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_default_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mycelium",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_partial_tilt_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_partial_tilt_mycelium",
                        block_model_partial_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_full_tilt_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_full_tilt_mycelium",
                        block_model_full_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_default_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_moss",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_partial_tilt_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_partial_tilt_moss",
                        block_model_partial_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_full_tilt_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_full_tilt_moss",
                        block_model_full_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_default_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_clay",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_partial_tilt_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_partial_tilt_clay",
                        block_model_partial_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_full_tilt_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_full_tilt_clay",
                        block_model_full_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_default_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_soul_sand",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_partial_tilt_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_partial_tilt_soul_sand",
                        block_model_partial_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        ModelFile flower_pot_full_tilt_soul_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_full_tilt_soul_sand",
                        block_model_full_tilt).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/soul_sand")).texture("stem", texture_stem).texture("top", texture_top).texture("tip", texture_tip).texture("side", texture_side).texture("particle", texture_pot);

        flowerPotDripLeaf(block, flower_pot_default_dirt, flower_pot_partial_tilt_dirt, flower_pot_full_tilt_dirt,
                flower_pot_default_coarse_dirt, flower_pot_partial_tilt_coarse_dirt, flower_pot_full_tilt_coarse_dirt,
                flower_pot_default_grass_block, flower_pot_partial_tilt_grass_block, flower_pot_full_tilt_grass_block,
                flower_pot_default_podzol, flower_pot_partial_tilt_podzol, flower_pot_full_tilt_podzol,
                flower_pot_default_rooted_dirt, flower_pot_partial_tilt_rooted_dirt, flower_pot_full_tilt_rooted_dirt,
                flower_pot_default_mud, flower_pot_partial_tilt_mud, flower_pot_full_tilt_mud,
                flower_pot_default_crimson_nylium, flower_pot_partial_tilt_crimson_nylium, flower_pot_full_tilt_crimson_nylium,
                flower_pot_default_warped_nylium, flower_pot_partial_tilt_warped_nylium, flower_pot_full_tilt_warped_nylium,
                flower_pot_default_sand, flower_pot_partial_tilt_sand, flower_pot_full_tilt_sand,
                flower_pot_default_red_sand, flower_pot_partial_tilt_red_sand, flower_pot_full_tilt_red_sand,
                flower_pot_default_mycelium, flower_pot_partial_tilt_mycelium, flower_pot_full_tilt_mycelium,
                flower_pot_default_moss, flower_pot_partial_tilt_moss, flower_pot_full_tilt_moss,
                flower_pot_default_clay, flower_pot_partial_tilt_clay, flower_pot_full_tilt_clay,
                flower_pot_default_soul_sand, flower_pot_partial_tilt_soul_sand, flower_pot_full_tilt_soul_sand);
    }

    public void flowerPotDripLeaf(Block block, ModelFile flower_pot_default_dirt, ModelFile flower_pot_partial_tilt_dirt, ModelFile flower_pot_full_tilt_dirt,
                                  ModelFile flower_pot_default_coarse_dirt, ModelFile flower_pot_partial_tilt_coarse_dirt, ModelFile flower_pot_full_tilt_coarse_dirt,
                                  ModelFile flower_pot_default_grass_block, ModelFile flower_pot_partial_tilt_grass_block, ModelFile flower_pot_full_tilt_grass_block,
                                  ModelFile flower_pot_default_podzol, ModelFile flower_pot_partial_tilt_podzol, ModelFile flower_pot_full_tilt_podzol,
                                  ModelFile flower_pot_default_rooted_dirt, ModelFile flower_pot_partial_tilt_rooted_dirt, ModelFile flower_pot_full_tilt_rooted_dirt,
                                  ModelFile flower_pot_default_mud, ModelFile flower_pot_partial_tilt_mud, ModelFile flower_pot_full_tilt_mud,
                                  ModelFile flower_pot_default_crimson_nylium, ModelFile flower_pot_partial_tilt_crimson_nylium, ModelFile flower_pot_full_tilt_crimson_nylium,
                                  ModelFile flower_pot_default_warped_nylium, ModelFile flower_pot_partial_tilt_warped_nylium, ModelFile flower_pot_full_tilt_warped_nylium,
                                  ModelFile flower_pot_default_sand, ModelFile flower_pot_partial_tilt_sand, ModelFile flower_pot_full_tilt_sand,
                                  ModelFile flower_pot_default_red_sand, ModelFile flower_pot_partial_tilt_red_sand, ModelFile flower_pot_full_tilt_red_sand,
                                  ModelFile flower_pot_default_mycelium, ModelFile flower_pot_partial_tilt_mycelium, ModelFile flower_pot_full_tilt_mycelium,
                                  ModelFile flower_pot_default_moss, ModelFile flower_pot_partial_tilt_moss, ModelFile flower_pot_full_tilt_moss,
                                  ModelFile flower_pot_default_clay, ModelFile flower_pot_partial_tilt_clay, ModelFile flower_pot_full_tilt_clay,
                                  ModelFile flower_pot_default_soul_sand, ModelFile flower_pot_partial_tilt_soul_sand, ModelFile flower_pot_full_tilt_soul_sand) {

        getVariantBuilder(block).forAllStates(state -> {
            ModelFile finalModel = switch (state.getValue(ModEnums.FLOWER_POT_DIRT)) {
                case GRASS_BLOCK -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_partial_tilt_grass_block;
                    case VARIANT_1 -> flower_pot_full_tilt_grass_block;
                    default -> flower_pot_default_grass_block;
                };
                case DIRT -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_partial_tilt_dirt;
                    case VARIANT_1 -> flower_pot_full_tilt_dirt;
                    default -> flower_pot_default_dirt;
                };
                case COARSE_DIRT -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_partial_tilt_coarse_dirt;
                    case VARIANT_1 -> flower_pot_full_tilt_coarse_dirt;
                    default -> flower_pot_default_coarse_dirt;
                };
                case PODZOL -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_partial_tilt_podzol;
                    case VARIANT_1 -> flower_pot_full_tilt_podzol;
                    default -> flower_pot_default_podzol;
                };
                case ROOTED_DIRT -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_partial_tilt_rooted_dirt;
                    case VARIANT_1 -> flower_pot_full_tilt_rooted_dirt;
                    default -> flower_pot_default_rooted_dirt;
                };
                case MUD -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_partial_tilt_mud;
                    case VARIANT_1 -> flower_pot_full_tilt_mud;
                    default -> flower_pot_default_mud;
                };
                case CRIMSON_NYLIUM -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_partial_tilt_crimson_nylium;
                    case VARIANT_1 -> flower_pot_full_tilt_crimson_nylium;
                    default -> flower_pot_default_crimson_nylium;
                };
                case WARPED_NYLIUM -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_partial_tilt_warped_nylium;
                    case VARIANT_1 -> flower_pot_full_tilt_warped_nylium;
                    default -> flower_pot_default_warped_nylium;
                };
                case SAND -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_partial_tilt_sand;
                    case VARIANT_1 -> flower_pot_full_tilt_sand;
                    default -> flower_pot_default_sand;
                };
                case RED_SAND -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_partial_tilt_red_sand;
                    case VARIANT_1 -> flower_pot_full_tilt_red_sand;
                    default -> flower_pot_default_red_sand;
                };
                case MYCELIUM -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_partial_tilt_mycelium;
                    case VARIANT_1 -> flower_pot_full_tilt_mycelium;
                    default -> flower_pot_default_mycelium;
                };
                case MOSS -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_partial_tilt_moss;
                    case VARIANT_1 -> flower_pot_full_tilt_moss;
                    default -> flower_pot_default_moss;
                };
                case CLAY -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_partial_tilt_clay;
                    case VARIANT_1 -> flower_pot_full_tilt_clay;
                    default -> flower_pot_default_clay;
                };
                case SOUL_SAND -> switch (state.getValue(ModEnums.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> flower_pot_partial_tilt_soul_sand;
                    case VARIANT_1 -> flower_pot_full_tilt_soul_sand;
                    default -> flower_pot_default_soul_sand;
                };

            };
            return ConfiguredModel.builder()
                    .modelFile(finalModel)
                    .build();
        });
    }
    //endregion

}
