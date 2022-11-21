package main.observer;

import java.text.DecimalFormat;

public class GetTheStocks implements Runnable {
    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetTheStocks(Subject stockGrabber, int startTime, String stock, double price) {
        this.stockGrabber = stockGrabber;
        this.startTime = startTime;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            try {
                Thread.sleep(this.startTime * 1000);
            } catch (InterruptedException e) {
            }

            double randNum = (Math.random() * .06) - .03;

            DecimalFormat df = new DecimalFormat("#.##");

            price = Double.valueOf(df.format(price + randNum));

            if (stock == "IBM")
                ((StockGrabber) stockGrabber).setIBMprice(price);
            if (stock == "APPL")
                ((StockGrabber) stockGrabber).setIBMprice(price);
            if (stock == "GOOG")
                ((StockGrabber) stockGrabber).setIBMprice(price);

            System.out.println(stock + ": " + df.format(price + randNum) + " " + df.format(randNum));
            System.out.println();
        }
    }

}
