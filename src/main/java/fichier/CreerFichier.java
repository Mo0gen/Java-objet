package fichier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreerFichier {

    public static void main(String[] args) {

        String fichierEntree = "recensement.csv";
        String fichierSortie = "100-premieres-lignes.csv";

        try {

            BufferedReader lecteur = new BufferedReader(new FileReader(fichierEntree));
            BufferedWriter ecrivain = new BufferedWriter(new FileWriter(fichierSortie));

            String ligne;
            int compteur = 0;

            while ((ligne = lecteur.readLine()) != null && compteur < 100) {
                ecrivain.write(ligne);
                ecrivain.newLine();
                compteur++;
            }

            lecteur.close();
            ecrivain.close();

            System.out.println("Le fichier a été créé avec succès.");

        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture ou de l'écriture du fichier.");
            e.printStackTrace();
        }

    }

}