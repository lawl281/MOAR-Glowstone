package com.lawl281.moarglowstone.proxy;

import com.lawl281.moarglowstone.registry.ModBlocks;
import com.lawl281.moarglowstone.registry.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by lawl281 on 8/29/2016.
 */
public class ClientProxy extends CommonProxy{

    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void Init(FMLInitializationEvent event) {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
