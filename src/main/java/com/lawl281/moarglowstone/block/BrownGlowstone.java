package com.lawl281.moarglowstone.block;

import com.lawl281.moarglowstone.MoarGlowstone;
import com.lawl281.moarglowstone.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

/**
 * Created by lawl281 on 8/30/2016.
 */
public class BrownGlowstone extends Block{

    public BrownGlowstone(Material materialIn) {
        super(materialIn, MapColor.BROWN);

        setUnlocalizedName("BlockBrownGlowstone");
        setRegistryName("BlockBrownGlowstone");
        setCreativeTab(MoarGlowstone.glowstoneTab);
        setSoundType(SoundType.GLASS);
        setHardness(0.3f);
        setResistance(1.5f);
        setLightOpacity(16);
        setLightLevel(0.9375f);

    }

    public int quantityDroppedWithBonus(int fortune, Random random) {
        return MathHelper.clamp_int(this.quantityDropped(random) + random.nextInt(fortune + 1), 1, 4);
    }

    public int quantityDropped(Random random) {
        return  2 + random.nextInt(3);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.brownglowstonedust;
    }

}
