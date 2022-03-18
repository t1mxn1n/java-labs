class Thing extends Room {
    String thing_name;
    public Thing(String street, String city, int houseNum, String postal_code,
                 int flat_number, int area, String type_room, String thing_name) {
        super(street, city, houseNum, postal_code, flat_number, area, type_room);
        this.thing_name = thing_name;
    }

    public String getThing_name() {
        return thing_name;
    }

    public void setThing_name(String thing_name) {
        this.thing_name = thing_name;
    }

    public String getDescription() {
        return "Info about thing: This is " + thing_name + ", located in " + type_room;
    }
}