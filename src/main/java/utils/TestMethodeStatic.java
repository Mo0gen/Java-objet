package utils;

public class TestMethodeStatic {

    public static void main(String[] args) {

        // Chaîne contenant un nombre
        String chaine = "12";

        // Conversion String -> int
        int nombre = Integer.parseInt(chaine);

        System.out.println("Valeur convertie : " + nombre);

        // Deux entiers
        int a = 15;
        int b = 20;

        // Recherche du maximum
        int maximum = Integer.max(a, b);

        System.out.println("La plus grande valeur entre " + a + " et " + b + " est : " + maximum);
    }
}