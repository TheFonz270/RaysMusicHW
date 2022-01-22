package shop;

import behaviours.ISell;

public abstract class Stock implements ISell {

    private double buyPrice;
    private double sellPrice;

    public Stock(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup(){
        return sellPrice / buyPrice;
    }
}
