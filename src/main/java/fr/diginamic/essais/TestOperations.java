package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

    public static void main(String[] args) {

        double a = 10;
        double b = 5;

        System.out.println("Addition : " + Operations.calcul(a, b, '+'));
        System.out.println("Soustraction : " + Operations.calcul(a, b, '-'));
        System.out.println("Multiplication : " + Operations.calcul(a, b, '*'));
        System.out.println("Division : " + Operations.calcul(a, b, '/'));
    }
}