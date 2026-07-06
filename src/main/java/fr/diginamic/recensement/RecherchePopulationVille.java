package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {

    @Override
    public void traiter(Recensement recensement,
                        Scanner scanner) {

        System.out.println("Nom de la ville :");

        String nom = scanner.nextLine();

        for (Ville ville : recensement.getVilles()) {

            if (ville.getNomCommune().equalsIgnoreCase(nom)) {

                System.out.println(ville);
                return;
            }
        }

        System.out.println("Ville introuvable");
    }
}