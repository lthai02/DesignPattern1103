package org.example.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private double price;
    private List<Observer> investors = new ArrayList<>();
    @Override
    public void addObserve(Stock stock) {
    }

    @Override
    public void removeObserve(Stock stock) {

    }

    @Override
    public void notifycation() {

    }

    @Override
    public void setPrice(double price) {

    }
}
