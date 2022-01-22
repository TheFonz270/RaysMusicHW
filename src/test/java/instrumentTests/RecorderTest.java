package instrumentTests;

import Instruments.Flute;
import Instruments.Guitar;
import Instruments.Recorder;
import instrumentTypes.FluteTypes;
import instrumentTypes.GuitarTypes;
import instrumentTypes.RecorderTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RecorderTest {

    private Recorder recorder;

    @Before
    public void setUp() {
        recorder = new Recorder(50.00, 75.00, "Yamaha", RecorderTypes.ALTO);
    }

    @Test
    public void canGetType() {
        assertEquals("Yamaha", recorder.getBrand());
        assertEquals(RecorderTypes.ALTO, recorder.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("foooooo foo", recorder.play());
    }

    @Test
    public void canStock(){
        assertEquals(50.00, recorder.getBuyPrice(), 0);
        assertEquals(75.00, recorder.getSellPrice(), 0);
        assertEquals(1.5, recorder.calculateMarkup(), 0);
    }
}