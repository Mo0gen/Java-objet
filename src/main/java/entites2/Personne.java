package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale adressePostale;

    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    public void afficherIdentite() {
        System.out.println(nom.toUpperCase() + " " + prenom);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAdressePostale(AdressePostale adressePostale) {
        this.adressePostale = adressePostale;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public AdressePostale getAdressePostale() {
        return adressePostale;
    }

}