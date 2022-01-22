package Instruments;

import instrumentTypes.Brass;
import instrumentTypes.SaxophoneTypes;

public class Saxophone extends Brass {

    private SaxophoneTypes type;

    public Saxophone (double buyPrice, double sellPrice, String brand, SaxophoneTypes type){
        super(buyPrice, sellPrice, brand);
        this.type = type;
    }

    public SaxophoneTypes getType() {
        return type;
    }

    public String play(){
        return "Saxomaphoooooooone";
    }
}
