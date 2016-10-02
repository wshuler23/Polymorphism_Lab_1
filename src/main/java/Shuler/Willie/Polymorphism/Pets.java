package Shuler.Willie.Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by willieshuler on 9/26/16.
 */
public class Pets {
    String name;
    public ArrayList<Pets> petsArrayList = new ArrayList<Pets>();
    Scanner in = new Scanner(System.in);
    Pets pets;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {}

    public void runApplication() {
        displayPetsInformation();
    }

    public void getNameofPet(String names){

        String[] tokens = names.split(",");
        for(int i=0; i< petsArrayList.size(); i++){
            petsArrayList.get(i).setName(tokens[i]);
        }
    }

    public void getKindofPet(String names) {

        String[] tokens = names.split(",");

        for (String token1 : tokens ) {

            switch (token1) {
                case "dog":
                    pets = new Dog();
                    petsArrayList.add(pets);
                    break;
                case "cat":
                    pets = new Cat();
                    petsArrayList.add(pets);
                    break;
                case "fish":
                    pets = new Fish();
                    petsArrayList.add(pets);
                    break;
            }
        }
    }

    public void displayPetsInformation() {
        for (int i = 0; i < petsArrayList.size(); i++) {
            System.out.println(petsArrayList.get(i).getName());
            petsArrayList.get(i).speak();
        }
    }
}
