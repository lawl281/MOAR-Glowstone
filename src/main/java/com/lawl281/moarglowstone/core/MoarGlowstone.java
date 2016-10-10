package com.lawl281.moarglowstone.core;


import com.lawl281.moarglowstone.util.Reference;
import com.lawl281.moarglowstone.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;


/**
 * Created by lawl281 on 8/29/2016.
 */

@Mod(modid = Reference.Mod.MODID, name = Reference.Mod.NAME, version = Reference.Mod.VERSION)
public class MoarGlowstone {

    @SidedProxy(serverSide = Reference.Mod.SERVER_PROXY_CLASS, clientSide = Reference.Mod.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    public static MoarGlowstoneTab glowstoneTab;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        glowstoneTab = new MoarGlowstoneTab(CreativeTabs.getNextID(), "glowstone_tab");
        ModBlocks.preInit();
        ModBlocks.register();
        ModItems.preInit();
        proxy.preInit(event);
    }

    @EventHandler
    public void Init (FMLInitializationEvent event) {
        proxy.Init(event);
        ModCrafting.register();
    }

    @EventHandler
    public void postInit (FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
