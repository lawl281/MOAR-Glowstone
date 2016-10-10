package com.lawl281.moarglowstone.util;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by WildWolf on 28/06/2016.
 */
public class BlockAndItemHelper {

    private static String modid = Reference.Mod.MODID;

    /**
     * for rendering blocks
     *
     * @param block    the block that you want rendered
     * @param metadata metadata of the block if it has one else set 0
     * @param file the model you want
     */
    public void renderBlock(Block block, int metadata, String file) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, metadata, new ModelResourceLocation(Reference.Mod.MODID + file, "inventory"));
    }

    /**
     * for rendering items
     *
     * @param item     the item that you want rendered
     * @param metadata metadata of the block if it has one else set 0
     * @param file the model you want
     */
    public void renderItem(Item item, int metadata, String file) {
        ModelBakery.registerItemVariants(item, new ModelResourceLocation(Reference.Mod.MODID + file, "inventory"));
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(Reference.Mod.MODID + file, "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, metadata, new ModelResourceLocation(Reference.Mod.MODID + file, "inventory"));
    }

    /**
     * for registering blocks
     *
     * @param block the block that you want registered
     * @param name  the unlocalized and registry name for the block
     */
    public void registerBlock(Block block, String name) {
        block.setRegistryName(name);
        block.setUnlocalizedName(name);
        GameRegistry.register(block);
    }

    /**
     * for registering blocks that has a registry name
     *
     * @param block the block that you want registered
     */
    public void registerBlock(Block block) {
        GameRegistry.register(block);
    }

    public void registerIBlock(ItemBlock itemBlock, String name) {
        itemBlock.setRegistryName(name);
        itemBlock.setUnlocalizedName(name);
        GameRegistry.register(itemBlock);
    }

    /**
     * for registering items
     *
     * @param item the item that you want registered
     * @param name the unlocalized and registry name for the block
     */
    public void registerItem(Item item, String name) {
        item.setUnlocalizedName(name);
        item.setRegistryName(name);
        GameRegistry.register(item);
    }
    /**
     * Item Oredic
     *
     * @param string the oredic name
     * @param items what items are in the same oredic
     */
    public void registerOreDic(String string, Item... items){
        for(Item item : items){
            OreDictionary.registerOre(string, item);
        }
    }

    /**
     * Block Oredic
     *
     * @param string the oredic name
     * @param blocks what blocks are in the same oredic
     */
    public void registerOreDic(String string, Block... blocks){
        for(Block block: blocks){
            OreDictionary.registerOre(string, block);
        }
    }

    /**
     * ItemStack Oredic
     *
     * @param string the oredic name
     * @param itemStacks what itemstacks are in the same oredic
     */
    public void registerOreDic(String string, ItemStack... itemStacks){
        for (ItemStack stack: itemStacks) {
            OreDictionary.registerOre(string, stack);
        }
    }

}
