import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HotelTest {
    Hotel hotel;
    Bedroom room1;
    Bedroom room2;
    Bedroom room3;
    ConferenceRoom room4;
    ConferenceRoom room5;
    ConferenceRoom room6;
    Guest guest1;


    @Before
    public void before(){
        hotel = new Hotel();
        room1 = new Bedroom(1, 201, RoomType.SINGLE);
        room2 = new Bedroom(2, 205, RoomType.DOUBLE);
        room3 = new Bedroom(3, 210, RoomType.FAMILY);
        room4 = new ConferenceRoom(30, "Garden view");
        room5 = new ConferenceRoom(20, "Seaside");
        room6 = new ConferenceRoom(30, "Grand hall");
        guest1 = new Guest("Robert Peacock");
        hotel.addBedroom(room1);
        hotel.addBedroom(room2);
        hotel.addBedroom(room3);
        hotel.addConferenceRoom(room4);
        hotel.addConferenceRoom(room5);
        hotel.addConferenceRoom(room6);


    }
//    @Test
//    public void canAddBedroom(){
//        hotel.addBedroom(room1);
//        assertEquals(1, hotel.countBedrooms());
//    }
//    @Test
//    public void canAddConferenceRoom(){
//        hotel.addConferenceRoom(room4);
//        assertEquals(1, hotel.countConferenceRooms());
//    }
    @Test
    public void canAddGuestsToBedrooms(){
        hotel.checkInToBedroom(room1, guest1);
        assertEquals(1, room1.countGuests());
    }
    @Test
    public void canAddGuestsToConferenceRoom(){
        hotel.checkInToConferenceRoom(room4, guest1);
        assertEquals(1, room4.countGuests());
    }
    @Test
    public void canRemoveGuestsFromBedrooms(){
        hotel.checkInToBedroom(room1, guest1);
        hotel.checkOutOfBedroom(room1, guest1);
        assertEquals(0, room1.countGuests());
    }
    @Test
    public void canRemoveGuestsFromConferenceRooms(){
        hotel.checkInToConferenceRoom(room4, guest1);
        hotel.checkOutOfConferenceRoom(room4, guest1);
        assertEquals(0, room4.countGuests());
    }



}
