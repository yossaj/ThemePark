import Attractions.Rollercoaster;
import Attractions.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Visitor visitor;
    Visitor visitor2;
    Rollercoaster rollercoaster;

    @Before
    public void before(){
        visitor = new Visitor(170, 23, 300);
        visitor2 = new Visitor(140, 9, 0);
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

    @Test
    public void cantBoardShortPassenger(){
        rollercoaster.boardVisitor(visitor2);
        assertEquals(0, rollercoaster.countPassengers());
    }

    @Test
    public void canAddNotSoShortPassengers(){
        rollercoaster.boardVisitor(visitor);
        assertEquals(1, rollercoaster.countPassengers());

    }

};
