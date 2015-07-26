package io.github.herobrine2nether.netherLauncher.backend;

import io.github.herobrine2nether.netherLauncher.backend.Util.Logging;
import io.github.herobrine2nether.netherLauncher.backend.files.Assets;
import io.github.herobrine2nether.netherLauncher.backend.files.FileOps;
import io.github.herobrine2nether.netherLauncher.ui.MainWindow;

public class Setup {
    public static void Begin() {
        Logging.LogProps();
        if (!Assets.Dir.exists()) {
            NewInstall();
        } else {
            RenewInstall();
        }
    }

    public static void NewInstall() {
        FileOps.NewInstall();
        RenewInstall();
    }

    public static void RenewInstall() {
        FileOps.RenewInstall();
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainWindow MW = new MainWindow();
            }
        });
    }
}
