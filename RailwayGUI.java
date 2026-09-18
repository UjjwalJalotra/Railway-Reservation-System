import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class RailwayGUI {
    static ArrayList<Passenger> Passengers = new ArrayList<>();

static ArrayList<Booking> bookings = new ArrayList<>();
static int pnrCounter = 1001;
    static void showPassengerMenu(JFrame frame, Passenger p) {

      
        ArrayList<Train> trains = new ArrayList<>();

{
    trains.add(new Train(12951, "Karnataka Express", "New Delhi", "Mumbai", 100));
    trains.add(new Train(12952, "Mumbai Rajdhani", "Mumbai", "New Delhi", 100));
    trains.add(new Train(12002, "Shatabdi Express", "New Delhi", "Bhopal", 100));
}
        

    JFrame menu = new JFrame("Passenger Menu");

    menu.setSize(500, 400);
    menu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    menu.setLayout(new GridLayout(5, 1, 10, 10));

    JLabel welcome = new JLabel(
            "Welcome " + p.name,
            SwingConstants.CENTER
    );

    JButton searchButton = new JButton("Search & Book Train");
    JButton historyButton = new JButton("Booking History");
    JButton cancelButton = new JButton("Cancel Ticket");
    JButton logoutButton = new JButton("Logout");

    menu.add(welcome);
    menu.add(searchButton);
    menu.add(historyButton);
    menu.add(cancelButton);
    menu.add(logoutButton);

    logoutButton.addActionListener(e -> {
        menu.dispose();
    });
searchButton.addActionListener(e -> {

    String source = JOptionPane.showInputDialog(menu, "Enter Source:");
    String destination = JOptionPane.showInputDialog(menu, "Enter Destination:");

    if (source == null || destination == null) return;

    ArrayList<Train> matchingTrains = new ArrayList<>();

    for (Train t : trains) {
        if (t.source.equalsIgnoreCase(source)
                && t.destination.equalsIgnoreCase(destination)) {
            matchingTrains.add(t);
        }
    }

    if (matchingTrains.isEmpty()) {
        JOptionPane.showMessageDialog(menu, "No trains found on this route.");
        return;
    }

    String result = "";

    for (Train t : matchingTrains) {
        result += "Train No: " + t.trainNumber
                + "\nTrain Name: " + t.trainName
                + "\nAvailable Seats: " + t.availableSeats
                + "\n\n";
    }

    JOptionPane.showMessageDialog(menu, result);

    String trainNumberInput = JOptionPane.showInputDialog(
            menu, "Enter Train Number to Book:");

    if (trainNumberInput == null) return;

    int trainNumber = Integer.parseInt(trainNumberInput);
    Train selectedTrain = null;

    for (Train t : matchingTrains) {
        if (t.trainNumber == trainNumber) {
            selectedTrain = t;
            break;
        }
    }

    if (selectedTrain == null) {
        JOptionPane.showMessageDialog(menu, "Invalid Train Number!");
        return;
    }

    String seatsInput = JOptionPane.showInputDialog(
            menu, "Enter Number of Seats:");

    if (seatsInput == null) return;

    int seats = Integer.parseInt(seatsInput);
    String date = JOptionPane.showInputDialog(
        menu, "Enter Journey Date (DD-MM-YYYY):");

if (date == null || date.isEmpty()) return;

    if (seats <= 0 || seats > selectedTrain.availableSeats) {
        JOptionPane.showMessageDialog(menu, "Seats not available!");
        return;
    }

    selectedTrain.availableSeats -= seats;

    String pnr = "PNR" + pnrCounter++;

    Booking booking = new Booking(
            pnr, p, selectedTrain, seats, date
    );

    bookings.add(booking);

    String ticket = "\n--- TICKET ---"
            + "\nPNR: " + booking.pnr
            + "\nPassenger: " + booking.passenger.name
            + "\nTrain: " + booking.train.trainName
            + "\nFrom: " + booking.train.source
            + "\nTo: " + booking.train.destination
            + "\nSeats: " + booking.seats
            + "\nJourney Date: " + booking.date;
             

    JOptionPane.showMessageDialog(menu, ticket, "Booking Successful",
            JOptionPane.INFORMATION_MESSAGE);
});



 historyButton.addActionListener(e -> {

    String history = "";

    for (Booking b : bookings) {
        if (b.passenger == p) {
            history += "PNR: " + b.pnr
                    + "\nPassenger: " + b.passenger.name
                    + "\nTrain: " + b.train.trainName
                    + "\nFrom: " + b.train.source
                    + "\nTo: " + b.train.destination
                    + "\nDate: " + b.date
                    + "\nSeats: " + b.seats
                    + "\n-------------------\n";
        }
    }

    if (history.isEmpty()) {
        history = "No booking history found!";
    }

    JOptionPane.showMessageDialog(menu, history, "Booking History",
            JOptionPane.INFORMATION_MESSAGE);
});

cancelButton.addActionListener(e -> {

    String pnr = JOptionPane.showInputDialog(
            menu, "Enter PNR to Cancel:");

    if (pnr == null || pnr.isEmpty()) return;

    Booking foundBooking = null;

    for (Booking b : bookings) {
        if (b.pnr.equalsIgnoreCase(pnr)
                && b.passenger == p) {
            foundBooking = b;
            break;
        }
    }

    if (foundBooking == null) {
        JOptionPane.showMessageDialog(menu,
                "Booking not found!");
        return;
    }

    foundBooking.train.availableSeats += foundBooking.seats;
    bookings.remove(foundBooking);

    JOptionPane.showMessageDialog(menu,
            "Ticket Cancelled Successfully!\nPNR: " + pnr);
});

    menu.setLocationRelativeTo(null);
    menu.setVisible(true);
}
    static ArrayList<Passenger> passengers = new ArrayList<>();

    public static void main(String[] args) {

        JFrame frame = new JFrame("Railway Reservation System");

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel title = new JLabel(
                "RAILWAY RESERVATION SYSTEM",
                SwingConstants.CENTER
        );

        title.setFont(new Font("Arial", Font.BOLD, 24));

        frame.add(title, BorderLayout.NORTH);

        JPanel panel = new JPanel();

        JButton registerButton = new JButton("Register");
        JButton loginButton = new JButton("Login");
        JButton exitButton = new JButton("Exit");
        registerButton.addActionListener(e -> {

    String name = JOptionPane.showInputDialog(
            frame, "Enter your name:");

    String username = JOptionPane.showInputDialog(
            frame, "Enter username:");

    String password = JOptionPane.showInputDialog(
            frame, "Enter password:");

     if (name != null && username != null && password != null) {

    Passenger p = new Passenger(name, username, password);

    passengers.add(p);

    JOptionPane.showMessageDialog(
            frame, "Registration Successful!");
}
});


loginButton.addActionListener(e -> {

    String username = JOptionPane.showInputDialog(
            frame, "Enter username:");

    String password = JOptionPane.showInputDialog(
            frame, "Enter password:");

     boolean loginSuccess = false;

for (Passenger p : passengers) {

    if (p.username.equals(username) &&
        p.password.equals(password)) {

        loginSuccess = true;

        JOptionPane.showMessageDialog(
                frame,
                "Login Successful!\nWelcome " + p.name
        );
        showPassengerMenu(frame, p);

        break;
    }
}

if (!loginSuccess) {

    JOptionPane.showMessageDialog(
            frame,
            "Invalid Username or Password!"
    );
}
});

        panel.add(registerButton);
        panel.add(loginButton);
        panel.add(exitButton);

        frame.add(panel, BorderLayout.CENTER);

        exitButton.addActionListener(e -> {
            System.exit(0);
        });

        frame.setVisible(true);
    }
}