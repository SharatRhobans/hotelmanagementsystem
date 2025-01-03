package hotelmanagementsystem;

class SuiteRoom extends Room {
    public SuiteRoom(String roomNumber, double pricePerNight) {
        super(roomNumber, pricePerNight);
    }

    @Override
    public String getRoomType() {
        return "Suite";
    }
}
