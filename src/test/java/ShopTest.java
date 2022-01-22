import Accessories.GuitarMiscItems;
import Instruments.*;
import instrumentTypes.*;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop rays;
    private Guitar guitar;
    private Piano piano;
    private Saxophone saxophone;
    private Trumpet trumpet;
    private Flute flute;
    private Recorder recorder;
    private GuitarMiscItems guitarPicks;

    @Before
    public void before(){
        flute = new Flute(40.00, 60.00, "Miyazawa", FluteTypes.STANDARD);
        guitar = new Guitar(80.00, 120.00, "Gibson", GuitarTypes.ACOUSTIC, 6);
        piano = new Piano(800.00, 1200.00, "Yamaha", PianoTypes.GRAND, 88);
        recorder = new Recorder(50.00, 75.00, "Yamaha", RecorderTypes.ALTO);
        saxophone = new Saxophone(150.00, 200.00, "Selmer", SaxophoneTypes.ALTO);
        trumpet = new Trumpet(120.00, 180.00, "Jean Paul", TrumpetTypes.Bass);
        guitarPicks = new GuitarMiscItems(5.00, 10.00, "Gibson Begginer Picks");

        rays = new Shop("Ray's Music Exchange", "Edinburgh");
        rays.addStock(flute);
        rays.addStock(guitar);
        rays.addStock(piano);
        rays.addStock(recorder);
        rays.addStock(saxophone);
        rays.addStock(trumpet);

    }

    @Test
    public void shopExists(){
        assertEquals("Ray's Music Exchange", rays.getName());
        assertEquals("Edinburgh", rays.getLocation());
        assertEquals(6, rays.getStock().size());
    }

    @Test
    public void canAddStock(){
        assertEquals(6, rays.getStock().size());
        rays.addStock(guitarPicks);
        assertEquals(7, rays.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        assertEquals(6, rays.getStock().size());
        rays.removeStock(guitar);
        assertEquals(5, rays.getStock().size());
    }

}
