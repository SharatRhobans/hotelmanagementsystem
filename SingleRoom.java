package hotelmanagementsystem;

class SingleRoom extends Room {
    public SingleRoom(String roomNumber, double pricePerNight) {
        super(roomNumber, pricePerNight);
    }

    @Override
    public String getRoomType() {
        return "Single";
    }
}
