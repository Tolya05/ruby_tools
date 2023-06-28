package com.anatoliyk.ruby_tools.item;

import com.anatoliyk.ruby_tools.RubyToolsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
public class ModItem {

    public static final Item Ruby = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final ToolItem RubySword = registerToolItem("ruby_sword", new SwordItem(RubyMaterial.INSTANCE, 2, -0.8F, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RubyToolsMod.MOD_ID, name), item);
    }
    private static ToolItem registerToolItem(String name, ToolItem item) {
        return Registry.register(Registries.ITEM, new Identifier(RubyToolsMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, Ruby);
        addToolToItemGroup(ItemGroups.COMBAT, RubySword);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    private static void addToolToItemGroup(ItemGroup group, ToolItem item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItem() {
        RubyToolsMod.LOGGER.info(("Registering Mod Items for " + RubyToolsMod.MOD_ID));

        addItemsToItemGroup();
    }
}
