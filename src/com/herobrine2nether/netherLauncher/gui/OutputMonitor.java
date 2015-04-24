package com.herobrine2nether.netherLauncher.gui;

import com.herobrine2nether.netherLauncher.osSpecific.FileSystem;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOError;
import java.io.IOException;

public class OutputMonitor {
    static File assetsDir = new File("./.NetherLauncher");
    public static void Console() {
        if (!assetsDir.exists()) {
            initialSetup();
        } else {
            loadAll();
        }
    }

    public static void initialSetup() {
        try {
            FileUtils.forceMkdir(assetsDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadAll() {

    }
}
