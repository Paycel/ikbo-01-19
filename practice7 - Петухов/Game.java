package com.company;

public abstract class Game<T>{

    private T player1, player2;
    private int counter;

    public Game(T player1, T player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Game() {}

    public int getCounter() {
        return counter;
    }

    public void incCounter(){
        counter++;
    }

    public T getPlayer1() {
        return player1;
    }

    public T getPlayer2() {
        return player2;
    }

    public void initialize(T player1, T player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
}
