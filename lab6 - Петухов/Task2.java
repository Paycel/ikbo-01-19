package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Task2 extends JFrame {
    private final String eventCenterTXT = "Добро пожаловать в *Center*";
    private final String eventWestTXT = "Добро пожаловать в Джидда";
    private final String eventSouthTXT = "Добро пожаловать в Абха";
    private final String eventNorthTXT = "Добро пожаловать в *North*";
    private final String eventEastTXT = "Добро пожаловать в Дахране";
    private JLabel lblCenter, lblWest, lblSouth, lblNorth, lblEast;


    public Task2(){
        initialize();
    }

    public void initialize(){
        setLayout(new BorderLayout());
        lblCenter = new JLabel(eventCenterTXT);
        lblWest = new JLabel(eventWestTXT);
        lblSouth = new JLabel(eventSouthTXT);
        lblNorth = new JLabel(eventNorthTXT);
        lblEast = new JLabel(eventEastTXT);

        lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
        lblWest.setHorizontalAlignment(SwingConstants.CENTER);
        lblSouth.setHorizontalAlignment(SwingConstants.CENTER);
        lblNorth.setHorizontalAlignment(SwingConstants.CENTER);
        lblEast.setHorizontalAlignment(SwingConstants.CENTER);

        lblCenter.setOpaque(true);
        lblCenter.setBackground(Color.cyan);
        lblNorth.setOpaque(true);
        lblNorth.setBackground(Color.lightGray);
        lblSouth.setOpaque(true);
        lblSouth.setBackground(Color.green);

        add(lblCenter, BorderLayout.CENTER);
        add(lblWest, BorderLayout.WEST);
        add(lblSouth, BorderLayout.SOUTH);
        add(lblNorth, BorderLayout.NORTH);
        add(lblEast, BorderLayout.EAST);

        setListeners();

        setSize(600, 600);
    }

    private void setListeners(){
        lblNorth.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showMessage(eventNorthTXT);
            }
        });
        lblCenter.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showMessage(eventCenterTXT);
            }
        });
        lblEast.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showMessage(eventEastTXT);
            }
        });
        lblSouth.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showMessage(eventSouthTXT);
            }
        });
        lblWest.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showMessage(eventWestTXT);
            }
        });
    }

    private void showMessage(String message){
        JOptionPane.showMessageDialog(Task2.this, message);
    }

    public static void main(String[]args)
    {
        new Task2().setVisible(true);
    }

}
