package de.artemis.flowerpots.client;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.registration.ModBlocks;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.FoliageColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FlowerPots.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEvents {

    @SubscribeEvent
    public static void onBlockColorEvent(RegisterColorHandlersEvent.Item event) {

        event.getBlockColors().register((state, level, pos, tint) -> level != null && pos != null ? BiomeColors.getAverageFoliageColor(level, pos) : FoliageColor.getDefaultColor(),
                ModBlocks.SMALL_FLOWER_POT.get(),
                ModBlocks.SMALL_FLOWER_POT_ALLIUM.get(), ModBlocks.SMALL_FLOWER_POT_OAK_SAPLING.get(),
                ModBlocks.SMALL_FLOWER_POT_SPRUCE_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_BIRCH_SAPLING.get(),
                ModBlocks.SMALL_FLOWER_POT_JUNGLE_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_ACACIA_SAPLING.get(),
                ModBlocks.SMALL_FLOWER_POT_DARK_OAK_SAPLING.get(), ModBlocks.SMALL_FLOWER_POT_MANGROVE_SAPLING.get(),
                ModBlocks.SMALL_FLOWER_POT_FERN.get(), ModBlocks.SMALL_FLOWER_POT_DANDELION.get(),
                ModBlocks.SMALL_FLOWER_POT_POPPY.get(), ModBlocks.SMALL_FLOWER_POT_BLUE_ORCHID.get(),
                ModBlocks.SMALL_FLOWER_POT_AZURE_BLUET.get(), ModBlocks.SMALL_FLOWER_POT_RED_TULIP.get(),
                ModBlocks.SMALL_FLOWER_POT_ORANGE_TULIP.get(), ModBlocks.SMALL_FLOWER_POT_WHITE_TULIP.get(),
                ModBlocks.SMALL_FLOWER_POT_PINK_TULIP.get(), ModBlocks.SMALL_FLOWER_POT_OXEYE_DAISY.get(),
                ModBlocks.SMALL_FLOWER_POT_CORNFLOWER.get(), ModBlocks.SMALL_FLOWER_POT_LILY_OF_THE_VALLEY.get(),
                ModBlocks.SMALL_FLOWER_POT_WITHER_ROSE.get(), ModBlocks.SMALL_FLOWER_POT_RED_MUSHROOM.get(),
                ModBlocks.SMALL_FLOWER_POT_BROWN_MUSHROOM.get(), ModBlocks.SMALL_FLOWER_POT_DEAD_BUSH.get(),
                ModBlocks.SMALL_FLOWER_POT_CACTUS.get(), ModBlocks.SMALL_FLOWER_POT_BAMBOO.get(),
                ModBlocks.SMALL_FLOWER_POT_CRIMSON_FUNGUS.get(), ModBlocks.SMALL_FLOWER_POT_WARPED_FUNGUS.get(),
                ModBlocks.SMALL_FLOWER_POT_CRIMSON_ROOTS.get(), ModBlocks.SMALL_FLOWER_POT_WARPED_ROOTS.get(),
                ModBlocks.SMALL_FLOWER_POT_AZALEA.get(), ModBlocks.SMALL_FLOWER_POT_FLOWERING_AZALEA.get());

    }

}
