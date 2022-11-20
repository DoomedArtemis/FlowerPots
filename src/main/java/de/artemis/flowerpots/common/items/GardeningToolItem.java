package de.artemis.flowerpots.common.items;

import de.artemis.flowerpots.common.registration.ModKeyBindings;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GardeningToolItem extends TieredItem {
    public int tooltipValue;

    public GardeningToolItem(int tooltipValue, Properties properties) {
        super(Tiers.IRON, properties);
        this.tooltipValue = tooltipValue;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);

        String[] tooltips = {"tooltip.flowerpots.gardeningshovel", "tooltip.flowerpots.gardeningshears"};

        if (ModKeyBindings.TOGGLE_DESCRIPTION_KEYBIND.isDown()) {
            tooltip.add(Component.translatable(tooltips[tooltipValue]).withStyle(ChatFormatting.GRAY));
        } else {
            tooltip.add(Component.translatable(ModKeyBindings.TOGGLE_DESCRIPTION_KEYBIND.getKey().getDisplayName().getString()).withStyle(Style.EMPTY.withColor(0x66B75B)));
        }
    }
}
