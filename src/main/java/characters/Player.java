package characters;

public abstract class Player {

    private String name;
    private double healthPoints;

    public Player(String name, double healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public double getHealthPoints() {
        return healthPoints;
    }
}
