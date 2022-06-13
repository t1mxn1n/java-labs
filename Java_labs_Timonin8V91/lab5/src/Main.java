
/*
Используется фабритный метод создания объектов класса SampleBuilding
Интерфейс содержит getDescription
В BuildingFactory происходит создание и заполение случайным образом объектов
 */

public class Main {
    public static void main(String[] args) {
        BuildingFactory buildingFactory = new BuildingFactory();
        Building building_1 = buildingFactory.getBuild("building");
        System.out.println(building_1.getDescription());

        Building building_2 = buildingFactory.getBuild("livingHouse");
        System.out.println(building_2.getDescription());

        Building building_3 = buildingFactory.getBuild("privateHouse");
        System.out.println(building_3.getDescription());

        Building building_4 = buildingFactory.getBuild("cottage");
        System.out.println(building_4.getDescription());

    }
}

/*
OUTPUT EXAMPLE:

Building address: 13 Terminus Rd, Burnley, HU5 3QP.
Living house information: Located in 6 Princes Ave, Los Angeles, have 3 floors and 85 flats.
Private House information: Located in 6 Terminus Rd, Los Angeles, material's house is - Frame, have 2 floors, 2 live here.
Cottage information: Located in 54 Green Street Green Rd, Eastbourne, have 2 floors, made of Blocks, and have 56 house area.
 */
