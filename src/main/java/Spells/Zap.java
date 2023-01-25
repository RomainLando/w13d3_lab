package Spells;

public class Zap implements ISpell{

    private static double effect;

    public Zap() {
        this.effect = 20;
    }

    public double cast(){
        return effect;
    }

}
