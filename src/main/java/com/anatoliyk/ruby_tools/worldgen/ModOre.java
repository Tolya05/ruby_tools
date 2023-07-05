package com.anatoliyk.ruby_tools.worldgen;

import com.anatoliyk.ruby_tools.RubyToolsMod;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModOre {

    private static void registerOre(String name) {
        final RegistryKey<PlacedFeature> NEW_ORE_PLACED_KEY = RegistryKey.of(
                RegistryKeys.PLACED_FEATURE,
                new Identifier(RubyToolsMod.MOD_ID, name)
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                NEW_ORE_PLACED_KEY
        );
    }

    public static void registerOres() {
        registerOre("ore_ruby_placed");
    }
}
