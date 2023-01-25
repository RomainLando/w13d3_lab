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

    public void increaseHealthPoints(double amount){
        if (100 - this.healthPoints > amount){
            this.healthPoints+=amount;
        } else {
            this.healthPoints = 100;
        }
    }

    public void decreaseHealthPoints(double amount){
        this.healthPoints-=amount;
    }
}
