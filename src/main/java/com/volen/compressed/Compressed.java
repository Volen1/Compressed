package com.volen.compressed;

import com.volen.compressed.block.ModBlocks;
import com.volen.compressed.client.CompressedTab;
import com.volen.compressed.proxy.CommonProxy;
import com.volen.compressed.recipe._Recipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Compressed.modId, name = Compressed.name, version = Compressed.version, acceptedMinecraftVersions = "[1.9.4]", dependencies = "required-after:Forge@[12.17.0.1960,)" )

public class Compressed {
    public static final String modId = "cpd";
    public static final String name = "Compressed";
    public static final String version = "0.0.1";


    @SidedProxy(clientSide = "com.volen.compressed.proxy.ClientProxy", serverSide = "com.volen.compressed.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static Compressed instance;
    public static final CompressedTab creativeTab = new CompressedTab();
    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        System.out.println(name + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        _Recipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }


}
