package net.ecler.slepoikot;

import net.ecler.slepoikot.items.ModItems;
import net.ecler.slepoikot.items.ModItemsGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slepoikot implements ModInitializer {
    public  static final String MOD_ID = "slepoikot";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemsGroups.registerItemGroups();
	}
}