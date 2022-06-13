package lab6;

import lab6.AbstractFactory.BuildingFactory;
import lab6.AbstractFactory.ExpensiveBuildingFactory;

/*
Для примера паттерна Абстрактная фабрика добавил разделение на Дорогие дома
Интерфейс BuildingFactory содержит методы для создания каждого типа здания
Интерфейсы типов зданий реализуются в классах дирректории Expensive
 */

public class Main {
    public static void main(String[] args) {
        BuildingFactory buildingFactory = new ExpensiveBuildingFactory();

        SampleBuildInterface sampleBuild = buildingFactory.getSampleBuild();
        System.out.println(sampleBuild.getDescription());

        LivingHouseInterface livingHouse = buildingFactory.getLivingHouse();
        System.out.println(livingHouse.getDescription());

        PrivateHouseInterface privateHouse = buildingFactory.getPrivateHouse();
        System.out.println(privateHouse.getDescription());

        CottageInterface cottage = buildingFactory.getCottage();
        System.out.println(cottage.getDescription());

    }
}

/*
OUTPUT EXAMPLE:

[EXPENSIVE HOUSING] Building address: 6 Vere St, Eastbourne, CA27 0AA.
[EXPENSIVE HOUSING] Living house information: Located in 165 Kenton Rd, Eastbourne, have 1 floors and 15 flats.
[EXPENSIVE HOUSING] Private House information: Located in 54 Princes Ave, Los Angeles, material's house is - Blocks, have 1 floors, 2 live here.
[EXPENSIVE HOUSING] Cottage information: Located in 44 Terminus Rd, Los Angeles, have 1 floors, made of Brick, and have 24 house area.
 */
