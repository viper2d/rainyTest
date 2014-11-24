package Rainy;

import java.util.Scanner;

/**
 * User: Aleksandrs Grigorjevs
 * Date: 2014.06.18. 9:14
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("1. Do some activities");
            System.out.println("2. Eat something from bag");
            System.out.println("3. Find goods in forest");
            System.out.println("4. Inpect my bag");
            System.out.println("5. My energy level");
            System.out.println();
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Go for a walk (30 energy)");
                    System.out.println("2. Play football (70 energy)");
                    System.out.println("3. Test Siebel (100 energy)");
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            person.walk();
                            break;
                        case 2:
                            person.playFootball();
                            break;
                        case 3:
                            person.testSiebel();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    person.eatSomething();
                    break;
                case 3:
                    person.getBag().add(Forest.inspect());
                    break;
                case 4:
                    person.getBag().inspect();
                    break;
                case 5:
                    System.out.println("Energy level is " + person.getEnergy());
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
