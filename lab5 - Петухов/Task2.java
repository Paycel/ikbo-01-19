package com.company;

import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame {

    private String address;

    public Task2(String address){
        super("Image_Task");
        this.address = address;
        startWindow();
    }

    public void startWindow(){
        ImageIcon icon = new ImageIcon(getClass().getResource(address));
        JLabel label = new JLabel(icon);
        add(label);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Task2(args[0]).setVisible(true);
    }
}
