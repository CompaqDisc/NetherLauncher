package io.github.herobrine2nether.netherLauncher.ui.tabs;

import io.github.herobrine2nether.netherLauncher.Constants;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;

import javax.swing.*;

public class NewsTab extends JPanel {
    JFXPanel NewsBrowser = new JFXPanel();

    public NewsTab() {
        add(NewsBrowser);
        NewsFX();
    }

    public void NewsFX() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                WebView SiteLoader = new WebView();
                SiteLoader.getEngine().load(Constants.NEWS_URL);
                BorderPane Border = new BorderPane();
                Border.setCenter(SiteLoader);
                Scene View = new Scene(Border, getWidth(), getHeight());
                NewsBrowser.setScene(View);
            }
        });
    }
}
