import characters.Knight;
import Enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Sword sword;
    Club club;
    Orc orc;

    @Before
    public void before(){
        club = new Club();
        orc = new Orc(100);
        sword = new Sword();
        knight = new Knight("Arthur", 100, sword);
    }

    @Test
    public void hasName(){
        assertEquals("Arthur", knight.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, knight.getHealthPoints(), 0.0);
    }

    @Test
    public void hasWeapon(){
        assertEquals(sword, knight.getWeapon());
    }

    @Test
    public void canAttack(){
        knight.attack(orc);
        assertEquals(75, orc.getHealthPoints(), 0.0);
    }

    @Test
    public void canChangeWeapon(){
        knight.setWeapon(club);
        knight.attack(orc);
        assertEquals(90, orc.getHealthPoints(), 0.0);
        assertEquals(club, knight.getWeapon());
    }

    @Test
    public void canRage(){
        assertEquals("Charge!", knight.charge());
    }
}
