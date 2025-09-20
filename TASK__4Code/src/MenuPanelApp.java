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
    }
    }