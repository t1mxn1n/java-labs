public class BuildWithParkingPlace extends BuildingDecorator {
    public BuildWithParkingPlace(Building building) {
        super(building);
    }

    public String getDescription() {
        return super.getDescription() + withParking();
    }

    public String withParking() {
        return " | This building have parking place |";
    }
}
