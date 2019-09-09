package com.lawl281.moarglowstone.common;

import com.lawl281.moarglowstone.common.init.Registry;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MOARGlowstoneTab extends ItemGroup {

    public static ItemGroup TAB = new MOARGlowstoneTab();

    private MOARGlowstoneTab() {
        super("tabGlowstone");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Registry.COLORED_GLOWSTONE.get(DyeColor.WHITE));
    }


}
