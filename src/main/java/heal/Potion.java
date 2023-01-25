package heal;

public class Potion implements IHeal{

    private static double effect;

    public Potion() {
        this.effect = 30;
    }

    public double heal(){
        return effect;
    }

}
