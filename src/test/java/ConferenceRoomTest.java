import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(30, "Garden view");

    }
    @Test
    public void hasName(){
        assertEquals("Garden view", conferenceRoom.getName());
    }
    @Test
    public void hasCapacity(){
        assertEquals(30, conferenceRoom.getCapacity());
    }
    @Test
    public void hasAccessToArrayList(){
        assertEquals(0, conferenceRoom.countGuests());
    }

}
