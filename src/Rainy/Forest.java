package Rainy;

import java.util.Random;

public class Forest {

    private static Random random = new Random(System.currentTimeMillis());

    public static Food inspect() {
        switch (random.nextInt(4)) {
            case 0:
                final Pear pear = new Pear();
                System.out.println("You found " + pear.getName());
                return pear;
            case 1:
                final Truffle truffle = new Truffle();
                System.out.println("You found " + truffle.getName());
                return truffle;
            case 2:
                final Nuts nut = new Nuts();
                System.out.println("You found " + nut.getName());
                return nut;
            case 3:
                final Amanita amanita = new Amanita();
                System.out.println("You found " + amanita.getName());
                return amanita;
        }
        return null;
    }

}
