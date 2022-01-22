package Accessories;

import behaviours.ISell;
import shop.Stock;

public class GuitarMiscItems extends Stock implements ISell {
    private String name;


    public GuitarMiscItems(double buyPrice, double sellPrice, String name) {
        super(buyPrice, sellPrice);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
