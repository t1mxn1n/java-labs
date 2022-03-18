import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] CITIES = {"Los Angeles", "Sheffield", "Burnley", "Liverpool", "Eastbourne"};
        String[] STREETS = {"Terminus Rd", "Kenton Rd", "Vere St", "Green Street Green Rd", "Princes Ave"};
        Integer[] HOUSE_NUMS = {13, 44, 54, 165, 6};
        String[] POSTAL_CODES = {"HU5 3QP", "CA27 0AA", "LD3 9SR", "LL26 0EP", "NN15 6DD"};
        Integer[] FLAT_NUMS = {9, 113, 15, 56, 85};
        Integer[] AREAS = {44, 80, 24, 56, 34};
        String[] ROOM_TYPE = {"Bathroom", "Bedroom", "Kitchen", "Garage", "Living Room"};
        String[] THING_NAMES = {"PC", "TV", "Sofa", "Chair", "Bed"};

        ArrayList<Building> buildings = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Array length n = ");
        String line = input.nextLine();
        var n = Integer.parseInt(line);

        for (int i = 0; i < n; i++) {
            int random_choice = (int) (Math.random() * 4); // [0, 3] 0 - Building, 1 - Flat, 2 - Room, 3 - Thing
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
                    Building flat = new Flat(STREETS[(int) (Math.random() * STREETS.length)],
                            CITIES[(int) (Math.random() * CITIES.length)],
                            HOUSE_NUMS[(int) (Math.random() * HOUSE_NUMS.length)],
                            POSTAL_CODES[(int) (Math.random() * POSTAL_CODES.length)],
                            FLAT_NUMS[(int) (Math.random() * FLAT_NUMS.length)],
                            AREAS[(int) (Math.random() * AREAS.length)]
                    );
                    buildings.add(flat);
                }
                case 2 -> {
                    Building room = new Room(STREETS[(int) (Math.random() * STREETS.length)],
                            CITIES[(int) (Math.random() * CITIES.length)],
                            HOUSE_NUMS[(int) (Math.random() * HOUSE_NUMS.length)],
                            POSTAL_CODES[(int) (Math.random() * POSTAL_CODES.length)],
                            FLAT_NUMS[(int) (Math.random() * FLAT_NUMS.length)],
                            AREAS[(int) (Math.random() * AREAS.length)],
                            ROOM_TYPE[(int) (Math.random() * ROOM_TYPE.length)]
                    );
                    buildings.add(room);
                }
                case 3 -> {
                    Building thing = new Thing(STREETS[(int) (Math.random() * STREETS.length)],
                            CITIES[(int) (Math.random() * CITIES.length)],
                            HOUSE_NUMS[(int) (Math.random() * HOUSE_NUMS.length)],
                            POSTAL_CODES[(int) (Math.random() * POSTAL_CODES.length)],
                            FLAT_NUMS[(int) (Math.random() * FLAT_NUMS.length)],
                            AREAS[(int) (Math.random() * AREAS.length)],
                            ROOM_TYPE[(int) (Math.random() * ROOM_TYPE.length)],
                            THING_NAMES[(int) (Math.random() * THING_NAMES.length)]
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