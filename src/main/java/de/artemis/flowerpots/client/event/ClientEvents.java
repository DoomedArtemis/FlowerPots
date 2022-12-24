package de.artemis.flowerpots.client.event;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.ModKeyBindings;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.FoliageColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FlowerPots.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEvents {

    @SubscribeEvent
    public static void onBlockColorEvent(RegisterColorHandlersEvent.Item event) {

        event.getBlockColors().register((state, level, pos, tint) -> level != null && pos != null ? BiomeColors.getAverageFoliageColor(level, pos) : FoliageColor.getDefaultColor(),
                ModBlocks.SMALL_FLOWER_POT_FERN.get(), ModBlocks.SMALL_TALL_FLOWER_POT_FERN.get(), ModBlocks.LARGE_FLOWER_POT_FERN.get(), ModBlocks.LARGE_TALL_FLOWER_POT_FERN.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_FERN.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_FERN.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_FERN.get(),
                ModBlocks.SMALL_FLOWER_POT_OAK_LEAVES.get(), ModBlocks.SMALL_TALL_FLOWER_POT_OAK_LEAVES.get(), ModBlocks.LARGE_FLOWER_POT_OAK_LEAVES.get(), ModBlocks.LARGE_TALL_FLOWER_POT_OAK_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_OAK_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_OAK_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_OAK_LEAVES.get(),
                ModBlocks.SMALL_FLOWER_POT_DARK_OAK_LEAVES.get(), ModBlocks.SMALL_TALL_FLOWER_POT_DARK_OAK_LEAVES.get(), ModBlocks.LARGE_FLOWER_POT_DARK_OAK_LEAVES.get(), ModBlocks.LARGE_TALL_FLOWER_POT_DARK_OAK_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_DARK_OAK_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_DARK_OAK_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_DARK_OAK_LEAVES.get(),
                ModBlocks.SMALL_FLOWER_POT_ACACIA_LEAVES.get(), ModBlocks.SMALL_TALL_FLOWER_POT_ACACIA_LEAVES.get(), ModBlocks.LARGE_FLOWER_POT_ACACIA_LEAVES.get(), ModBlocks.LARGE_TALL_FLOWER_POT_ACACIA_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_ACACIA_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_ACACIA_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_ACACIA_LEAVES.get(),
                ModBlocks.SMALL_FLOWER_POT_JUNGLE_LEAVES.get(), ModBlocks.SMALL_TALL_FLOWER_POT_JUNGLE_LEAVES.get(), ModBlocks.LARGE_FLOWER_POT_JUNGLE_LEAVES.get(), ModBlocks.LARGE_TALL_FLOWER_POT_JUNGLE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_JUNGLE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_JUNGLE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_JUNGLE_LEAVES.get(),
                ModBlocks.SMALL_FLOWER_POT_MANGROVE_LEAVES.get(), ModBlocks.SMALL_TALL_FLOWER_POT_MANGROVE_LEAVES.get(), ModBlocks.LARGE_FLOWER_POT_MANGROVE_LEAVES.get(), ModBlocks.LARGE_TALL_FLOWER_POT_MANGROVE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_MANGROVE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_MANGROVE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_MANGROVE_LEAVES.get()

        );

        event.getBlockColors().register((state, level, pos, tint) -> level != null && pos != null ? BiomeColors.getAverageGrassColor(level, pos) : FoliageColor.getDefaultColor(),
                ModBlocks.SMALL_FLOWER_POT_GRASS.get(), ModBlocks.SMALL_TALL_FLOWER_POT_GRASS.get(), ModBlocks.LARGE_FLOWER_POT_GRASS.get(), ModBlocks.LARGE_TALL_FLOWER_POT_GRASS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_GRASS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_GRASS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_GRASS.get(),
                ModBlocks.SMALL_FLOWER_POT_TALL_GRASS.get(), ModBlocks.SMALL_TALL_FLOWER_POT_TALL_GRASS.get(), ModBlocks.LARGE_FLOWER_POT_TALL_GRASS.get(), ModBlocks.LARGE_TALL_FLOWER_POT_TALL_GRASS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_TALL_GRASS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_TALL_GRASS.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_TALL_GRASS.get(),
                ModBlocks.SMALL_FLOWER_POT_LARGE_FERN.get(), ModBlocks.SMALL_TALL_FLOWER_POT_LARGE_FERN.get(), ModBlocks.LARGE_FLOWER_POT_LARGE_FERN.get(), ModBlocks.LARGE_TALL_FLOWER_POT_LARGE_FERN.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_LARGE_FERN.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_LARGE_FERN.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_LARGE_FERN.get()
        );

        event.getBlockColors().register((state, level, pos, tint) -> FoliageColor.getEvergreenColor(),
                ModBlocks.SMALL_FLOWER_POT_SPRUCE_LEAVES.get(), ModBlocks.SMALL_TALL_FLOWER_POT_SPRUCE_LEAVES.get(), ModBlocks.LARGE_FLOWER_POT_SPRUCE_LEAVES.get(), ModBlocks.LARGE_TALL_FLOWER_POT_SPRUCE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_SPRUCE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_SPRUCE_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_SPRUCE_LEAVES.get()
        );

        event.getBlockColors().register((state, level, pos, tint) -> FoliageColor.getBirchColor(),
                ModBlocks.SMALL_FLOWER_POT_BIRCH_LEAVES.get(), ModBlocks.SMALL_TALL_FLOWER_POT_BIRCH_LEAVES.get(), ModBlocks.LARGE_FLOWER_POT_BIRCH_LEAVES.get(), ModBlocks.LARGE_TALL_FLOWER_POT_BIRCH_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN_BIRCH_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN_BIRCH_LEAVES.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN_BIRCH_LEAVES.get()
        );

    }

    @SubscribeEvent
    public static void onRegisterKeyMappingEvent(RegisterKeyMappingsEvent event) {
        event.register(ModKeyBindings.TOGGLE_DESCRIPTION_KEYBIND);
    }

}
