package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {

    @Override
    public void traiter(Recensement recensement,
                        Scanner scanner) {

        System.out.println("Code département :");

        String code = scanner.nextLine();

        int population = 0;

        for (Ville ville : recensement.getVilles()) {

            if (ville.getCodeDepartement().equalsIgnoreCase(code)) {

                population += ville.getPopulation();
            }
        }

        System.out.println(population + " habitants");
    }
}