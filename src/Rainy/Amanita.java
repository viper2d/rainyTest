package Rainy;

public class Amanita extends Mushrooms {

    private final String name = "amanita";
    private final int calories = 700;

    public Amanita() {
        this.setName(name);
        this.setCalories(calories);
        this.setPoisoned(true);
    }

}
