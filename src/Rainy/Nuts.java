package Rainy;

/**
 * User: Aleksandrs Grigorjevs
 * Date: 2014.06.18. 11:33
 */
public class Nuts extends Food {

    private final String name = "nuts";
    private final float weight = 0.14f;
    private final int size = 1;
    private final int calories = 15;

    public Nuts() {
        this.setName(name);
        this.setCalories(calories);
        this.setWeight(weight);
        this.setSize(size);
    }

    @Override
    public void about() {
        System.out.println(this.getName());
        this.params();
    }
}
