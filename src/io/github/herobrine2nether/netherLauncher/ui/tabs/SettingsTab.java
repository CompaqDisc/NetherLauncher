package io.github.herobrine2nether.netherLauncher.ui.tabs;

import io.github.herobrine2nether.netherLauncher.ui.tabs.settings.JavaTab;

import javax.swing.*;

public class SettingsTab extends JTabbedPane {
    public SettingsTab() {
        addTab("Java", null, JavaTab, "Tweak Java Settings and RAM");
        setTabPlacement(JTabbedPane.TOP);
    }
}
