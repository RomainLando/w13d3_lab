package characters;

import defence.IDefend;

public abstract class Mage extends Player{

    IDefend defender;

    public Mage(String name, double healthPoints, IDefend defender) {
        super(name, healthPoints);
        this.defender = defender;
    }

    public IDefend getDefender() {
        return defender;
    }

    public void setDefender(IDefend defender) {
        this.defender = defender;
    }

    
}
