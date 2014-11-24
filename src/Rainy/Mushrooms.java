package Rainy;

/**
 * User: Aleksandrs Grigorjevs
 * Date: 2014.06.18. 10:37
 */
public abstract class Mushrooms extends Food {

    protected boolean isPoisoned() {
        return poisoned;
    }

    protected void setPoisoned(boolean poisoned) {
        this.poisoned = true;
    }

    private final int weight = 1;
    private final int size = 10;
    private boolean poisoned = false;

    public Mushrooms() {
        setWeight(weight);
        setSize(size);
    }

    @Override
    public void about() {
        System.out.println(this.getName() + (this.isPoisoned() ? " (poisonous)" : " (not poisonous)"));
        this.params();
    }
}
