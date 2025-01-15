
# 🎬 Welcome to the Cinema Room Manager 🎬

## Project Overview

This Java application simulates a basic cinema room management system. It allows users to:

*   **Visualize the seating arrangement:** See which seats are available and which have been purchased.
*   **Purchase tickets:** Choose a specific row and seat to reserve.
*   **View statistics:** Get insights into ticket sales, occupancy, current income, and total potential income.

It's a perfect starting point for understanding console-based interactive applications and working with 2D arrays.

## Features

*   **Interactive Menu:** A user-friendly text-based menu guides users through the application.
*   **Seat Selection:** Allows users to buy tickets for specific row and seat combinations.
*   **Seat Visualization:** The seating arrangement is displayed with 'S' for available seats and 'B' for booked seats.
*   **Dynamic Pricing:** Ticket prices vary based on the number of seats in the theater. If the cinema is 60 seats or less, the price will be $10. If not, the price will be $10 for seats in the first half and $8 for seats in the second half.
*   **Statistics:** Displays the number of purchased tickets, percentage of seats occupied, current revenue and total potential revenue.
*   **Robust Input Handling:** Ensures the application doesn't crash due to invalid user input.

## How to Run

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/Filz0r/CinemaRoomManager-Hyperskill
    cd CinemaRoomManager-Hyperskill
    ```
2.  **Compile the code:**
    ```bash
    javac cinema/Cinema.java
    ```
3.  **Run the application:**
    ```bash
    java cinema.Cinema
    ```

## Usage

Upon running the application, you'll be presented with the following menu:


*   **1. Show the seats:** Displays the current layout of the cinema hall.
*   **2. Buy a ticket:** Prompts you to enter the row and seat number. Once purchased, the seat status is updated, and the ticket price is displayed.
*   **3. Statistics:** Shows the overall statistics of the theatre.
*   **0. Exit:** Closes the application.

## Contributing

Feel free to fork the repository and contribute to its development. Any enhancements or bug fixes are welcome.

---

Enjoy your time at the virtual cinema! 🍿
