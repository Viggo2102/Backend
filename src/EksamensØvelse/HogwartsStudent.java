package EksamensØvelse;

import java.util.ArrayList;
import java.util.Collections;

public class HogwartsStudent implements Comparable<HogwartsStudent> {
    String firstname;
    String lastname;
    String house;

    public HogwartsStudent(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String toString() {
        return firstname + " " + lastname;
    }

    public void setHouse(String h) throws Exception {

if(h.equals("Gryffindor")|| h.equals("Slytherin")|| h.equals("Hufflepuff") || h.equals("Ravenclaw")) {
    System.out.println("Du har fået hus: " + h);
        }
else throw new Exception("Ikke et hus ven");

    }

    public int compareTo(HogwartsStudent o) {
        return lastname.compareTo(o.lastname);
    }

    public static void main(String[] args) {
        ArrayList<HogwartsStudent> h = new ArrayList<>();
        HogwartsStudent h1 = new HogwartsStudent("Harry", "Potter");
        HogwartsStudent h2 = new HogwartsStudent("Luna", "Lovegood");
        HogwartsStudent h3 = new HogwartsStudent("Draco", "Malfoy");

        h.add(h1);
        h.add(h2);
        h.add(h3);

        for (HogwartsStudent hh: h) {
            System.out.println(hh);
        }
        Collections.sort(h);
        System.out.println(h);

        try {
            h1.setHouse("Gryffindor");
            h2.setHouse("Hufflepuff");
            h3.setHouse("Slytherin");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}
