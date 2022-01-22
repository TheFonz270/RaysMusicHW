package instrumentTypes;

import behaviours.IPlay;

public abstract class WoodWind implements IPlay {
    private String brand;

    public WoodWind(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

