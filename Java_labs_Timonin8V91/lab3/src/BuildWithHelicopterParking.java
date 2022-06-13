public class BuildWithHelicopterParking extends BuildingDecorator {
    public BuildWithHelicopterParking(Building building) {
        super(building);
    }

    public String getDescription() {
        return super.getDescription() + withParking();
    }

    public String withParking() {
        return " | This building has place for helicopters |";
    }
}
