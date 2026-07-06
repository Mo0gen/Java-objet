package fr.diginamic.map; 

public class Pays {

    private String nom;
    private long habitants;
    private String continent;

    public Pays(String nom, long habitants, String continent) {
        this.nom = nom;
        this.habitants = habitants;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public long getHabitants() {
        return habitants;
    }

    public String getContinent() {
        return continent;
    }
}