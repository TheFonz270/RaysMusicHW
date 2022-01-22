package Instruments;

import instrumentTypes.Brass;
import instrumentTypes.TrumpetTypes;

public class Trumpet extends Brass {

    private TrumpetTypes type;

    public Trumpet(double buyPrice, double sellPrice, String brand, TrumpetTypes type) {
        super(buyPrice, sellPrice, brand);
        this.type = type;
    }

    public TrumpetTypes getType() {
        return type;
    }

    public String play() {
        return "toot toot";
    }
}
