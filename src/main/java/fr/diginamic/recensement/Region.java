package fr.diginamic.recensement;

public class Region {

    private String nom;
    private int population;

    public Region(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return nom + " : " + population;
    }
}