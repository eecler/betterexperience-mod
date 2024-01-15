package net.ecler.slepoikot.items;

import net.ecler.slepoikot.Slepoikot;
import net.ecler.slepoikot.items.custom.OreFinder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.item.Item;
public class ModItems {
    public static final Item IRONSTICK = registerItem("iron_stick", new Item(new FabricItemSettings()));
    public static final Item OREFINDER = registerItem("ore_finder",
            new OreFinder(new FabricItemSettings().maxDamage(64)));

    // Item register
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Slepoikot.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Slepoikot.LOGGER.info(Slepoikot.MOD_ID + " Registering Mod Items");
    }

}
