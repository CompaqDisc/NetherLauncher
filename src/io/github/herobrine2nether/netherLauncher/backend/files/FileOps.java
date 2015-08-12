package io.github.herobrine2nether.netherLauncher.backend.files;

import io.github.herobrine2nether.netherLauncher.backend.Util.Logging;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileOps {
    public static void NewInstall() {
        try {
            FileUtils.forceMkdir(Assets.Dir);
            FileUtils.forceMkdir(Assets.Versions);
            Assets.RAM.createNewFile();
        } catch (IOException e) {
            Logging.Log(e.getMessage(), 3);
            e.printStackTrace();
        }
        SetDefaultSettings();
    }

    public static void RenewInstall() {
        try {
            FileUtils.copyURLToFile(Assets.VanillaUrl(), Assets.Vanilla);
        } catch (IOException e) {
            Logging.Log(e.getMessage(), 3);
            e.printStackTrace();
        }
        SetRenewingSettings();
    }

    public static void SetDefaultSettings() {
        //do one time stuff
    }

    public static void SetRenewingSettings() {
        //do repeated stuff on startup
    }

    public static void WriteSettings() {
        // Write settings to file
    }

    public static void ReadSettings() {
        // Read settings from .cfg
    }

}
