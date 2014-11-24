package Rainy;

import java.util.Random;

/**
 * User: Aleksandrs Grigorjevs
 * Date: 2014.06.18. 10:45
 */
public class Person {

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    private Bag bag = new Bag();

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    private int energy = Config.MAX_ENERGY;

    public void eatSomething() {
        if (bag.size() > 0 && energy < Config.MAX_ENERGY) {
            Random random = new Random(System.currentTimeMillis());
            final Food food = bag.get(random.nextInt(bag.size()));
            if (food instanceof Mushrooms && ((Mushrooms) food).isPoisoned()) {
                energy = 0;
                System.out.println("I ate " + food.getName() + ". It was poisonous, I will go to puke :(");
                System.out.println("I've lost all my energy.");
            } else {
                final int newEnergy = food.getCalories() / 2 + energy;
                if (newEnergy >= Config.MAX_ENERGY) {
                    energy = Config.MAX_ENERGY;
                    System.out.println("I ate " + food.getName()
                            + " and received " + food.getCalories() + " calories. My energy is full!");
                } else {
                    energy = newEnergy;
                    System.out.println("I ate " + food.getName()
                            + " and received " + food.getCalories() + " calories. Now I have " + newEnergy + " energy");
                }
            }
            bag.remove(food);
        } else if (energy >= Config.MAX_ENERGY){
            System.out.println("I don't need to eat as my energy is already full.");
        } else {
            System.out.println("Oh.. my bag is empty. I should collect some food.");
        }
    }

    public void walk() {
        doSmth(Config.WALKING_ENERGY, "I finished walking");
    }

    public void playFootball() {
        doSmth(Config.FOOTBALL_ENERGY, "Football is over");
    }

    public void testSiebel() {
        doSmth(Config.SIEBEL_ENERGY, "I have done with Siebel");
    }

    public void doSmth(int actionEnergy, String message) {
        int newEnergy = energy - actionEnergy;
        if (newEnergy < 0) {
            System.out.println("You don't have enough energy, eat something.");
        } else {
            energy = newEnergy;
            System.out.println("Fuh, " + message + ". I lost " + actionEnergy + " energy.");
        }
    }

}
