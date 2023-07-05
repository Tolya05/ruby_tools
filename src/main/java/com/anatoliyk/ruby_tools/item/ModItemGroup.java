package com.anatoliyk.ruby_tools.item;

import com.anatoliyk.ruby_tools.block.ModBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ModItemGroup {
    public static void addToItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItem.Ruby);
            entries.add(ModItem.EmeraldDust);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(ModItem.RubyShovel);
            entries.add(ModItem.RubyAxe);
            entries.add(ModItem.RubyPickaxe);
            entries.add(ModItem.RubyHoe);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(ModItem.RubySword);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlock.Deepslate_Ruby_Ore);
            entries.add(ModBlock.Ruby_Ore);
        });
    }
}
