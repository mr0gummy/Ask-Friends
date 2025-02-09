package dev.mr0gummy.ask_friends;

import dev.mr0gummy.ask_friends.block.ModBlocks;
import dev.mr0gummy.ask_friends.item.ModItemGroups;
import dev.mr0gummy.ask_friends.item.ModItems;
import dev.mr0gummy.ask_friends.misc.ModCustomTrades;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AskFriends implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("ask_friends");
	public static String MOD_ID = "ask_friends";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.



		LOGGER.info("Maybe ask your friends for some prompts it's fun to make such things and their reaction was so fun!(Initializing Ask Friends Main)");
		ModBlocks.regiterModBlock();
		ModItems.registerModItem();
		ModItemGroups.registerItemGroup();
		ModCustomTrades.registerCustomTrades();
	}
}