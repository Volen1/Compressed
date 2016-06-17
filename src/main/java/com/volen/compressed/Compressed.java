package com.volen.compressed;

import com.volen.compressed.block.ModBlocks;
import com.volen.compressed.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Compressed.modId, name = Compressed.name, version = Compressed.version, acceptedMinecraftVersions = "[1.9.4]", dependencies = "required-after:Forge@[12.17.0.1960,)" )

public class Compressed {
    public static final String modId = "cpm";
    public static final String name = "Compressed";
    public static final String version = "0.0.1";

    @SidedProxy(clientSide = "com.volen.compressed.proxy.ClientProxy", serverSide = "com.volen.compressed.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static Compressed instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        System.out.println(name + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }


}
