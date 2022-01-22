package Instruments;

import instrumentTypes.GuitarTypes;
import instrumentTypes.Strings;

public class Guitar extends Strings {

    private GuitarTypes type;
    private int numOfStrings;

    public Guitar(String brand, GuitarTypes type, int numOfStrings){
        super(brand);
        this.type = type;
        this.numOfStrings = numOfStrings;
    }

    public GuitarTypes getType() {
        return type;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String play(){
        return "twing twang";
    }
}
