package Instruments;

import instrumentTypes.PianoTypes;
import instrumentTypes.Strings;

public class Piano extends Strings {

    private PianoTypes type;
    private int numOfKeys;

    public Piano(double buyPrice, double sellPrice, String brand, PianoTypes type, int numOfKeys){
        super(buyPrice, sellPrice, brand);
        this.type = type;
        this.numOfKeys = numOfKeys;
    }

    public PianoTypes getType() {
        return type;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    public String play(){
        return "god's song";
    }
}
