package hotelmanagementsystem;

class DoubleRoom extends Room {
    public DoubleRoom(String roomNumber, double pricePerNight) {
        super(roomNumber, pricePerNight);
    }

    @Override
    public String getRoomType() {
        return "Double";
    }
}
