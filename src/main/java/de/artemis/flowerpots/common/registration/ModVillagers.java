package de.artemis.flowerpots.common.registration;

import com.google.common.collect.ImmutableSet;
import de.artemis.flowerpots.FlowerPots;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.registries.RegistryObject;

public class ModVillagers {

    public static final RegistryObject<PoiType> FLORIST_POI = Registration.POI_TYPES.register("florist", () -> new PoiType(ImmutableSet.copyOf(ModBlocks.SMALL_FLOWER_POT.get().getStateDefinition().getPossibleStates()), 1, 1));
    public static final RegistryObject<VillagerProfession> FLORIST = Registration.VILLAGER_PROFESSIONS.register("florist", () -> new VillagerProfession(FlowerPots.MOD_ID + ":florist", holder -> holder.is(FLORIST_POI.getKey()), holder -> holder.is(FLORIST_POI.getKey()), ImmutableSet.of(), ImmutableSet.of(ModBlocks.SMALL_FLOWER_POT.get()), SoundEvents.VILLAGER_WORK_FARMER));

    public static void register() {
    }
}
