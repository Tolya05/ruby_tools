package com.anatoliyk.ruby_tools.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RubyMaterial implements ToolMaterial {

    public static final RubyMaterial INSTANCE = new RubyMaterial();
    @Override
    public int getDurability() {

        return 3500;
    }

    @Override
    public float getMiningSpeedMultiplier() {

        return 6.7F;
    }

    @Override
    public float getAttackDamage() {

        return 3.5F;
    }

    @Override
    public int getMiningLevel() {

        return 3;
    }

    @Override
    public int getEnchantability() {

        return 35;
    }

    @Override
    public Ingredient getRepairIngredient() {

        return Ingredient.ofItems(ModItem.Ruby);
    }
}
