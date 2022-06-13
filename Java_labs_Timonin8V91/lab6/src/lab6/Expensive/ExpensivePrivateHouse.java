package lab6.Expensive;

import lab6.PrivateHouse;
import lab6.PrivateHouseInterface;

public class ExpensivePrivateHouse extends PrivateHouse implements PrivateHouseInterface {

    public ExpensivePrivateHouse(String street, String city, int houseNum, String postal_code, int floors_count, int flats_count, String material, int residents_count) {
        super(street, city, houseNum, postal_code, floors_count, flats_count, material, residents_count);
    }

    @Override
    public String getDescription() {
        String address = getHouseNum() + " " + getStreet() + ", " + getCity();
        return "[EXPENSIVE HOUSING] Private House information: Located in " + address + ", material's house is - " + getMaterial() + ", have " + getFloors() + " floors, " + getResidents() + " live here.";
    }
}
