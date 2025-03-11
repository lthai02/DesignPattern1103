package org.example.Observer_Pattern;

public interface Subject {
    void addObserve(Stock stock);
    void removeObserve(Stock stock);
    void notifycation();
    void setPrice(double price);
}
