package com.lawl281.moarglowstone.registry;

import com.sun.jna.platform.win32.WinBase;
import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import org.lwjgl.Sys;

import java.util.List;

/**
 * Created by lawl281 on 9/6/2016.
 */
public class ModCrafting {
    public static void register() {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockBlackGlowstone, 1), "##", "##", '#', ModItems.blackglowstonedust);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockBlueGlowstone, 1), "##", "##", '#', ModItems.blueglowstonedust);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockBrownGlowstone, 1), "##", "##", '#', ModItems.brownglowstonedust);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockCyanGlowstone, 1), "##", "##", '#', ModItems.cyanglowstonedust);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockGrayGlowstone, 1), "##", "##", '#', ModItems.grayglowstonedust);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockGreenGlowstone, 1), "##", "##", '#', ModItems.greenglowstonedust);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockLightBlueGlowstone, 1), "##", "##", '#', ModItems.lightblueglowstonedust);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockLightGrayGlowstone, 1), "##", "##", '#', ModItems.lightgrayglowstonedust);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockLimeGlowstone, 1), "##", "##", '#', ModItems.limeglowstonedust);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockMagentaGlowstone, 1), "##", "##", '#', ModItems.magentaglowstonedust);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockOrangeGlowstone, 1), "##", "##", '#', ModItems.orangeglowstonedust);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockPinkGlowstone, 1), "##", "##", '#', ModItems.pinkglowstonedust);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockPurpleGlowstone, 1), "##", "##", '#', ModItems.purpleglowstonedust);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockRedGlowstone, 1), "##", "##", '#', ModItems.redglowstonedust);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockWhiteGlowstone, 1), "##", "##", '#', ModItems.whiteglowstonedust);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockYellowGlowstone, 1), "##", "##", '#', ModItems.yellowglowstonedust);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.blackglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 0)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.blueglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 4)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.brownglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 3)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.cyanglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 6)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.grayglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 8)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.greenglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 2)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lightblueglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 12)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lightgrayglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 7)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.limeglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 10)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.magentaglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 13)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.orangeglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 14)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pinkglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 9)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.purpleglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 5)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 1)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.whiteglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 15)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.yellowglowstonedust, 8), "QQQ", "QDQ", "QQQ", 'Q', "dustGlowstone", 'D', new ItemStack(Items.DYE, 1, 11)));

    }
}
