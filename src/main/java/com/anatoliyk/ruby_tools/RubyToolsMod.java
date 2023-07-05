package com.anatoliyk.ruby_tools;

import com.anatoliyk.ruby_tools.block.ModBlock;
import com.anatoliyk.ruby_tools.item.ModItem;
import com.anatoliyk.ruby_tools.item.ModItemGroup;
import com.anatoliyk.ruby_tools.worldgen.ModOre;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.registry.Registry;

public class RubyToolsMod implements ModInitializer {
    public static final String MOD_ID = "ruby-tools";

    public static final Logger LOGGER = LoggerFactory.getLogger("ruby-tools");

    @Override
    public void onInitialize() {
        ModItem.registerModItem();
        ModBlock.registerModBlocks();
        ModItemGroup.addToItemGroup();
        ModOre.registerOres();
    }
}
