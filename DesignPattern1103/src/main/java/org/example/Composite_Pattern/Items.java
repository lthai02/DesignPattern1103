package org.example.Composite_Pattern;

import java.util.List;

public class Items implements Product{
    private String name;
    private double price;

    public Items(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
