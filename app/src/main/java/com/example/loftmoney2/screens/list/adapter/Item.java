package com.example.loftmoney2.screens.list.adapter;

import java.io.Serializable;

public class Item implements Serializable {
    public static String KEY_NAME = Item.class.getName();

    private String name;
    private String price;

    public Item (String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }
}

