import java.util.ArrayList;
import java.util.Scanner;

/*
Иерархия классов имеет структуру: Building <- LivingHouse <- PrivateHouse <- Cottage
Заполнение объектов происходит случайным образом
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
                    Building build = new Building(STREETS[(int) (Math.random() * STREETS.length)],
                            CITIES[(int) (Math.random() * CITIES.length)],
                            HOUSE_NUMS[(int) (Math.random() * HOUSE_NUMS.length)],
                            POSTAL_CODES[(int) (Math.random() * POSTAL_CODES.length)]
                    );
                    buildings.add(build);
                }
                case 1 -> {
                    Building flat = new LivingHouse(STREETS[(int) (Math.random() * STREETS.length)],
                            CITIES[(int) (Math.random() * CITIES.length)],
                            HOUSE_NUMS[(int) (Math.random() * HOUSE_NUMS.length)],
                            POSTAL_CODES[(int) (Math.random() * POSTAL_CODES.length)],
                            FLOORS_COUNT[(int) (Math.random() * FLOORS_COUNT.length)],
                            FLATS_COUNT[(int) (Math.random() * FLATS_COUNT.length)]
                    );
                    buildings.add(flat);
                }
                case 2 -> {
                    Building room = new PrivateHouse(STREETS[(int) (Math.random() * STREETS.length)],
                            CITIES[(int) (Math.random() * CITIES.length)],
                            HOUSE_NUMS[(int) (Math.random() * HOUSE_NUMS.length)],
                            POSTAL_CODES[(int) (Math.random() * POSTAL_CODES.length)],
                            FLOORS_COUNT[(int) (Math.random() * (FLOORS_COUNT.length - 3))],
                            FLATS_COUNT[(int) (Math.random() * (FLATS_COUNT.length - 3))],
                            MATERIALS[(int) (Math.random() * MATERIALS.length)],
                            RESIDENTS_COUNT[(int) (Math.random() * (RESIDENTS_COUNT.length - 3))]
                    );
                    buildings.add(room);
                }
                case 3 -> {
                    Building thing = new Cottage(STREETS[(int) (Math.random() * STREETS.length)],
                            CITIES[(int) (Math.random() * CITIES.length)],
                            HOUSE_NUMS[(int) (Math.random() * HOUSE_NUMS.length)],
                            POSTAL_CODES[(int) (Math.random() * POSTAL_CODES.length)],
                            FLOORS_COUNT[(int) (Math.random() * (FLOORS_COUNT.length - 3))],
                            FLATS_COUNT[(int) (Math.random() * (FLATS_COUNT.length - 3))],
                            MATERIALS[(int) (Math.random() * MATERIALS.length)],
                            RESIDENTS_COUNT[(int) (Math.random() * (RESIDENTS_COUNT.length - 3))],
                            AREAS[(int) (Math.random() * AREAS.length)]
                    );
                    buildings.add(thing);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(buildings.get(i).getDescription());
        }
    }
}
/*
EXAMPLE OUTPUT:

Array length n = 15
Building address: 54 Green Street Green Rd, Eastbourne, HU5 3QP.
Cottage information: Located in 165 Terminus Rd, Eastbourne, have 1 floors, made of Brick, and have 44 house area.
Cottage information: Located in 165 Kenton Rd, Eastbourne, have 2 floors, made of Panel, and have 34 house area.
Living house information: Located in 165 Terminus Rd, Los Angeles, have 5 floors and 2 flats.
Private House information: Located in 165 Kenton Rd, Eastbourne, material's house is - Brick, have 2 floors, 4 live here.
Private House information: Located in 44 Terminus Rd, Los Angeles, material's house is - Panel, have 1 floors, 2 live here.
Private House information: Located in 54 Terminus Rd, Sheffield, material's house is - Panel, have 1 floors, 4 live here.
Private House information: Located in 54 Vere St, Liverpool, material's house is - Blocks, have 2 floors, 4 live here.
Building address: 54 Terminus Rd, Burnley, HU5 3QP.
Cottage information: Located in 13 Green Street Green Rd, Los Angeles, have 1 floors, made of Frame, and have 80 house area.
Building address: 44 Princes Ave, Eastbourne, CA27 0AA.
Cottage information: Located in 13 Green Street Green Rd, Los Angeles, have 2 floors, made of Blocks, and have 56 house area.
Building address: 6 Vere St, Liverpool, CA27 0AA.
Cottage information: Located in 165 Terminus Rd, Burnley, have 2 floors, made of Wood, and have 34 house area.
Living house information: Located in 13 Green Street Green Rd, Los Angeles, have 1 floors and 2 flats.

 */