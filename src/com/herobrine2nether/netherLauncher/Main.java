package com.herobrine2nether.netherLauncher;

import com.herobrine2nether.netherLauncher.fileInterfaces.FileSetup;

public class Main {

    public static void main(String[] args) {
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                FileSetup.Check();
            }
        });

    }


}
