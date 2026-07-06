package listes;

import java.util.ArrayList;

public class TestListeInt {

    public static void main(String[] args) {

        // 1. création de la liste
        ArrayList<Integer> liste = new ArrayList<>();

        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);

        System.out.println("Liste : " + liste);

        System.out.println("Taille : " + liste.size());

        // 2. recherche du maximum
        int max = liste.get(0);
        for (int nb : liste) {
            if (nb > max) {
                max = nb;
            }
        }
        System.out.println("Maximum : " + max);

        // 3. suppression du minimum
        int min = liste.get(0);
        for (int nb : liste) {
            if (nb < min) {
                min = nb;
            }
        }
        liste.remove(Integer.valueOf(min));

        System.out.println("Après suppression du min : " + liste);

        // 4. rendre positifs les nombres négatifs
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) < 0) {
                liste.set(i, -liste.get(i));
            }
        }

        // 5. affichage final
        System.out.println("Liste finale : " + liste);
    }
}