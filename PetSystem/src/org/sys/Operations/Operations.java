package org.sys.Operations;

import org.sys.Pets.Cat;
import org.sys.Pets.Dog;
import org.sys.Pets.Pet;
import org.sys.Pets.Rabbit;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Operations {

    ArrayList<Pet> pets = new ArrayList();
    int id = 0;
    Search se = new Search();

    public ArrayList<Pet> Store(String pathFile) {
        File archivo = new File(pathFile);
        Scanner leer;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd-HHmmss");

        try {
            leer = new Scanner(archivo);
            while (leer.hasNextLine()) {
                String[] pet = leer.nextLine().split(",");
                Date date = formatter.parse(pet[3]);
                Create(pet[0], pet[1], pet[2], date);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return pets;
    }

    public void Create(String type, String nombre, String gender, Date date) {
        Pet nPet = null;
        id++;
        switch (type) {
            case "CAT":
                nPet = new Cat(id, nombre, gender.charAt(0), date);
                pets.add(nPet);
                break;
            case "DOG":
                nPet = new Dog(id, nombre, gender.charAt(0), date);
                pets.add(nPet);
                break;
            case "RABBIT":
                nPet = new Rabbit(id, nombre, gender.charAt(0), date);
                pets.add(nPet);
                break;
        }
    }


    public void printResultsAsc(ArrayList<Pet> results) {
        for (int i = results.size() - 1; i > -1; i--) {
            System.out.println("[ID] : " + results.get(i).getId()
                    + " [NAME] : " + results.get(i).getName() + " [GENDER] : "
                    + results.get(i).getGender() + " [TYPE] : " + results.get(i).getClass().getSimpleName()
                    + " [DATE] : " + results.get(i).getDate());
        }
    }
    
    public void printResults(ArrayList<Pet> results) {
        for (int i = 0; i < results.size()-1; i++) {
            System.out.println("[ID] : " + results.get(i).getId()
                    + " [NAME] : " + results.get(i).getName() + " [GENDER] : "
                    + results.get(i).getGender() + " [TYPE] : " + results.get(i).getClass().getSimpleName()
                    + " [DATE] : " + results.get(i).getDate());
        }
    }

}
