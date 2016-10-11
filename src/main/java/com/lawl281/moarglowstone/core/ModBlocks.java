package com.lawl281.moarglowstone.core;


import com.lawl281.moarglowstone.util.BlockAndItemHelper;
import com.lawl281.moarglowstone.util.Reference;
import com.lawl281.moarglowstone.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by lawl281 on 8/30/2016.
 */
public class ModBlocks {



    public static Block coloredGlowstone;
    public static Block glowstoneBrick;
    public static Block carvedGlowstoneBrick;
    public static Block glowstoneTorch;
    public static BlockAndItemHelper helper = new BlockAndItemHelper();


    public static void preInit() {
        coloredGlowstone =new ColoredGlowstone(Material.GLASS);
        glowstoneBrick = new GlowstoneBrick(Material.ROCK);
        carvedGlowstoneBrick = new CarvedGlowstoneBrick(Material.ROCK);
        glowstoneTorch = new GlowstoneTorch();
    }

    public static void register() {
        helper.registerBlock(coloredGlowstone);
        helper.registerBlock(glowstoneBrick);
        helper.registerBlock(glowstoneTorch);
        helper.registerBlock(carvedGlowstoneBrick);
    }

    public static void registerRenders() {

        for (int i = 0; i< ColorEnum.values().length; i++) {
            helper.renderBlock(coloredGlowstone, i, ":blocks/" + ColorEnum.values()[i].getName() + "Glowstone");
            helper.renderBlock(glowstoneBrick, i, ":bricks/" + ColorEnum.values()[i].getName() + "GlowstoneBrick");
            helper.renderBlock(carvedGlowstoneBrick, i, ":carved/" + ColorEnum.values()[i].getName() + "CarvedGlowstoneBrick");
            helper.renderBlock(glowstoneTorch, i, ":torch/" + ColorEnum.values()[i].getName() + "Torch");
            helper.registerOreDic("glowstone", new ItemStack(coloredGlowstone, 1, i));
        }
    }
}
