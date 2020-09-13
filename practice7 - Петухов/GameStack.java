package com.company;

import java.util.Stack;

public class GameStack extends Game<Stack<Integer>> implements GameFunctions<Stack<Integer>> {

    public GameStack() {
        initialize(new Stack<>(), new Stack<>());
        for (int i = 9; i >= 1; i -= 2) getPlayer1().push(i); getPlayer2().push(0);
        for (int i = 8; i >= 2; i -= 2) getPlayer2().push(i);
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
        Stack<Integer> player1 = super.getPlayer1();
        Stack<Integer> player2 = super.getPlayer2();
        if (isFinish() == 0) {
            int first = player1.pop();
            int second = player2.pop();
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
        return super.getPlayer1().empty() ? 2 : super.getPlayer2().empty() ? 1 : 0;
    }

    @Override
    public boolean finish(int whoWin) {
        if (whoWin == 0) return false;
        if (whoWin == 1) System.out.println("first " + super.getCounter());
        else System.out.println("second " + super.getCounter());
        return true;
    }

    @Override
    public void insert(Stack<Integer> from, Stack<Integer> to, int x1, int x2) {
        to.insertElementAt(x1, 0);
        to.insertElementAt(x2, 0);
    }
}
