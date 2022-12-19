package de.artemis.flowerpots;

import com.mojang.logging.LogUtils;
import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.ModItems;
import de.artemis.flowerpots.common.registration.Registration;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Collections;

@Mod(FlowerPots.MODID)
public class FlowerPots {

    public static final String MODID = "flowerpots";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final CreativeModeTab INVENTORY_TAB = new CreativeModeTab(MODID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN.get());
        }

        @Override
        public void fillItemList(@NotNull NonNullList<ItemStack> items) {
            ArrayList<Item> blockList = new ArrayList<>();

            int run = 0;

            Collections.addAll(blockList, ModItems.GARDENING_SHOVEL.get(), ModItems.GARDENING_SHEARS.get(), ModBlocks.SMALL_FLOWER_POT.get().asItem(), ModBlocks.SMALL_UNFIRED_FLOWER_POT.get().asItem(), ModBlocks.SMALL_TALL_FLOWER_POT.get().asItem(), ModBlocks.SMALL_TALL_UNFIRED_FLOWER_POT.get().asItem(), ModBlocks.LARGE_FLOWER_POT.get().asItem(), ModBlocks.LARGE_UNFIRED_FLOWER_POT.get().asItem(), ModBlocks.LARGE_TALL_FLOWER_POT.get().asItem(), ModBlocks.LARGE_TALL_UNFIRED_FLOWER_POT.get().asItem(), ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN.get().asItem().asItem(), ModBlocks.SMALL_HANGING_FLOWER_POT_GOLD_CHAIN.get().asItem(), ModBlocks.SMALL_HANGING_FLOWER_POT_COPPER_CHAIN.get().asItem());
            for (Item x : blockList) {

                items.add(run, new ItemStack(x));
                run++;
            }
        }
    };

    public FlowerPots() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        Registration.register();
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

}
