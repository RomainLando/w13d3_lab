import characters.Dwarf;
import Enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Axe axe;
    Sword sword;
    Orc orc;

    @Before
    public void before(){
        sword = new Sword();
        orc = new Orc(100);
        axe = new Axe();
        dwarf = new Dwarf("Kili", 100, axe);
    }

    @Test
    public void hasName(){
        assertEquals("Kili", dwarf.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, dwarf.getHealthPoints(), 0.0);
    }

    @Test
    public void hasWeapon(){
        assertEquals(axe, dwarf.getWeapon());
    }

    @Test
    public void canAttack(){
        dwarf.attack(orc);
        assertEquals(65, orc.getHealthPoints(), 0.0);
    }

    @Test
    public void canChangeWeapon(){
        dwarf.setWeapon(sword);
        dwarf.attack(orc);
        assertEquals(75, orc.getHealthPoints(), 0.0);
        assertEquals(sword, dwarf.getWeapon());
    }

    @Test
    public void canRage(){
        assertEquals("BBBbbrrrrr!", dwarf.blowHorn());
    }
}
