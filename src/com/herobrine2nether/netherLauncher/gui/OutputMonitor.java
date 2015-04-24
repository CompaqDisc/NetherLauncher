package com.herobrine2nether.netherLauncher.gui;

import com.herobrine2nether.netherLauncher.osSpecific.FileSystem;

import java.io.File;
import java.io.IOError;

public class OutputMonitor {
    static File assetsDir = new File(FileSystem.osSlash() + ".NetherLauncher");
    public static void Console() {
        if (!assetsDir.exists()) {
            initialSetup();
        } else {
            loadAll();
        }
    }

    public static void initialSetup() {
        try{
            assetsDir.mkdirs();
        } catch (IOError e) {
            e.printStackTrace();
        }
    }

    public static void loadAll() {

    }
}
