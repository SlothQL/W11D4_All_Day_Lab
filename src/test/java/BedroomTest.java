import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 5, RoomType.DOUBLE);
    }
    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }
    @Test
    public void hasRoomNumber(){
        assertEquals(5, bedroom.getRoomNumber());
    }
    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }
    @Test
    public void doubleHasValue2(){
        assertEquals(2, bedroom.getValueFromEnum());
    }
    @Test
    public void hasAccessToArrayList(){
        assertEquals(0, bedroom.countGuests());
    }

}
