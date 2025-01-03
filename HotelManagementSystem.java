package hotelmanagementsystem;

import java.util.*;

class HotelManagementSystem {
    private List<Room> rooms;

    public HotelManagementSystem() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println("Room Number: " + room.getRoomNumber() + ", Type: " + room.getRoomType() + ", Price: $" + room.getPricePerNight());
            }
        }
    }

    public void bookRoom(String roomNumber, int nights) {
        for (Room room : rooms) {
            if (room.getRoomNumber().equals(roomNumber) && room.isAvailable()) {
                room.setAvailable(false);
                double totalCost = nights * room.getPricePerNight();
                System.out.println("Room " + roomNumber + " booked for " + nights + " nights. Total cost: $" + totalCost);
                return;
            }
        }
        System.out.println("Room not available or not found.");
    }

    public void checkOutRoom(String roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber().equals(roomNumber) && !room.isAvailable()) {
                room.setAvailable(true);
                System.out.println("Room " + roomNumber + " checked out.");
                return;
            }
        }
        System.out.println("Room not found or already checked out.");
    }

    public void searchRoomByPrice(double minPrice, double maxPrice) {
        System.out.println("Rooms within price range:");
        for (Room room : rooms) {
            if (room.getPricePerNight() >= minPrice && room.getPricePerNight() <= maxPrice) {
                System.out.println("Room Number: " + room.getRoomNumber() + ", Type: " + room.getRoomType() + ", Price: $" + room.getPricePerNight());
            }
        }
    }
}
