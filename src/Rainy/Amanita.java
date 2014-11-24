package Rainy;

/**
 * User: Aleksandrs Grigorjevs
 * Date: 2014.06.20. 10:59
 */
public class Amanita extends Mushrooms {

    private final String name = "amanita";
    private final int calories = 700;

    public Amanita() {
        this.setName(name);
        this.setCalories(calories);
        this.setPoisoned(true);
    }

}
