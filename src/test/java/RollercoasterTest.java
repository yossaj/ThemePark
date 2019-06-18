import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Visitor visitor;
    Rollercoaster rollercoaster;

    @Before
    public void before(){
        visitor = new Visitor();
        rollercoaster = new Rollercoaster("Pepsi-Max", 30);
    }

    @Test
    public void hasAName(){
        assertEquals("Pepsi-Max", rollercoaster.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(30, rollercoaster.getCapacity());
    }

    @Test
    public void canAddVisitor(){
        rollercoaster.addVisitor(visitor);
        assertEquals(1, rollercoaster.countPassengers());
    }

}
