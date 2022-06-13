package lab6.Expensive;

import lab6.LivingHouse;
import lab6.LivingHouseInterface;

public class ExpensiveLivingHouse extends LivingHouse implements LivingHouseInterface {
    public ExpensiveLivingHouse(String street, String city, int houseNum, String postal_code, int floors_count, int flats_count) {
        super(street, city, houseNum, postal_code, floors_count, flats_count);
    }

    @Override
    public String getDescription() {
        String address = getHouseNum() + " " + getStreet() + ", " + getCity();
        return "[EXPENSIVE HOUSING] Living house information: Located in " + address + ", have " + getFloors() + " floors and " + getFlats() + " flats.";
    }
}
