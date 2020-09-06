package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Task extends JFrame {
    private JPanel[] panel = new JPanel[9];
    private JButton btnMilan = new JButton("AC Milan");
    private JButton btnMadrid = new JButton("Real Madrid");
    private JTextField score, lastScored, winner;
    private int goalsMilan = 0, goalsMadrid = 0, currentGoals = 0;
    private final int maxGoals = (int) (2 + Math.random() * 4);

    public Task()
    {
        setLayout(new GridLayout(3,3));
        for (int i = 0; i < panel.length; i++){
            panel[i] = new JPanel();
            add(panel[i]);
        }
        score = new JTextField(15);
        lastScored = new JTextField(15);
        winner = new JTextField(15);
        score.setHorizontalAlignment(JTextField.CENTER);
        lastScored.setHorizontalAlignment(JTextField.CENTER);
        winner.setHorizontalAlignment(JTextField.CENTER);
        score.setText("Result: 0 X 0");
        lastScored.setText("Last Scorer: N/A");
        winner.setText("Winner: DRAW");
        setIgnore(score); setIgnore(lastScored); setIgnore(winner);
        panel[1].add(score);
        panel[4].add(lastScored);
        panel[7].add(winner);
        panel[6].add(btnMilan);
        panel[8].add(btnMadrid);
        setListeners(btnMadrid, btnMilan);
        setSize(400, 300);
    }

    private void setListeners(JButton btnMadrid, JButton btnMilan){
        btnMadrid.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                if (currentGoals == maxGoals) mouseEvent.consume();
                else {
                    currentGoals++;
                    score.setText("Result: " + goalsMilan + " X " + (++goalsMadrid));
                    lastScored.setText("Last Scorer: Real Madrid");
                    if (currentGoals == maxGoals) finish();
                }
            }
            @Override
            public void mousePressed(MouseEvent mouseEvent) {}
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {}
            @Override
            public void mouseExited(MouseEvent mouseEvent) {}
        });
        btnMilan.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                if (currentGoals == maxGoals) mouseEvent.consume();
                else {
                    currentGoals++;
                    score.setText("Result: " + (++goalsMilan) + " X " + goalsMadrid);
                    lastScored.setText("Last Scorer: AC Milan");
                    if (currentGoals == maxGoals) finish();
                }
            }
            @Override
            public void mousePressed(MouseEvent mouseEvent) {}
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {}
            @Override
            public void mouseExited(MouseEvent mouseEvent) {}
        });

    }

    private void setIgnore(JTextField button){
        button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                e.consume();
            }
        });
    }

    private void finish(){
        if (goalsMadrid > goalsMilan) winner.setText("Winner: Real Madrid");
        else if (goalsMilan > goalsMadrid) winner.setText("Winner: AC Milan");
        else winner.setText("Winner: DRAW");
    }

    public static void main(String[]args)
    {
        new Task().setVisible(true);
    }
}
