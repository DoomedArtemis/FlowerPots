package de.artemis.flowerpots.common.util;

import de.artemis.flowerpots.common.registration.Registration;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;

public class FlowerPotUtil {

    public static ArrayList<Block> getBlocks(String type) {
        ArrayList<Block> blocks = new ArrayList<>();

        Registration.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            if (block.getName().getString().contains(type)) {
                blocks.add(block);
            }
        });
        return blocks;
    }

}
