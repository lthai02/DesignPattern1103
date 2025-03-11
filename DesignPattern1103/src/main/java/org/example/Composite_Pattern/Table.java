package org.example.Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Table implements Product{
    private int id;
    private List<Items> items;

    public Table(int id) {
        this.id = id;
        this.items = new ArrayList<>();
    }
    public void addProduct(Items item) {
        items.add(item);
    }
    @Override
    public double getPrice() {
        double total = 0;
        for(Items item : items){
            total += item.getPrice();
        }
        return total;
    }
}
