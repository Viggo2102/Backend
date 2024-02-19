package EksamensØvelse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Tekst {
    ArrayList<String> tekstList = new ArrayList<>();

    public void tilføj(String s) {
        tekstList.add(s);
    }

    public int findAntalunikke() {

        Set<String> unikke = new HashSet<>(tekstList);
        return unikke.size();
    }

    public static void main(String[] args) {
        Tekst t = new Tekst();
        t.tilføj("Hej");
        t.tilføj("Davs");
        t.tilføj("Godmorgen");
        t.tilføj("Godmorgen");
        t.tilføj("Godmorgen");
        t.tilføj("HVad sker der");
        t.tilføj("Du er sød");

        for (String s: t.tekstList) {
            System.out.println(s);
        }
        System.out.println(t.findAntalunikke());
    }
}
