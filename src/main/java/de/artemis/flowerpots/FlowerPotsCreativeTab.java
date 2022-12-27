package de.artemis.flowerpots;

import de.artemis.flowerpots.common.registration.ModBlocks;
import de.artemis.flowerpots.common.registration.Registration;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.RegistryObject;

public class FlowerPotsCreativeTab{

    @SubscribeEvent
    public static void registerCreativeTab(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(FlowerPots.getRL("creativetab"), FlowerPotsCreativeTab::populateCreativeTabBuilder);
    }

    private static void populateCreativeTabBuilder(CreativeModeTab.Builder builder) {
        builder.displayItems((set, out, unknownMagicBoolean) -> {
            Registration.ITEMS.getEntries().stream().map(RegistryObject::get).forEach(out::accept);
        });
        builder.icon(() -> new ItemStack(ModBlocks.SMALL_HANGING_FLOWER_POT_IRON_CHAIN.get()));
        builder.title(Component.translatable("flowerpots.name"));
        builder.withSearchBar();
    }

}
