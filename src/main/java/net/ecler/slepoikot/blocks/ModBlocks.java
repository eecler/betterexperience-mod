package net.ecler.slepoikot.blocks;

import net.ecler.slepoikot.Slepoikot;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class ModBlocks {
    private static Item registerBlockItem(String name, Block block) {
      return Registry.register(Registries.ITEM, new Identifier(Slepoikot.MOD_ID, name),
          new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Slepoikot.LOGGER.info(Slepoikot.MOD_ID + " Registering Mod Blocks");
    }

}
