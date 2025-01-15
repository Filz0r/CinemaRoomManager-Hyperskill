
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



Use code with caution.Markdown

    Show the seats

    Buy a ticket

    Statistics

    Exit


*   **1. Show the seats:** Displays the current layout of the cinema hall.
*   **2. Buy a ticket:** Prompts you to enter the row and seat number. Once purchased, the seat status is updated, and the ticket price is displayed.
*   **3. Statistics:** Shows the overall statistics of the theatre.
*   **0. Exit:** Closes the application.

## Example Interaction



Use code with caution.

Enter the number of rows:

    7
    Enter the number of seats in each row:
    8

    Show the seats

    Buy a ticket

    Statistics

    Exit

    1

Cinema:
1 2 3 4 5 6 7 8
1 S S S S S S S S
2 S S S S S S S S
3 S S S S S S S S
4 S S S S S S S S
5 S S S S S S S S
6 S S S S S S S S
7 S S S S S S S S

    Show the seats

    Buy a ticket

    Statistics

    Exit

    2

Enter a row number:

    4
    Enter a seat number in that row:
    6

Ticket price: $10

    Show the seats

    Buy a ticket

    Statistics

    Exit

    1

Cinema:
1 2 3 4 5 6 7 8
1 S S S S S S S S
2 S S S S S S S S
3 S S S S S S S S
4 S S S S S B S S
5 S S S S S S S S
6 S S S S S S S S
7 S S S S S S S S

    Show the seats

    Buy a ticket

    Statistics

    Exit

    3
    Number of purchased tickets: 1
    Percentage: 1.79%
    Current income: $10
    Total income: $560

    Show the seats

    Buy a ticket

    Statistics

    Exit

    0


## Code Structure

*   `Cinema.java`: The main class containing the core logic of the application.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.



Use code with caution.

MIT License

Copyright (c) 2025 Filipe Figueiredo

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.


## Contributing

Feel free to fork the repository and contribute to its development. Any enhancements or bug fixes are welcome.

---

Enjoy your time at the virtual cinema! 🍿