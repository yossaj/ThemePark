import Attractions.Visitor;
import Stalls.HotDogStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotDogStallTest {

    Visitor visitor;
    HotDogStall hotDogStall;

    @Before
    public void before(){
        visitor = new Visitor(157, 14, 30);
        hotDogStall = new HotDogStall("Burning Buns", "Bill Burgers", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Burning Buns", hotDogStall.getName());
    }

    @Test
    public void canGetOwnersName(){
        assertEquals("Bill Burgers", hotDogStall.getOwnersName());
    }

    @Test
    public void canChangeParkingSpot(){
        hotDogStall.assignNewParkingSpot(1);
        assertEquals(1, hotDogStall.getParkingSpot(), 0);
    }


}
