package com.company;

import javax.swing.*;
import java.awt.*;

public class Background {

    Image img = new ImageIcon("image/background.jpg").getImage();



    public void draw(Graphics2D g){
        g.drawImage(img, (int)0, (int)0,null);
    }
}
