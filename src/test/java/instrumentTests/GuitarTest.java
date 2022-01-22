package instrumentTests;

import Instruments.Flute;
import Instruments.Guitar;
import instrumentTypes.FluteTypes;
import instrumentTypes.GuitarTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarTest {

    private Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Gibson", GuitarTypes.ACOUSTIC, 6);
    }

    @Test
    public void canGetType() {
        assertEquals("Gibson", guitar.getBrand());
        assertEquals(GuitarTypes.ACOUSTIC, guitar.getType());
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("twing twang", guitar.play());
    }
}