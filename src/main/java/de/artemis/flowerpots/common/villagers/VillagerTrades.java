package de.artemis.flowerpots.common.villagers;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.ModItems;
import de.artemis.flowerpots.common.registration.ModVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = FlowerPots.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class VillagerTrades {

    @SubscribeEvent
    public static void registerVillagerTrades(VillagerTradesEvent event) {
        Int2ObjectMap<List<net.minecraft.world.entity.npc.VillagerTrades.ItemListing>> trades = event.getTrades();
        if (event.getType() == ModVillagers.FLORIST.get()) {

            trades.get(1).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModBlocks.SMALL_FLOWER_POT.get()).setEmeraldPrice(2));
            trades.get(1).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.DANDELION).setEmeraldPrice(2));
            trades.get(1).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.POPPY).setEmeraldPrice(2));
            trades.get(1).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.BLUE_ORCHID).setEmeraldPrice(2));
            trades.get(1).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.ALLIUM).setEmeraldPrice(2));
            trades.get(1).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Items.BONE_MEAL).setItemAmount(4).setEmeraldPrice(1));
            trades.get(1).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModItems.GARDENING_SHEARS.get()).setEmeraldPrice(2).setMaxUses(2));
            trades.get(1).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModItems.GARDENING_SHOVEL.get()).setEmeraldPrice(2).setMaxUses(2));
            trades.get(1).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.DANDELION).setItemAmount(4).setEmeraldPrice(1));
            trades.get(1).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.POPPY).setItemAmount(4).setEmeraldPrice(1));
            trades.get(1).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.BLUE_ORCHID).setItemAmount(4).setEmeraldPrice(1));
            trades.get(1).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.ALLIUM).setItemAmount(4).setEmeraldPrice(1));

            trades.get(2).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModBlocks.SMALL_TALL_FLOWER_POT.get()).setEmeraldPrice(2));
            trades.get(2).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.AZURE_BLUET).setEmeraldPrice(2));
            trades.get(2).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.RED_TULIP).setEmeraldPrice(2));
            trades.get(2).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.ORANGE_TULIP).setEmeraldPrice(2));
            trades.get(2).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.WHITE_TULIP).setEmeraldPrice(2));
            trades.get(2).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.AZURE_BLUET).setItemAmount(4).setEmeraldPrice(1));
            trades.get(2).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.RED_TULIP).setItemAmount(4).setEmeraldPrice(1));
            trades.get(2).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.ORANGE_TULIP).setItemAmount(4).setEmeraldPrice(1));
            trades.get(2).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.WHITE_TULIP).setItemAmount(4).setEmeraldPrice(1));

            trades.get(3).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModBlocks.LARGE_FLOWER_POT.get()).setEmeraldPrice(2));
            trades.get(3).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.PINK_TULIP).setEmeraldPrice(2));
            trades.get(3).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.OXEYE_DAISY).setEmeraldPrice(2));
            trades.get(3).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.CORNFLOWER).setEmeraldPrice(2));
            trades.get(3).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.LILY_OF_THE_VALLEY).setEmeraldPrice(2));
            trades.get(3).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.PINK_TULIP).setItemAmount(4).setEmeraldPrice(1));
            trades.get(3).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.OXEYE_DAISY).setItemAmount(4).setEmeraldPrice(1));
            trades.get(3).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.CORNFLOWER).setItemAmount(4).setEmeraldPrice(1));
            trades.get(3).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.LILY_OF_THE_VALLEY).setItemAmount(4).setEmeraldPrice(1));

            trades.get(4).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModBlocks.LARGE_TALL_FLOWER_POT.get()).setEmeraldPrice(2));
            trades.get(4).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.LILAC).setEmeraldPrice(4));
            trades.get(4).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.ROSE_BUSH).setEmeraldPrice(4));
            trades.get(4).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.PEONY).setEmeraldPrice(4));
            trades.get(4).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.LILAC).setItemAmount(4).setEmeraldPrice(1));
            trades.get(4).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.ROSE_BUSH).setItemAmount(4).setEmeraldPrice(1));
            trades.get(4).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.PEONY).setItemAmount(4).setEmeraldPrice(1));

            trades.get(5).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN.get()).setEmeraldPrice(3));
            trades.get(5).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN.get()).setEmeraldPrice(3));
            trades.get(5).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN.get()).setEmeraldPrice(3));
            trades.get(5).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.AZALEA).setEmeraldPrice(2));
            trades.get(5).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.FLOWERING_AZALEA).setEmeraldPrice(2));
            trades.get(5).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.AZALEA_LEAVES).setItemAmount(4).setEmeraldPrice(2));
            trades.get(5).add(new VillagerTrade(VillagerTrade.Type.ITEM_FOR_EMERALD).setItem(Blocks.FLOWERING_AZALEA_LEAVES).setItemAmount(4).setEmeraldPrice(2));
            trades.get(5).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.AZALEA).setItemAmount(4).setEmeraldPrice(1));
            trades.get(5).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.FLOWERING_AZALEA).setItemAmount(4).setEmeraldPrice(1));
            trades.get(5).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.AZALEA_LEAVES).setItemAmount(8).setEmeraldPrice(1));
            trades.get(5).add(new VillagerTrade(VillagerTrade.Type.EMERALD_FOR_ITEM).setItem(Blocks.FLOWERING_AZALEA_LEAVES).setItemAmount(8).setEmeraldPrice(1));

        }
    }
}
