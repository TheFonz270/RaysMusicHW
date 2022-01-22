package Instruments;

import instrumentTypes.Brass;
import instrumentTypes.SaxaphoneTypes;

public class Saxophone extends Brass {

    private SaxaphoneTypes type;

    public Saxophone (String brand, SaxaphoneTypes type){
        super(brand);
        this.type = type;
    }

    public SaxaphoneTypes getType() {
        return type;
    }

    public String play(){
        return "Saxamaphoooooooone";
    }
}
