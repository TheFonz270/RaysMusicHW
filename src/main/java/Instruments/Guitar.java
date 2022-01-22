package Instruments;

import instrumentTypes.GuitarTypes;

public class Guitar {

    private GuitarTypes type;
    private int numOfStrings;

    public Guitar(GuitarTypes type, int numOfStrings){
        this.type = type;
        this.numOfStrings = numOfStrings;
    }

    public GuitarTypes getType() {
        return type;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }
}
