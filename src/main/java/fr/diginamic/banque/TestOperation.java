package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

    public static void main(String[] args) {

        Operation[] operations = new Operation[4];

        operations[0] = new Credit("01/01/2026", 1000);
        operations[1] = new Debit("02/01/2026", 300);
        operations[2] = new Credit("03/01/2026", 500);
        operations[3] = new Debit("04/01/2026", 150);

        double total = 0;

        for (Operation op : operations) {

            System.out.println(
                    op.getDate()
                            + " - "
                            + op.getMontant()
                            + " - "
                            + op.getType());

            if (op.getType().equals("CREDIT")) {
                total += op.getMontant();
            } else {
                total -= op.getMontant();
            }
        }

        System.out.println("Montant global : " + total);
    }
}