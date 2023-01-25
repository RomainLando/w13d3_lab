package characters;

import weapons.IWeapon;

public class Barbarian extends Fighter{

    public Barbarian(String name, double healthPoints, IWeapon weapon) {
        super(name, healthPoints, weapon);
    }

    public String rage(){
        return "RrrraaAAAAA!!!";
    }
}
