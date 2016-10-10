package com.lawl281.moarglowstone.block;

import com.lawl281.moarglowstone.core.ColorEnum;
import com.lawl281.moarglowstone.core.MoarGlowstone;
import com.lawl281.moarglowstone.util.IMetaBlockName;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by lawl281 on 10/6/2016.
 */
public class GlowstoneBrick extends Block implements IMetaBlockName {

    public static final PropertyEnum COLOR = PropertyEnum.create("color", ColorEnum.class);

    public GlowstoneBrick(Material materialIn) {
        super(materialIn);

        this.setUnlocalizedName("glowstonebrick");
        this.setRegistryName("glowstoneBrick");
        this.setDefaultState(this.blockState.getBaseState().withProperty(COLOR, ColorEnum.BLACK));
        this.setCreativeTab(MoarGlowstone.glowstoneTab);
        this.setSoundType(SoundType.STONE);
        this.setHardness(0.3f);
        this.setResistance(1.5f);
        this.setLightOpacity(16);
        this.setLightLevel(1f);
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{COLOR});
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(COLOR, ColorEnum.byMetadata(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((ColorEnum) state.getValue(COLOR)).getMeta();
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((ColorEnum) state.getValue(COLOR)).getMeta();
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
        for (ColorEnum color : ColorEnum.values())
            list.add(new ItemStack(itemIn, 1, color.getMeta()));
    }

    @Override
    public String getSpecialName(ItemStack stack) {
        return ColorEnum.byMetadata(stack.getItemDamage()).getName();
    }
}
