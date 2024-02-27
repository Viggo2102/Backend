package EksamensØvelse;

public class Bil {
    Trailer t;
    double vægt;

    public Bil(double vægt) {
        this.vægt = vægt;
    }
    public static double totalVægt(Bil b, Trailer t1) {
    double totalvægt = b.vægt + t1.trailerVægt;
    if (totalvægt>3500) {
        System.out.println("Det må du ikke.");
    } else System.out.println("Trailer er tilkoblet. ");

    return totalvægt;
    }

    public static void main(String[] args) {
        Bil b = new Bil(2500);
        Trailer tt = new Trailer(1500);
        totalVægt(b, tt);
    }
}


class Trailer {
    double trailerVægt;

    public Trailer(double trailerVægt) {
        this.trailerVægt = trailerVægt;
    }
}
