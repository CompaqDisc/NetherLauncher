package com.herobrine2nether.netherLauncher;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                gui();
            }
        });
    }

    public static void gui() {
        JFrame window = new JFrame("NetherLauncher " + Constants.VERSION);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        URL iconUrl = null;
        try {
            iconUrl = new URL("https://raw.githubusercontent.com/Herobrine2Nether/NetherLauncher/master/Head16.png");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        java.awt.Image icon = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(iconUrl);
        window.setIconImage(icon);

        Dimension size = new Dimension(576, 192);
        window.getContentPane().setPreferredSize(size);

        JLabel label = new JLabel("NetherLauncher " + Constants.VERSION + " is starting up...");
        window.getContentPane().add(label);

        window.pack();
        window.setVisible(true);
    }
}
