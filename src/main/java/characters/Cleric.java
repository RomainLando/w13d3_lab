package characters;

import heal.IHeal;

public class Cleric extends Player{

    private IHeal healingItem;

    public Cleric(String name, double healthPoints, IHeal healingItem) {
        super(name, healthPoints);
        this.healingItem = healingItem;
    }

    public IHeal getHealingItem() {
        return healingItem;
    }

    public void setHealingItem(IHeal healingItem) {
        this.healingItem = healingItem;
    }

    public void heal(Player player){
        player.increaseHealthPoints(this.healingItem.heal());
    }
}
