package com.lawl281.moarglowstone.core;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by lawl281 on 9/6/2016.
 */
public class ModCrafting {
    public static void register() {
        for (int i = 0; i < ColorEnum.values().length; i++) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.dusts, 8, i), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, ColorEnum.byMetadata(i).getDyeColor())));
            GameRegistry.addRecipe(new ItemStack(ModItems.coloredGlowstone, 1, i), "##", "##", '#', new ItemStack(ModItems.dusts, 1, i));
            GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneBrick, 1, i), " Q ", "QDQ", " Q ", 'D', new ItemStack(Blocks.STONEBRICK, 1, 0), 'Q', new ItemStack(ModItems.dusts, 1, i));
            GameRegistry.addRecipe(new ItemStack(ModItems.carvedGlowstoneBrick, 1, i), " Q ", "QDQ", " Q ", 'D', new ItemStack(Blocks.STONEBRICK, 1, 3), 'Q', new ItemStack(ModItems.dusts, 1, i));


        }

    }
}
