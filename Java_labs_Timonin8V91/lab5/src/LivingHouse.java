class LivingHouse extends SampleBuilding implements Building{
    int floors_count;
    int flats_count;
    public LivingHouse(String street, String city, int houseNum, String postal_code, int floors_count, int flats_count) {
        super(street, city, houseNum, postal_code);
        this.floors_count = floors_count;
        this.flats_count = flats_count;
    }

    public int getFloors() {
        return floors_count;
    }

    public void setFloors(int flats_count) {
        this.floors_count = flats_count;
    }

    public int getFlats() {
        return flats_count;
    }

    public void setFlats(int area) {
        this.flats_count = area;
    }

    public String getDescription() {
        String address = houseNum + " " + street + ", " + city;
        return "Living house information: Located in " + address + ", have " + floors_count + " floors and " + flats_count + " flats.";
    }

}