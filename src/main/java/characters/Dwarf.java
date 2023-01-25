package characters;

import weapons.IWeapon;

public class Dwarf extends Fighter{

    public Dwarf(String name, double healthPoints, IWeapon weapon) {
        super(name, healthPoints, weapon);
    }

    public String blowHorn(){
        return "BBBbbrrrrr!";
    }
}
