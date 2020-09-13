package com.company;

public interface GameFunctions<T> {
    void start();
    boolean move();
    int isFinish();
    boolean finish(int whoWin);
    void insert(T from, T to, int x1, int x2);
}
