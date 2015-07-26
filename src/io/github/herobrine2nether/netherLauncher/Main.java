package io.github.herobrine2nether.netherLauncher;

import io.github.herobrine2nether.netherLauncher.backend.*;
import io.github.herobrine2nether.netherLauncher.backend.Util.Logging;
import io.github.herobrine2nether.netherLauncher.backend.Util.Sys;

public class Main {

    public static void main(String[] args) {
        Logging.Log("NetherLauncher " + Constants.VERSION + " is starting on " + Sys.getOSName() + ", v" + Sys.getOSVer() + "...", 0);
        Setup.Begin();
    }
}
