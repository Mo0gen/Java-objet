package Pays;

import java.util.Objects;

public class Pays {

    private String nom;
    private int population;

    public Pays(String nom, int population) {
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Pays autre = (Pays) obj;

        return population == autre.population &&
                Objects.equals(nom, autre.nom);
    }
}