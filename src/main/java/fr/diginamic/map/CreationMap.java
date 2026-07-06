package fr.diginamic.map;

import java.util.HashMap;

public class CreationMap {

    public static void main(String[] args) {

        HashMap<Integer, String> mapVilles = new HashMap<>();

        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        // Ajout des villes
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        // Affichage des clés
        System.out.println("Clés :");
        for (Integer cle : mapVilles.keySet()) {
            System.out.println(cle);
        }

        // Affichage des valeurs
        System.out.println("\nValeurs :");
        for (String ville : mapVilles.values()) {
            System.out.println(ville);
        }

        // Taille
        System.out.println("\nTaille : " + mapVilles.size());
    }
}