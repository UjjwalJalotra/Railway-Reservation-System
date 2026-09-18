import java.util.ArrayList;
import java.util.Scanner;
class Train{
    int trainNumber;
    String trainName;
    String source;
    String destination;
    int totalSeats;
    int availableSeats;
 Train(int trainNumber,String trainName,String source,String destination,int totalSeats){
    this.trainNumber=trainNumber;
    this.trainName=trainName;
    this.source=source;
    this.destination=destination;
    this.totalSeats=totalSeats;
    this.availableSeats=totalSeats;}
void displayTd(){
    System.out.println(trainNumber);
    System.out.println(trainName);
    System.out.println(source);
    System.out.println(destination);
    System.out.println(totalSeats);
     
}
}

public class main{
    public static void main(String[]args){

     
    Scanner sc= new Scanner(System.in);
    /*System.out.println("Enter the train number");
    int trainNumber= sc.nextInt();
    System.out.println("Enter the train name");
    String trainName= sc.nextLine();
    sc.nextLine();
    System.out.println("Enter the source");
    String source= sc.nextLine();
    System.out.println("Enter the destination");
    String destination= sc.nextLine();
    System.out.println("Enter the total seats");
    int totalSeats= sc.nextInt();*/
    ArrayList<Train> trains= new ArrayList<>();
    
    Train t1= new Train(12951,"Karnataka Express","New Delhi","Banglore",200);
    trains.add(t1);
    Train t2= new Train(12952, "Mumbai Rajdhani", "Mumbai", "New Delhi", 150);
    Train t3=new Train(12002, "Shatabdi Express", "New Delhi","Bhopal", 100);
    trains.add(t2);
    trains.add(t3);
    for(Train t: trains){
        t.displayTd();
    }
    System.out.println("Enter the source");
    String source= sc.nextLine();
    System.out.println("Enter the destination");
    String destination= sc.nextLine();
    boolean found= false;
    for(Train t:trains){
        if(t.source.equalsIgnoreCase(source) && t.destination.equalsIgnoreCase(destination)){
            found =true;
            t.displayTd();
        }}
        if (!found){
            System.out.println("no trains found on this route");
        }
        ArrayList<Passenger> Passengers = new ArrayList<>();

 System.out.println("Enter your name:");
String name = sc.nextLine();

System.out.println("Enter username:");
String username = sc.nextLine();

System.out.println("Enter password:");
String password = sc.nextLine();

Passenger p1 = new Passenger(name, username, password);
Passengers.add(p1);

System.out.println("Registration successful!");
System.out.println("\n--- LOGIN ---");

System.out.println("Enter username:");
String loginUsername = sc.nextLine();

System.out.println("Enter password:");
String loginPassword = sc.nextLine();

boolean loginSuccess = false;

for (Passenger p : Passengers) {
    if (p.username.equals(loginUsername) &&
        p.password.equals(loginPassword)) {

        loginSuccess = true;
        System.out.println("Login successful!");
        System.out.println("Welcome " + p.name);
         } else {
            System.out.println("Not enough seats available.");
        } 
ArrayList<Booking> bookings = new ArrayList<>();
System.out.println("\n--- AVAILABLE TRAINS ---");

ArrayList<Train> availableTrains = new ArrayList<>();

for (Train t : trains) {
    if (t.source.equalsIgnoreCase(source) &&
        t.destination.equalsIgnoreCase(destination)) {

        availableTrains.add(t);

        System.out.println(availableTrains.size() + ". "
                + t.trainName + " (" + t.trainNumber + ")");
        System.out.println("   Available Seats: " + t.availableSeats);
    }
}

if (availableTrains.size() == 0) {
    System.out.println("No trains available.");
} else {

    System.out.println("\nSelect train:");
    int choice = sc.nextInt();

    Train selectedTrain = availableTrains.get(choice - 1);

    System.out.println("Enter number of seats:");
    int seats = sc.nextInt();

    if (seats <= selectedTrain.availableSeats) {

        selectedTrain.availableSeats =
                selectedTrain.availableSeats - seats;

        String pnr = "PNR" + (bookings.size() + 1001);

        Booking b = new Booking(
                pnr, p, selectedTrain, seats);

        bookings.add(b);

        System.out.println("\nBooking successful!");
        b.displayTicket();
        System.out.println("\nDo you want to cancel this ticket? (yes/no)");
sc.nextLine();
String cancel = sc.nextLine();

if (cancel.equalsIgnoreCase("yes")) {

    bookings.remove(b);
    selectedTrain.availableSeats =
            selectedTrain.availableSeats + seats;

    System.out.println("Ticket cancelled successfully!");
    bookings.add(b);
    System.out.println("\n--- BOOKING HISTORY ---");

if (bookings.size() == 0) {

    System.out.println("No bookings found.");

} else {

    for (Booking booking : bookings) {

        if (booking.passenger.username.equals(p.username)) {
            booking.displayTicket();
        }
    }
}

}

    } else {
        System.out.println("Not enough seats available.");
    }
}

 

       

  

if (!loginSuccess) {
    System.out.println("Invalid username or password");
}
    





}}}