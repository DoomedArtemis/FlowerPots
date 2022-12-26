package de.artemis.flowerpots.common.registration;

import de.artemis.flowerpots.FlowerPots;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;

public class ModTags {

    public static class Item {
        public static final TagKey<net.minecraft.world.item.Item> MAY_APPLY_ON_FLOWER_POT = tag("may_apply_on_flower_pot");

        private static TagKey<net.minecraft.world.item.Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(FlowerPots.MOD_ID, name));
        }

        private static TagKey<net.minecraft.world.item.Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Block {
        public static final TagKey<net.minecraft.world.level.block.Block> EMPTY_FLOWER_POT = tag("empty_flower_pot");
        public static final TagKey<net.minecraft.world.level.block.Block> UNFIRED_FLOWER_POT = tag("unfired_flower_pot");
        public static final TagKey<net.minecraft.world.level.block.Block> FLOWER_POT_NO_VARIANTS = tag("flower_pot_no_variants");

        private static TagKey<net.minecraft.world.level.block.Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(FlowerPots.MOD_ID, name));
        }

        private static TagKey<net.minecraft.world.level.block.Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
