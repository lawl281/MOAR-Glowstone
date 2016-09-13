package com.lawl281.moarglowstone.block;

import com.lawl281.moarglowstone.MoarGlowstone;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Created by lawl281 on 9/6/2016.
 */
public class BlockColoredGlowstone extends Block {

    public BlockColoredGlowstone(Material blockMaterialIn, MapColor blockMapColorIn, String name) {
        super(blockMaterialIn, blockMapColorIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(MoarGlowstone.glowstoneTab);
        setSoundType(SoundType.GLASS);
        setHardness(0.3f);
        setResistance(1.5f);
        setLightOpacity(16);
        setLightLevel(0.9375f);
    }

}
