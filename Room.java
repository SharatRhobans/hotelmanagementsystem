package hotelmanagementsystem;

abstract class Room {
    private String roomNumber;
    private boolean available;
    private double pricePerNight;

    public Room(String roomNumber, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.available = true;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public abstract String getRoomType();
}
