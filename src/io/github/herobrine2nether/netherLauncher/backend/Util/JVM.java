package io.github.herobrine2nether.netherLauncher.backend.Util;

public class JVM {
    public static String getJVMVer() {
        return System.getProperty("java.version");
    }

    public static String getJVMAuthor() {
        return System.getProperty("java.vendor");
    }

    public static String getJVMPath() {
        return  System.getProperty("java.home");
    }

    public static boolean wrongJVM() {
        boolean isWrong = false;
        if (Sys.getArch() == 64 && getJVM() == 32) {
            isWrong = true;
        }
        return isWrong;
    }

    public static int getJVM() {
        String ArchS = System.getProperty("sun.arch.data.model");
        int Arch = 32;
        if (ArchS.contains("64")) {
            Arch = 64;
        }
        return Arch;
    }
}
