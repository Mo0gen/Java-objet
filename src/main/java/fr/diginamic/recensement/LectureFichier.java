package fr.diginamic.recensement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureFichier {

    public static void charger(Recensement recensement) {

        try (BufferedReader reader = new BufferedReader(new FileReader("recensement.csv"))) {

            reader.readLine(); // saute l'en-tête

            String ligne;

            while ((ligne = reader.readLine()) != null) {

                String[] morceaux = ligne.split(";");

                Ville ville = new Ville(
                        morceaux[0],
                        morceaux[1],
                        morceaux[2],
                        morceaux[5],
                        morceaux[6],
                        Integer.parseInt(morceaux[9].replace(" ", ""))
                );

                recensement.ajouterVille(ville);
            }

        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
}