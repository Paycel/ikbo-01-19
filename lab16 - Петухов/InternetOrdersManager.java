package com.company;

import java.util.Arrays;

public class InternetOrdersManager implements OrdersManager{
    private QueueNode head, tail;
    private int size;

    public boolean add(Order order){
        if (head == null) {
            head = new QueueNode();
            tail = new QueueNode();
            head.setValue(order);
            head.setNext(tail);
            tail.setNext(head);
        } else {
            QueueNode node = new QueueNode();
            node.setValue(order);
            node.setNext(tail);
            head.setNext(node);
        }
        size++;
        return true;
    }

    public boolean remove(Order order){
        for (QueueNode node = head; node != tail; node = node.getNext())
            if (node.getValue().equals(order)) {
                node.setPrev(node.getNext());
                size--;
                return true;
            }
        return false;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for (QueueNode node = head; node != tail; node = node.getNext())
            count += node.getValue().itemQuantity(itemName);
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return itemsQuantity(item.getName());
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];
        int i = 0;
        for (QueueNode node = head; node != tail; node = node.getNext())
            orders[i++] = node.getValue();
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        return Arrays.stream(getOrders())
                .mapToInt(Order::costTotal)
                .sum();
    }

    @Override
    public int ordersQuantity() {
        return size;
    }
}
