package instrumentTypes;

import behaviours.IPlay;
import behaviours.ISell;
import shop.Stock;

public abstract class Brass extends Stock implements IPlay {
    private String brand;

    public Brass(double buyPrice, double sellPrice, String brand) {
        super(buyPrice, sellPrice);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }


}
