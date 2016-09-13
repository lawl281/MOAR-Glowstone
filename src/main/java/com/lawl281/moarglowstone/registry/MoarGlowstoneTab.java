package com.lawl281.moarglowstone.registry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by lawl281 on 8/29/2016.
 */
public class MoarGlowstoneTab extends CreativeTabs {

    public MoarGlowstoneTab(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.blackglowstonedust;
    }
}
