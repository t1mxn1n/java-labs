import java.util.ArrayList;

public class lab1 {
    public static void main(String[] args) {
        City city2 = new City();
        city2.setName("Винница");

        Build dormitory = new Build();
        dormitory.setStreet("Вершинина");
        dormitory.setHouseNum(39);
        dormitory.setPayment(500);
        dormitory.setArea(18*36*4);

        Flat flat1 = new Flat(310,18);

        dormitory.addPlacement(flat1);
        flat1.addResident("Фадей Тимофеев");
        flat1.addResident("Степан Плёхов");
        flat1.addResident("Дима Диман");
        System.out.println("Имена жильцов квартиры с номером " + flat1.getNumber() + ": ");
        for (int i = 0; i < flat1.getResidents().size(); i++) {
            System.out.println(flat1.getResidents().get(i) + " ");
        }

        System.out.println("Стоимость оплаты для квартиры с номером " +  flat1.getNumber() + ": " +flat1.Cost());

        Office office1 = new Office(112,30,"google","do something useful things");
        dormitory.addPlacement(office1);
        System.out.println("Стоимость оплаты для офиса с номером " +  office1.getNumber() + ": " + office1.Cost());

    }
}
class City {
    String name;

    public City () {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Build {
    String street;
    int houseNum, payment, area;
    private ArrayList placements = new ArrayList();

    public Build() {
        this.street = street;
        this.houseNum = houseNum;
        this.payment = payment;
        this.area = area;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNum() {
        return houseNum;
    }
    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public double getPayment() {
        return payment;
    }
    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }

    public ArrayList getPlacements() {
        return placements;
    }
    public void addPlacement(Placement placement) {
        placements.add(placement);
        placement.setBuild(this);
    }
    public void removePlacement(Placement placement) {
        placements.remove(placement);
    }
    public int summaryArea(Build build) {
        var sum = 0;
        for (int i = 0; i < build.getPlacements().size(); i++) {
            Placement place = (Placement)build.getPlacements().get(i);
            sum += place.getArea();
        }
        return sum;
    }
}
abstract class Placement {
    int number, area;
    public Placement(int number, int area) {
        this.number = number;
        this.area = area;
    }
    private Build build;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }

    public Build getBuild() {
        return build;
    }
    public void setBuild(Build build) {
        this.build = build;
    }

    public abstract double Cost();

}

class Flat extends Placement {
    private ArrayList residents = new ArrayList();

    public Flat(int number, int area) {
        super(number,area);
    }

    public ArrayList getResidents() {
        return residents;
    }
    public void addResident(String resident) {
        residents.add(resident);}
    public void removeResident(String resident) {
        residents.remove(resident);
    }



    public double Cost() {
        double c;
        c = this.getBuild().getPayment()*area*(1 + residents.size()*0.1);
        return c;
    }
}

class Office extends Placement{
    String company, activity;
    public Office(int number, int area, String company, String activity) {
        super(number, area);
        this.company = company;
        this.activity = activity;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getActivity() {
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }

    public double Cost() {
        double c;
        c = this.getBuild().getPayment()*area*2;
        return c;
    }
}
