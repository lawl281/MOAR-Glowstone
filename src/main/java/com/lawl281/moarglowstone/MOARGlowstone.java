package com.lawl281.moarglowstone;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(MOARGlowstone.ID)
@Mod.EventBusSubscriber(modid = MOARGlowstone.ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class MOARGlowstone {
    public static final String ID = "moarglowstone";

    public MOARGlowstone() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(MOARGlowstone::setup);
        MinecraftForge.EVENT_BUS.register(this);

    }

    private static void setup(final FMLCommonSetupEvent event) {

    }
}
