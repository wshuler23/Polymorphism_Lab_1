package Shuler.Willie.Polymorphism;
import java.util.*;

/**
 * Created by willieshuler on 9/27/16.
 */
public class Input {
    Scanner in = new Scanner(System.in);

    public String askUserKindOfPet() {
        System.out.println("What kind of pets do you have?");
        String typeOfPets = in.nextLine();
        return typeOfPets;
    }

    public String askForPetsNames(){
        System.out.println("What are your pets names?");
        String names = in.nextLine();
        return names;
    }

    public String howManyPets(){
        System.out.println("How many pets do you have?");
        String names = in.nextLine();
        return names;
    }
}