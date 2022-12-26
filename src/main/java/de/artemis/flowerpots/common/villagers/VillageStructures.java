package de.artemis.flowerpots.common.villagers;

import com.mojang.datafixers.util.Pair;
import de.artemis.flowerpots.FlowerPots;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;

import java.util.List;
import java.util.stream.Collectors;

public class VillageStructures {
    public static void init() {
        PlainVillagePools.bootstrap();
        SavannaVillagePools.bootstrap();
        TaigaVillagePools.bootstrap();
        DesertVillagePools.bootstrap();
        SnowyVillagePools.bootstrap();

        for (String biome : new String[]{"desert", "snowy", "plains", "savanna", "taiga"}) {
            addToPool(new ResourceLocation("village/" + biome + "/houses"), FlowerPots.MOD_ID + ":villages/florist_" + biome, 10);
        }
    }

    private static void addToPool(ResourceLocation pool, String toAdd, int weight) {
        StructureTemplatePool old = BuiltinRegistries.TEMPLATE_POOL.get(pool);
        if (old == null) {
            return;
        }
        List<StructurePoolElement> shuffled = old.getShuffledTemplates(RandomSource.createNewThreadLocalInstance());
        List<Pair<StructurePoolElement, Integer>> newPieces = shuffled.stream().map(p -> Pair.of(p, 1)).collect(Collectors.toList());
        StructurePoolElement newPiece = StructurePoolElement.legacy(toAdd).apply(StructureTemplatePool.Projection.RIGID);
        newPieces.add(Pair.of(newPiece, weight));
        Registry.register(BuiltinRegistries.TEMPLATE_POOL, pool, new StructureTemplatePool(pool, old.getName(), newPieces));
    }
}