package de.artemis.flowerpots.common.registration;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.RegistryObject;

import static de.artemis.flowerpots.common.registration.Registration.PARTICLE_TYPES;

public class ModParticles {

    public static final RegistryObject<SimpleParticleType> GARDENING_SHOVEL_PARTICLES =
            PARTICLE_TYPES.register("gardening_shovel_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> GARDENING_SHEARS_PARTICLES =
            PARTICLE_TYPES.register("gardening_shears_particles", () -> new SimpleParticleType(true));

    public static void register() {
    }
}
