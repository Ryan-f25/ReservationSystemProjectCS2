import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import java.util.ArrayList;

public class reservationSystem {
    public static int count = 0;

    public static ArrayList<Integer> reservations = new ArrayList<Integer>();
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
        displayReservations();
        Reservation Bill = new Reservation(4,12,2,"Bill");
        Bill.toString();

    }

    public static void addReservation(int PnumberOfGuests, int PtimeOfReservation, int PtimeResWasMade, String Pname){
      if (count<10) {
          reservations.add( new Reservation(PnumberOfGuests, PtimeOfReservation, PtimeResWasMade, Pname);
          count++;
      }

    }

    public static void displayReservations(){
        for (int n=0; n<reservations.length; n++) {
            System.out.println(reservations.size);
        }

    }

    public static void cancelReservation(){

    }

}
