package cuke;

public class DomainModel {

    {
        System.err.println("Creating Domain Model...");
    }
    private int count;
    boolean triggered = false;

    public int getCount() {
        if (triggered) return count;
        else throw new IllegalStateException("not yet triggered");
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void trigger() {
        triggered = true;
    }
}
