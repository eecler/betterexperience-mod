package net.ecler.slepoikot.items;

import net.ecler.slepoikot.Slepoikot;
import net.ecler.slepoikot.blocks.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemsGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Slepoikot.MOD_ID, "iron_stick"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.slepoikot"))
                    .icon(() -> new ItemStack(ModItems.IRONSTICK)).entries((displayContext, entries) -> {
                    // Add Items Here
                        entries.add(ModItems.IRONSTICK);
                        entries.add(ModItems.OREFINDER);

                        entries.add(ModBlocks.OAKLOG_IRONFRAME);
                        entries.add(ModBlocks.OAKPLANKS_IRONFRAME);

                        // Dyeable Stone
                        entries.add(ModBlocks.STONE_BLACK);
                        entries.add(ModBlocks.STONE_BLUE);
                        entries.add(ModBlocks.STONE_BROWN);
                        entries.add(ModBlocks.STONE_WHITE);
                        entries.add(ModBlocks.STONE_LIGHTBLUE);
                        entries.add(ModBlocks.STONE_LIGHTGRAY);
                        entries.add(ModBlocks.STONE_PURPLE);
                        entries.add(ModBlocks.STONE_PINK);
                        entries.add(ModBlocks.STONE_GREEN);
                        entries.add(ModBlocks.STONE_ORANGE);
                        entries.add(ModBlocks.STONE_YELLOW);
                        entries.add(ModBlocks.STONE_RED);
                        entries.add(ModBlocks.STONE_CYAN);
                    }).build());


    public static void registerItemGroups() {
        Slepoikot.LOGGER.info("Registering Item Groups for " + Slepoikot.MOD_ID);
    }
}