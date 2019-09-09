package com.lawl281.moarglowstone.common.block;

import com.lawl281.moarglowstone.common.MOARGlowstoneTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public abstract class BaseGlowstone extends Block {

    BaseGlowstone(DyeColor color) {
        super(Block.Properties
                .create(Material.GLASS, color)
                .lightValue(15)
                .hardnessAndResistance(0.8F));

        setReg(color);
    }

    abstract void setReg(DyeColor color);

    private GlowstoneBlockItem item;

    @Nonnull
    @Override
    public Item asItem() {
        if (item == null) {
            item = new GlowstoneBlockItem();
        }
        return item;
    }
    public class GlowstoneBlockItem extends BlockItem {
        GlowstoneBlockItem() {
            super(BaseGlowstone.this, new Item.Properties().group(MOARGlowstoneTab.TAB));
            ResourceLocation name = BaseGlowstone.this.getRegistryName();
            if (name != null) {
                setRegistryName(name);
            }
        }
    }
}

