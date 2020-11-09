package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableOrdersManager implements OrdersManager{
    private Order[] orders = new Order[10];

    public void add(Order order, int tableNumber){
        orders[tableNumber] = order;
    }

    public void addItem(MenuItem item, int tableNumber){
        orders[tableNumber].add(item);
    }

    public int freeTableNumber(){
        for (int i = 0; i < orders.length; i++)
            if (orders[i] == null) return i;
        return -1;
    }

    public int[] freeTableNumbers(){
        ArrayList<Integer> arrayListNumbers = new ArrayList<>();
        for (int i = 0; i < orders.length; i++)
            if (orders[i] == null)
                arrayListNumbers.add(i);
        int[] arrNumbers = new int[arrayListNumbers.size()];
        for (int i = 0; i < arrNumbers.length; i++)
            arrNumbers[i] = arrayListNumbers.get(i);
        return arrNumbers;
    }

    public Order getOrder(int tableNumber){
        return orders[tableNumber];
    }

    public void remove(int tableNumber){
        orders[tableNumber] = null;
    }

    public int remove(Order order){
        for (int i = 0; i < orders.length; i++)
            if (orders[i].equals(order)) {
                orders[i] = null;
                return i;
            }
        return -1;
    }

    public int removeAll(Order order){
        int count = 0;
        for (int i = 0; i < orders.length; i++)
            if (orders[i].equals(order)) {
                orders[i] = null;
                count++;
            }
        return count;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for (Order order : orders)
            count += order.itemQuantity(itemName);
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return itemsQuantity(item.getName());
    }

    @Override
    public Order[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        return Arrays.stream(getOrders())
                .mapToInt(Order::costTotal)
                .sum();    }

    @Override
    public int ordersQuantity() {
        return orders.length;
    }
}
