package GUI;
import Functions.LinkOpener;
import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {

    public MainFrame(){

        LinkOpener objLinkOpener = new LinkOpener();


        // Create panels
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(123, 154, 227));
        mainPanel.setBounds(0,0,800, 550);
        mainPanel.setLayout(null);

        // Buttons
        // Left Buttons
        ButtonsFrame gitButton = new ButtonsFrame("Download Git", "https://github.com/git-for-windows/git/releases/download/v2.40.1.windows.1/Git-2.40.1-64-bit.exe");
        gitButton.setBounds(20,20,180,40);

        ButtonsFrame vsButton = new ButtonsFrame("Download VS Code", "https://code.visualstudio.com/docs/?dv=win/VSCodeUserSetup-x64-1.78.2.exe");
        vsButton.setBounds(20, gitButton.getY()+60, 180, 40);

        ButtonsFrame noteButton = new ButtonsFrame("Download NotePad++", "https://github.com/notepad-plus-plus/notepad-plus-plus/releases/download/v8.5.3/npp.8.5.3.Installer.x64.exe");
        noteButton.setBounds(20, vsButton.getY()+60, 180, 40);

        ButtonsFrame braveButton = new ButtonsFrame("Download Brave", "https://laptop-updates.brave.com/latest/winx64/BraveBrowserSetup.exe");
        braveButton.setBounds(20, noteButton.getY()+60, 180, 40);

        ButtonsFrame discordButton = new ButtonsFrame("Download Discord", "https://discord.com/api/downloads/distributions/app/installers/latest?channel=stable&platform=win&arch=x86/DiscordSetup.exe");
        discordButton.setBounds(20, braveButton.getY()+60, 180, 40);

        ButtonsFrame jetButton = new ButtonsFrame("Download JetBrains", "https://www.jetbrains.com/fleet/download/download-thanks.html?platform=windows/jetbrains-toolbox-1.28.1.15219.exe");
        jetButton.setBounds(20, discordButton.getY()+60, 180, 40);

        ButtonsFrame chromeButton = new ButtonsFrame("Download Chrome", "https://www.google.com/chrome/thank-you.html?statcb=1&installdataindex=empty&defaultbrowser=0#/ChromeSetup.exe");
        chromeButton.setBounds(20, jetButton.getY()+60, 180, 40);

        ButtonsFrame elevenButton = new ButtonsFrame("Down. ElevenTerminal", "https://github.com/HojdaAdelin/Eleven-Terminal/releases/download/v2.2/ElevenTerminal.exe");
        elevenButton.setBounds(20, chromeButton.getY()+60, 180, 40);

        // Right buttons

        JButton sourceButton = new JButton();
        sourceButton.setBounds(590, 20, 180, 40);
        sourceButton.setText("Project Src");
        sourceButton.addActionListener(e -> {

            String src_link = "https://www.github.com/HojdaAdelin/PackagerTurbo";

            objLinkOpener.openLink(src_link);

        });
        sourceButton.setFocusable(false);
        sourceButton.setFont(new Font("Helvetica",Font.BOLD, 14));

        JButton changeButton = new JButton();
        changeButton.setBounds(590, sourceButton.getY() +60, 180, 40);
        changeButton.setText("Change log");
        changeButton.addActionListener(e -> {

            JOptionPane.showMessageDialog(this, "-Apps links" + "\n-Src link" + "\n-Change log & bugs configure");

        });
        changeButton.setFocusable(false);
        changeButton.setFont(new Font("Helvetica",Font.BOLD, 14));

        JButton reportButton = new JButton();
        reportButton.setBounds(590, changeButton.getY() +60, 180, 40);
        reportButton.setText("Bugs report");
        reportButton.addActionListener(e -> {

            String report_link = "https://github.com/HojdaAdelin/PackagerTurbo/issues";

            objLinkOpener.openLink(report_link);
        });
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
        mainPanel.add(discordButton);
        mainPanel.add(jetButton);
        mainPanel.add(chromeButton);
        mainPanel.add(elevenButton);
        mainPanel.add(sourceButton);
        mainPanel.add(changeButton);
        mainPanel.add(reportButton);

    }

}
