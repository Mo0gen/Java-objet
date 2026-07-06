package fr.diginamic.recensement;

import java.util.Comparator;
import java.util.Scanner;

public class Top10VillesRegion extends MenuService {

    @Override
    public void traiter(Recensement recensement,
                        Scanner scanner) {

        System.out.println("Nom région :");

        String region = scanner.nextLine();

        recensement.getVilles().stream()

                .filter(v -> v.getNomRegion().equalsIgnoreCase(region))

                .sorted(Comparator.comparing(Ville::getPopulation).reversed())

                .limit(10)

                .forEach(System.out::println);
    }
}