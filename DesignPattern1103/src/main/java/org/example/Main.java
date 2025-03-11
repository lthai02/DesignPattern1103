package org.example;

import org.example.Adapter_Pattern.Adapter;
import org.example.Composite_Pattern.Cafe;
import org.example.Composite_Pattern.Items;
import org.example.Composite_Pattern.Table;
import org.example.Observer_Pattern.Investors;
import org.example.Observer_Pattern.Observer;
import org.example.Observer_Pattern.Stock;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Observer
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

        // Observer
        Stock stk = new Stock(200);
        Observer hai = new Investors("hai");
        Observer linh = new Investors("linh");

        stk.addObserve(hai);
        stk.addObserve(linh);

        stk.setPrice(99);
        stk.setPrice(199);

        stk.removeObserve(linh);
        stk.setPrice(299);

        // Adapter
        Adapter adapter = new Adapter();

        String jsonData = "{ \"name\": \"Lê Thanh Hải\", \"age\": 23 }";
        String xmlResult = adapter.convert(jsonData);
        System.out.println("JSON to XML:\n" + xmlResult);

        String xmlData = "<name>Lê Thanh Hải</name><age>23</age>";
        String jsonResult = adapter.convert(xmlData);
        System.out.println("XML to JSON:\n" + jsonResult);
    }
}