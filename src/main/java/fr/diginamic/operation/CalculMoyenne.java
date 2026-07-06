package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

    private double[] tableau = new double[0];

    public void ajout(double valeur) {
        //Permet d'agrandir le tableau car impossible en Java
        tableau = Arrays.copyOf(tableau, tableau.length + 1);
        tableau[tableau.length - 1] = valeur;
    }

    public double calcul() {
        if (tableau.length == 0) return 0;

        double somme = 0;
        for (double v : tableau) {
            somme += v;
        }
        return somme / tableau.length;
    }
}