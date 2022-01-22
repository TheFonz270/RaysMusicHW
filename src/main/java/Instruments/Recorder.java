package Instruments;

import instrumentTypes.RecorderTypes;

public class Recorder {

    private RecorderTypes type;

    public Recorder(RecorderTypes type){
        this.type = type;
    }

    public RecorderTypes getType() {
        return type;
    }

}
