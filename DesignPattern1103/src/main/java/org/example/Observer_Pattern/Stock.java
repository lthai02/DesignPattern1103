package org.example.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private double price;
    private List<Observer> investors = new ArrayList<>();

    public Stock(double price) {
        this.price = price;
    }

    @Override
    public void addObserve(Observer observer) {
        investors.add(observer);
    }

    @Override
    public void removeObserve(Observer observer) {
        investors.remove(observer);
    }

    @Override
    public void notification() {
        for (Observer investor : investors) {
            investor.update(price);
        }
    }

    @Override
    public void setPrice(double price) {
        if (this.price != price) {
            System.out.println("Stock price change to " + price);
            this.price = price;
            notification();
        }
    }

}
