package io.github.herobrine2nether.netherLauncher.backend.Util;

public class Logging {
    public static void Log(String msg, int level) {
        String MSG_Prefix;
        switch (level) {
            case 0: // General Info
                MSG_Prefix = "[" + Sys.getTime() + " INFO]: ";
                break;
            case 1: // Debug, Unused for now.
                MSG_Prefix = "[" + Sys.getTime() + " DEBUG]: ";
                break;
            case 2: // Warnings, like 32-bit JVM on 64-bit system.
                MSG_Prefix = "[" + Sys.getTime() + " WARN]: ";
                break;
            case 3: // Errors, JVM / Critical
                MSG_Prefix = "[" + Sys.getTime() + " ERROR]: ";
                break;
            default: // Other level was set
                MSG_Prefix = Sys.getTime() + " ";
                break;
        }
        System.out.println(MSG_Prefix + msg);
    }

    public static void LogProps() {
        double GB_RAM = Sys.getRAM();
        int JVM_Arch = JVM.getJVM();
        int OS_Arch = Sys.getArch();

        Log("Current time and date is " + Sys.getTime() + " on " + Sys.getDate(), 0);
        Log(GB_RAM + " GB RAM Available", 0);
        Log(OS_Arch + " bit OS", 0);
        Log(JVM_Arch + " bit JVM", 0);
        if (JVM.wrongJVM()) {
            Log("Please update to a 64 bit Java Runtime, Java runs better with a 64 bit runtime on a 64 bit Sys and OS.", 2);
            Log("You currently have a 32 bit runtime and a 64 bit OS.", 2);
        }
        Log("JVM Version " + JVM.getJVMVer() + " from " + JVM.getJVMAuthor(), 0);
        Log("Java found at: " + JVM.getJVMPath(), 0);
    }
}
