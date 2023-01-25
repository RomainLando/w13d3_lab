package defence;

public class Dragon implements IDefend{

    private static double damage;

    public Dragon() {
        this.damage = 50;
    }

    public double defend(){
        return damage;
    }
}
