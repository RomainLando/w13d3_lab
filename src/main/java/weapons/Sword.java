package weapons;

public class Sword implements IWeapon{

    private static double damage;

    public Sword() {
        this.damage = 25;
    }

    public double attack(){
        return damage;
    }
}
