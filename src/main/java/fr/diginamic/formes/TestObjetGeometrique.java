package fr.diginamic.formes;

public class TestObjetGeometrique {

    public static void main(String[] args) {

        ObjetGeometrique[] objets = new ObjetGeometrique[2];

        objets[0] = new Cercle(5);
        objets[1] = new Rectangle(4, 6);

        for (ObjetGeometrique objet : objets) {

            System.out.println("Périmètre : " + objet.perimetre());
            System.out.println("Surface : " + objet.surface());
            System.out.println();
        }
    }
}