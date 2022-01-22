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
        saxophone = new Saxophone(150.00, 200.00, "Selmer", SaxophoneTypes.ALTO);
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

    @Test
    public void canStock(){
        assertEquals(150.00, saxophone.getBuyPrice(), 0);
        assertEquals(200.00, saxophone.getSellPrice(), 0);
        assertEquals(1.33, saxophone.calculateMarkup(), 0.01);
    }
}