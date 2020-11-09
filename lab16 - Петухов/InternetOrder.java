package com.company;

import java.util.Arrays;

public class InternetOrder implements Order {
    private int size;
    private Customer customer;
    private ListNode head, tail;

    @Override
    public boolean add(MenuItem item) {
        if (head == null) {
            head = new ListNode();
            tail = new ListNode();
            head.setValue(item);
            head.setNext(tail);
            tail.setNext(head);
        } else {
            ListNode node = new ListNode();
            node.setValue(item);
            node.setNext(tail);
            head.setNext(node);
        }
        size++;
        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[size];
        int i = 0;
        for (ListNode node = head; node != tail; node = node.getNext())
            names[i++] = node.getValue().toString();
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        for (ListNode node = head; node != tail; node = node.getNext())
            if (node.getValue().getName().equals(itemName)) count++;
        return count;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        return itemQuantity(itemName.getName());
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] items = new MenuItem[size];
        int i = 0;
        for (ListNode node = head; node != tail; node = node.getNext())
            items[i++] = node.getValue();
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        for (ListNode node = head; node != tail; node = node.getNext())
            if (node.getNext().getValue().getName().equals(itemName)) {
                node.setNext(node.getNext().getNext());
                size--;
                return true;
            }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        return remove(item.getName());
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for (ListNode node = head; node != tail; node = node.getNext())
            if (node.getNext().getValue().getName().equals(itemName)) {
                node.setNext(node.getNext().getNext());
                size--;
                count++;
            }
        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        return removeAll(item.getName());
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] items = getItems();
        Arrays.sort(items, (menuItem, menuItem1) -> {
            double c = menuItem1.getCost() - menuItem.getCost();
            return (c == 0) ? 0 : (int) c;
        });
        return items;
    }

    @Override
    public int costTotal() {
        return Arrays.stream(getItems())
                .mapToInt(MenuItem::getCost)
                .sum();
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
