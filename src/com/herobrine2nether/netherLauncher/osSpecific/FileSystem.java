package com.herobrine2nether.netherLauncher.osSpecific;

import static com.sun.javafx.PlatformUtil.isWindows;

/**
 * Created by Owner on 4/23/2015.
 */
public class FileSystem {
    /**
     * Os slash.
     *
     * @return the string
     */
    public static String osSlash() {
        if (isWindows()) {
            return "\\";
        } else {
            return "/";
        }
    }

    /**
     * Os delimiter.
     *
     * @return the string
     */
    public static String osDelimiter() {
        if (isWindows()) {
            return ";";
        } else {
            return ":";
        }
    }
}
