package fichier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectureFichier {

    public static void main(String[] args) {

        String chemin = "recensement.csv";

        ArrayList<Ville> villes = new ArrayList<>();

        try {

            BufferedReader lecteur = new BufferedReader(new FileReader(chemin));

            String ligne;

            // Ignore la ligne d'en-tête
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

            System.out.println("Nombre de villes : " + villes.size());

            // Affiche les 10 premières villes
            for (int i = 0; i < 10; i++) {
                System.out.println(villes.get(i));
            }

        } catch (IOException e) {
            System.out.println("Erreur de lecture.");
            e.printStackTrace();
        }

    }

}