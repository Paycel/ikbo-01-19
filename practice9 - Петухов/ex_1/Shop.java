package com.company;

import java.util.HashMap;

public class Shop {
    private HashMap<String, Client> dataBase;

    public Shop() {
        dataBase = new HashMap<>();
        dataBase.put("12345", new Client("Name1", "Surname1", "Patronymic1"));
        dataBase.put("12346", new Client("Name2", "Surname2", "Patronymic2"));
        dataBase.put("12347", new Client("Name3", "Surname3", "Patronymic3"));
    }

    public void request(String INN) throws InvalidINNException {
        if (dataBase.containsKey(INN)) System.out.println("Request successful");
        else throw new InvalidINNException();
    }
}
