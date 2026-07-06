package fr.diginamic.testenumeration;

public class TestEnumeration {

    public static void main(String[] args) {

        for (Saison s : Saison.values()) {
            System.out.println(s.getLibelle());
        }

        // Recherche avec valueOf
        String nom = "ETE";
        Saison saison = Saison.valueOf(nom);

        System.out.println("Libellé : " + saison.getLibelle());

        // Recherche par numéro
        int numero = 3;

        Saison saison2 = Saison.getSaisonByNumero(numero);

        System.out.println("Saison : " + saison2.getLibelle());
    }
}