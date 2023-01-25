package weapons;

public class Axe implements IWeapon{

    private static double damage;

    public Axe() {
        this.damage = 35;
    }

    public double attack(){
        return damage;
    }
}
