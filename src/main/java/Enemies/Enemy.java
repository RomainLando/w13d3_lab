package Enemies;

public abstract class Enemy {

    private double healthPoints;

    public Enemy(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getHealthPoints() {
        return this.healthPoints;
    }

    public void takeDamage(double hitPoints){
        this.healthPoints-=hitPoints;
    }
}
