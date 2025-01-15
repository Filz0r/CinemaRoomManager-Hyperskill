package cinema;

import java.util.Scanner;


public class Cinema {
    public static int purchasedTickets = 0;
    public static int totalSeats = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = getInputFromUser("Enter the number of rows:\n> ", scanner);
        int seatsPerRow = getInputFromUser("Enter the number of seats in each row:\n> ", scanner);
        totalSeats = rows * seatsPerRow;
        int[][] roomMatrix = new int[rows][seatsPerRow];
        System.out.println();

        int choice = printMenu(scanner);
        while (choice != 0) {
            switch (choice) {
                case 3:
                    printStatistics(roomMatrix);
                    break ;
                case 2:
                    buyTicket(roomMatrix, scanner);
                    break;
                case 1:
                    printSeats(roomMatrix);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            System.out.println();
            choice = printMenu(scanner);
        }
    }

    private static void printStatistics(int[][] room) {
        System.out.printf("Number of purchased tickets: %d\nPercentage: %.2f%%\nCurrent income: $%d\nTotal income: $%d\n",
                purchasedTickets,
                getPercentageBought(),
                calculateTotalRevenue(room),
                calculateRoomPrice(room.length, room[0].length));
    }

    private static int calculateTotalRevenue(int[][] room) {
        int result = 0;
        for (int i = 0; i < room.length; i++) {
            for (int k = 0; k < room[0].length; k++) {
                if (room[i][k] == 1) {
                    int price = calculateSeatPrice(room.length, i);
//                    System.out.printf("Row: %d, Seat: %d, Price: %d\n", i + 1, k + 1, price);
                    result += price;
                }
            }
        }
        return result;
    }

    public static double getPercentageBought() {
        return (purchasedTickets / (double)totalSeats) * 100;
    }

    public static int getInputFromUser(String message, Scanner sc) {
        System.out.print(message);
        boolean stop = false;
        int res = -1;

        while (!stop) {
            try {
                String temp = sc.nextLine();
                res = Integer.parseInt(temp);
                if (res <= 0) {
                    System.out.println("Wrong input!");
                    continue;
                }
                stop = true;
            } catch (Exception e) {
                System.out.println("Wrong input!");
            }
        }
        return res;
    }

    public static int printMenu(Scanner sc) {

        int res;
        while (true) {
            printMenuText();
            try {
                res = Integer.parseInt(sc.nextLine());
                if (res < 0 || res > 3) {
                    System.out.println("Wrong input!");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Wrong input!");
            }
        }
        return res;
    }

    private static void printMenuText() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        System.out.print("> ");
    }

    public static void buyTicket(int[][] room, Scanner scanner) {
        int seatRow;
        int seat;

        while (true) {
            seatRow = getInputFromUser("\nEnter a row number:\n> ", scanner) - 1;
            seat = getInputFromUser("Enter a seat number in that row:\n> ", scanner) - 1;
            if (seatRow >= room.length || seat >= room[0].length) {
                System.out.println("Wrong input!");
                continue;
            }
            if (room[seatRow][seat] == 1) {
                System.out.println("That ticket has already been purchased!");
                continue ;
            }
            room[seatRow][seat] = 1;
            purchasedTickets++;
            break ;
        }

        System.out.println();
        int price = calculateSeatPrice(room.length, seatRow);
        System.out.printf("Ticket price: $%d\n", price);
    }

    public static int calculateSeatPrice(int rows, int row) {
        int ticketPrice;

        if (totalSeats <= 60) {
            ticketPrice = 10;
        } else {
            int firstHalf = rows / 2;
            ticketPrice = row < firstHalf ? 10 : 8;
        }
        return ticketPrice;
    }

    public static int calculateRoomPrice(int rows, int seatsPerRow) {
        int totalSeats = rows * seatsPerRow;
        int totalIncome;
        if (totalSeats <= 60) {
            totalIncome = totalSeats * 10;
        } else {
            int firstHalfRows = rows / 2;
            int secondHalfRows = rows - firstHalfRows;
            int firstHalfPrice = firstHalfRows * seatsPerRow * 10;
            int secondHalfPrice = secondHalfRows * seatsPerRow * 8;
            totalIncome = firstHalfPrice + secondHalfPrice;
        }
        return totalIncome;
    }

    public static void printSeats(int[][] room) {
        System.out.println("\nCinema:");
        for (int i = 0; i < room[0].length; i++) {
            if (i == 0)
                System.out.print("  ");
            System.out.print(i + 1);
            if (i < room[0].length - 1) {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < room.length; i++) {
            System.out.print(i + 1);
            System.out.print(" ");
            for (int k = 0; k < room[0].length; k++) {
                if (room[i][k] == 1) {
                    System.out.print("B");
                } else {
                    System.out.print("S");
                }
                if (k < room[0].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
