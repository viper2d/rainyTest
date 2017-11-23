package Rainy;

public class Pear extends Food {

    private final String name = "pear";
    private final float weight = 0.3f;
    private final int size = 4;
    private final int calories = 130;

    public Pear() {
        this.setName(name);
        this.setWeight(weight);
        this.setSize(size);
        this.setCalories(calories);
    }

    @Override
    public void about() {
        System.out.println(this.getName());
        this.params();
    }

}
