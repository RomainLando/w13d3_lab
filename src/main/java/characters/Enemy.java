package characters;

public abstract class Enemy {

    private double healthPoints;

    public Enemy(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getHealthPoints() {
        return this.healthPoints;
    }

    public void takeDamage(int hitPoints){
        this.healthPoints-=hitPoints;
    }
}
