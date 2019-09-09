package com.lawl281.moarglowstone.common.init;


import com.lawl281.moarglowstone.MOARGlowstone;
import com.lawl281.moarglowstone.common.block.BaseGlowstone;
import com.lawl281.moarglowstone.common.block.ColoredGlowstone;
import net.minecraft.block.Block;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.EnumMap;

@Mod.EventBusSubscriber(modid = MOARGlowstone.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Registry {

    public static final EnumMap<DyeColor, BaseGlowstone> COLORED_GLOWSTONE = new EnumMap<>(DyeColor.class);


    static {
        for (DyeColor color : DyeColor.values()) {
            COLORED_GLOWSTONE.put(color, new ColoredGlowstone(color));
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) {
        COLORED_GLOWSTONE.values().forEach(block -> e.getRegistry().register(block));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {
        COLORED_GLOWSTONE.values().forEach(block -> e.getRegistry().register(block.asItem()));
    }
}

