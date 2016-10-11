package com.lawl281.moarglowstone.core;

import com.lawl281.moarglowstone.item.Dusts;
import com.lawl281.moarglowstone.item.block.ItemMoarGlowstone;
import com.lawl281.moarglowstone.util.BlockAndItemHelper;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by lawl281 on 8/29/2016.
 */
public class ModItems extends Item{

    public static BlockAndItemHelper helper = new BlockAndItemHelper();

    public static Item dusts = new Dusts();
    public static ItemBlock coloredGlowstone;
    public static ItemBlock glowstoneBrick;
    public static ItemBlock carvedGlowstoneBrick;
    public static ItemBlock glowstoneTorch;



    public static void preInit() {
        coloredGlowstone = new ItemMoarGlowstone(ModBlocks.coloredGlowstone);
        glowstoneBrick = new ItemMoarGlowstone(ModBlocks.glowstoneBrick);
        carvedGlowstoneBrick = new ItemMoarGlowstone(ModBlocks.carvedGlowstoneBrick);
        glowstoneTorch = new ItemMoarGlowstone(ModBlocks.glowstoneTorch);
        registerItems();
    }

    public static void registerItems() {
        helper.registerItem(dusts, "dusts");
        helper.registerIBlock(coloredGlowstone, "coloredGlowstone");
        helper.registerIBlock(glowstoneBrick, "glowstoneBrick");
        helper.registerIBlock(carvedGlowstoneBrick, "carvedGlowstoneBrick");
        helper.registerIBlock(glowstoneTorch, "glowstoneTorch");


    }

    public static void registerRenders() {
        for (int i = 0; i < ColorEnum.values().length; i++) {
            helper.renderItem(dusts, i, ":dusts/" + ColorEnum.byMetadata(i).getName() + "Dust");
            helper.renderItem(coloredGlowstone, i, ":blocks/" + ColorEnum.byMetadata(i).getName() + "Glowstone");
            helper.renderItem(glowstoneBrick, i, ":bricks/" + ColorEnum.byMetadata(i).getName() + "GlowstoneBrick");
            helper.renderItem(carvedGlowstoneBrick, i, ":carved/" + ColorEnum.byMetadata(i).getName() + "CarvedGlowstoneBrick");
            helper.renderItem(glowstoneTorch, i, ":torch/" + ColorEnum.values()[i].getName() + "Torch");
            helper.registerOreDic("dustGlowstone", new ItemStack(dusts, 1, i));
        }
    }

}
