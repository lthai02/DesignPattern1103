package org.example;

import org.example.Composite_Pattern.Cafe;
import org.example.Composite_Pattern.Items;
import org.example.Composite_Pattern.Table;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Items cafe = new Items("cafe", 100);
        Items cake = new Items("cake", 300);
        Items beer = new Items("beer", 200);

        Table tb1 = new Table(1);
        tb1.addProduct(cafe);
        tb1.addProduct(cake);
        tb1.addProduct(beer);

        System.out.println(tb1.getPrice());

        Cafe cf = new Cafe();
        cf.addTable(tb1);
        System.out.println(cf.getRevenue());
    }
}