class Booking {

    String pnr;
    Passenger passenger;
    Train train;
    int seats;
    String date;

    Booking(String pnr, Passenger passenger, Train train, int seats, String date) {
        this.pnr = pnr;
        this.passenger = passenger;
        this.train = train;
        this.seats = seats;
        this.date=date;
    }

    void displayTicket() {
        System.out.println("\n--- TICKET ---");
        System.out.println("PNR: " + pnr);
        System.out.println("Passenger: " + passenger.name);
        System.out.println("Train: " + train.trainName);
        System.out.println("From: " + train.source);
        System.out.println("To: " + train.destination);
        System.out.println("Seats: " + seats);
        System.out.println("Journey Date: " + date);
    }
}