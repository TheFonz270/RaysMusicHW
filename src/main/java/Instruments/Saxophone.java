package Instruments;

import instrumentTypes.Brass;
import instrumentTypes.SaxophoneTypes;

public class Saxophone extends Brass {

    private SaxophoneTypes type;

    public Saxophone (String brand, SaxophoneTypes type){
        super(brand);
        this.type = type;
    }

    public SaxophoneTypes getType() {
        return type;
    }

    public String play(){
        return "Saxomaphoooooooone";
    }
}
