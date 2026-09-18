# Railway Reservation System – Project Statement

## 1. Problem Statement

The Railway Reservation System is a Java Swing-based desktop application developed to simplify the basic process of railway ticket reservation. The system allows passengers to register and log in, search for available trains based on source and destination, select a train, book seats, generate a unique PNR, view booking history, and cancel tickets.

The project aims to demonstrate how Object-Oriented Programming concepts and Java collections can be used to implement a simple railway reservation workflow in a desktop application.

---

## 2. Scope of the Project

The scope of this project is to provide a basic desktop-based railway ticket reservation system for academic and learning purposes.

The system covers:

- Passenger registration and login.
- Searching trains using source and destination.
- Displaying available trains and seats.
- Selecting a train for reservation.
- Booking one or more seats.
- Selecting a journey date.
- Generating a unique PNR for each booking.
- Displaying ticket details after successful booking.
- Viewing passenger booking history.
- Cancelling an existing ticket.
- Updating seat availability after booking or cancellation.
- Providing a simple graphical user interface using Java Swing.

The current implementation uses in-memory data structures such as ArrayList. Therefore, data is temporary and is lost when the application is closed. Database integration, online payments, and real-time railway information are outside the current scope.

---

## 3. Target Users

The primary target users of the system are:

- **Passengers:** Users who want to register, log in, search for trains, book tickets, view their booking history, and cancel tickets.
- **Students/Learners:** Users who want to understand the implementation of Object-Oriented Programming, Java Swing, ArrayList, and basic reservation logic through a practical project.

The current version is designed as an academic prototype rather than a production railway booking platform.

---

## 4. High-Level Features

### 4.1 Passenger Registration
Users can create an account by providing their name, username, and password.

### 4.2 Passenger Login
Registered passengers can log in using their username and password.

### 4.3 Train Search
Passengers can search for trains by entering the source and destination stations.

### 4.4 Train Selection
The system displays matching trains along with their train numbers and available seats.

### 4.5 Ticket Booking
Passengers can select a train, enter the number of seats, provide the journey date, and complete a reservation if sufficient seats are available.

### 4.6 PNR Generation
A unique PNR is generated for each successful booking.

### 4.7 Ticket Display
After successful booking, the system displays passenger, train, journey, seat, date, and PNR details.

### 4.8 Booking History
Passengers can view their previous/current booking details through the booking history option.

### 4.9 Ticket Cancellation
Passengers can cancel a booking using its PNR.

### 4.10 Seat Availability Update
The available seat count is reduced after booking and restored when a ticket is cancelled.

### 4.11 Graphical User Interface
The application uses Java Swing components such as JFrame, JButton, JLabel, JPanel, and JOptionPane to provide a desktop GUI.

### 4.12 Object-Oriented Implementation
The project uses classes such as Passenger, Booking, Train, and RailwayGUI to represent different entities and application functionality.

---

## 5. Project Limitations

The current academic version has the following limitations:

- Data is stored temporarily in memory using ArrayList.
- Data is lost when the application is closed.
- No database is currently connected.
- Train information is predefined.
- No online payment system is implemented.
- The application does not provide real-time railway information.
- The system is designed as a desktop-based academic prototype.

---

## 6. Future Scope

The system can be extended in the future by adding:

- MySQL or another database for permanent data storage.
- Admin dashboard for train and reservation management.
- Online payment integration.
- Improved seat selection.
- Password encryption and stronger authentication.
- Real-time train and seat information.
- Enhanced graphical user interface.
- Permanent booking and passenger records.
