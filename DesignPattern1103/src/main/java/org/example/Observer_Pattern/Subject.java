package org.example.Observer_Pattern;

public interface Subject {
    void addObserve(Observer observer);

    void removeObserve(Observer observer);

    void notification();

    void setPrice(double price);
}
