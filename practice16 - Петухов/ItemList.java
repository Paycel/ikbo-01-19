package com.company;

import java.util.Collection;

public class ItemList<T> {
    private static class Node<T> {
        T element;
        Node<T> next, prev;

        public Node(T element, Node<T> next, Node<T> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private int size;
    private Node<T> head, end;

    public ItemList() {
        this.size = 0;
    }

    public ItemList(Collection<? extends T> orders) {
        Object[] collection = orders.toArray();
        if (collection.length == 0) return;
        size = 0;
        for (Object object: collection) add((T) object);
    }

    public void add(T element){
        if (head == null){
            head = new Node<>(element, null, null);
            head.prev = head; head.next = head; end = head;
        } else if (size == 1){
            end = new Node<>(element, head, head);
            head.next = end; head.prev = end;
        } else {
            Node<T> newNode = new Node<>(element, head, end);
            head.prev = newNode;
            end.next = newNode;
            end = newNode;
        }
        size++;
    }

    public boolean delete(Object object){
        Node<T> root = head;
        if (size == 0) return false;
        if (size == 1 && root.element.toString().equals(object.toString())){
            size--; head = null; end = null; return true;
        }
        while (root != end){
            if (((T) root.element).equals(object)){
                root.prev.next = root.next;
                root.next.prev = root.prev;
                size--;
                return true;
            }
            root = root.next;
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public Item[] toArray(){
        Item[] array = new Item[size];
        int i = 0;
        for (Node<T> node = head; node != end && node.next != node.prev; node = node.next)
            array[i++] = (Item) node.element;
        if (size > 0) array[size - 1] = (Item) end.element;
        return array;
    }
}
