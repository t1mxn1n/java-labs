class PrivateHouse extends LivingHouse implements Building{
    String material;
    int residents_count;

    public PrivateHouse(String street, String city, int houseNum, String postal_code, int floors_count, int flats_count, String material, int residents_count) {
        super(street, city, houseNum, postal_code, floors_count, flats_count);
        this.material = material;
        this.residents_count = residents_count;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getResidents() {
        return residents_count;
    }

    public void setResidents(int residents_count) {
        this.residents_count = residents_count;
    }

    public String getDescription() {
        String address = houseNum + " " + street + ", " + city;
        return "Private House information: Located in " + address + ", material's house is - " + material + ", have " + floors_count + " floors, " + residents_count + " live here.";
    }
}