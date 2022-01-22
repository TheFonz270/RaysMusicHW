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

    @Test
    public void canStock(){
        assertEquals(120.00, trumpet.getBuyPrice(), 0);
        assertEquals(180.00, trumpet.getSellPrice(), 0);
        assertEquals(1.5, trumpet.calculateMarkup(), 0);
    }
}