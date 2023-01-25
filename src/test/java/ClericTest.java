import characters.Cleric;
import characters.Knight;
import heal.Herb;
import heal.Potion;
import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Knight knight;
    Sword sword;
    Potion potion;
    Herb herb;

    @Before
    public void before(){
        sword = new Sword();
        potion = new Potion();
        herb = new Herb();
        cleric = new Cleric("Ves", 100, potion);
        knight = new Knight("Arthur", 50, sword);
    }

    @Test
    public void hasName(){
        assertEquals("Ves", cleric.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, cleric.getHealthPoints(), 0.0);
    }

    @Test
    public void hasHealingItem(){
        assertEquals(potion, cleric.getHealingItem());
    }

    @Test
    public void canHeal(){
        cleric.heal(knight);
        assertEquals(80, knight.getHealthPoints(), 0.0);
    }

    @Test
    public void canChangeHealingItem(){
        cleric.setHealingItem(herb);
        assertEquals(herb, cleric.getHealingItem());
    }

}
