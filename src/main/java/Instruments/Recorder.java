package Instruments;

import instrumentTypes.RecorderTypes;
import instrumentTypes.WoodWind;

public class Recorder extends WoodWind {

    private RecorderTypes type;

    public Recorder(String brand, RecorderTypes type){
        super(brand);
        this.type = type;
    }

    public RecorderTypes getType() {
        return type;
    }

    public String play(){
        return "foooooo foo";
    }

}
