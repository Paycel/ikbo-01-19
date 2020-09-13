package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainGraph extends JFrame {
    private JPanel[] panel = new JPanel[8];
    private final String player1Name = "Игрок 1";
    private final String player2Name = "Игрок 2";
    private final String buttonAgainName = "Начать заново";
    private final String buttonNextMoveName = "Следующий ход";
    private final String labelNumMove = "Ход #";
    private final String labelWinner = "Победитель: ";
    private JLabel player1Deck, player2Deck, lblPlayer1, lblPlayer2, lblNumMove, lblWinner;
    private JButton btnNextMove, btnStartAgain;
    private GameQueue game;

    public MainGraph(){
        setLayout(new GridLayout(4, 2));
        initialize();
    }

    private void initialize(){
        for (int i = 0; i < 8; i++){
            panel[i] = new JPanel();
            add(panel[i]);
        }
        game = new GameQueue();
        player1Deck = new JLabel(game.getPlayer1().toString().substring(1, game.getPlayer1().toString().length() - 1));
        player2Deck = new JLabel(game.getPlayer2().toString().substring(1, game.getPlayer2().toString().length() - 1));
        lblPlayer1 = new JLabel(player1Name);
        lblPlayer2 = new JLabel(player2Name);
        lblNumMove = new JLabel(labelNumMove + game.getCounter());
        lblWinner = new JLabel(labelWinner + "N/A");
        btnNextMove = new JButton(buttonNextMoveName);
        btnStartAgain = new JButton(buttonAgainName);
        panel[0].add(lblPlayer1);
        panel[1].add(player1Deck);
        panel[2].add(lblPlayer2);
        panel[3].add(player2Deck);
        panel[4].add(btnNextMove);
        panel[5].add(lblNumMove);
        panel[6].add(btnStartAgain);
        panel[7].add(lblWinner);
        setListeners(btnNextMove, btnStartAgain);
        setSize(400, 300);
    }

    private void setListeners(JButton btnNextMove, JButton btnStartAgain){
        btnNextMove.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                if (game.getCounter() < 106) {
                    if (game.isFinish() == 0) {
                        boolean flag = game.move();
                        lblNumMove.setText(labelNumMove + game.getCounter());
                        player1Deck.setText(game.getPlayer1().toString().substring(1, game.getPlayer1().toString().length() - 1));
                        player2Deck.setText(game.getPlayer2().toString().substring(1, game.getPlayer2().toString().length() - 1));
                        if (flag) lblWinner.setText(labelWinner + (game.isFinish() == 1 ? player1Name : player2Name));
                    }
                } else {
                    lblWinner.setText(labelWinner + "DRAW");
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
        btnStartAgain.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                game = new GameQueue();
                player1Deck.setText(game.getPlayer1().toString().substring(1, game.getPlayer1().toString().length() - 1));
                player2Deck.setText(game.getPlayer2().toString().substring(1, game.getPlayer2().toString().length() - 1));
                lblNumMove.setText(labelNumMove + game.getCounter());
                lblWinner.setText(labelWinner + "N/A");

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

    public static void main(String[] args){
        new MainGraph().setVisible(true);
    }
}
