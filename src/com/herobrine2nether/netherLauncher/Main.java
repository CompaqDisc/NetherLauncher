package com.herobrine2nether.netherLauncher;

import com.herobrine2nether.netherLauncher.fileInterfaces.FileSetup;
import com.herobrine2nether.netherLauncher.ui.Splash;

public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                Splash.splashScreen();
                FileSetup.Check();
            }
        });

    }


}
