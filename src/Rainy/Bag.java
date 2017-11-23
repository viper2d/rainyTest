package Rainy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Bag extends ArrayList<Food> {
    private int capacity = Config.BAG_CAPACITY;

    public void inspect() {
        System.out.println("BAG");
        System.out.println("--------------------------");
        Iterator<Food> foodIterator = this.iterator();
        while (foodIterator.hasNext()) {
            Food food = foodIterator.next();
            food.about();
            if (food instanceof Mushrooms && ((Mushrooms) food).isPoisoned()) {
                System.out.println();
                System.out.println("WARNING!!! Amanita detected!");
                Scanner sc = new Scanner(System.in);
                while (true) {
                    System.out.println();
                    System.out.println("1. Throw away poisonous item");
                    System.out.println("2. Leave it in bag");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            foodIterator.remove();
                            System.out.println("Amanita was successfully removed from your bag!");
                            break;
                        case 2:
                            break;
                    }
                    break;
                }
            }
            System.out.println("--------------------------");
        }
    }

    @Override
    public boolean add(Food food) {
        if (this.size() < capacity) {
            System.out.println("I will put this " + food.getName() + " in my bag");
            return super.add(food);
        } else {
            System.out.println("My bag is full. Unfortunately, I should throw away this " + food.getName());
            return false;
        }
    }
}
