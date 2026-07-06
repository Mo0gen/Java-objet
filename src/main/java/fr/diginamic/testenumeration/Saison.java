package fr.diginamic.testenumeration;

public enum Saison {

    PRINTEMPS("Printemps", 1),
    ETE("Eté", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private String libelle;
    private int numero;

    Saison(String libelle, int numero) {
        this.libelle = libelle;
        this.numero = numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getNumero() {
        return numero;
    }

    public static Saison getSaisonByNumero(int numero) {

        for (Saison s : Saison.values()) {
            if (s.numero == numero) {
                return s;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Saison{" +
                "libelle='" + libelle + '\'' +
                ", numero=" + numero +
                '}';
    }
}