package com.herobrine2nether.netherLauncher;

import com.herobrine2nether.netherLauncher.gui.Splash;

public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                Splash.splashScreen();
            }
        });
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
