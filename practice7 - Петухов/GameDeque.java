package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class GameDeque extends Game<Deque<Integer>> implements GameFunctions<Deque<Integer>> {
    public GameDeque() {
        initialize(new ArrayDeque<>(), new ArrayDeque<>());
        for (int i = 1; i <= 9; i += 2) getPlayer1().add(i);
        for (int i = 2; i <= 8; i += 2) getPlayer2().add(i); getPlayer2().add(0);
    }

    @Override
    public void start() {
        for (Integer i: getPlayer1()) System.out.print(i + " "); System.out.println();
        for (Integer i: getPlayer2()) System.out.print(i + " "); System.out.println();
        for (; super.getCounter() < 106 && !move(););
        if (isFinish() == 0) {
            System.out.println("botva");
            for (Integer i: getPlayer1()) System.out.print(i + " "); System.out.println();
            for (Integer i: getPlayer2()) System.out.print(i + " "); System.out.println();
        }
    }

    @Override
    public boolean move() {
        incCounter();
        Deque<Integer> player1 = super.getPlayer1();
        Deque<Integer> player2 = super.getPlayer2();
        if (isFinish() == 0) {
            int first = player1.removeFirst();
            int second = player2.removeFirst();
            if (Math.abs(first - second) == 9){
                if (first == 0) insert(player2, player1, first, second);
                else insert(player1, player2, first, second);
            } else {
                if (first > second) insert(player2, player1, first, second);
                else insert(player1, player2, first, second);
            }
        }
        return finish(isFinish());
    }

    @Override
    public int isFinish() {
        return super.getPlayer1().isEmpty() ? 2 : super.getPlayer2().isEmpty() ? 1 : 0;
    }

    @Override
    public boolean finish(int whoWin) {
        if (whoWin == 0) return false;
        if (whoWin == 1) System.out.println("first " + super.getCounter());
        else System.out.println("second " + super.getCounter());
        return true;
    }

    @Override
    public void insert(Deque<Integer> from, Deque<Integer> to, int x1, int x2) {
        to.add(x1);
        to.add(x2);
    }
}

