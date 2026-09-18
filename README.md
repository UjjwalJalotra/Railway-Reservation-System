# 🚆 Railway Reservation System

A Java Swing-based desktop application that allows passengers to register, log in, search trains, book tickets, view booking history, and cancel tickets.

## 📌 Project Overview

The Railway Reservation System is developed using **Core Java, Java Swing, OOP concepts, and ArrayList**. It provides a simple graphical user interface for managing railway ticket reservations.

This project is developed as part of a 2nd-year B.Tech academic project at **VIT Bhopal University**.

## ✨ Features

- Passenger Registration and Login
- Train Search by Source and Destination
- Train Number Selection
- Ticket Booking
- Journey Date Selection
- Automatic PNR Generation
- Ticket Display
- Booking History
- Ticket Cancellation
- Automatic Seat Availability Update
- Logout

## 🛠️ Technologies Used

- **Language:** Java
- **GUI:** Java Swing
- **Concepts:** Object-Oriented Programming (OOP)
- **Data Structure:** ArrayList
- **IDE:** VS Code / IntelliJ IDEA / Eclipse

## 📂 Project Structure

```text
RailwayReservationSystem/
│
├── Passenger.java
├── main.java
├── Booking.java
├── RailwayGUI.java
└── README.md
```

| Class | Description |
|---|---|
| `Passenger.java` | Stores passenger name, username, and password |
| main.java` | Stores train details and available seats |
| `Booking.java` | Stores PNR, passenger, train, seats, and journey date |
| `RailwayGUI.java` | Contains the GUI and application logic |

## ⚙️ Requirements

- Java Development Kit (JDK 8 or above)
- VS Code, IntelliJ IDEA, Eclipse, or any Java-compatible IDE

Check installation:

```bash
java -version
javac -version
```

## 🚀 How to Run

### 1. Clone the Repository

```bash
https://github.com/UjjwalJalotra/Railway-Reservation-System.git
```

Replace the placeholder with your actual GitHub repository URL.

### 2. Open the Project

Open the downloaded folder in your Java IDE. Keep all `.java` files in the same folder.

### 3. Compile the Project

Open the terminal inside the project folder and run:

```bash
javac *.java
```

### 4. Run the Application

```bash
java RailwayGUI
```

## 🖥️ How to Use

1. Select **Register** and enter your name, username, and password.
2. Select **Login** using the registered credentials.
3. Open **Search & Book Train**.
4. Enter the source and destination.
5. Select a train using its train number.
6. Enter the number of seats and journey date.
7. View the generated ticket and PNR.
8. Open **Booking History** to view previous bookings.
9. Use **Cancel Ticket** and enter the PNR to cancel a ticket.
10. Select **Logout** to close the passenger dashboard.

## 🚆 Sample Train Data

| Train Number | Train Name | Source | Destination |
|---|---|---|---|
| 12951 | Karnataka Express | New Delhi | Mumbai |
| 12952 | Mumbai Rajdhani | Mumbai | New Delhi |
| 12002 | Shatabdi Express | New Delhi | Bhopal |

Each train initially has 100 available seats in the current implementation.

## ⚠️ Limitations

- Data is stored temporarily using ArrayList.
- Data is lost when the application is closed.
- No database is connected.
- No online payment gateway is implemented.
- Train data is predefined in the source code.
- This is a desktop-based academic prototype.

## 🔮 Future Enhancements

- MySQL database integration
- Admin dashboard
- Online payment integration
- Permanent booking storage
- Improved seat selection
- Password encryption
- Real-time train information
- Enhanced user interface

## 👨‍💻 Developer

**Ujjwal Jalotra**

- Registration Number: 25BAI10118
- University: VIT Bhopal University
- Course: B.Tech (Artificial Intelligence & Machine Learning)
- Year: 2nd Year

## 📄 License

This project is developed for educational and academic purposes.
