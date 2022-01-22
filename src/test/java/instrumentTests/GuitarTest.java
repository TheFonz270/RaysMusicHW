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
        guitar = new Guitar(GuitarTypes.ACOUSTIC, 6);
    }

    @Test
    public void canGetType() {
        assertEquals(GuitarTypes.ACOUSTIC, guitar.getType());
        assertEquals(6, guitar.getNumOfStrings());
    }
}