package de.artemis.flowerpots.common.event;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.client.particle.custom.GardeningShearsParticles;
import de.artemis.flowerpots.client.particle.custom.GardeningShovelParticles;
import de.artemis.flowerpots.common.registration.ModParticles;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FlowerPots.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent
    public static void registerParticleProvidersEvent(final RegisterParticleProvidersEvent event) {
        event.register(ModParticles.GARDENING_SHOVEL_PARTICLES.get(), GardeningShovelParticles.Provider::new);
        event.register(ModParticles.GARDENING_SHEARS_PARTICLES.get(), GardeningShearsParticles.Provider::new);
    }

}
