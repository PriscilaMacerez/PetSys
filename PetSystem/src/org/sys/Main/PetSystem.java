package org.sys.Main;

import java.util.ArrayList;
import java.util.Date;
import org.sys.Operations.Operations;
import org.sys.Operations.Search;
import org.sys.Pets.Pet;

public class PetSystem {

    public static void main(String[] args) {
        System.out.println("WELCOME");
        System.out.println("REGISTERING PETS:");
        System.out.println("---------------------------------------");
        Operations op = new Operations();
        ArrayList<Pet> pets = op.Store(args[0]);
        op.printResults(pets);

        Search se = new Search();
        if (args.length == 2) {
            String[] search = args[1].split("=");
            System.out.println("SEARCH RESULTS");
            System.out.println("---------------------------------------");
            if (search[0].toLowerCase().equals("name")) {
                pets = se.SearchByName(pets, search[1]);
                op.printResults(pets);

            } else if (search[0].toLowerCase().equals("type")) {
                pets = se.SearchByType(pets, search[1]);
                op.printResultsAsc(pets);

            } else if (search[0].toLowerCase().equals("create")) {
                Date date = new Date();
                String[] create = search[1].split(",");
                op.Create(create[0].toUpperCase(), create[1], create[2], date);
                op.printResultsAsc(pets);
            }

        } else if (args.length == 3) {

            System.out.println("SEARCH RESULTS");
            System.out.println("---------------------------------------");
            String[] type = args[1].split("=");
            String[] gender = args[2].split("=");

            pets = se.SearchByTypeGender(pets, type[1], gender[1]);
            op.printResultsAsc(pets);

        }

    }

}
