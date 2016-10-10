package com.lawl281.moarglowstone.item.block;

import com.lawl281.moarglowstone.core.MoarGlowstone;
import com.lawl281.moarglowstone.util.IMetaBlockName;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by lawl281 on 9/20/2016.
 */
public class ItemMoarGlowstone extends ItemBlock {

    public ItemMoarGlowstone(Block block) {
        super(block);
        if (!(block instanceof IMetaBlockName || !(block != null)))
            throw new IllegalArgumentException(String.format("The given block, %s" + ", is not an instance of IMetaBlockName.", block.getUnlocalizedName()));
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
        this.setCreativeTab(MoarGlowstone.glowstoneTab);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName(stack) + "." + ((IMetaBlockName)this.block).getSpecialName(stack);
    }
}
