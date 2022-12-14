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
                ModBlocks.SMALL_FLOWER_POT_FERN.get(), ModBlocks.SMALL_TALL_FLOWER_POT_FERN.get(), ModBlocks.LARGE_FLOWER_POT_FERN.get(), ModBlocks.LARGE_TALL_FLOWER_POT_FERN.get(), ModBlocks.SMALL_HANGING_FLOWER_POT_FERN.get());
    }

    @SubscribeEvent
    public static void onRegisterKeyMappingEvent(RegisterKeyMappingsEvent event) {
        event.register(ModKeyBindings.TOGGLE_DESCRIPTION_KEYBIND);
    }

}
