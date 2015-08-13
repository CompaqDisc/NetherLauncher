package io.github.herobrine2nether.netherLauncher.ui.tabs.settings;

import io.github.herobrine2nether.netherLauncher.backend.Util.Logging;
import io.github.herobrine2nether.netherLauncher.backend.files.Assets;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class AccountTab extends JPanel {
    String username = "";
    String password = "";
    JTextField usernameBox = new JTextField(username);
    JTextField passwordBox = new JTextField(password);
    public AccountTab() {
        JLabel usernameLabel = new JLabel("Username");
        JLabel passwordLabel = new JLabel("Password");
        usernameBox.setColumns(16);
        passwordBox.setColumns(16);
        JButton saveBtn = new JButton("Save");
        usernameBox.setText(loadUsername());
        passwordBox.setText(loadPassword());
        add(usernameLabel);
        add(usernameBox);
        add(passwordLabel);
        add(passwordBox);
        saveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Execute when button is pressed
                save();
            }
        });
        add(saveBtn);
    }

    public void save() {
        try {
            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(Assets.Account.getPath()), "utf-8"))) {
                writer.write(usernameBox.getText() + "\r\n" + passwordBox.getText());
                Logging.Log("Saved", 0);
            }
        } catch (IOException e) {
            Logging.Log("Problem Saving Settings", 2);
            Logging.Log(e.getMessage(), 3);
            e.printStackTrace();
        }
    }

    public String loadUsername() {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(Assets.Account.getPath()));

            if ((line = br.readLine()) != null) {
                return line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return "";
    }

    public String loadPassword() {BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(Assets.Account.getPath()));

            if ((line = br.readLine()) != null) {
                if ((line = br.readLine()) != null) {
                    return line;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return "";
    }
}
