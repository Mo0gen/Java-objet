package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {

    @Override
    public void traiter(Recensement recensement,
                        Scanner scanner) {

        System.out.println("Nom région :");

        String region = scanner.nextLine();

        int population = 0;

        for (Ville ville : recensement.getVilles()) {

            if (ville.getNomRegion().equalsIgnoreCase(region)) {

                population += ville.getPopulation();
            }
        }

        System.out.println(population + " habitants");
    }
}