package de.artemis.flowerpots.common.data;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.util.ModBlockStateProperties;
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

        smallFlowerPotEmpty(ModBlocks.SMALL_FLOWER_POT.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_empty"), new ResourceLocation("block/flower_pot"));
        smallFlowerPotEmpty(ModBlocks.SMALL_UNFIRED_FLOWER_POT.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_empty"), new ResourceLocation("block/clay"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_ALLIUM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/allium"), new ResourceLocation("flowerpots:block/allium_variant_0"), new ResourceLocation("flowerpots:block/allium_variant_1"), new ResourceLocation("flowerpots:block/allium_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/oak_sapling"), new ResourceLocation("flowerpots:block/oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/oak_sapling_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_SPRUCE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/spruce_sapling"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_0"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_1"), new ResourceLocation("flowerpots:block/spruce_sapling_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_BIRCH_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/birch_sapling"), new ResourceLocation("flowerpots:block/birch_sapling_variant_0"), new ResourceLocation("flowerpots:block/birch_sapling_variant_1"), new ResourceLocation("flowerpots:block/birch_sapling_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_JUNGLE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/jungle_sapling"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_0"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_1"), new ResourceLocation("flowerpots:block/jungle_sapling_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_ACACIA_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/acacia_sapling"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_0"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_1"), new ResourceLocation("flowerpots:block/acacia_sapling_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_DARK_OAK_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/dark_oak_sapling"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_0"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_1"), new ResourceLocation("flowerpots:block/dark_oak_sapling_variant_2"));
        smallFlowerPotConfigurableModel(ModBlocks.SMALL_FLOWER_POT_MANGROVE_SAPLING.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_mangrove_propagule_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_mangrove_propagule_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_mangrove_propagule_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_mangrove_propagule_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/mangrove_propagule"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_0"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_1"), new ResourceLocation("flowerpots:block/mangrove_propagule_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_FERN.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross_tint"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/fern"), new ResourceLocation("flowerpots:block/fern_variant_0"), new ResourceLocation("flowerpots:block/fern_variant_1"), new ResourceLocation("flowerpots:block/fern_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_DANDELION.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/dandelion"), new ResourceLocation("flowerpots:block/dandelion_variant_0"), new ResourceLocation("flowerpots:block/dandelion_variant_1"), new ResourceLocation("flowerpots:block/dandelion_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_POPPY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/poppy"), new ResourceLocation("flowerpots:block/poppy_variant_0"), new ResourceLocation("flowerpots:block/poppy_variant_1"), new ResourceLocation("flowerpots:block/poppy_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_BLUE_ORCHID.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/blue_orchid"), new ResourceLocation("flowerpots:block/blue_orchid_variant_0"), new ResourceLocation("flowerpots:block/blue_orchid_variant_1"), new ResourceLocation("flowerpots:block/blue_orchid_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_AZURE_BLUET.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/azure_bluet"), new ResourceLocation("flowerpots:block/azure_bluet_variant_0"), new ResourceLocation("flowerpots:block/azure_bluet_variant_1"), new ResourceLocation("flowerpots:block/azure_bluet_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_RED_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/red_tulip"), new ResourceLocation("flowerpots:block/red_tulip_variant_0"), new ResourceLocation("flowerpots:block/red_tulip_variant_1"), new ResourceLocation("flowerpots:block/red_tulip_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_ORANGE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/orange_tulip"), new ResourceLocation("flowerpots:block/orange_tulip_variant_0"), new ResourceLocation("flowerpots:block/orange_tulip_variant_1"), new ResourceLocation("flowerpots:block/orange_tulip_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_WHITE_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/white_tulip"), new ResourceLocation("flowerpots:block/white_tulip_variant_0"), new ResourceLocation("flowerpots:block/white_tulip_variant_1"), new ResourceLocation("flowerpots:block/white_tulip_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_PINK_TULIP.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/pink_tulip"), new ResourceLocation("flowerpots:block/pink_tulip_variant_0"), new ResourceLocation("flowerpots:block/pink_tulip_variant_1"), new ResourceLocation("flowerpots:block/pink_tulip_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_OXEYE_DAISY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/oxeye_daisy"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_0"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_1"), new ResourceLocation("flowerpots:block/oxeye_daisy_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_CORNFLOWER.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/cornflower"), new ResourceLocation("flowerpots:block/cornflower_variant_0"), new ResourceLocation("flowerpots:block/cornflower_variant_1"), new ResourceLocation("flowerpots:block/cornflower_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_LILY_OF_THE_VALLEY.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/lily_of_the_valley"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_0"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_1"), new ResourceLocation("flowerpots:block/lily_of_the_valley_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_WITHER_ROSE.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/wither_rose"), new ResourceLocation("flowerpots:block/wither_rose_variant_0"), new ResourceLocation("flowerpots:block/wither_rose_variant_1"), new ResourceLocation("flowerpots:block/wither_rose_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_RED_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/red_mushroom"), new ResourceLocation("flowerpots:block/red_mushroom_variant_0"), new ResourceLocation("flowerpots:block/red_mushroom_variant_1"), new ResourceLocation("flowerpots:block/red_mushroom_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_BROWN_MUSHROOM.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/brown_mushroom"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_0"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_1"), new ResourceLocation("flowerpots:block/brown_mushroom_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_DEAD_BUSH.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/dead_bush"), new ResourceLocation("flowerpots:block/dead_bush_variant_0"), new ResourceLocation("flowerpots:block/dead_bush_variant_1"), new ResourceLocation("flowerpots:block/dead_bush_variant_2"));
        smallFlowerPotConfigurable(ModBlocks.SMALL_FLOWER_POT_CACTUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cactus_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cactus_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cactus_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cactus_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_side"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"), new ResourceLocation("block/cactus_top"));
        smallFlowerPotConfigurable(ModBlocks.SMALL_FLOWER_POT_BAMBOO.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_bamboo_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_bamboo_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_bamboo_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_bamboo_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_singleleaf"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"), new ResourceLocation("block/bamboo_stalk"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_CRIMSON_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/crimson_fungus"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_0"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_1"), new ResourceLocation("flowerpots:block/crimson_fungus_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_WARPED_FUNGUS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/warped_fungus"), new ResourceLocation("flowerpots:block/warped_fungus_variant_0"), new ResourceLocation("flowerpots:block/warped_fungus_variant_1"), new ResourceLocation("flowerpots:block/warped_fungus_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_CRIMSON_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/crimson_roots_pot"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/crimson_roots_pot_variant_2"));
        smallFlowerPot(ModBlocks.SMALL_FLOWER_POT_WARPED_ROOTS.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_cross"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/warped_roots_pot"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_0"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_1"), new ResourceLocation("flowerpots:block/warped_roots_pot_variant_2"));
        smallFlowerPotConfigurable(ModBlocks.SMALL_FLOWER_POT_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/potted_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_azalea_bush_top_variant_2"));
        smallFlowerPotConfigurable(ModBlocks.SMALL_FLOWER_POT_FLOWERING_AZALEA.get(), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_default"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_variant_0"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_variant_1"), new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_azalea_variant_2"), new ResourceLocation("block/flower_pot"), new ResourceLocation("block/potted_flowering_azalea_bush_plant"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_plant_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_side"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_side_variant_2"), new ResourceLocation("block/potted_flowering_azalea_bush_top"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_0"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_1"), new ResourceLocation("flowerpots:block/potted_flowering_azalea_bush_top_variant_2"));
    }

    public void smallFlowerPotEmpty(Block block, ResourceLocation block_model, ResourceLocation block_texture) {
        ModelFile small_flower_pot_empty = models().withExistingParent(DataProvider.getRegistryName(block.asItem()),
                new ResourceLocation(FlowerPots.MODID, "generation/small_flower_pot_empty")).texture("flower_pot", block_texture).texture("particle", block_texture).renderType("cutout");

        smallFlowerPotEmpty(block, small_flower_pot_empty);
    }

    public void smallFlowerPotEmpty(Block block, ModelFile small_flower_pot_empty) {
        getVariantBuilder(block).forAllStates(state -> {
            ModelFile finalModel = small_flower_pot_empty;
            return ConfiguredModel.builder()
                    .modelFile(finalModel)
                    .build();
        });
    }

    public void smallFlowerPotConfigurable(Block block, ResourceLocation block_model_default, ResourceLocation block_model_variant_0, ResourceLocation block_model_variant_1, ResourceLocation block_model_variant_2, ResourceLocation texture_pot, ResourceLocation texture_plant_default, ResourceLocation texture_plant_variant_0, ResourceLocation texture_plant_variant_1, ResourceLocation texture_plant_variant_2, ResourceLocation texture_plant_side_default, ResourceLocation texture_plant_side_variant_0, ResourceLocation texture_plant_side_variant_1, ResourceLocation texture_plant_side_variant_2, ResourceLocation texture_plant_top_default, ResourceLocation texture_plant_top_variant_0, ResourceLocation texture_plant_top_variant_1, ResourceLocation texture_plant_top_variant_2) {

        ModelFile small_flower_pot_default_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_dirt",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_dirt",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_dirt",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_dirt",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_coarse_dirt",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_coarse_dirt",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_coarse_dirt",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_coarse_dirt",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_grass_block",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_grass_block",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_grass_block",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_grass_block",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_podzol",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_podzol",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_podzol",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_podzol",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_rooted_dirt",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_rooted_dirt",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_rooted_dirt",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_rooted_dirt",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mud",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_mud",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_mud",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_mud",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_crimson_nylium",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_crimson_nylium",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_crimson_nylium",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_crimson_nylium",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_warped_nylium",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_warped_nylium",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_warped_nylium",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_warped_nylium",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_sand",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_sand",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_sand",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_sand",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_red_sand",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_red_sand",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_red_sand",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_red_sand",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mycelium",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_mycelium",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_mycelium",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_mycelium",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_moss",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_moss",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_moss",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_moss",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_clay",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_default).texture("plant_side", texture_plant_side_default).texture("plant_top", texture_plant_top_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_clay",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_0).texture("plant_side", texture_plant_side_variant_0).texture("plant_top", texture_plant_top_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_clay",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_1).texture("plant_side", texture_plant_side_variant_1).texture("plant_top", texture_plant_top_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_clay",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_2).texture("plant_side", texture_plant_side_variant_2).texture("plant_top", texture_plant_top_variant_2).texture("particle", texture_pot);

        smallFlowerPotConfigurable(block, small_flower_pot_default_dirt, small_flower_pot_variant_0_dirt, small_flower_pot_variant_1_dirt, small_flower_pot_variant_2_dirt,
                small_flower_pot_default_coarse_dirt, small_flower_pot_variant_0_coarse_dirt, small_flower_pot_variant_1_coarse_dirt, small_flower_pot_variant_2_coarse_dirt,
                small_flower_pot_default_grass_block, small_flower_pot_variant_0_grass_block, small_flower_pot_variant_1_grass_block, small_flower_pot_variant_2_grass_block,
                small_flower_pot_default_podzol, small_flower_pot_variant_0_podzol, small_flower_pot_variant_1_podzol, small_flower_pot_variant_2_podzol,
                small_flower_pot_default_rooted_dirt, small_flower_pot_variant_0_rooted_dirt, small_flower_pot_variant_1_rooted_dirt, small_flower_pot_variant_2_rooted_dirt,
                small_flower_pot_default_mud, small_flower_pot_variant_0_mud, small_flower_pot_variant_1_mud, small_flower_pot_variant_2_mud,
                small_flower_pot_default_crimson_nylium, small_flower_pot_variant_0_crimson_nylium, small_flower_pot_variant_1_crimson_nylium, small_flower_pot_variant_2_crimson_nylium,
                small_flower_pot_default_warped_nylium, small_flower_pot_variant_0_warped_nylium, small_flower_pot_variant_1_warped_nylium, small_flower_pot_variant_2_warped_nylium,
                small_flower_pot_default_sand, small_flower_pot_variant_0_sand, small_flower_pot_variant_1_sand, small_flower_pot_variant_2_sand,
                small_flower_pot_default_red_sand, small_flower_pot_variant_0_red_sand, small_flower_pot_variant_1_red_sand, small_flower_pot_variant_2_red_sand,
                small_flower_pot_default_mycelium, small_flower_pot_variant_0_mycelium, small_flower_pot_variant_1_mycelium, small_flower_pot_variant_2_mycelium,
                small_flower_pot_default_moss, small_flower_pot_variant_0_moss, small_flower_pot_variant_1_moss, small_flower_pot_variant_2_moss,
                small_flower_pot_default_clay, small_flower_pot_variant_0_clay, small_flower_pot_variant_1_clay, small_flower_pot_variant_2_clay);
    }

    public void smallFlowerPotConfigurable(Block block, ModelFile small_flower_pot_default_dirt, ModelFile small_flower_pot_variant_0_dirt, ModelFile small_flower_pot_variant_1_dirt, ModelFile small_flower_pot_variant_2_dirt,
                                           ModelFile small_flower_pot_default_coarse_dirt, ModelFile small_flower_pot_variant_0_coarse_dirt, ModelFile small_flower_pot_variant_1_coarse_dirt, ModelFile small_flower_pot_variant_2_coarse_dirt,
                                           ModelFile small_flower_pot_default_grass_block, ModelFile small_flower_pot_variant_0_grass_block, ModelFile small_flower_pot_variant_1_grass_block, ModelFile small_flower_pot_variant_2_grass_block,
                                           ModelFile small_flower_pot_default_podzol, ModelFile small_flower_pot_variant_0_podzol, ModelFile small_flower_pot_variant_1_podzol, ModelFile small_flower_pot_variant_2_podzol,
                                           ModelFile small_flower_pot_default_rooted_dirt, ModelFile small_flower_pot_variant_0_rooted_dirt, ModelFile small_flower_pot_variant_1_rooted_dirt, ModelFile small_flower_pot_variant_2_rooted_dirt,
                                           ModelFile small_flower_pot_default_mud, ModelFile small_flower_pot_variant_0_mud, ModelFile small_flower_pot_variant_1_mud, ModelFile small_flower_pot_variant_2_mud,
                                           ModelFile small_flower_pot_default_crimson_nylium, ModelFile small_flower_pot_variant_0_crimson_nylium, ModelFile small_flower_pot_variant_1_crimson_nylium, ModelFile small_flower_pot_variant_2_crimson_nylium,
                                           ModelFile small_flower_pot_default_warped_nylium, ModelFile small_flower_pot_variant_0_warped_nylium, ModelFile small_flower_pot_variant_1_warped_nylium, ModelFile small_flower_pot_variant_2_warped_nylium,
                                           ModelFile small_flower_pot_default_sand, ModelFile small_flower_pot_variant_0_sand, ModelFile small_flower_pot_variant_1_sand, ModelFile small_flower_pot_variant_2_sand,
                                           ModelFile small_flower_pot_default_red_sand, ModelFile small_flower_pot_variant_0_red_sand, ModelFile small_flower_pot_variant_1_red_sand, ModelFile small_flower_pot_variant_2_red_sand,
                                           ModelFile small_flower_pot_default_mycelium, ModelFile small_flower_pot_variant_0_mycelium, ModelFile small_flower_pot_variant_1_mycelium, ModelFile small_flower_pot_variant_2_mycelium,
                                           ModelFile small_flower_pot_default_moss, ModelFile small_flower_pot_variant_0_moss, ModelFile small_flower_pot_variant_1_moss, ModelFile small_flower_pot_variant_2_moss,
                                           ModelFile small_flower_pot_default_clay, ModelFile small_flower_pot_variant_0_clay, ModelFile small_flower_pot_variant_1_clay, ModelFile small_flower_pot_variant_2_clay) {

        getVariantBuilder(block).forAllStates(state -> {
            ModelFile finalModel = switch (state.getValue(ModBlockStateProperties.FLOWER_POT_DIRT_VARIANT)) {
                case GRASS_BLOCK -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_grass_block;
                    case VARIANT_1 -> small_flower_pot_variant_1_grass_block;
                    case VARIANT_2 -> small_flower_pot_variant_2_grass_block;
                    default -> small_flower_pot_default_grass_block;
                };
                case DIRT -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_dirt;
                    case VARIANT_1 -> small_flower_pot_variant_1_dirt;
                    case VARIANT_2 -> small_flower_pot_variant_2_dirt;
                    default -> small_flower_pot_default_dirt;
                };
                case COARSE_DIRT -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_coarse_dirt;
                    case VARIANT_1 -> small_flower_pot_variant_1_coarse_dirt;
                    case VARIANT_2 -> small_flower_pot_variant_2_coarse_dirt;
                    default -> small_flower_pot_default_coarse_dirt;
                };
                case PODZOL -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_podzol;
                    case VARIANT_1 -> small_flower_pot_variant_1_podzol;
                    case VARIANT_2 -> small_flower_pot_variant_2_podzol;
                    default -> small_flower_pot_default_podzol;
                };
                case ROOTED_DIRT -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_rooted_dirt;
                    case VARIANT_1 -> small_flower_pot_variant_1_rooted_dirt;
                    case VARIANT_2 -> small_flower_pot_variant_2_rooted_dirt;
                    default -> small_flower_pot_default_rooted_dirt;
                };
                case MUD -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_mud;
                    case VARIANT_1 -> small_flower_pot_variant_1_mud;
                    case VARIANT_2 -> small_flower_pot_variant_2_mud;
                    default -> small_flower_pot_default_mud;
                };
                case CRIMSON_NYLIUM -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_crimson_nylium;
                    case VARIANT_1 -> small_flower_pot_variant_1_crimson_nylium;
                    case VARIANT_2 -> small_flower_pot_variant_2_crimson_nylium;
                    default -> small_flower_pot_default_crimson_nylium;
                };
                case WARPED_NYLIUM -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_warped_nylium;
                    case VARIANT_1 -> small_flower_pot_variant_1_warped_nylium;
                    case VARIANT_2 -> small_flower_pot_variant_2_warped_nylium;
                    default -> small_flower_pot_default_warped_nylium;
                };
                case SAND -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_sand;
                    case VARIANT_1 -> small_flower_pot_variant_1_sand;
                    case VARIANT_2 -> small_flower_pot_variant_2_sand;
                    default -> small_flower_pot_default_sand;
                };
                case RED_SAND -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_red_sand;
                    case VARIANT_1 -> small_flower_pot_variant_1_red_sand;
                    case VARIANT_2 -> small_flower_pot_variant_2_red_sand;
                    default -> small_flower_pot_default_red_sand;
                };
                case MYCELIUM -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_mycelium;
                    case VARIANT_1 -> small_flower_pot_variant_1_mycelium;
                    case VARIANT_2 -> small_flower_pot_variant_2_mycelium;
                    default -> small_flower_pot_default_mycelium;
                };
                case MOSS -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_moss;
                    case VARIANT_1 -> small_flower_pot_variant_1_moss;
                    case VARIANT_2 -> small_flower_pot_variant_2_moss;
                    default -> small_flower_pot_default_moss;
                };
                case CLAY -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_clay;
                    case VARIANT_1 -> small_flower_pot_variant_1_clay;
                    case VARIANT_2 -> small_flower_pot_variant_2_clay;
                    default -> small_flower_pot_default_clay;
                };
            };
            return ConfiguredModel.builder()
                    .modelFile(finalModel)
                    .build();
        });
    }

    public void smallFlowerPotConfigurableModel(Block block, ResourceLocation block_model_default, ResourceLocation block_model_variant_0, ResourceLocation block_model_variant_1, ResourceLocation block_model_variant_2, ResourceLocation texture_pot, ResourceLocation texture_plant_default, ResourceLocation texture_plant_variant_0, ResourceLocation texture_plant_variant_1, ResourceLocation texture_plant_variant_2) {

        ModelFile small_flower_pot_default_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_dirt",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_dirt",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_dirt",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_dirt",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_coarse_dirt",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_coarse_dirt",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_coarse_dirt",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_coarse_dirt",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_grass_block",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_grass_block",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_grass_block",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_grass_block",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_podzol",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_podzol",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_podzol",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_podzol",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_rooted_dirt",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_rooted_dirt",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_rooted_dirt",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_rooted_dirt",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mud",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_mud",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_mud",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_mud",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_crimson_nylium",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_crimson_nylium",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_crimson_nylium",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_crimson_nylium",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_warped_nylium",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_warped_nylium",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_warped_nylium",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_warped_nylium",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_sand",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_sand",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_sand",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_sand",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_red_sand",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_red_sand",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_red_sand",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_red_sand",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mycelium",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_mycelium",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_mycelium",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_mycelium",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_moss",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_moss",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_moss",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_moss",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_clay",
                        block_model_default).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_clay",
                        block_model_variant_0).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_clay",
                        block_model_variant_1).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_clay",
                        block_model_variant_2).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        smallFlowerPotConfigurableModel(block, small_flower_pot_default_dirt, small_flower_pot_variant_0_dirt, small_flower_pot_variant_1_dirt, small_flower_pot_variant_2_dirt,
                small_flower_pot_default_coarse_dirt, small_flower_pot_variant_0_coarse_dirt, small_flower_pot_variant_1_coarse_dirt, small_flower_pot_variant_2_coarse_dirt,
                small_flower_pot_default_grass_block, small_flower_pot_variant_0_grass_block, small_flower_pot_variant_1_grass_block, small_flower_pot_variant_2_grass_block,
                small_flower_pot_default_podzol, small_flower_pot_variant_0_podzol, small_flower_pot_variant_1_podzol, small_flower_pot_variant_2_podzol,
                small_flower_pot_default_rooted_dirt, small_flower_pot_variant_0_rooted_dirt, small_flower_pot_variant_1_rooted_dirt, small_flower_pot_variant_2_rooted_dirt,
                small_flower_pot_default_mud, small_flower_pot_variant_0_mud, small_flower_pot_variant_1_mud, small_flower_pot_variant_2_mud,
                small_flower_pot_default_crimson_nylium, small_flower_pot_variant_0_crimson_nylium, small_flower_pot_variant_1_crimson_nylium, small_flower_pot_variant_2_crimson_nylium,
                small_flower_pot_default_warped_nylium, small_flower_pot_variant_0_warped_nylium, small_flower_pot_variant_1_warped_nylium, small_flower_pot_variant_2_warped_nylium,
                small_flower_pot_default_sand, small_flower_pot_variant_0_sand, small_flower_pot_variant_1_sand, small_flower_pot_variant_2_sand,
                small_flower_pot_default_red_sand, small_flower_pot_variant_0_red_sand, small_flower_pot_variant_1_red_sand, small_flower_pot_variant_2_red_sand,
                small_flower_pot_default_mycelium, small_flower_pot_variant_0_mycelium, small_flower_pot_variant_1_mycelium, small_flower_pot_variant_2_mycelium,
                small_flower_pot_default_moss, small_flower_pot_variant_0_moss, small_flower_pot_variant_1_moss, small_flower_pot_variant_2_moss,
                small_flower_pot_default_clay, small_flower_pot_variant_0_clay, small_flower_pot_variant_1_clay, small_flower_pot_variant_2_clay);
    }

    public void smallFlowerPotConfigurableModel(Block block, ModelFile small_flower_pot_default_dirt, ModelFile small_flower_pot_variant_0_dirt, ModelFile small_flower_pot_variant_1_dirt, ModelFile small_flower_pot_variant_2_dirt,
                                                ModelFile small_flower_pot_default_coarse_dirt, ModelFile small_flower_pot_variant_0_coarse_dirt, ModelFile small_flower_pot_variant_1_coarse_dirt, ModelFile small_flower_pot_variant_2_coarse_dirt,
                                                ModelFile small_flower_pot_default_grass_block, ModelFile small_flower_pot_variant_0_grass_block, ModelFile small_flower_pot_variant_1_grass_block, ModelFile small_flower_pot_variant_2_grass_block,
                                                ModelFile small_flower_pot_default_podzol, ModelFile small_flower_pot_variant_0_podzol, ModelFile small_flower_pot_variant_1_podzol, ModelFile small_flower_pot_variant_2_podzol,
                                                ModelFile small_flower_pot_default_rooted_dirt, ModelFile small_flower_pot_variant_0_rooted_dirt, ModelFile small_flower_pot_variant_1_rooted_dirt, ModelFile small_flower_pot_variant_2_rooted_dirt,
                                                ModelFile small_flower_pot_default_mud, ModelFile small_flower_pot_variant_0_mud, ModelFile small_flower_pot_variant_1_mud, ModelFile small_flower_pot_variant_2_mud,
                                                ModelFile small_flower_pot_default_crimson_nylium, ModelFile small_flower_pot_variant_0_crimson_nylium, ModelFile small_flower_pot_variant_1_crimson_nylium, ModelFile small_flower_pot_variant_2_crimson_nylium,
                                                ModelFile small_flower_pot_default_warped_nylium, ModelFile small_flower_pot_variant_0_warped_nylium, ModelFile small_flower_pot_variant_1_warped_nylium, ModelFile small_flower_pot_variant_2_warped_nylium,
                                                ModelFile small_flower_pot_default_sand, ModelFile small_flower_pot_variant_0_sand, ModelFile small_flower_pot_variant_1_sand, ModelFile small_flower_pot_variant_2_sand,
                                                ModelFile small_flower_pot_default_red_sand, ModelFile small_flower_pot_variant_0_red_sand, ModelFile small_flower_pot_variant_1_red_sand, ModelFile small_flower_pot_variant_2_red_sand,
                                                ModelFile small_flower_pot_default_mycelium, ModelFile small_flower_pot_variant_0_mycelium, ModelFile small_flower_pot_variant_1_mycelium, ModelFile small_flower_pot_variant_2_mycelium,
                                                ModelFile small_flower_pot_default_moss, ModelFile small_flower_pot_variant_0_moss, ModelFile small_flower_pot_variant_1_moss, ModelFile small_flower_pot_variant_2_moss,
                                                ModelFile small_flower_pot_default_clay, ModelFile small_flower_pot_variant_0_clay, ModelFile small_flower_pot_variant_1_clay, ModelFile small_flower_pot_variant_2_clay) {

        getVariantBuilder(block).forAllStates(state -> {
            ModelFile finalModel = switch (state.getValue(ModBlockStateProperties.FLOWER_POT_DIRT_VARIANT)) {
                case GRASS_BLOCK -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_grass_block;
                    case VARIANT_1 -> small_flower_pot_variant_1_grass_block;
                    case VARIANT_2 -> small_flower_pot_variant_2_grass_block;
                    default -> small_flower_pot_default_grass_block;
                };
                case DIRT -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_dirt;
                    case VARIANT_1 -> small_flower_pot_variant_1_dirt;
                    case VARIANT_2 -> small_flower_pot_variant_2_dirt;
                    default -> small_flower_pot_default_dirt;
                };
                case COARSE_DIRT -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_coarse_dirt;
                    case VARIANT_1 -> small_flower_pot_variant_1_coarse_dirt;
                    case VARIANT_2 -> small_flower_pot_variant_2_coarse_dirt;
                    default -> small_flower_pot_default_coarse_dirt;
                };
                case PODZOL -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_podzol;
                    case VARIANT_1 -> small_flower_pot_variant_1_podzol;
                    case VARIANT_2 -> small_flower_pot_variant_2_podzol;
                    default -> small_flower_pot_default_podzol;
                };
                case ROOTED_DIRT -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_rooted_dirt;
                    case VARIANT_1 -> small_flower_pot_variant_1_rooted_dirt;
                    case VARIANT_2 -> small_flower_pot_variant_2_rooted_dirt;
                    default -> small_flower_pot_default_rooted_dirt;
                };
                case MUD -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_mud;
                    case VARIANT_1 -> small_flower_pot_variant_1_mud;
                    case VARIANT_2 -> small_flower_pot_variant_2_mud;
                    default -> small_flower_pot_default_mud;
                };
                case CRIMSON_NYLIUM -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_crimson_nylium;
                    case VARIANT_1 -> small_flower_pot_variant_1_crimson_nylium;
                    case VARIANT_2 -> small_flower_pot_variant_2_crimson_nylium;
                    default -> small_flower_pot_default_crimson_nylium;
                };
                case WARPED_NYLIUM -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_warped_nylium;
                    case VARIANT_1 -> small_flower_pot_variant_1_warped_nylium;
                    case VARIANT_2 -> small_flower_pot_variant_2_warped_nylium;
                    default -> small_flower_pot_default_warped_nylium;
                };
                case SAND -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_sand;
                    case VARIANT_1 -> small_flower_pot_variant_1_sand;
                    case VARIANT_2 -> small_flower_pot_variant_2_sand;
                    default -> small_flower_pot_default_sand;
                };
                case RED_SAND -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_red_sand;
                    case VARIANT_1 -> small_flower_pot_variant_1_red_sand;
                    case VARIANT_2 -> small_flower_pot_variant_2_red_sand;
                    default -> small_flower_pot_default_red_sand;
                };
                case MYCELIUM -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_mycelium;
                    case VARIANT_1 -> small_flower_pot_variant_1_mycelium;
                    case VARIANT_2 -> small_flower_pot_variant_2_mycelium;
                    default -> small_flower_pot_default_mycelium;
                };
                case MOSS -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_moss;
                    case VARIANT_1 -> small_flower_pot_variant_1_moss;
                    case VARIANT_2 -> small_flower_pot_variant_2_moss;
                    default -> small_flower_pot_default_moss;
                };
                case CLAY -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_clay;
                    case VARIANT_1 -> small_flower_pot_variant_1_clay;
                    case VARIANT_2 -> small_flower_pot_variant_2_clay;
                    default -> small_flower_pot_default_clay;
                };
            };
            return ConfiguredModel.builder()
                    .modelFile(finalModel)
                    .build();
        });
    }

    public void smallFlowerPot(Block block, ResourceLocation block_model, ResourceLocation texture_pot, ResourceLocation texture_plant_default, ResourceLocation texture_plant_variant_0, ResourceLocation texture_plant_variant_1, ResourceLocation texture_plant_variant_2) {

        ModelFile small_flower_pot_default_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/dirt")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_coarse_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_coarse_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_coarse_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_coarse_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_coarse_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/coarse_dirt")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_grass_block",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_grass_block",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_grass_block",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_grass_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_grass_block",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("flowerpots:block/grass_block_top_colored")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_podzol",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_podzol",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_podzol",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_podzol = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_podzol",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/podzol_top")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_rooted_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_rooted_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_rooted_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_rooted_dirt = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_rooted_dirt",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/rooted_dirt")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mud",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_mud",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_mud",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_mud = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_mud",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mud")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_crimson_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_crimson_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_crimson_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_crimson_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_crimson_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/crimson_nylium")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_warped_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_warped_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_warped_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_warped_nylium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_warped_nylium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/warped_nylium")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/sand")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_red_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_red_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_red_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_red_sand = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_red_sand",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/red_sand")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_mycelium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_mycelium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_mycelium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_mycelium = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_mycelium",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/mycelium_top")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_moss",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_moss",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_moss",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_moss = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_moss",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/moss_block")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        ModelFile small_flower_pot_default_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_default_clay",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_default).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_0_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_0_clay",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_0).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_1_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_1_clay",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_1).texture("particle", texture_pot);

        ModelFile small_flower_pot_variant_2_clay = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_variant_2_clay",
                        block_model).renderType("cutout")
                .texture("flower_pot", texture_pot).texture("dirt", new ResourceLocation("block/clay")).texture("plant", texture_plant_variant_2).texture("particle", texture_pot);

        smallFlowerPot(block, small_flower_pot_default_dirt, small_flower_pot_variant_0_dirt, small_flower_pot_variant_1_dirt, small_flower_pot_variant_2_dirt,
                small_flower_pot_default_coarse_dirt, small_flower_pot_variant_0_coarse_dirt, small_flower_pot_variant_1_coarse_dirt, small_flower_pot_variant_2_coarse_dirt,
                small_flower_pot_default_grass_block, small_flower_pot_variant_0_grass_block, small_flower_pot_variant_1_grass_block, small_flower_pot_variant_2_grass_block,
                small_flower_pot_default_podzol, small_flower_pot_variant_0_podzol, small_flower_pot_variant_1_podzol, small_flower_pot_variant_2_podzol,
                small_flower_pot_default_rooted_dirt, small_flower_pot_variant_0_rooted_dirt, small_flower_pot_variant_1_rooted_dirt, small_flower_pot_variant_2_rooted_dirt,
                small_flower_pot_default_mud, small_flower_pot_variant_0_mud, small_flower_pot_variant_1_mud, small_flower_pot_variant_2_mud,
                small_flower_pot_default_crimson_nylium, small_flower_pot_variant_0_crimson_nylium, small_flower_pot_variant_1_crimson_nylium, small_flower_pot_variant_2_crimson_nylium,
                small_flower_pot_default_warped_nylium, small_flower_pot_variant_0_warped_nylium, small_flower_pot_variant_1_warped_nylium, small_flower_pot_variant_2_warped_nylium,
                small_flower_pot_default_sand, small_flower_pot_variant_0_sand, small_flower_pot_variant_1_sand, small_flower_pot_variant_2_sand,
                small_flower_pot_default_red_sand, small_flower_pot_variant_0_red_sand, small_flower_pot_variant_1_red_sand, small_flower_pot_variant_2_red_sand,
                small_flower_pot_default_mycelium, small_flower_pot_variant_0_mycelium, small_flower_pot_variant_1_mycelium, small_flower_pot_variant_2_mycelium,
                small_flower_pot_default_moss, small_flower_pot_variant_0_moss, small_flower_pot_variant_1_moss, small_flower_pot_variant_2_moss,
                small_flower_pot_default_clay, small_flower_pot_variant_0_clay, small_flower_pot_variant_1_clay, small_flower_pot_variant_2_clay);
    }

    public void smallFlowerPot(Block block, ModelFile small_flower_pot_default_dirt, ModelFile small_flower_pot_variant_0_dirt, ModelFile small_flower_pot_variant_1_dirt, ModelFile small_flower_pot_variant_2_dirt,
                               ModelFile small_flower_pot_default_coarse_dirt, ModelFile small_flower_pot_variant_0_coarse_dirt, ModelFile small_flower_pot_variant_1_coarse_dirt, ModelFile small_flower_pot_variant_2_coarse_dirt,
                               ModelFile small_flower_pot_default_grass_block, ModelFile small_flower_pot_variant_0_grass_block, ModelFile small_flower_pot_variant_1_grass_block, ModelFile small_flower_pot_variant_2_grass_block,
                               ModelFile small_flower_pot_default_podzol, ModelFile small_flower_pot_variant_0_podzol, ModelFile small_flower_pot_variant_1_podzol, ModelFile small_flower_pot_variant_2_podzol,
                               ModelFile small_flower_pot_default_rooted_dirt, ModelFile small_flower_pot_variant_0_rooted_dirt, ModelFile small_flower_pot_variant_1_rooted_dirt, ModelFile small_flower_pot_variant_2_rooted_dirt,
                               ModelFile small_flower_pot_default_mud, ModelFile small_flower_pot_variant_0_mud, ModelFile small_flower_pot_variant_1_mud, ModelFile small_flower_pot_variant_2_mud,
                               ModelFile small_flower_pot_default_crimson_nylium, ModelFile small_flower_pot_variant_0_crimson_nylium, ModelFile small_flower_pot_variant_1_crimson_nylium, ModelFile small_flower_pot_variant_2_crimson_nylium,
                               ModelFile small_flower_pot_default_warped_nylium, ModelFile small_flower_pot_variant_0_warped_nylium, ModelFile small_flower_pot_variant_1_warped_nylium, ModelFile small_flower_pot_variant_2_warped_nylium,
                               ModelFile small_flower_pot_default_sand, ModelFile small_flower_pot_variant_0_sand, ModelFile small_flower_pot_variant_1_sand, ModelFile small_flower_pot_variant_2_sand,
                               ModelFile small_flower_pot_default_red_sand, ModelFile small_flower_pot_variant_0_red_sand, ModelFile small_flower_pot_variant_1_red_sand, ModelFile small_flower_pot_variant_2_red_sand,
                               ModelFile small_flower_pot_default_mycelium, ModelFile small_flower_pot_variant_0_mycelium, ModelFile small_flower_pot_variant_1_mycelium, ModelFile small_flower_pot_variant_2_mycelium,
                               ModelFile small_flower_pot_default_moss, ModelFile small_flower_pot_variant_0_moss, ModelFile small_flower_pot_variant_1_moss, ModelFile small_flower_pot_variant_2_moss,
                               ModelFile small_flower_pot_default_clay, ModelFile small_flower_pot_variant_0_clay, ModelFile small_flower_pot_variant_1_clay, ModelFile small_flower_pot_variant_2_clay) {

        getVariantBuilder(block).forAllStates(state -> {
            ModelFile finalModel = switch (state.getValue(ModBlockStateProperties.FLOWER_POT_DIRT_VARIANT)) {
                case GRASS_BLOCK -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_grass_block;
                    case VARIANT_1 -> small_flower_pot_variant_1_grass_block;
                    case VARIANT_2 -> small_flower_pot_variant_2_grass_block;
                    default -> small_flower_pot_default_grass_block;
                };
                case DIRT -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_dirt;
                    case VARIANT_1 -> small_flower_pot_variant_1_dirt;
                    case VARIANT_2 -> small_flower_pot_variant_2_dirt;
                    default -> small_flower_pot_default_dirt;
                };
                case COARSE_DIRT -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_coarse_dirt;
                    case VARIANT_1 -> small_flower_pot_variant_1_coarse_dirt;
                    case VARIANT_2 -> small_flower_pot_variant_2_coarse_dirt;
                    default -> small_flower_pot_default_coarse_dirt;
                };
                case PODZOL -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_podzol;
                    case VARIANT_1 -> small_flower_pot_variant_1_podzol;
                    case VARIANT_2 -> small_flower_pot_variant_2_podzol;
                    default -> small_flower_pot_default_podzol;
                };
                case ROOTED_DIRT -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_rooted_dirt;
                    case VARIANT_1 -> small_flower_pot_variant_1_rooted_dirt;
                    case VARIANT_2 -> small_flower_pot_variant_2_rooted_dirt;
                    default -> small_flower_pot_default_rooted_dirt;
                };
                case MUD -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_mud;
                    case VARIANT_1 -> small_flower_pot_variant_1_mud;
                    case VARIANT_2 -> small_flower_pot_variant_2_mud;
                    default -> small_flower_pot_default_mud;
                };
                case CRIMSON_NYLIUM -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_crimson_nylium;
                    case VARIANT_1 -> small_flower_pot_variant_1_crimson_nylium;
                    case VARIANT_2 -> small_flower_pot_variant_2_crimson_nylium;
                    default -> small_flower_pot_default_crimson_nylium;
                };
                case WARPED_NYLIUM -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_warped_nylium;
                    case VARIANT_1 -> small_flower_pot_variant_1_warped_nylium;
                    case VARIANT_2 -> small_flower_pot_variant_2_warped_nylium;
                    default -> small_flower_pot_default_warped_nylium;
                };
                case SAND -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_sand;
                    case VARIANT_1 -> small_flower_pot_variant_1_sand;
                    case VARIANT_2 -> small_flower_pot_variant_2_sand;
                    default -> small_flower_pot_default_sand;
                };
                case RED_SAND -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_red_sand;
                    case VARIANT_1 -> small_flower_pot_variant_1_red_sand;
                    case VARIANT_2 -> small_flower_pot_variant_2_red_sand;
                    default -> small_flower_pot_default_red_sand;
                };
                case MYCELIUM -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_mycelium;
                    case VARIANT_1 -> small_flower_pot_variant_1_mycelium;
                    case VARIANT_2 -> small_flower_pot_variant_2_mycelium;
                    default -> small_flower_pot_default_mycelium;
                };
                case MOSS -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_moss;
                    case VARIANT_1 -> small_flower_pot_variant_1_moss;
                    case VARIANT_2 -> small_flower_pot_variant_2_moss;
                    default -> small_flower_pot_default_moss;
                };
                case CLAY -> switch (state.getValue(ModBlockStateProperties.FLOWER_POT_PLANT_VARIANT)) {
                    case VARIANT_0 -> small_flower_pot_variant_0_clay;
                    case VARIANT_1 -> small_flower_pot_variant_1_clay;
                    case VARIANT_2 -> small_flower_pot_variant_2_clay;
                    default -> small_flower_pot_default_clay;
                };
            };
            return ConfiguredModel.builder()
                    .modelFile(finalModel)
                    .build();
        });
    }


}
