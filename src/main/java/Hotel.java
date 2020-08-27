import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms =  new ArrayList<ConferenceRoom>();
    }
    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }
    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }
    public int countBedrooms(){
        return this.bedrooms.size();
    }
    public int countConferenceRooms(){
        return this.conferenceRooms.size();
    }

    public void checkInToBedroom(Bedroom room, Guest guest) {
        room.addGuests(guest);


    }
    public void checkInToConferenceRoom(ConferenceRoom room, Guest guest){
        room.addGuests(guest);

    }
    public void checkOutOfBedroom(Bedroom room, Guest guest){
        room.removeGuests(guest);
    }
    public void checkOutOfConferenceRoom(ConferenceRoom room, Guest guest){
        room.removeGuests(guest);
    }
}
