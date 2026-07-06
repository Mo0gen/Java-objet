package fr.diginamic.map;

import java.util.HashMap;

public class MapVilles {

    public static void main(String[] args) {

        HashMap<String, Ville> villes = new HashMap<>();

        villes.put("Nice", new Ville("Nice", 343000));
        villes.put("Carcassonne", new Ville("Carcassonne", 47800));
        villes.put("Narbonne", new Ville("Narbonne", 53400));
        villes.put("Lyon", new Ville("Lyon", 484000));
        villes.put("Foix", new Ville("Foix", 9700));
        villes.put("Pau", new Ville("Pau", 77200));
        villes.put("Marseille", new Ville("Marseille", 850700));
        villes.put("Tarbes", new Ville("Tarbes", 40600));

        String villeMoinsPeuplee = null;
        int min = Integer.MAX_VALUE;

        for (String nom : villes.keySet()) {

            Ville v = villes.get(nom);

            if (v.getNbHabitants() < min) {
                min = v.getNbHabitants();
                villeMoinsPeuplee = nom;
            }
        }

        villes.remove(villeMoinsPeuplee);

        System.out.println("Villes restantes :");

        for (Ville v : villes.values()) {
            System.out.println(v);
        }
    }
}