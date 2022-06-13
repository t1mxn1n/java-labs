public class BuildingDecorator implements Building {
    private Building building;

    public BuildingDecorator(Building building) {
        this.building = building;
    }

    @Override
    public String getDescription() {
        return building.getDescription();
    }
}
