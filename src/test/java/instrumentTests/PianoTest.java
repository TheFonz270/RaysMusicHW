package instrumentTests;

import Instruments.Flute;
import Instruments.Guitar;
import Instruments.Piano;
import instrumentTypes.FluteTypes;
import instrumentTypes.GuitarTypes;
import instrumentTypes.PianoTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PianoTest {

    private Piano piano;

    @Before
    public void setUp() {
        piano = new Piano(800.00, 1200.00, "Yamaha", PianoTypes.GRAND, 88);
    }

    @Test
    public void canGetType() {
        assertEquals("Yamaha", piano.getBrand());
        assertEquals(PianoTypes.GRAND, piano.getType());
        assertEquals(88, piano.getNumOfKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("god's song", piano.play());
    }

    @Test
    public void canStock(){
        assertEquals(800.00, piano.getBuyPrice(), 0);
        assertEquals(1200.00, piano.getSellPrice(), 0);
        assertEquals(1.5, piano.calculateMarkup(), 0);
    }
}