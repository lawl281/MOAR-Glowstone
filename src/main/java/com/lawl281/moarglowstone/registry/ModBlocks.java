package com.lawl281.moarglowstone.registry;


import com.lawl281.moarglowstone.Reference;
import com.lawl281.moarglowstone.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by lawl281 on 8/30/2016.
 */
public class ModBlocks {

    public static Block BlockBlackGlowstone;
    public static Block BlockBlueGlowstone;
    public static Block BlockBrownGlowstone;
    public static Block BlockCyanGlowstone;
    public static Block BlockGrayGlowstone;
    public static Block BlockGreenGlowstone;
    public static Block BlockLightBlueGlowstone;
    public static Block BlockLightGrayGlowstone;
    public static Block BlockLimeGlowstone;
    public static Block BlockMagentaGlowstone;
    public static Block BlockOrangeGlowstone;
    public static Block BlockPinkGlowstone;
    public static Block BlockPurpleGlowstone;
    public static Block BlockRedGlowstone;
    public static Block BlockWhiteGlowstone;
    public static Block BlockYellowGlowstone;


    public static void preInit() {

        BlockBlackGlowstone = new BlackGlowstone(Material.GLASS);
        BlockBlueGlowstone = new BlueGlowstone(Material.GLASS);
        BlockBrownGlowstone = new BrownGlowstone(Material.GLASS);
        BlockCyanGlowstone = new CyanGlowstone(Material.GLASS);
        BlockGrayGlowstone = new GrayGlowstone(Material.GLASS);
        BlockGreenGlowstone = new GreenGlowstone(Material.GLASS);
        BlockLightBlueGlowstone = new LightBlueGlowstone(Material.GLASS);
        BlockLightGrayGlowstone = new LightGrayGlowstone(Material.GLASS);
        BlockLimeGlowstone = new LimeGlowstone(Material.GLASS);
        BlockMagentaGlowstone = new MagentaGlowstone(Material.GLASS);
        BlockOrangeGlowstone = new OrangeGlowstone(Material.GLASS);
        BlockPinkGlowstone = new PinkGlowstone(Material.GLASS);
        BlockPurpleGlowstone = new PurpleGlowstone(Material.GLASS);
        BlockRedGlowstone = new RedGlowstone(Material.GLASS);
        BlockWhiteGlowstone = new WhiteGlowstone(Material.GLASS);
        BlockYellowGlowstone = new YellowGlowstone(Material.GLASS);



    }

    public static void register() {
        registerBlock(BlockBlackGlowstone);
        registerBlock(BlockBlueGlowstone);
        registerBlock(BlockBrownGlowstone);
        registerBlock(BlockCyanGlowstone);
        registerBlock(BlockGrayGlowstone);
        registerBlock(BlockGreenGlowstone);
        registerBlock(BlockLightBlueGlowstone);
        registerBlock(BlockLightGrayGlowstone);
        registerBlock(BlockLimeGlowstone);
        registerBlock(BlockMagentaGlowstone);
        registerBlock(BlockOrangeGlowstone);
        registerBlock(BlockPinkGlowstone);
        registerBlock(BlockPurpleGlowstone);
        registerBlock(BlockRedGlowstone);
        registerBlock(BlockWhiteGlowstone);
        registerBlock(BlockYellowGlowstone);


    }

    private static void registerBlock(Block block){
        GameRegistry.register(block);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
        OreDictionary.registerOre("glowstone", block);
    }

    public static void registerRenders() {
        registerRender(BlockBlackGlowstone);
        registerRender(BlockBlueGlowstone);
        registerRender(BlockBrownGlowstone);
        registerRender(BlockCyanGlowstone);
        registerRender(BlockGrayGlowstone);
        registerRender(BlockGreenGlowstone);
        registerRender(BlockLightBlueGlowstone);
        registerRender(BlockLightGrayGlowstone);
        registerRender(BlockLimeGlowstone);
        registerRender(BlockMagentaGlowstone);
        registerRender(BlockOrangeGlowstone);
        registerRender(BlockPinkGlowstone);
        registerRender(BlockPurpleGlowstone);
        registerRender(BlockRedGlowstone);
        registerRender(BlockWhiteGlowstone);
        registerRender(BlockYellowGlowstone);
    }

    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

    }
}
