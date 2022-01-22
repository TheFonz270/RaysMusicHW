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
        piano = new Piano(PianoTypes.GRAND, 88);
    }

    @Test
    public void canGetType() {
        assertEquals(PianoTypes.GRAND, piano.getType());
        assertEquals(88, piano.getNumOfKeys());
    }
}