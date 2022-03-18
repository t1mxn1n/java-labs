class Flat extends Building {
    int flat_number;
    int area;
    public Flat(String street, String city, int houseNum, String postal_code, int flat_number, int area) {
        super(street, city, houseNum, postal_code);
        this.flat_number = flat_number;
        this.area = area;
    }

    public int getFlat_number() {
        return flat_number;
    }

    public void setFlat_number(int flat_number) {
        this.flat_number = flat_number;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDescription() {
        return "Flat address: Apartment "+ flat_number + ", " + houseNum + " " + street + ", " + city + ", " + postal_code;
    }

}