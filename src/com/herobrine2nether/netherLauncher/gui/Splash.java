package com.herobrine2nether.netherLauncher.gui;

import com.herobrine2nether.netherLauncher.Constants;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Owner on 4/23/2015.
 */
public class Splash {
    public static void splashScreen() {
        // Splash Properties
        JFrame window = new JFrame("NetherLauncher " + Constants.VERSION);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setUndecorated(true);

        Dimension size = new Dimension(Constants.SPLASH_WIDTH, Constants.SPLASH_HEIGHT);
        window.getContentPane().setPreferredSize(size);

        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        window.setLocation(screenWidth/2, screenHeight/2);

        URL iconUrl = null;
        try {
            iconUrl = new URL(Constants.APP_ICON_URL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        java.awt.Image icon = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(iconUrl);
        window.setIconImage(icon);

        URL splashUrl = null;
        try {
            splashUrl = new URL(Constants.APP_SPLASH_LOGO_URL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ImageIcon splashImage = new ImageIcon(splashUrl);

        JLabel splashImageLabel = new JLabel(splashImage);
        window.getContentPane().add(splashImageLabel);

        window.pack();
        window.setVisible(true);
    }
}
