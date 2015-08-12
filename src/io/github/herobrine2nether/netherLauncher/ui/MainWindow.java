package io.github.herobrine2nether.netherLauncher.ui;

import io.github.herobrine2nether.netherLauncher.Constants;
import io.github.herobrine2nether.netherLauncher.Main;
import io.github.herobrine2nether.netherLauncher.backend.Util.Sys;
import io.github.herobrine2nether.netherLauncher.ui.tabs.NewsTab;
import io.github.herobrine2nether.netherLauncher.ui.tabs.SettingsTab;

import javax.swing.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.net.URL;

public class MainWindow extends JFrame {

    NewsTab NT = new NewsTab();
    JTabbedPane SettingsTab = new SettingsTab();
    JPanel ProfilesTab = new JPanel();
    JPanel VersionsTabs = new JPanel();
    JTabbedPane Tabs = new JTabbedPane();

    public MainWindow() {
        setTitle("NetherLauncher " + Constants.VERSION);
        URL iconURL = Main.class.getResource("/io/github/herobrine2nether/netherLauncher/assets/AppIcon.png");
        ImageIcon iconIMG = new ImageIcon(iconURL);
        setIconImage(iconIMG.getImage());
        Tabs();
        addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                NT.NewsFX();
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                //NT.NewsFX();
            }

            @Override
            public void componentShown(ComponentEvent e) {
                NT.NewsFX();
            }

            @Override
            public void componentHidden(ComponentEvent e) {
                NT.NewsFX();
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Sys.GetScreenWorkingWidth() / 2, Sys.GetScreenWorkingHeight() / 2);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void Tabs() {
        getContentPane().add(Tabs);

        JLabel SettingsLbl = new JLabel();
        SettingsLbl.setText("SETTINGS");
        SettingsTab.add(SettingsLbl);

        JLabel ProfilesLbl = new JLabel();
        ProfilesLbl.setText("PROFILES");
        ProfilesTab.add(ProfilesLbl);

        JLabel VersionsLbl = new JLabel();
        VersionsLbl.setText("VERSIONS");
        VersionsTabs.add(VersionsLbl);

        String PART_A = Constants.TABS_PART_A;
        String PART_B = Constants.TABS_PART_B;
        Tabs.addTab(PART_A + "News" + PART_B, null, NT, "Updates and Notifications");
        Tabs.addTab(PART_A + "Settings" + PART_B, null, SettingsTab, "Launcher Global Settings");
        Tabs.addTab(PART_A + "Versions" + PART_B, null, VersionsTabs, "Add new Profiles Here");
        Tabs.addTab(PART_A + "Profiles" + PART_B, null, ProfilesTab, "Installed Profiles");
        Tabs.setTabPlacement(JTabbedPane.RIGHT);
    }
}
