package instrumentTests;

import Instruments.Trumpet;
import instrumentTypes.TrumpetTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet(120.00, 180.00, "Jean Paul", TrumpetTypes.Bass);
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