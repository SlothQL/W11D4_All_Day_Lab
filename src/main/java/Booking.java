public class Booking {

    private Bedroom bedroom;
    private int numberOfNights;


    public Booking(Bedroom bedroom, int numberOfNights){
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }
    public int getTotal(){
        int nightlyRate = this.bedroom.getNightlyRate();
        return this.numberOfNights * nightlyRate;
    }


}
