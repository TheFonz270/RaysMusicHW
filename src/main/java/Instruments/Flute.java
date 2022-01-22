package Instruments;

import instrumentTypes.FluteTypes;
import instrumentTypes.WoodWind;

public class Flute extends WoodWind {

    private FluteTypes type;

    public Flute(String brand, FluteTypes type){
        super(brand);
        this.type = type;
    }

    public FluteTypes getType() {
        return type;
    }

    public String play() {
        return "fwooooo foo";
    }
}
