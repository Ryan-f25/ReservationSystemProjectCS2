public class Reservation {

    public int numberOfGuests;
    public int timeOfReservation;
    public int timeResWasMade;
    public String name;

    //constructor
    public Reservation(int PnumberOfGuests, int PtimeOfReservation, int PtimeResWasMade, String Pname){
        numberOfGuests = PnumberOfGuests;
        timeOfReservation = PtimeOfReservation;
        timeResWasMade=PtimeResWasMade;
        name = Pname;
    }

    public String getName(){
        return name;
    }



    //print method with attributes
    public String toString(){
        return "The party, " + name + ", has a reservation for " + numberOfGuests + " guests at " + timeOfReservation + ". This reservation was placed at " + timeResWasMade;

    }
}
