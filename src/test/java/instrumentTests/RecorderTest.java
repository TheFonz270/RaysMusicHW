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
        recorder = new Recorder(RecorderTypes.ALTO);
    }

    @Test
    public void canGetType() {
        assertEquals(RecorderTypes.ALTO, recorder.getType());
    }
}