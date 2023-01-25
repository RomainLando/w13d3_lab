package heal;

public class Herb implements IHeal{

    private static double effect;

    public Herb() {
        this.effect = 25;
    }

    public double heal(){
        return effect;
    }
}
