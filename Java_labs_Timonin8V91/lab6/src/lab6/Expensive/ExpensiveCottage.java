package lab6.Expensive;

import lab6.Cottage;
import lab6.CottageInterface;

public class ExpensiveCottage extends Cottage implements CottageInterface {
    public ExpensiveCottage(String street, String city, int houseNum, String postal_code, int floors_count, int flats_count, String material, int residents_count, String area) {
        super(street, city, houseNum, postal_code, floors_count, flats_count, material, residents_count, area);
    }

    @Override
    public String getDescription() {
        String address = getHouseNum() + " " + getStreet() + ", " + getCity();
        return "[EXPENSIVE HOUSING] Cottage information: Located in " + address + ", have " + getFloors() + " floors, made of " + getMaterial() + ", and have " + getArea() + " house area.";
    }
}

/*
EXAMPLE OUTPUT:

[EXPENSIVE HOUSING] Building address: 44 Green Street Green Rd, Los Angeles, NN15 6DD.
[EXPENSIVE HOUSING] Living house information: Located in 13 Vere St, Sheffield, have 1 floors and 15 flats.
[EXPENSIVE HOUSING] Private House information: Located in 165 Terminus Rd, Liverpool, material's house is - Frame, have 2 floors, 4 live here.
[EXPENSIVE HOUSING] Cottage information: Located in 44 Kenton Rd, Burnley, have 1 floors, made of Blocks, and have 34 house area.
 */