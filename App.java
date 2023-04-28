import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Address a1 = new Address("0618 Birthday Drive", "Sydney", "New South Wales", 2023);
        CircularSilo c1 = new CircularSilo(a1, 20040, "Pink", "Grassie", 18.6, 22.2);

        Address a2 = new Address("0222 Dumbo Road", "Pittsburgh", "Pennsylvania", 15106);
        CircularSilo c2 = new CircularSilo(a2, 16690, "Creme", "Parsley", 12.4, 14.9);

        Address a3 = new Address("120 Izze Drive", "Las Vegas", "Nevada", 88901);
        RectangularRanch r1 = new RectangularRanch(a3, 77744, "Deep Teal", "Russ", 57,38.3, 78.2);

        Address a4 = new Address("28 Calendar Road", "Greenland", "Kingdom State of Denmark", 3900);
        RectangularRanch r2 = new RectangularRanch(a4, 38972, "Nature Green", "Lena", 380.1, 45, 30);

        ArrayList<Building> buildings = new ArrayList<Building>();
        buildings.add(c1);
        buildings.add(c2);
        buildings.add(r1);
        buildings.add(r2);

        for(Building b: buildings){
            System.out.println(c1.getInfo());
            System.out.println(c2.getInfo());
            System.out.println(r1.getInfo());
            System.out.println(r2.getInfo());
        }
    }
}