package Accessories;

public class GuitarMiscItems {
    private String name;
    private double buyPrice;
    private double sellPrice;

    public GuitarMiscItems(String name, double buyPrice, double sellPrice) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
