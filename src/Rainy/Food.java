package Rainy;

/**
 * User: Aleksandrs Grigorjevs
 * Date: 2014.06.18. 9:20
 */
public abstract class Food {

    protected String getName() {
        return "\"" + name + "\"";
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getSize() {
        return size;
    }

    protected void setSize(int size) {
        this.size = size;
    }

    protected float getWeight() {
        return weight;
    }

    protected void setWeight(float weight) {
        this.weight = weight;
    }

    protected int getCalories() {
        return calories;
    }

    protected void setCalories(int calories) {
        this.calories = calories;
    }

    private String name;
    private float weight;
    private int size;
    private int calories;

    public void params() {
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Size: " + size);
        System.out.println("Calories: " + calories);
    }

    public abstract void about();

}
