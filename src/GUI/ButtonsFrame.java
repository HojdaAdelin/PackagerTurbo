package GUI;

import Functions.AppsDownload;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class ButtonsFrame extends JButton {

    public ButtonsFrame(String names, String fileUrl) {

        AppsDownload objAppDownload = new AppsDownload();

        this.setText(names);
        this.setFocusable(false);
        this.setFont(new Font("Helvetica",Font.BOLD, 14));
        this.addActionListener(e -> {

            String downloadDirectory = "C:/Packager";

            try {
                objAppDownload.downloadFile(fileUrl, downloadDirectory);
                JOptionPane.showMessageDialog(this, "Installer was successfully installed\nDirectory: C:\\Packager");
            } catch (IOException ex) {
                System.out.println("An error occurred while downloading the file: " + ex.getMessage());
            }

        });


    }

}
