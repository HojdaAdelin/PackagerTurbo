package GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {

        ImageIcon frameIcon = new ImageIcon("assets/ico.png");
        this.setSize(800, 550);
        this.setTitle("Packager Turbo");
        this.setResizable(false);
        this.setIconImage(frameIcon.getImage());
        this.getContentPane().setBackground(new Color(145, 148, 170));
        this.setVisible(true);

        // Create panels
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(123, 154, 227));
        leftPanel.setBounds(0,0,this.getWidth()/2, this.getHeight());
        leftPanel.setLayout(null);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(new Color(123, 154, 227));
        rightPanel.setBounds(this.getWidth()/2, 0,leftPanel.getWidth(), this.getHeight());

        // Buttons
        JButton gitButton = new JButton();
        gitButton.setBounds(20, 20, 180, 40);
        gitButton.setText("Download Git");
        gitButton.setFocusable(false);
        gitButton.setFont(new Font("Helvetica",Font.BOLD, 14));

        JButton vsButton = new JButton();
        vsButton.setBounds(20, gitButton.getY()+60, 180, 40);
        vsButton.setText("Download VS Code");
        vsButton.setFocusable(false);
        vsButton.setFont(new Font("Helvetica",Font.BOLD, 14));

        JButton noteButton = new JButton();
        noteButton.setBounds(20, vsButton.getY()+60, 180, 40);
        noteButton.setText("Download NotePad++");
        noteButton.setFocusable(false);
        noteButton.setFont(new Font("Helvetica",Font.BOLD, 14));

        JButton braveButton = new JButton();
        braveButton.setBounds(20, noteButton.getY()+60, 180, 40);
        braveButton.setText("Download Brave");
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
        elevenButton.setFont(new Font("Helvetica",Font.BOLD, 12));
        elevenButton.setFont(new Font("Helvetica",Font.BOLD, 10));


        this.add(leftPanel);
        this.add(rightPanel);
        leftPanel.add(gitButton);
        leftPanel.add(vsButton);
        leftPanel.add(noteButton);
        leftPanel.add(braveButton);
        leftPanel.add(notionButton);
        leftPanel.add(jetButton);
        leftPanel.add(chromeButton);
        leftPanel.add(elevenButton);

    }

}
