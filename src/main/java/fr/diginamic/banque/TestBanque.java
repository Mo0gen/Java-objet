package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

    public static void main(String[] args) {

        Compte[] comptes = new Compte[2];

        comptes[0] = new Compte("C001", 1500.0);
        comptes[1] = new CompteTaux("C002", 3000.0, 2.5);

        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}