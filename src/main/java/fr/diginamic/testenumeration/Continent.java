package fr.diginamic.testenumeration;

public enum Continent {

    EUROPE("Europe"),
    ASIE("Asie"),
    AFRIQUE("Afrique"),
    AMERIQUE("Amérique"),
    OCEANIE("Océanie");

    private String libelle;

    Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}