package characters;

import Enemies.Enemy;
import Spells.ISpell;
import defence.IDefend;

public class Wizard extends Mage{

    private ISpell spell;

    public Wizard(String name, double healthPoints, IDefend defender, ISpell spell) {
        super(name, healthPoints, defender);
        this.spell = spell;
    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public void cast(Enemy enemy) {
        enemy.takeDamage(this.spell.cast());
    }

    public void defend(Enemy enemy) {
        enemy.takeDamage(this.defender.defend());
    }
}
