package lab6.Expensive;

import lab6.SampleBuildInterface;
import lab6.SampleBuilding;


public class ExpensiveSampleBuilding extends SampleBuilding implements SampleBuildInterface {


    public ExpensiveSampleBuilding(String street, String city, int houseNum, String postal_code) {
        super(street, city, houseNum, postal_code);
    }

    @Override
    public String getDescription() {
        return "[EXPENSIVE HOUSING] Building address: " + getHouseNum() + " " + getStreet() + ", " + getCity() + ", " + getPostal_code() + ".";
    }
}
