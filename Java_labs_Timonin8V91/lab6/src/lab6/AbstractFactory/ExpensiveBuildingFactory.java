package lab6.AbstractFactory;

import lab6.*;
import lab6.Expensive.ExpensiveCottage;
import lab6.Expensive.ExpensiveLivingHouse;
import lab6.Expensive.ExpensivePrivateHouse;
import lab6.Expensive.ExpensiveSampleBuilding;

public class ExpensiveBuildingFactory implements BuildingFactory{

    String[] CITIES = {"Los Angeles", "Sheffield", "Burnley", "Liverpool", "Eastbourne"};
    String[] STREETS = {"Terminus Rd", "Kenton Rd", "Vere St", "Green Street Green Rd", "Princes Ave"};
    Integer[] HOUSE_NUMS = {13, 44, 54, 165, 6};
    String[] POSTAL_CODES = {"HU5 3QP", "CA27 0AA", "LD3 9SR", "LL26 0EP", "NN15 6DD"};
    Integer[] FLOORS_COUNT = {1, 2, 3, 4, 5};
    Integer[] FLATS_COUNT = {1, 2, 15, 56, 85};
    String[] MATERIALS = {"Wood", "Brick", "Panel", "Frame", "Blocks"};
    Integer[] RESIDENTS_COUNT = {2, 4, 65, 51, 109};
    String[] AREAS = {"44", "80", "24", "56", "34"};

    @Override
    public CottageInterface getCottage() {
        return new ExpensiveCottage(STREETS[(int) (Math.random() * STREETS.length)],
                CITIES[(int) (Math.random() * CITIES.length)],
                HOUSE_NUMS[(int) (Math.random() * HOUSE_NUMS.length)],
                POSTAL_CODES[(int) (Math.random() * POSTAL_CODES.length)],
                FLOORS_COUNT[(int) (Math.random() * (FLOORS_COUNT.length - 3))],
                FLATS_COUNT[(int) (Math.random() * (FLATS_COUNT.length - 3))],
                MATERIALS[(int) (Math.random() * MATERIALS.length)],
                RESIDENTS_COUNT[(int) (Math.random() * (RESIDENTS_COUNT.length - 3))],
                AREAS[(int) (Math.random() * AREAS.length)]
        );
    }

    @Override
    public SampleBuildInterface getSampleBuild() {
        return new ExpensiveSampleBuilding(STREETS[(int) (Math.random() * STREETS.length)],
                CITIES[(int) (Math.random() * CITIES.length)],
                HOUSE_NUMS[(int) (Math.random() * HOUSE_NUMS.length)],
                POSTAL_CODES[(int) (Math.random() * POSTAL_CODES.length)]
        );
    }

    @Override
    public LivingHouseInterface getLivingHouse() {
        return new ExpensiveLivingHouse(STREETS[(int) (Math.random() * STREETS.length)],
                CITIES[(int) (Math.random() * CITIES.length)],
                HOUSE_NUMS[(int) (Math.random() * HOUSE_NUMS.length)],
                POSTAL_CODES[(int) (Math.random() * POSTAL_CODES.length)],
                FLOORS_COUNT[(int) (Math.random() * FLOORS_COUNT.length)],
                FLATS_COUNT[(int) (Math.random() * FLATS_COUNT.length)]
        );
    }

    @Override
    public PrivateHouseInterface getPrivateHouse() {
        return new ExpensivePrivateHouse(STREETS[(int) (Math.random() * STREETS.length)],
                CITIES[(int) (Math.random() * CITIES.length)],
                HOUSE_NUMS[(int) (Math.random() * HOUSE_NUMS.length)],
                POSTAL_CODES[(int) (Math.random() * POSTAL_CODES.length)],
                FLOORS_COUNT[(int) (Math.random() * (FLOORS_COUNT.length - 3))],
                FLATS_COUNT[(int) (Math.random() * (FLATS_COUNT.length - 3))],
                MATERIALS[(int) (Math.random() * MATERIALS.length)],
                RESIDENTS_COUNT[(int) (Math.random() * (RESIDENTS_COUNT.length - 3))]
        );
    }
}
