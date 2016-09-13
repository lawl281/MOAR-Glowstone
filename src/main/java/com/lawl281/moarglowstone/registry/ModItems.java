package com.lawl281.moarglowstone.registry;

import com.lawl281.moarglowstone.MoarGlowstone;
import com.lawl281.moarglowstone.Reference;
import com.lawl281.moarglowstone.item.EnumColorGlowstone;
import com.lawl281.moarglowstone.item.ItemColorGlowstone;
import net.minecraft.block.BlockRedstoneComparator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import javax.security.auth.RefreshFailedException;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 * Created by lawl281 on 8/29/2016.
 */
public class ModItems extends Item{

    public static Item blackglowstonedust;
    public static Item blueglowstonedust;
    public static Item brownglowstonedust;
    public static Item cyanglowstonedust;
    public static Item grayglowstonedust;
    public static Item greenglowstonedust;
    public static Item lightblueglowstonedust;
    public static Item lightgrayglowstonedust;
    public static Item limeglowstonedust;
    public static Item magentaglowstonedust;
    public static Item orangeglowstonedust;
    public static Item pinkglowstonedust;
    public static Item purpleglowstonedust;
    public static Item redglowstonedust;
    public static Item whiteglowstonedust;
    public static Item yellowglowstonedust;
   // public static Item coloredglowstonedust = new ItemColorGlowstone();


    public static void preInit() {

        blackglowstonedust = new Item().setUnlocalizedName("black_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);
        blueglowstonedust = new Item().setUnlocalizedName("blue_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);
        brownglowstonedust = new Item().setUnlocalizedName("brown_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);
        cyanglowstonedust = new Item().setUnlocalizedName("cyan_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);
        grayglowstonedust = new Item().setUnlocalizedName("gray_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);
        greenglowstonedust = new Item().setUnlocalizedName("green_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);
        lightblueglowstonedust = new Item().setUnlocalizedName("lightblue_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);
        lightgrayglowstonedust = new Item().setUnlocalizedName("lightgray_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);
        limeglowstonedust = new Item().setUnlocalizedName("lime_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);
        magentaglowstonedust = new Item().setUnlocalizedName("magenta_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);
        orangeglowstonedust = new Item().setUnlocalizedName("orange_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);
        pinkglowstonedust = new Item().setUnlocalizedName("pink_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);
        purpleglowstonedust = new Item().setUnlocalizedName("purple_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);
        redglowstonedust = new Item().setUnlocalizedName("red_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);
        whiteglowstonedust = new Item().setUnlocalizedName("white_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);
        yellowglowstonedust = new Item().setUnlocalizedName("yellow_glowstone_dust").setCreativeTab(MoarGlowstone.glowstoneTab);



        registerItems();
    }

    public static void registerItems() {

        //GameRegistry.register(coloredglowstonedust, new ResourceLocation(Reference.Mod.MODID, "colored_glowstone_dust"));
        GameRegistry.register(blackglowstonedust, new ResourceLocation(Reference.Mod.MODID, "black_glowstone_dust"));
        GameRegistry.register(blueglowstonedust, new ResourceLocation(Reference.Mod.MODID, "blue_glowstone_dust"));
        GameRegistry.register(brownglowstonedust, new ResourceLocation(Reference.Mod.MODID, "brown_glowstone_dust"));
        GameRegistry.register(cyanglowstonedust, new ResourceLocation(Reference.Mod.MODID, "cyan_glowstone_dust"));
        GameRegistry.register(grayglowstonedust, new ResourceLocation(Reference.Mod.MODID, "gray_glowstone_dust"));
        GameRegistry.register(greenglowstonedust, new ResourceLocation(Reference.Mod.MODID, "green_glowstone_dust"));
        GameRegistry.register(lightblueglowstonedust, new ResourceLocation(Reference.Mod.MODID, "lightblue_glowstone_dust"));
        GameRegistry.register(lightgrayglowstonedust, new ResourceLocation(Reference.Mod.MODID, "lightgray_glowstone_dust"));
        GameRegistry.register(limeglowstonedust, new ResourceLocation(Reference.Mod.MODID, "lime_glowstone_dust"));
        GameRegistry.register(magentaglowstonedust, new ResourceLocation(Reference.Mod.MODID, "magenta_glowstone_dust"));
        GameRegistry.register(orangeglowstonedust, new ResourceLocation(Reference.Mod.MODID, "orange_glowstone_dust"));
        GameRegistry.register(pinkglowstonedust, new ResourceLocation(Reference.Mod.MODID, "pink_glowstone_dust"));
        GameRegistry.register(purpleglowstonedust, new ResourceLocation(Reference.Mod.MODID, "purple_glowstone_dust"));
        GameRegistry.register(redglowstonedust, new ResourceLocation(Reference.Mod.MODID, "red_glowstone_dust"));
        GameRegistry.register(whiteglowstonedust, new ResourceLocation(Reference.Mod.MODID, "white_glowstone_dust"));
        GameRegistry.register(yellowglowstonedust, new ResourceLocation(Reference.Mod.MODID, "yellow_glowstone_dust"));
        OreDictionary.registerOre("dustGlowstone", blackglowstonedust);
        OreDictionary.registerOre("dustGlowstone", blueglowstonedust);
        OreDictionary.registerOre("dustGlowstone", brownglowstonedust);
        OreDictionary.registerOre("dustGlowstone", cyanglowstonedust);
        OreDictionary.registerOre("dustGlowstone", grayglowstonedust);
        OreDictionary.registerOre("dustGlowstone", greenglowstonedust);
        OreDictionary.registerOre("dustGlowstone", lightblueglowstonedust);
        OreDictionary.registerOre("dustGlowstone", lightgrayglowstonedust);
        OreDictionary.registerOre("dustGlowstone", limeglowstonedust);
        OreDictionary.registerOre("dustGlowstone", magentaglowstonedust);
        OreDictionary.registerOre("dustGlowstone", orangeglowstonedust);
        OreDictionary.registerOre("dustGlowstone", pinkglowstonedust);
        OreDictionary.registerOre("dustGlowstone", purpleglowstonedust);
        OreDictionary.registerOre("dustGlowstone", redglowstonedust);
        OreDictionary.registerOre("dustGlowstone", whiteglowstonedust);
        OreDictionary.registerOre("dustGlowstone", yellowglowstonedust);


    }

    public static void registerRenders() {

        registerRender(blackglowstonedust);
        registerRender(blueglowstonedust);
        registerRender(brownglowstonedust);
        registerRender(cyanglowstonedust);
        registerRender(grayglowstonedust);
        registerRender(greenglowstonedust);
        registerRender(lightblueglowstonedust);
        registerRender(lightgrayglowstonedust);
        registerRender(limeglowstonedust);
        registerRender(magentaglowstonedust);
        registerRender(orangeglowstonedust);
        registerRender(pinkglowstonedust);
        registerRender(purpleglowstonedust);
        registerRender(redglowstonedust);
        registerRender(whiteglowstonedust);
        registerRender(yellowglowstonedust);

        /*for(int i = 0; i < EnumColorGlowstone.values().length; i++){
            registerRender(coloredglowstonedust, i);
        }*/

    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
