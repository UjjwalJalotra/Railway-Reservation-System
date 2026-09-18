Railway Reservation System
A Java-based desktop application developed using Java Swing to simplify railway train searching and passenger ticket reservation.
Project Information
Project Title: Railway Reservation System
Student: Ujjwal Jalotra
Registration Number: 25BAI10118
Institution: VIT Bhopal University
Project Type: Individual Academic Project
Overview
The Railway Reservation System is designed to provide a simple and user-friendly interface for passengers. The application allows users to register, log in, search trains by source and destination, view seat availability, book tickets, generate a PNR, view booking history, and cancel tickets.
The project demonstrates the practical use of Java Object-Oriented Programming and GUI-based event handling.
Technologies Used
Java
Java Swing
Object-Oriented Programming
ArrayList Collections
Event Handling and Action Listeners
Basic Input Validation
In-memory Data Storage
Main Features
Passenger Registration
Passengers can register by entering their name, username, and password. The information is stored in an ArrayList of Passenger objects during program execution.
Passenger Login
Registered passengers can log in using their username and password. The system verifies the credentials and displays a success or error message.
Passenger Dashboard
After login, the passenger can access options such as:
Search and Book Train
Booking History
Cancel Ticket
Logout
Train Search
Passengers can search for trains by entering the source and destination. Matching trains are displayed with train numbers, train names, and available seats.
Seat Availability
Each train stores its total seats and available seats. The available seat count is updated after a successful booking.
Ticket Booking
The booking workflow includes:
Enter source and destination.
View available trains.
Select a train.
Enter the number of seats.
Validate seat availability.
Generate a PNR.
Create and display booking details.
Booking History and Cancellation
The project is designed to display the logged-in passenger's booking history and support ticket cancellation using a PNR. After successful cancellation, booked seats should be restored.
Note: Verify the latest source code before claiming that every feature is fully integrated.
Project Structure
Railway-Reservation-System/
│
├── RailwayGUI.java
├── Passenger.java
├── Train.java
├── Booking.java
└── README.md
Passenger.java
Stores passenger information:
name
username
password
Train.java
Stores train information:
trainNumber
trainName
source
destination
totalSeats
availableSeats
Booking.java
Stores the PNR, passenger reference, train reference, and number of seats. It also displays ticket details.
RailwayGUI.java
Creates the graphical user interface using Java Swing and manages registration, login, passenger dashboard, train search, and reservation operations.
Application Workflow
Start
  |
  v
Main GUI
  |
  +--> Register --> Passenger Created
  |
  +--> Login --> Validate Credentials
                    |
                    v
            Passenger Dashboard
                    |
       +------------+------------+------------+
       |            |            |            |
  Search/Book   History     Cancel       Logout
       |
       v
Display Trains --> Select Train --> Enter Seats
       |
       v
Validate Availability --> Generate PNR --> Display Ticket
Object-Oriented Concepts Used
Classes and Objects: Separate classes represent passengers, trains, and bookings.
Constructors: Parameterized constructors initialize object data.
Collections: ArrayList stores multiple passengers, trains, and bookings.
Conditional Statements: Used for login, searching, and seat validation.
Loops: Used to search records in collections.
Event-Driven Programming: Swing action listeners connect buttons with operations.
Validation and Error Handling
The application should validate:
Empty or cancelled dialog input
Incorrect login credentials
Unavailable routes
Invalid train selection
Invalid seat quantity
Booking requests exceeding available seats
Invalid PNR during cancellation
Testing
Test Case	Expected Result
Valid registration	Passenger is registered
Correct login	Passenger dashboard opens
Incorrect login	Error message is displayed
Available route search	Matching trains are displayed
Unavailable route search	No-trains message is displayed
Booking within seat limit	Booking is created and seats decrease
Booking beyond seat limit	Booking is rejected
Booking history	Passenger bookings are displayed
Valid cancellation	Booking is cancelled and seats are restored
Limitations
Data is stored in memory and may be lost when the application closes.
The project is intended for academic demonstration.
Passwords are not stored using production-level security methods.
The system is not connected to a live railway database or payment gateway.
Real-time schedules and live seat availability are not included.
Future Enhancements
File handling or database integration
Secure password hashing
Admin panel for train management
Journey dates and train schedules
Coach and seat-number allocation
Online payment integration
Email or SMS ticket confirmation
PDF ticket generation
Improved GUI design
Search filters based on date, class, and price
How to Run the Project
Prerequisites
Install Java JDK.
Use an IDE such as VS Code, IntelliJ IDEA, or Eclipse.
Keep all Java files in the same project folder.
Steps
Open the project folder in your IDE.
Check that file names and class names match.
Compile the Java files.
Run RailwayGUI.java.
Example terminal commands:
javac *.java
java RailwayGUI
Author
Ujjwal Jalotra
Registration Number: 25BAI10118
VIT Bhopal University
Disclaimer
This project is developed for academic and learning purposes. It is not connected to official railway reservation infrastructure and cannot be used for real ticket booking.
