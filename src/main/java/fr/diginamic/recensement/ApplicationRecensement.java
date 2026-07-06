package fr.diginamic.recensement;

import java.util.Scanner;

public class ApplicationRecensement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Recensement recensement = new Recensement();
        LectureFichier.charger(recensement);

        // Chargement du fichier CSV ici

        int choix;

        do {

            System.out.println("1 Population ville");
            System.out.println("2 Population département");
            System.out.println("3 Population région");
            System.out.println("4 Top 10 régions");
            System.out.println("5 Top 10 départements");
            System.out.println("6 Top 10 villes département");
            System.out.println("7 Top 10 villes région");
            System.out.println("8 Top 10 villes France");
            System.out.println("9 Quitter");

            choix = Integer.parseInt(scanner.nextLine());

            switch (choix) {

                case 1:
                    new RecherchePopulationVille().traiter(recensement, scanner);
                    break;

                case 2:
                    new RecherchePopulationDepartement().traiter(recensement, scanner);
                    break;

                case 3:
                    new RecherchePopulationRegion().traiter(recensement, scanner);
                    break;

                case 4:
                    new Top10Regions().traiter(recensement, scanner);
                    break;

                case 5:
                    new Top10Departements().traiter(recensement, scanner);
                    break;

                case 6:
                    new Top10VillesDepartement().traiter(recensement, scanner);
                    break;

                case 7:
                    new Top10VillesRegion().traiter(recensement, scanner);
                    break;

                case 8:
                    new Top10VillesFrance().traiter(recensement, scanner);
                    break;

                case 9:
                    System.out.println("Au revoir !");
                    break;
            }

        } while (choix != 9);

        scanner.close();
    }
}