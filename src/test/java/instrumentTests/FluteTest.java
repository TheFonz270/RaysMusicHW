package instrumentTests;

import Instruments.Flute;
import instrumentTypes.FluteTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FluteTest {

    private Flute flute;

    @Before
    public void setUp() {
        flute = new Flute("Miyazawa", FluteTypes.STANDARD);
    }

    @Test
    public void canGetType() {
        assertEquals("Miyazawa", flute.getBrand());
        assertEquals(FluteTypes.STANDARD, flute.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("fwooooo foo", flute.play());
    }
}