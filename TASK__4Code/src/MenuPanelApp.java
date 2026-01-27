import javax.swing.*;
import java.awt.*;

public class MenuPanelApp {
    public JFrame frame;
    public JPanel main;
    public CardLayout card;
    public MenuPanelApp() {
        frame = new JFrame("Swing Application with Panels & Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        JMenuBar menuBar = new JMenuBar();
        JMenu menuNavigate = new JMenu("Navigate");
        JMenuItem home = new JMenuItem("Home");
        JMenuItem profile = new JMenuItem("Profile");
        JMenuItem settings = new JMenuItem("Settings");
        menuNavigate.add(home);
        menuNavigate.add(profile);
        menuNavigate.add(settings);
        menuBar.add(menuNavigate);
        JMenu menuFile = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        menuFile.add(exitItem);
        menuBar.add(menuFile);
        frame.setJMenuBar(menuBar);
        card = new CardLayout();
        main = new JPanel(card);
    }
    }