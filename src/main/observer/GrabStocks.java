package main.observer;

public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockCompany = new StockGrabber();
        StockObserver personA = new StockObserver(stockCompany);

        stockCompany.setIBMprice(237.5);
        stockCompany.setAAPLprice(300.1);
        stockCompany.setGOOGprice(211);

        StockObserver personB = new StockObserver(stockCompany);
        stockCompany.setIBMprice(222.4);
        stockCompany.setAAPLprice(327.1);
        stockCompany.setGOOGprice(199.8);

        stockCompany.unregister(personB);
        stockCompany.setIBMprice(222.4);

        // Use thread
        Runnable getIBM = new GetTheStocks(stockCompany, 2, "IBM", 197);
        Runnable getAAPL = new GetTheStocks(stockCompany, 2, "AAPL", 200);
        Runnable getGOOG = new GetTheStocks(stockCompany, 2, "GOOG", 201);

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();

    }
}
