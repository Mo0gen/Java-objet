package Pays;

public class TestEqualsPays {

    public static void main(String[] args) {

        Pays france1 = new Pays("France", 68000000);
        Pays france2 = new Pays("France", 68000000);
        Pays france3 = new Pays("France", 70000000);

        System.out.println("france1.equals(france2) : " + france1.equals(france2));
        System.out.println("france1.equals(france3) : " + france1.equals(france3));

        System.out.println("france1 == france2 : " + (france1 == france2));
        System.out.println("france1 == france3 : " + (france1 == france3));
    }
}