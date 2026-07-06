package fr.diginamic.recensement;

import java.util.Comparator;

public class Top10VillesFrance extends MenuService {

    @Override
    public void traiter(Recensement recensement,
                        java.util.Scanner scanner) {

        recensement.getVilles()
                .stream()
                .sorted(Comparator.comparing(Ville::getPopulation).reversed())
                .limit(10)
                .forEach(System.out::println);
    }
}