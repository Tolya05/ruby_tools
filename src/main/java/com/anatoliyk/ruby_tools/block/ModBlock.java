package com.anatoliyk.ruby_tools.block;

import com.anatoliyk.ruby_tools.RubyToolsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlock {

    public static final Block Ruby_Ore = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(2, 6)));
    public static final Block Deepslate_Ruby_Ore = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COAL_ORE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(2, 6)));

    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RubyToolsMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(RubyToolsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings())
        );
    }

    public static void registerModBlocks() {
        RubyToolsMod.LOGGER.info("registering mod blocks for " + RubyToolsMod.MOD_ID);
    }
}
