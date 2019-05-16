package EdibleClass;

import AnimalClass.Animal;
import AnimalClass.Chicken;
import AnimalClass.Tiger;

import static org.junit.Assert.*;

public class Test {
    private static Object Animal;

    public static void main(String[] args) {
        // 01. Test Chicken
        System.out.println((new Chicken()).makeSound());
        System.out.println((new Tiger()).makeSound());
        //02. Test Orange
        System.out.println("\n - "+(new Orange()).howtoEat());
        //03. Test Apple
        System.out.println("\n - "+(new Apple()).howtoEat());
    }

}