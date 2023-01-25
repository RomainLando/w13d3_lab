package Spells;

public class Fireball implements ISpell{

    private static double effect;

    public Fireball() {
        this.effect = 40;
    }

    public double cast(){
        return effect;
    }
}
