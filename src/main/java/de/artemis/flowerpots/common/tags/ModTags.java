package de.artemis.flowerpots.common.tags;

import de.artemis.flowerpots.FlowerPots;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;

public class ModTags {

    public static class Item {
        public static final TagKey<net.minecraft.world.item.Item> MAY_APPLIE_ON_FLOWER_POT = tag("may_applie_on_flower_pot");

        private static TagKey<net.minecraft.world.item.Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(FlowerPots.MODID, name));
        }

        private static TagKey<net.minecraft.world.item.Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
