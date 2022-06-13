import java.util.*;
import java.util.Iterator;

/*
Используется три типа массивов: обычный, ArrayList и Vector
Данные (тип и площадь) записываюстя случайным образом (randomType, randomArea)
Для записи данных использую словарь HashMap, откуда потом формирую итоговый вывод
 */

public class Main {
    public static String[] TYPES = {"Bedroom", "Kitchen", "Bathroom", "Living Room"};
    public static Integer[] AREAS = {6, 8, 7, 10};
    public static void main(String[] args) {
        int rooms = 15;
        Room[] floor1 = new Room[rooms];
        ArrayList<Room> floor2 = new ArrayList<>();
        Vector<Room> floor3 = new Vector<>();

        for (int i = 0; i < rooms; i++){
            floor1[i] = new Room(randomType(), randomArea());
            floor2.add(new Room(randomType(), randomArea()));
            floor3.add(new Room(randomType(), randomArea()));
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String type : TYPES) {
            map.put(type, 0);
        }
        Iterator<Room> iterator1 = Arrays.stream(floor1).iterator();
        calculateArea(map, iterator1, "First");

        Iterator<Room> iterator2 = floor2.iterator();
        calculateArea(map, iterator2, "Second");

        Iterator<Room> iterator3 = floor3.iterator();
        HashMap<String, Integer> result = calculateArea(map, iterator3, "Third");

        int firstFloorArea = result.get("First");
        result.remove("First");
        System.out.println("First floor area is " + firstFloorArea);

        int secondFloorArea = result.get("Second");
        result.remove("Second");
        System.out.println("Second floor area is " + secondFloorArea);

        int thirdFloorArea = result.get("Third");
        result.remove("Third");
        System.out.println("Third floor area is " +thirdFloorArea);
        System.out.println("------------");

        Iterator<Map.Entry<String, Integer>> iterator = result.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            System.out.println(pair.getKey() + " have " + pair.getValue());
            iterator.remove();
        }
        System.out.println("------------");
        System.out.println("General area is " + (firstFloorArea + secondFloorArea + thirdFloorArea));

    }

    private static HashMap<String, Integer> calculateArea(HashMap<String, Integer> map, Iterator<Room> iterator, String floor) {
        int SumArea = 0;
        while (iterator.hasNext()) {
            Room room = iterator.next();
            SumArea += room.getArea();
            map.put(room.getType(), map.get(room.getType()) + room.getArea());
        }
        map.put(floor, SumArea);
        return map;
    }

    public static String randomType() {
        return TYPES[(int) (Math.random() * TYPES.length)];
    }

    public static Integer randomArea() {
        return AREAS[(int) (Math.random() * AREAS.length)];
    }

}

/*
OUTPUT EXAMPLE:

First floor area is 123
Second floor area is 117
Third floor area is 119
------------
Kitchen have 76
Bathroom have 67
Bedroom have 100
Living Room have 116
------------
General area is 359

 */
