package com.lawl281.moarglowstone.item;

import com.lawl281.moarglowstone.core.ColorEnum;
import com.lawl281.moarglowstone.core.MoarGlowstone;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.List;

/**
 * Created by lawl281 on 9/23/2016.
 */
public class Dusts extends Item {

    public Dusts() {
        super();
        this.setHasSubtypes(true);
        this.setCreativeTab(MoarGlowstone.glowstoneTab);
    }

    public String getUnlocalizedName(ItemStack stack) {
        String out = super.getUnlocalizedName() + "." + ColorEnum.byMetadata(stack.getItemDamage()).getName();
        return out;
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        for(int i = 0; i < ColorEnum.values().length; i++) {
            list.add(new ItemStack(item, 1, i));
        }

    }
}
