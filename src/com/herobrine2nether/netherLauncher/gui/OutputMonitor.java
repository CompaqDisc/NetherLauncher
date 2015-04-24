package com.herobrine2nether.netherLauncher.gui;

import com.herobrine2nether.netherLauncher.osSpecific.FileSystem;

import java.io.File;

/**
 * Created by Owner on 4/23/2015.
 */
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
        assetsDir.mkdirs();
    }

    public static void loadAll() {

    }
}
