package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocation(0,0);
        Dimension screeenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screeenSize);
        Panel panel = new Panel();
        frame.setContentPane(panel);
        panel.mainTimer.start();
        frame.setVisible(true);
    }
}
