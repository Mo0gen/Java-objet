package fr.diginamic.recensement;

public class Ville implements Comparable<Ville> {

    private String codeRegion;
    private String nomRegion;
    private String codeDepartement;
    private String codeCommune;
    private String nomCommune;
    private int population;

    public Ville(String codeRegion, String nomRegion,
                 String codeDepartement,
                 String codeCommune,
                 String nomCommune,
                 int population) {

        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.population = population;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public String getCodeCommune() {
        return codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return nomCommune + " : " + population + " habitants";
    }

    @Override
    public int compareTo(Ville autreVille) {
        return this.getNomCommune().compareTo(autreVille.getNomCommune());
    }
}