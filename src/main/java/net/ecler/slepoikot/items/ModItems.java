package net.ecler.slepoikot.items;

import net.ecler.slepoikot.Slepoikot;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.item.Item;
public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Slepoikot.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Slepoikot.LOGGER.info(Slepoikot.MOD_ID + "Registering Mod Items");
    }

}
