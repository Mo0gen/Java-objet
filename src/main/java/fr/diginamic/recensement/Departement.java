package fr.diginamic.recensement;

public class Departement {

    private String code;
    private int population;

    public Departement(String code, int population) {
        this.code = code;
        this.population = population;
    }

    public String getCode() {
        return code;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return code + " : " + population;
    }
}