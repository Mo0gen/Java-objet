package listes;

import java.util.ArrayList;

public class TestVilles {

    public static void main(String[] args) {

        // 1. création de la liste
        ArrayList<Ville> villes = new ArrayList<>();

        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        // 2. ville la plus peuplée
        Ville max = villes.get(0);

        for (Ville v : villes) {
            if (v.getNbHabitants() > max.getNbHabitants()) {
                max = v;
            }
        }

        System.out.println("Ville la plus peuplée : " + max);

        // 3. ville la moins peuplée
        Ville min = villes.get(0);

        for (Ville v : villes) {
            if (v.getNbHabitants() < min.getNbHabitants()) {
                min = v;
            }
        }

        villes.remove(min);

        // 4. majuscules si +100000 habitants
        for (Ville v : villes) {
            if (v.getNbHabitants() > 100000) {
                v.setNom(v.getNom().toUpperCase());
            }
        }

        // 5. affichage final
        System.out.println("Liste finale :");
        for (Ville v : villes) {
            System.out.println(v);
        }
    }
}