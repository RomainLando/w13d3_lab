package characters;

import weapons.IWeapon;

public class Knight extends Fighter{

    public Knight(String name, double healthPoints, IWeapon weapon) {
        super(name, healthPoints, weapon);
    }

    public String charge(){
        return "Charge!";
    }
}
