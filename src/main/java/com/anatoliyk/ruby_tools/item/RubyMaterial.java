package com.anatoliyk.ruby_tools.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RubyMaterial implements ToolMaterial {

    public static final RubyMaterial INSTANCE = new RubyMaterial();
    @Override
    public int getDurability() {

        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 2.5F;
    }

    @Override
    public float getAttackDamage() {

        return 3.5F;
    }

    @Override
    public int getMiningLevel() {

        return 1;
    }

    @Override
    public int getEnchantability() {

        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {

        return null;
    }
}
