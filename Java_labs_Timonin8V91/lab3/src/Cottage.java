class Cottage extends PrivateHouse {
    String area;
    public Cottage(String street, String city, int houseNum, String postal_code, int floors_count, int flats_count, String material, int residents_count, String area) {
        super(street, city, houseNum, postal_code, floors_count, flats_count, material, residents_count);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDescription() {
        String address = houseNum + " " + street + ", " + city;
        return "Cottage information: Located in " + address + ", have " + floors_count + " floors, made of " + material + ", and have " + area + " house area.";
    }
}