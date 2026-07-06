package fichier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GenererFichier {

    public static void main(String[] args) {

        String fichierEntree = "recensement.csv";
        String fichierSortie = "villes_plus_25000.csv";

        ArrayList<Ville> villes = new ArrayList<>();

        try {

            BufferedReader lecteur = new BufferedReader(new FileReader(fichierEntree));

            String ligne;

            //saute la ligne d'en-tête
            lecteur.readLine();

            while ((ligne = lecteur.readLine()) != null) {

                String[] tokens = ligne.split(";");

                String nom = tokens[6];
                String codeDepartement = tokens[2];
                String nomRegion = tokens[1];
                int populationTotale = Integer.parseInt(tokens[9].trim().replaceAll(" ", ""));

                Ville ville = new Ville(nom, codeDepartement, nomRegion, populationTotale);

                villes.add(ville);
            }

            lecteur.close();

            BufferedWriter ecrivain = new BufferedWriter(new FileWriter(fichierSortie));

            // Écriture de l'en-tête
            ecrivain.write("Nom;Code département;Nom région;Population totale");
            ecrivain.newLine();

            for (Ville ville : villes) {

                if (ville.getPopulationTotale() > 25000) {

                    ecrivain.write(ville.getNom() + ";"
                            + ville.getCodeDepartement() + ";"
                            + ville.getNomRegion() + ";"
                            + ville.getPopulationTotale());

                    ecrivain.newLine();
                }
            }

            ecrivain.close();

            System.out.println("Le fichier a été généré avec succès.");

        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture ou de l'écriture du fichier.");
            e.printStackTrace();
        }

    }

}