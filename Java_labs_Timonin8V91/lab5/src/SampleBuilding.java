class SampleBuilding implements Building{
    String city, street, postal_code;
    int houseNum;

    public SampleBuilding(String street, String city, int houseNum, String postal_code) {
        this.street = street;
        this.city = city;
        this.houseNum = houseNum;
        this.postal_code = postal_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getDescription() {
        return "Building address: " + houseNum + " " + street + ", " + city + ", " + postal_code + ".";
    }
}