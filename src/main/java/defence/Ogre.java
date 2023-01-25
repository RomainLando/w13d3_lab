package defence;

public class Ogre implements IDefend{

    private static double damage;

    public Ogre() {
        this.damage = 40;
    }

    public double defend(){
        return damage;
    }
}
