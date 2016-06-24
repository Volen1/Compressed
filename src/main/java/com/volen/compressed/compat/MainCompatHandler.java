package com.volen.compressed.compat;


import com.volen.compressed.compat.top.TOPCompatibility;
import net.minecraftforge.fml.common.Loader;


public class MainCompatHandler {
    public static void registerTOP() {
        if (Loader.isModLoaded("theoneprobe")) {
            TOPCompatibility.register();
        }
    }
}
