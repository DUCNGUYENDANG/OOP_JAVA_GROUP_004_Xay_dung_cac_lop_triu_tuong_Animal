package AnimalClass;

import EdibleClass.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Test Chicken:"
                + " \n  .Sound:Cluckkkkkkk.....";
    }

    @Override
    public String howtoEat() {
        return " \n  .How to Eat:Boiled and eat it";
    }
}
