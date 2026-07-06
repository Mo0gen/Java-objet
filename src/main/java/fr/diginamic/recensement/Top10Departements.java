package fr.diginamic.recensement;

import java.util.*;

public class Top10Departements extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        Map<String,Integer> map = new HashMap<>();

        for(Ville ville : recensement.getVilles()){

            map.put(
                    ville.getCodeDepartement(),
                    map.getOrDefault(ville.getCodeDepartement(),0)
                            + ville.getPopulation());
        }

        List<Departement> liste = new ArrayList<>();

        for(String code : map.keySet()){

            liste.add(new Departement(code,map.get(code)));
        }

        liste.sort((d1,d2)->d2.getPopulation()-d1.getPopulation());

        for(int i=0;i<10;i++){

            System.out.println(liste.get(i));
        }
    }
}