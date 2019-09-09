package com.lawl281.moarglowstone.common.block;

import com.lawl281.moarglowstone.MOARGlowstone;

import net.minecraft.item.DyeColor;


public class ColoredGlowstone extends BaseGlowstone {
    public ColoredGlowstone(DyeColor color) {
        super(color);
    }
    @Override
    void    setReg(DyeColor color) {
        setRegistryName(MOARGlowstone.ID, "glowstone_" + color.getName() );
    }
}
