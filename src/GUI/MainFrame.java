package GUI;
import Functions.AppsDownload;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MainFrame extends JFrame {

    public MainFrame() {

        AppsDownload objAppDownload = new AppsDownload();

        // Create panels
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(123, 154, 227));
        mainPanel.setBounds(0,0,800, 550);
        mainPanel.setLayout(null);

        // Buttons
        // Left Buttons
        JButton gitButton = new JButton();
        gitButton.setBounds(20, 20, 180, 40);
        gitButton.setText("Download Git");
        gitButton.addActionListener(e -> {

            String fileUrl = "https://github.com/git-for-windows/git/releases/download/v2.40.1.windows.1/Git-2.40.1-64-bit.exe";
            String downloadDirectory = "C:/Packager";

            try {
                objAppDownload.downloadFile(fileUrl, downloadDirectory);
                JOptionPane.showMessageDialog(this, "GIT installer was successfully installed\nDirectory: C:\\Packager");
            } catch (IOException ex) {
                System.out.println("An error occurred while downloading the file: " + ex.getMessage());
            }


        });
        gitButton.setFocusable(false);
        gitButton.setFont(new Font("Helvetica",Font.BOLD, 14));

        JButton vsButton = new JButton();
        vsButton.setBounds(20, gitButton.getY()+60, 180, 40);
        vsButton.setText("Download VS Code");
        vsButton.addActionListener(e -> {

            String fileUrl = "https://code.visualstudio.com/docs/?dv=win/VSCodeUserSetup-x64-1.78.2.exe";
            String downloadDirectory = "C:/Packager";

            try {
                objAppDownload.downloadFile(fileUrl, downloadDirectory);
                JOptionPane.showMessageDialog(this, "VS Code installer was successfully installed\nDirectory: C:\\Packager");
            } catch (IOException ex) {
                System.out.println("An error occurred while downloading the file: " + ex.getMessage());
            }
        });
        vsButton.setFocusable(false);
        vsButton.setFont(new Font("Helvetica",Font.BOLD, 14));

        JButton noteButton = new JButton();
        noteButton.setBounds(20, vsButton.getY()+60, 180, 40);
        noteButton.setText("Download NotePad++");
        noteButton.addActionListener(e -> {

            String fileUrl = "https://github.com/notepad-plus-plus/notepad-plus-plus/releases/download/v8.5.3/npp.8.5.3.Installer.x64.exe";
            String downloadDirectory = "C:/Packager";

            try {
                objAppDownload.downloadFile(fileUrl, downloadDirectory);
                JOptionPane.showMessageDialog(this, "NotePad++ installer was successfully installed\nDirectory: C:\\Packager");
            } catch (IOException ex) {
                System.out.println("An error occurred while downloading the file: " + ex.getMessage());
            }

        });
        noteButton.setFocusable(false);
        noteButton.setFont(new Font("Helvetica",Font.BOLD, 14));

        JButton braveButton = new JButton();
        braveButton.setBounds(20, noteButton.getY()+60, 180, 40);
        braveButton.setText("Download Brave");
        braveButton.addActionListener(e -> {

            String fileUrl = "https://laptop-updates.brave.com/download/BRV010/BraveBrowserSetup-BRV010.exe";
            String downloadDirectory = "C:/Packager";

            try {
                objAppDownload.downloadFile(fileUrl, downloadDirectory);
                JOptionPane.showMessageDialog(this, "NotePad++ installer was successfully installed\nDirectory: C:\\Packager");
            } catch (IOException ex) {
                System.out.println("An error occurred while downloading the file: " + ex.getMessage());
            }

        });

        braveButton.setFocusable(false);
        braveButton.setFont(new Font("Helvetica",Font.BOLD, 14));

        JButton notionButton = new JButton();
        notionButton.setBounds(20, braveButton.getY()+60, 180, 40);
        notionButton.setText("Download Notion");
        notionButton.setFocusable(false);
        notionButton.setFont(new Font("Helvetica",Font.BOLD, 14));

        JButton jetButton = new JButton();
        jetButton.setBounds(20, notionButton.getY()+60, 180, 40);
        jetButton.setText("Download JetBrains");
        jetButton.setFocusable(false);
        jetButton.setFont(new Font("Helvetica",Font.BOLD, 14));

        JButton chromeButton = new JButton();
        chromeButton.setBounds(20, jetButton.getY()+60, 180, 40);
        chromeButton.setText("Download Chrome");
        chromeButton.setFocusable(false);
        chromeButton.setFont(new Font("Helvetica",Font.BOLD, 14));

        JButton elevenButton = new JButton();
        elevenButton.setBounds(20, chromeButton.getY()+60, 180, 40);
        elevenButton.setText("Download Eleven-Terminal");
        elevenButton.setFocusable(false);
        elevenButton.setFont(new Font("Helvetica",Font.BOLD, 10));

        // Right buttons

        JButton sourceButton = new JButton();
        sourceButton.setBounds(590, 20, 180, 40);
        sourceButton.setText("Project Src");
        sourceButton.setFocusable(false);
        sourceButton.setFont(new Font("Helvetica",Font.BOLD, 14));

        JButton changeButton = new JButton();
        changeButton.setBounds(590, sourceButton.getY() +60, 180, 40);
        changeButton.setText("Change log");
        changeButton.setFocusable(false);
        changeButton.setFont(new Font("Helvetica",Font.BOLD, 14));

        JButton reportButton = new JButton();
        reportButton.setBounds(590, changeButton.getY() +60, 180, 40);
        reportButton.setText("Bugs report");
        reportButton.setFocusable(false);
        reportButton.setFont(new Font("Helvetica",Font.BOLD, 14));


        ImageIcon frameIcon = new ImageIcon("assets/ico.png");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 550);
        this.setTitle("Packager Turbo");
        this.setResizable(false);
        this.setIconImage(frameIcon.getImage());
        this.getContentPane().setBackground(new Color(145, 148, 170));
        this.setVisible(true);
        this.add(mainPanel);
        mainPanel.add(gitButton);
        mainPanel.add(vsButton);
        mainPanel.add(noteButton);
        mainPanel.add(braveButton);
        mainPanel.add(notionButton);
        mainPanel.add(jetButton);
        mainPanel.add(chromeButton);
        mainPanel.add(elevenButton);
        mainPanel.add(sourceButton);
        mainPanel.add(changeButton);
        mainPanel.add(reportButton);

    }

}
