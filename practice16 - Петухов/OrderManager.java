package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class OrderManager implements Order {
    private ItemList<Item> list;

    public OrderManager() {
        list = new ItemList<>();
    }

    public OrderManager(Collection<Item> orders){
        list = new ItemList<>(orders);
    }

    @Override
    public boolean add(Item item) {
        list.add(item);
        return true;
    }

    @Override
    public boolean delete(String name) {
        Item item = null;
        for (Item item_: list.toArray())
            if (item_.getName().equals(name)){
                item = item_; break;
            }
        return item != null && list.delete(item);
    }

    // todo протестить
    @Override
    public int deleteAll(String name) {
        int count = 0;
        for (Item item: list.toArray())
            if (item.getName().equals(name))
               if (list.delete(item)) count++;
        return count;
    }

    @Override
    public int ordersSize() {
        return list.getSize();
    }

    @Override
    public Item[] getOrder() {
        return list.toArray();
    }

    @Override
    public int getCost() {
        int cost = 0;
        for (Item item: list.toArray())
            cost += item.getPrice();
        return cost;
    }

    @Override
    public int getItemsSize(String name) {
        int count = 0;
        for (Item item: list.toArray())
            if (item.getName().equals(name)) count++;
        return count;
    }

    @Override
    public String[] getNames() {
        ArrayList<String> names = new ArrayList<>();
        for (Item item: list.toArray())
            if (!names.contains(item.getName())) names.add(item.getName());
        return names.toArray(new String[names.size()]);
    }

    @Override
    public Item[] getSortedOrder() {
        Item[] sorted = list.toArray();
        Arrays.sort(sorted, (o1, o2) -> o2.getPrice() - o1.getPrice());
        return sorted;
    }
}
