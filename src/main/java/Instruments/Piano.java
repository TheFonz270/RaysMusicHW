package Instruments;

import instrumentTypes.PianoTypes;

public class Piano {

    private PianoTypes type;
    private int numOfKeys;

    public Piano(PianoTypes type, int numOfKeys){
        this.type = type;
        this.numOfKeys = numOfKeys;
    }

    public PianoTypes getType() {
        return type;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }
}
