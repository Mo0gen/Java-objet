package fr.diginamic.recensement;

import java.util.*;

public class Top10Regions extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        Map<String,Integer> map = new HashMap<>();

        for(Ville ville : recensement.getVilles()){

            map.put(
                    ville.getNomRegion(),
                    map.getOrDefault(ville.getNomRegion(),0)
                            + ville.getPopulation());
        }

        List<Region> liste = new ArrayList<>();

        for(String nom : map.keySet()){

            liste.add(new Region(nom,map.get(nom)));
        }

        liste.sort((r1,r2)->r2.getPopulation()-r1.getPopulation());

        for(int i=0;i<10;i++){

            System.out.println(liste.get(i));
        }
    }

}