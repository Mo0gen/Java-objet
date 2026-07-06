package fr.diginamic.recensement;

import java.util.Comparator;
import java.util.Scanner;

public class Top10VillesDepartement extends MenuService {

    @Override
    public void traiter(Recensement recensement,
                        Scanner scanner) {

        System.out.println("Département :");

        String dep = scanner.nextLine();

        recensement.getVilles().stream()

                .filter(v -> v.getCodeDepartement().equalsIgnoreCase(dep))

                .sorted(Comparator.comparing(Ville::getPopulation).reversed())

                .limit(10)

                .forEach(System.out::println);
    }

}