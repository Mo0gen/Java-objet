package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

    public static void main(String[] args) {

        List<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");


        List<String> liste3 = new ArrayList<>();

        // liste1
        for (String couleur : liste1) {
            liste3.add(couleur);
        }

        // liste2
        for (String couleur : liste2) {
            liste3.add(couleur);
        }

        System.out.println("Liste fusionnée : " + liste3);
    }
}