package Shuler.Willie.Polymorphism;

import java.util.*;

/**
 * Created by willieshuler on 9/26/16.
 */
public class PetsApp {

    public static void main(String[] args) {
        Pets pets = new Pets();
        Input input = new Input();

        String howManyPets = input.howManyPets();
        String kindOfPet = input.askUserKindOfPet();
        pets.getKindofPet(kindOfPet);
        String nameofPet = input.askForPetsNames();
        pets.getNameofPet(nameofPet);
        pets.runApplication();
    }
}