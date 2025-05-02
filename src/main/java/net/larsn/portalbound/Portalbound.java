package net.larsn.portalbound;

import net.fabricmc.api.ModInitializer;

import net.larsn.portalbound.block.ModBlocks;
import net.larsn.portalbound.item.ModItemGroups;
import net.larsn.portalbound.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Portalbound implements ModInitializer {
	public static final String MOD_ID = "portalbound";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}