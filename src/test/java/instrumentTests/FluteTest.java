package instrumentTests;

import Instruments.Flute;
import instrumentTypes.FluteTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


class FluteTest {

    private Flute flute;

    @Before
    void setUp() {
        flute = new Flute(FluteTypes.STANDARD);
    }

    @Test
    void getType() {
        assertEquals(FluteTypes.STANDARD, flute.getType());
    }
}