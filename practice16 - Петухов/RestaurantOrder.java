package com.company;

import java.util.Collection;

public class RestaurantOrder extends OrderManager{
    public RestaurantOrder() {}

    public RestaurantOrder(Collection<Item> orders){
        super(orders);
    }
}
