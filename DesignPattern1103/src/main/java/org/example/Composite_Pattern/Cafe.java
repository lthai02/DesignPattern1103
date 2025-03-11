package org.example.Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private List<Product> tables;

    public Cafe() {
        tables = new ArrayList<>();
    }

    public void addTable (Product table){
        tables.add(table);
    }

    public double getRevenue(){
        double totalRevenue = 0;
        for(Product table: tables){
            totalRevenue += table.getPrice();
        }
        return totalRevenue;
    }
}
