package com.anatoliyk.ruby_tools;

import com.anatoliyk.ruby_tools.item.ModItem;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubyToolsMod implements ModInitializer {
    public static final String MOD_ID = "ruby-tools";

    public static final Logger LOGGER = LoggerFactory.getLogger("ruby-tools");

    @Override
    public void onInitialize() {
        ModItem.registerModItem();
    }
}
