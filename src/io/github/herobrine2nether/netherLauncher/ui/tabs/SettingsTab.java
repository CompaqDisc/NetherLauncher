package io.github.herobrine2nether.netherLauncher.ui.tabs;

import io.github.herobrine2nether.netherLauncher.ui.tabs.settings.AccountTab;
import io.github.herobrine2nether.netherLauncher.ui.tabs.settings.JavaTab;

import javax.swing.*;

public class SettingsTab extends JTabbedPane {
    public SettingsTab() {
        JPanel JavaTab = new JavaTab();
        JPanel AccountTab = new AccountTab();
        addTab("Java", null, JavaTab, "Tweak Java Settings and RAM");
        addTab("Account", null, AccountTab, "Log in to Minecraft here");
        setTabPlacement(JTabbedPane.TOP);
    }
}
