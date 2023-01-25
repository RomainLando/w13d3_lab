package Spells;

public class Heal implements ISpell{

    private static double effect;

    public Heal() {
        this.effect = 20;
    }

    public double cast(){
        return effect;
    }

}
