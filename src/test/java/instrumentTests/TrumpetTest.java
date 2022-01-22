package instrumentTests;

import Instruments.Saxophone;
import Instruments.Trumpet;
import instrumentTypes.SaxophoneTypes;
import instrumentTypes.TrumpetTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet("Jean Paul", TrumpetTypes.Bass);
    }

    @Test
    public void canGetType() {
        assertEquals("Jean Paul", trumpet.getBrand());
        assertEquals(TrumpetTypes.Bass, trumpet.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("toot toot", trumpet.play());
    }
}