package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Panel extends JPanel implements ActionListener {

    public static  int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    public static  int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;

    public static enum  STATES{
        GAME,
        MENU,
    }

    public static STATES state = STATES.GAME;

    private BufferedImage image;
    private Graphics2D g;

    Timer mainTimer = new Timer (30,this);

    Background background = new Background();

    public Panel() {
        super();
        setFocusable(true);
        requestFocus();
        image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
        g = (Graphics2D) image.getGraphics();
    }

    public void actionPerformed(ActionEvent e) {
            gameRender();
            gameDraw();
    }

    public void gameRender(){
        background.draw(g);
    }

    private  void gameDraw(){
        Graphics g2 =  this.getGraphics();
        g2.drawImage(image,0,0,null);
        g2.dispose();
    }



}
