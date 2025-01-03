package hotelmanagementsystem;

import java.util.*;;

public class HotelManagementApp {
    public static void main(String[] args) {
        HotelManagementSystem hotel = new HotelManagementSystem();

        // Adding sample rooms
        hotel.addRoom(new SingleRoom("101", 100));
        hotel.addRoom(new DoubleRoom("102", 150));
        hotel.addRoom(new SuiteRoom("201", 300));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nHotel Management System Options:");
            System.out.println("1. Display Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Check Out a Room");
            System.out.println("4. Search Room by Price");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    hotel.displayAvailableRooms();
                    break;
                case 2:
                    System.out.println("Enter Room Number to book:");
                    String roomNumber = scanner.nextLine();
                    System.out.println("Enter number of nights:");
                    int nights = scanner.nextInt();
                    hotel.bookRoom(roomNumber, nights);
                    break;
                case 3:
                    System.out.println("Enter Room Number to check out:");
                    String checkOutRoomNumber = scanner.nextLine();
                    hotel.checkOutRoom(checkOutRoomNumber);
                    break;
                case 4:
                    System.out.println("Enter minimum price:");
                    double minPrice = scanner.nextDouble();
                    System.out.println("Enter maximum price:");
                    double maxPrice = scanner.nextDouble();
                    hotel.searchRoomByPrice(minPrice, maxPrice);
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
