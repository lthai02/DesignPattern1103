package org.example.Observer_Pattern;

public class Investors implements Observer {
    private String name;

    public Investors(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println("Stock price change to " + price);
    }

}
