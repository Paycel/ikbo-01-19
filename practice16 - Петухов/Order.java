package com.company;

public interface Order {
    boolean add(Item item);
    boolean delete(String name);
    int deleteAll(String name);
    int ordersSize();
    Object[] getOrder();
    int getCost();
    int getItemsSize(String name);
    String[] getNames();
    Object[] getSortedOrder();
}
