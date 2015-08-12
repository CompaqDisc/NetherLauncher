package io.github.herobrine2nether.netherLauncher.backend.files;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Assets {
    public static File Dir = new File("./NetherLauncher");
    public static File Config = new File(Dir + "/Settings.cfg");
    public static File RAM = new File(Dir + "/RAM.cfg");
    public static String ConfigPath = Config.toString();
    public static File Versions = new File(Dir + "/Versions");
    public static File Vanilla = new File(Versions + "/Versions.json");
    public static File Forge = new File(Versions + "/Forge.json");
    public static File LiteLoader = new File(Versions + "/LiteLoader.json");
    public static File ModPacks = new File(Versions + "/ModPacks.json");
    public static File Profiles = new File(Dir + "/Profiles");
    public static File InstalledProfiles = new File(Profiles + "/Profiles.json");

    public static URL VanillaUrl() {
        URL vanillaVersionsJson = null;
        try {
            vanillaVersionsJson = new URL("http://s3.amazonaws.com/Minecraft.Download/versions/versions.json");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return vanillaVersionsJson;
    }
}
