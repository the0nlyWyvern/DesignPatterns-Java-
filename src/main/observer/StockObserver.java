package main.observer;

public class StockObserver implements Observer {

    private double IBMprice;
    private double AAPLprice;
    private double GOOGprice;

    private static int observerIdTracker = 0;

    private int observerId;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = observerIdTracker++;
        System.out.println("Observer " + this.observerId + " has been added");

        stockGrabber.register(this);
    }

    @Override
    public void update(double IBMprice, double AAPLprice, double GOOGprice) {
        this.IBMprice = IBMprice;
        this.AAPLprice = AAPLprice;
        this.GOOGprice = GOOGprice;

        this.printThePrices();
    }

    public void printThePrices() {
        System.out.println("Observer ID: " + this.observerId + ": IBM-" + this.IBMprice + " APPLE:-" + this.AAPLprice
                + " GOOGLE-" + this.GOOGprice);
    }

}
