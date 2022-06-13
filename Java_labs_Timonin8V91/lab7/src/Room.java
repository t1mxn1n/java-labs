public class Room{
    String type;
    Integer area;
    public Room(String type, Integer area) {
        this.type = type;
        this.area = area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getArea() {
        return area;
    }

    public String getType() {
        return type;
    }

}
