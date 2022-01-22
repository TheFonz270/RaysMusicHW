package instrumentTypes;

import behaviours.IPlay;

public abstract class Brass implements IPlay {
    private String brand;

    public Brass(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
