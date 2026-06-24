package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {

        AdressePostale adresse1 =
                new AdressePostale(10, "rue Victor Hugo", "75000", "France");

        AdressePostale adresse2 =
                new AdressePostale(25, "bd tkt", "34000", "mtp");

        Personne personne1 =
                new Personne("Dupont", "Jean", adresse1);

        Personne personne2 =
                new Personne("Dupond", "Francois", adresse2);

        personne1.afficherIdentite();

        System.out.println("Nom : " + personne1.getNom());

        System.out.println("Prénom : " + personne1.getPrenom());

        System.out.println("Adresse : "
                + personne1.getAdressePostale().ville);
    }
}