package main.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double IBMprice;
    private double AAPLprice;
    private double GOOGprice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserser) {
        observers.add(newObserser);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIdx = observers.indexOf(deleteObserver);
        observers.remove(observerIdx);
        System.out.println("Observer " + observerIdx + " has been deleted.");
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(IBMprice, AAPLprice, GOOGprice);
        }
    }

    public void setIBMprice(double newPrice) {
        this.IBMprice = newPrice;
        notifyObserver();
    }

    public void setAAPLprice(double newPrice) {
        this.AAPLprice = newPrice;
        notifyObserver();
    }

    public void setGOOGprice(double newPrice) {
        this.GOOGprice = newPrice;
        notifyObserver();
    }
}
