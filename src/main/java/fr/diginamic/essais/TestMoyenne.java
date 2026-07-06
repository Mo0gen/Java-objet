package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

    public static void main(String[] args) {
        CalculMoyenne cm = new CalculMoyenne();
        cm.ajout(10);
        cm.ajout(20);
        System.out.println(cm.calcul());

        CalculMoyenne cm2 = new CalculMoyenne();
        cm2.ajout(5);
        cm2.ajout(15);
        cm2.ajout(25);
        System.out.println(cm2.calcul());
    }
}