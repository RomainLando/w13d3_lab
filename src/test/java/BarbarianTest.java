import characters.Barbarian;
import characters.Orc;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.IWeapon;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Axe axe;
    Sword sword;
    Orc orc;

    @Before
    public void before(){
        sword = new Sword();
        orc = new Orc(100);
        axe = new Axe();
        barbarian = new Barbarian("Khal", 100, axe);
    }

    @Test
    public void hasName(){
        assertEquals("Khal", barbarian.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, barbarian.getHealthPoints(), 0.0);
    }

    @Test
    public void hasWeapon(){
        assertEquals(axe, barbarian.getWeapon());
    }

    @Test
    public void canAttack(){
        barbarian.attack(orc);
        assertEquals(65, orc.getHealthPoints(), 0.0);
    }

    @Test
    public void canChangeWeapon(){
        barbarian.setWeapon(sword);
        barbarian.attack(orc);
        assertEquals(75, orc.getHealthPoints(), 0.0);
        assertEquals(sword, barbarian.getWeapon());
    }

    @Test
    public void canRage(){
        assertEquals("RrrraaAAAAA!!!", barbarian.rage());
    }
}
