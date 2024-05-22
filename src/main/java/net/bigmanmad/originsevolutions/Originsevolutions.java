package net.bigmanmad.originsevolutions;

import net.bigmanmad.originsevolutions.item.ModItemGroups;
import net.bigmanmad.originsevolutions.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Originsevolutions implements ModInitializer {
	public static final String MOD_ID = "originsevolutions";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("origins-evolutions");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}

}