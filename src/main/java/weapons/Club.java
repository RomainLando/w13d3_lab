package weapons;

public class Club implements IWeapon{

    private static double damage;

    public Club() {
        this.damage = 10;
    }

    public double attack(){
        return damage;
    }
}
