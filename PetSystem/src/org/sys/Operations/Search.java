package org.sys.Operations;

import org.sys.Pets.Pet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Search {

    ArrayList<Pet> results;

    public Search() {
        results = new ArrayList();
    }

    public ArrayList<Pet> SearchByName(ArrayList<Pet> pets, String name) {
        for (Pet pet : pets) {
            if (pet.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(pet);
            }
        }
        return sortByName(results);
    }

    public ArrayList<Pet> SearchByType(ArrayList<Pet> pets, String type) {
        for (Pet pet : pets) {
            if (pet.getClass().getSimpleName().toUpperCase().equals(type)) {
                results.add(pet);
            }
        }
        return sortByDate(results);
    }

    public ArrayList<Pet> SearchByTypeGender(ArrayList<Pet> pets, String type,String gender) {
        results = new ArrayList<Pet>();
        for (Pet pet : pets) {
            if (pet.getGender() == gender.charAt(0) && pet.getClass().getSimpleName().toLowerCase().equals(type.toLowerCase())) {
                results.add(pet);
            }
        }
        return sortByDate(results);
    }

    private ArrayList<Pet> sortByDate(ArrayList<Pet> list) {

        Collections.sort(list, new Comparator<Pet>() {
            public int compare(Pet o1, Pet o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
        return list;
    }

    private ArrayList<Pet> sortByName(ArrayList<Pet> list) {

        Collections.sort(list, new Comparator<Pet>() {
            public int compare(Pet o1, Pet o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return list;
    }

}
