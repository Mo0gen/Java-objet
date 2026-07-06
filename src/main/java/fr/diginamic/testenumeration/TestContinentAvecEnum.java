package fr.diginamic.testenumeration;

import java.util.ArrayList;

import fr.diginamic.testenumeration.Ville;

public class TestContinentAvecEnum {

    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<>();

        villes.add(new Ville("New York", 8400000, Continent.AMERIQUE));
        villes.add(new Ville("Paris", 2200000, Continent.EUROPE));
        villes.add(new Ville("Pékin", 21500000, Continent.ASIE));
        villes.add(new Ville("Moscou", 12600000, Continent.EUROPE));
        villes.add(new Ville("Berlin", 3600000, Continent.EUROPE));
        villes.add(new Ville("Sydney", 5300000, Continent.OCEANIE));
        villes.add(new Ville("Sao Paulo", 12300000, Continent.AMERIQUE));
        villes.add(new Ville("Dakar", 1140000, Continent.AFRIQUE));

        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}