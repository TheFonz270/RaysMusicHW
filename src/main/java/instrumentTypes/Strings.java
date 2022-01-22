package instrumentTypes;

import behaviours.IPlay;
import shop.Stock;

public abstract class Strings extends Stock implements IPlay {

    private String brand;

    public Strings(double buyPrice, double sellPrice, String brand) {
        super(buyPrice, sellPrice);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

