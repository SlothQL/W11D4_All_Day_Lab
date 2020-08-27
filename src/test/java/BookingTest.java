import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 201, RoomType.SINGLE, 40);
        booking = new Booking(bedroom, 4);
    }
    @Test
    public void hasBedroom(){
        assertEquals(bedroom, booking.getBedroom());
    }
    @Test
    public void numberOfNights(){
        assertEquals(4, booking.getNumberOfNights());
    }
    @Test
    public void canReturnTotalBill(){
        assertEquals(160, booking.getTotal());
    }


}
