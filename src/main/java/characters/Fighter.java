package characters;

import Enemies.Enemy;
import weapons.IWeapon;

public abstract class Fighter extends Player{

    private IWeapon weapon;

    public Fighter(String name, double healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        enemy.takeDamage(this.weapon.attack());
    }
}
