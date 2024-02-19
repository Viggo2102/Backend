package EksamensØvelse;

import java.util.ArrayList;

public class Beer {
    String name;
    double alcPercentage;
    double price;

    Beer(String name, double alcPercentage, double price) {
        this.name = name;
        this.alcPercentage = alcPercentage;
        this.price = price;
    }

    public String toString() {
        return name + " " +  alcPercentage + " " + price;
    }

    public void setAlcPercentage (double alcPercentage) throws Exception {
    this.alcPercentage = alcPercentage;
    if (alcPercentage>100 || alcPercentage<0) {
        throw new Exception("Det kan vist ikke lade sig gøre venne," + " " + alcPercentage + "%");
    }
}

    public void setPrice(double price) throws Exception {
        this.price = price;
        if (price<=0) {
            throw new Exception("Prisen kan jo ikke være under 0 vel ven!");
        }
    }

    public static double calculateAverage(ArrayList<Beer> l) {
        double totalSum = 0;
        for (Beer b: l) {
            totalSum +=b.price;
        }
        return totalSum/l.size();
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Beer> list = new ArrayList<>();
        try {
            Beer b = new Beer("Heineken", 4.7, 12);
            Beer b1 = new Beer("Carlsberg", 4.7, 100);
            Beer b2 = new Beer("Tuborg", 101, 20);
            list.add(b);
            list.add(b1);
            list.add(b2);
            for (Beer bb: list) {
                System.out.println(bb);
            }
            System.out.println(calculateAverage(list));
            b1.setPrice(200);
            System.out.println(b1);
            b2.setAlcPercentage(101);
            System.out.println(b2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
