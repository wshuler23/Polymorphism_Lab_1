package Shuler.Willie.Polymorphism;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by willieshuler on 9/27/16.
 */
public class PetsTest {
    @Test
    public void getKindofPetTest(){
        Pets pets = new Pets();

        pets.getKindofPet("dog,cat,fish");
        Pets pet1 =  pets.petsArrayList.get(0);
        Pets pet2 =  pets.petsArrayList.get(1);
        Pets pet3 =  pets.petsArrayList.get(2);

        Assert.assertTrue(pet1 instanceof Dog);
        Assert.assertTrue(pet2 instanceof Cat);
        Assert.assertTrue(pet3 instanceof Fish);
    }

    @Test
    public void displayPetsInformationTest() {
        Pets pets = new Pets();

        pets.getKindofPet("cat");
        Pets pet1 =  pets.petsArrayList.get(0);
        int expectedValue = 1;
        int actualValue = pets.petsArrayList.size();
        Assert.assertEquals("Answer should be 1", expectedValue,actualValue);
    }

    @Test
    public void getNameTest() {
        Pets pets = new Pets();
        pets.setName("Sam");
        Assert.assertTrue(pets.getName() == "Sam");
    }
}
