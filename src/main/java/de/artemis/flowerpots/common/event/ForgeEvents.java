package de.artemis.flowerpots.common.event;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.ModItems;
import de.artemis.flowerpots.common.villagers.VillagerTrade;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FlowerPots.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEvents {

    @SubscribeEvent
    public static void onWanderingTrader(WandererTradesEvent event) {
        event.getGenericTrades().add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModItems.GARDENING_SHOVEL.get()).setEmeraldPrice(2));
        event.getGenericTrades().add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModItems.GARDENING_SHEARS.get()).setEmeraldPrice(2));
        event.getGenericTrades().add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModBlocks.SMALL_FLOWER_POT.get()).setEmeraldPrice(2));
        event.getGenericTrades().add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModBlocks.SMALL_TALL_FLOWER_POT.get()).setEmeraldPrice(2));
        event.getGenericTrades().add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModBlocks.LARGE_FLOWER_POT.get()).setEmeraldPrice(2));
        event.getGenericTrades().add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModBlocks.LARGE_TALL_FLOWER_POT.get()).setEmeraldPrice(2));
        event.getGenericTrades().add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN.get()).setEmeraldPrice(2));
        event.getGenericTrades().add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN.get()).setEmeraldPrice(2));
        event.getGenericTrades().add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN.get()).setEmeraldPrice(2));
    }
}

