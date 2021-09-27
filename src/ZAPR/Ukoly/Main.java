package ZAPR.Ukoly;

public class Main {

    public static void main(String[] args) {
        //1.
        double gal = 3.7854;
        double galm = 5.55;
        double lit = galm * gal;

        System.out.println(lit);
        //2.
        int vaha = 150;
        double vahamesic = vaha * 0.17;

        System.out.println(vahamesic);
        //3.
        int polomer = 5;
        double skruhu = polomer * Math.PI;

        System.out.println(skruhu);
        double okruhu = polomer * 2 * Math.PI;

        System.out.println(okruhu);

    }
}
