package instrumentTests;

import Instruments.Saxophone;
import instrumentTypes.GuitarTypes;
import instrumentTypes.SaxophoneTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SaxophoneTest {

    private Saxophone saxophone;

    @Before
    public void setUp() {
        saxophone = new Saxophone("Selmer", SaxophoneTypes.ALTO);
    }

    @Test
    public void canGetType() {
        assertEquals("Selmer", saxophone.getBrand());
        assertEquals(SaxophoneTypes.ALTO, saxophone.getType());
    }

    @Test
    public void canPlay(){
    assertEquals("Saxomaphoooooooone", saxophone.play());
    }
}