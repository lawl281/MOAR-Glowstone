package com.lawl281.moarglowstone.item;

import com.lawl281.moarglowstone.MoarGlowstone;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by lawl281 on 9/6/2016.
 */
public class ItemColorGlowstone extends Item {

    public ItemColorGlowstone(){
        super();
        this.setHasSubtypes(true);
        this.setCreativeTab(MoarGlowstone.glowstoneTab);
        this.setUnlocalizedName("");
    }

    public String getUnlocalizedName(ItemStack stack){
        String name = super.getUnlocalizedName() + EnumColorGlowstone.byMetadata(stack.getItemDamage()).getName();
        return name;
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tabs, List list){
        for(int i = 0; i < EnumColorGlowstone.values().length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

}
