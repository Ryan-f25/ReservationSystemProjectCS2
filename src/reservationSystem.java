import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import java.util.ArrayList;

public class reservationSystem {
    public static int count = 0;

    public static ArrayList<Reservation> reservations = new ArrayList<Reservation>();
    //10 is max amount of reservations we can keep

    //methods --> public void addReservation
    //addReservation
    //displayReservation --> show the user all of the reservations
    //cancelReservation
    //sortReservation




    public static void main(String[] args) {
        //this is where you call the methods above
        addReservation(4,1930,12,"Bill");
        addReservation(6,18,2,"Rook");
        addReservation(5,7,2,"Moot");
        addReservation(9,12,6,"Mike");
        displayReservations();


    }

    public static void addReservation(int PnumberOfGuests, int PtimeOfReservation, int PtimeResWasMade, String Pname){
        //This if statement says that if the reservation count is less than 10
        // it will add a new reservation with those attributes
      if (count<10) {
          reservations.add(new Reservation (PnumberOfGuests, PtimeOfReservation, PtimeResWasMade, Pname));
          count++;
      }

    }

    public static void displayReservations(){
        //This for loop goes through the index 0 through 10 and prints out the reservation
        //The if statement says that the reservation should only be printed if there is one
        for (int n=0; n<10; n++) {
            if(reservations.get(n) != null){
                System.out.println(reservations.get(n));

            }

        }

    }

    public static void cancelReservation(){

    }

}
