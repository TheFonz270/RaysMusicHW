package Instruments;

import instrumentTypes.Brass;
import instrumentTypes.TrumpetTypes;

public class Trumpet extends Brass {

    private TrumpetTypes type;

    public Trumpet(String brand, TrumpetTypes type) {
        super(brand);
        this.type = type;
    }

    public TrumpetTypes getType() {
        return type;
    }

    public String play() {
        return "Toot toot";
    }
}
