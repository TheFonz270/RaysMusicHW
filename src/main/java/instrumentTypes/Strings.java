package instrumentTypes;

import behaviours.IPlay;

public abstract class Strings implements IPlay {

    private String brand;

    public Strings(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

