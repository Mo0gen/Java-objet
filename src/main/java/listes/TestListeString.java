package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

    public static void main(String[] args) {

        // 1. création de la liste
        ArrayList<String> villes = new ArrayList<>();

        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        // 2. Ville la plus longue
        String plusLongue = villes.get(0);

        for (String ville : villes) {
            if (ville.length() > plusLongue.length()) {
                plusLongue = ville;
            }
        }

        System.out.println("Ville la plus longue : " + plusLongue);

        // 3. Mettre les villes en majuscules
        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }

        // 4. supprimer les villes qui commencent par N
        Iterator<String> it = villes.iterator();

        while (it.hasNext()) {
            String ville = it.next();
            if (ville.startsWith("N")) {
                it.remove();
            }
        }

        // 5. Final
        System.out.println("Liste finale : " + villes);
    }
}