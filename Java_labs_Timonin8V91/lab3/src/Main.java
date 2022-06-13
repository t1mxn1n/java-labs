import java.util.ArrayList;
import java.util.Scanner;

/*
Созданы декораторы расширения для метода getDescription (BuildingWithHelicopterParking, BuildingWithParkingPlace)
Выборо декортатора происходит случайным образом
 */

public class Main {
    public static void main(String[] args) {

        String[] CITIES = {"Los Angeles", "Sheffield", "Burnley", "Liverpool", "Eastbourne"};
        String[] STREETS = {"Terminus Rd", "Kenton Rd", "Vere St", "Green Street Green Rd", "Princes Ave"};
        Integer[] HOUSE_NUMS = {13, 44, 54, 165, 6};
        String[] POSTAL_CODES = {"HU5 3QP", "CA27 0AA", "LD3 9SR", "LL26 0EP", "NN15 6DD"};
        Integer[] FLOORS_COUNT = {1, 2, 3, 4, 5};
        Integer[] FLATS_COUNT = {1, 2, 15, 56, 85};
        String[] MATERIALS = {"Wood", "Brick", "Panel", "Frame", "Blocks"};
        Integer[] RESIDENTS_COUNT = {2, 4, 65, 51, 109};
        String[] AREAS = {"44", "80", "24", "56", "34"};

        ArrayList<Building> buildings = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Array length n = ");
        String line = input.nextLine();
        var n = Integer.parseInt(line);

        for (int i = 0; i < n; i++) {
            int random_choice = (int) (Math.random() * 4); // [0, 3] 0 - Building, 1 - Living House, 2 - Private House, 3 - Cottage

            switch (random_choice) {
                case 0 -> {
                    Building build = new SampleBuilding(STREETS[(int) (Math.random() * STREETS.length)],
                            CITIES[(int) (Math.random() * CITIES.length)],
                            HOUSE_NUMS[(int) (Math.random() * HOUSE_NUMS.length)],
                            POSTAL_CODES[(int) (Math.random() * POSTAL_CODES.length)]
                    );

                    int random_decorator = (int) (Math.random() * 2);
                    Building build_dec;
                    if (random_decorator == 1) {
                        build_dec = new BuildWithParkingPlace(build);
                    }
                    else {
                        build_dec = new BuildWithHelicopterParking(build);
                    }
                    buildings.add(build_dec);

                }
                case 1 -> {
                    SampleBuilding living_house = new LivingHouse(STREETS[(int) (Math.random() * STREETS.length)],
                            CITIES[(int) (Math.random() * CITIES.length)],
                            HOUSE_NUMS[(int) (Math.random() * HOUSE_NUMS.length)],
                            POSTAL_CODES[(int) (Math.random() * POSTAL_CODES.length)],
                            FLOORS_COUNT[(int) (Math.random() * FLOORS_COUNT.length)],
                            FLATS_COUNT[(int) (Math.random() * FLATS_COUNT.length)]
                    );

                    int random_decorator = (int) (Math.random() * 2);
                    Building living_house_dec;
                    if (random_decorator == 1) {
                        living_house_dec = new BuildWithParkingPlace(living_house);
                    }
                    else {
                        living_house_dec = new BuildWithHelicopterParking(living_house);
                    }
                    buildings.add(living_house_dec);

                }
                case 2 -> {
                    Building private_house = new PrivateHouse(STREETS[(int) (Math.random() * STREETS.length)],
                            CITIES[(int) (Math.random() * CITIES.length)],
                            HOUSE_NUMS[(int) (Math.random() * HOUSE_NUMS.length)],
                            POSTAL_CODES[(int) (Math.random() * POSTAL_CODES.length)],
                            FLOORS_COUNT[(int) (Math.random() * (FLOORS_COUNT.length - 3))],
                            FLATS_COUNT[(int) (Math.random() * (FLATS_COUNT.length - 3))],
                            MATERIALS[(int) (Math.random() * MATERIALS.length)],
                            RESIDENTS_COUNT[(int) (Math.random() * (RESIDENTS_COUNT.length - 3))]
                    );

                    int random_decorator = (int) (Math.random() * 2);
                    Building private_house_dec;
                    if (random_decorator == 1) {
                        private_house_dec = new BuildWithParkingPlace(private_house);
                    }
                    else {
                        private_house_dec = new BuildWithHelicopterParking(private_house);
                    }
                    buildings.add(private_house_dec);

                }
                case 3 -> {
                    Building cottage = new Cottage(STREETS[(int) (Math.random() * STREETS.length)],
                            CITIES[(int) (Math.random() * CITIES.length)],
                            HOUSE_NUMS[(int) (Math.random() * HOUSE_NUMS.length)],
                            POSTAL_CODES[(int) (Math.random() * POSTAL_CODES.length)],
                            FLOORS_COUNT[(int) (Math.random() * (FLOORS_COUNT.length - 3))],
                            FLATS_COUNT[(int) (Math.random() * (FLATS_COUNT.length - 3))],
                            MATERIALS[(int) (Math.random() * MATERIALS.length)],
                            RESIDENTS_COUNT[(int) (Math.random() * (RESIDENTS_COUNT.length - 3))],
                            AREAS[(int) (Math.random() * AREAS.length)]
                    );

                    int random_decorator = (int) (Math.random() * 2);
                    Building cottage_dec;
                    if (random_decorator == 1) {
                        cottage_dec = new BuildWithParkingPlace(cottage);
                    }
                    else {
                        cottage_dec = new BuildWithHelicopterParking(cottage);
                    }
                    buildings.add(cottage_dec);

                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(buildings.get(i).getDescription());
        }
    }
}
/*
OUTPUT EXAMPLE:

Array length n = 10
Living house information: Located in 13 Green Street Green Rd, Eastbourne, have 3 floors and 56 flats. | This building has place for helicopters |
Building address: 44 Vere St, Burnley, NN15 6DD | This building has place for helicopters |
Building address: 13 Green Street Green Rd, Los Angeles, NN15 6DD | This building have parking place |
Private House information: Located in 6 Terminus Rd, Los Angeles, material's house is - Blocks, have 2 floors, 4 live here. | This building has place for helicopters |
Building address: 54 Princes Ave, Los Angeles, LD3 9SR | This building have parking place |
Building address: 165 Princes Ave, Los Angeles, LL26 0EP | This building has place for helicopters |
Cottage information: Located in 165 Vere St, Sheffield, have 1 floors, made of Blocks, and have 56 house area. | This building have parking place |
Cottage information: Located in 6 Terminus Rd, Los Angeles, have 2 floors, made of Wood, and have 44 house area. | This building have parking place |
Building address: 54 Vere St, Sheffield, LD3 9SR | This building have parking place |
Private House information: Located in 54 Green Street Green Rd, Los Angeles, material's house is - Wood, have 2 floors, 4 live here. | This building has place for helicopters |
 */