class Room extends Flat {
    String type_room;

    public Room(String street, String city, int houseNum, String postal_code, int flat_number, int area, String type_room) {
        super(street, city, houseNum, postal_code, flat_number, area);
        this.type_room = type_room;
    }

    public String getType_room() {
        return type_room;
    }

    public void setType_room(String type_room) {
        this.type_room = type_room;
    }

    public String getDescription() {
        return "Info about room: This " + type_room + " located at: Apartment " + flat_number + ", " + houseNum + " " + street;
    }
}