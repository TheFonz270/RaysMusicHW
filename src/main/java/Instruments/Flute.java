package Instruments;

import instrumentTypes.FluteTypes;

public class Flute {

    private FluteTypes type;

    public Flute(FluteTypes type){
     this.type = type;
    }

    public FluteTypes getType() {
        return type;
    }
}
