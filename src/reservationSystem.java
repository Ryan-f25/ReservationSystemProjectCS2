import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class reservationSystem {
    public static int count = 0;

    public static ArrayList<Reservation> reservations = new ArrayList<Reservation>();
    //This arraylist is an object of the Reservation class.
    public static ArrayList<Integer> timeForBubbleSort = new ArrayList<Integer>();
    //This arraylist is for the bubble sort method
    //It holds the time of the reservation


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            //Print with differnet options
            System.out.println("Enter 1 to add a reservation");
            System.out.println("Enter 2 to cancel your reservation");
            System.out.println("Enter 3 to change your party size");
            System.out.println("Enter 4 to display all reservation");
            System.out.println("Enter 5 to sort reservation by their time");
            System.out.println("Enter 6 to exit");

            int choice = scanner.nextInt();
            switch(choice){
                case 1: //Adds reservations
                    System.out.println("Enter group size");
                    int groupSize = scanner.nextInt();
                    System.out.println("Enter time for reservation");
                    int time = scanner.nextInt();
                    System.out.println("Enter time reservation was made");
                    int timeMade = scanner.nextInt();
                    System.out.println("Enter party name");
                    String name = scanner.next();
                    addReservation(groupSize, time, timeMade, name);
                    break;
                case 2: //Cancels reservations
                    System.out.println("Enter the party name of the reservation you want to cancel");
                    String pName = scanner.next();
                    cancelReservation(pName);
                    break;
                case 3: //Changes party size in a reservation
                    System.out.println("Enter the party name of the reservation you want to change");
                    pName = scanner.next();
                    System.out.println("Enter the new party size");
                    int newPartySize = scanner.nextInt();
                    changeReservation(pName, newPartySize);
                    break;
                case 4: //Displays current reservations
                    displayReservations();
                    break;
                case 5: //Uses bubble sort to sort reservations by earliest to latest time
                    sortRestervation();
                    break;
                case 6: //Exits the code from scanner
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }

    }

    public static void addReservation(int PnumberOfGuests, int PtimeOfReservation, int PtimeResWasMade, String Pname){
        //This if statement says that if the reservation count is less than 10
        // it will add a new reservation with those attributes
        //The second arraylist just adds the time of reservation to the arraylist as an integer
      if (count<10) {
          reservations.add(new Reservation (PnumberOfGuests, PtimeOfReservation, PtimeResWasMade, Pname));
          timeForBubbleSort.add(PtimeOfReservation);
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

    public static void cancelReservation(String pName){
        //This for loop goes through each index of reservation and removes the index if
        //the name inputed by the user is equal to the party name in the reservation
        for(int i = 0; i < reservations.size();i ++){
            if(reservations.get(i).name.equals(pName)){

                reservations.remove(i);
            }

        }

    }

    public static void sortRestervation() {
        //This code goes through one number at a time and checks to see if it is the largest number
        //it continues to do this until the reservation times are sorted from least to greatest
        for (int n = 0; n < reservations.size(); n++) {
            for (int i = 0; i < reservations.size() - 1; i++) {
                if (reservations.get(i).timeOfReservation > (reservations.get(i + 1).timeOfReservation)) {
                    Reservation tempReservation = reservations.get(i);
                    reservations.set(i, reservations.get(i + 1));
                    reservations.set(i + 1, tempReservation);
                    //Eliana showed me the general format for bubble sort above

                        int tempTimeOfRes = timeForBubbleSort.get(i);
                        timeForBubbleSort.set(i, timeForBubbleSort.get(i + 1));
                        timeForBubbleSort.set(i + 1, tempTimeOfRes);
                    //Eliana also showed me that I needed these three lines above
                }
            }
        }
    }



    public static void changeReservation(String pName, int pNumberOfGuests){
        //This code runs through the indexes of reservations and
        // looks if the inputed party name is equal to the party name in an index
        //If it is the user inputs the new party size and it changes the reservation
        for(int i = 0; i < reservations.size();i ++){
            if(reservations.get(i).name.equals(pName)){
                reservations.get(i).numberOfGuests = pNumberOfGuests;
            }

        }

    }

}
