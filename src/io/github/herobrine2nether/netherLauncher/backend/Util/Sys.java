package io.github.herobrine2nether.netherLauncher.backend.Util;

import java.lang.management.ManagementFactory;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Sys {
    public static String getTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }

    public static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }

    public static double getRAM() {
        long RAM_Bytes = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize();
        long RAM_KBytes = RAM_Bytes / 1024;
        double RAM_MBytes = RAM_KBytes / 1024;
        double RAM_GBytes = RAM_MBytes / 1024;
        double Gigs_RAM = Math.round(RAM_GBytes, 2);
        return Gigs_RAM;
    }

    public static int getArch() {
        String nixArch = System.getenv("PROCESSOR_ARCHITECTURE");
        String winArch = System.getenv("PROCESSOR_ARCHITEW6432");

        int Arch = nixArch.endsWith("64") || winArch != null && winArch.endsWith("64") ? 64 : 32;
        return Arch;
    }

    public static String getOSName() {
        return System.getProperty("os.name");
    }

    public static String getOSVer() {
        return System.getProperty("os.version");
    }

    public static int GetScreenWorkingWidth() {
        return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
    }

    public static int GetScreenWorkingHeight() {
        return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
    }
}
