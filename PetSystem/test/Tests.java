
import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.sys.Operations.Search;
import org.sys.Pets.Cat;
import org.sys.Pets.Dog;
import org.sys.Pets.Pet;
import org.sys.Pets.Rabbit;


public class Tests {

    Search testSearch;
    ArrayList<Pet> data = new ArrayList<Pet>();

    public Tests() {
        testSearch = new Search();
        data = new ArrayList<Pet>();

        data.add(new Dog(1, "Any", 'M', new Date()));
        data.add(new Rabbit(1, "Betsy", 'F', new Date()));
        data.add(new Cat(1, "Puppy", 'M', new Date()));
    }
    
    @Test
    public void testSearchName() {

        boolean find = false;

        ArrayList<Pet> results = testSearch.SearchByName(data, "Any");
        for (Pet pet : results) {
            find = pet.getName().equals("Any") ? true : false;
        }
        assertTrue("Element was not found", find);
    }

    @Test
    public void testSearchByType() {

        boolean find = false;

        ArrayList<Pet> results = testSearch.SearchByType(data, "DOG");
        for (Pet pet : results) {
            find = pet.getClass().getSimpleName().equals("Dog") ? true : false;
        }
        assertTrue("Element was not found", find);
    }

    @Test
    public void testSearchByTypeGender() {

        boolean find = false;

        ArrayList<Pet> results = testSearch.SearchByTypeGender(data, "RABBIT", "F");
        for (Pet pet : results) {
            if (pet.getClass().getSimpleName().equals("Rabbit") && pet.getGender() == "F".charAt(0)) {
                find = true;
            }
        }
        assertTrue("Element was not found", find);
    }

}
