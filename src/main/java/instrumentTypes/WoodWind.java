package instrumentTypes;

import behaviours.IPlay;
import shop.Stock;

public abstract class WoodWind extends Stock implements IPlay {
    private String brand;

    public WoodWind(double buyPrice, double sellPrice, String brand) {
        super(buyPrice, sellPrice);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

