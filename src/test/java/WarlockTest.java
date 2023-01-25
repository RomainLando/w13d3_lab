import Enemies.Orc;
import Enemies.Troll;
import Spells.Fireball;
import Spells.Zap;
import characters.Warlock;
import defence.Dragon;
import defence.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Orc orc;
    Dragon dragon;
    Fireball fireball;

    @Before
    public void before(){
        orc = new Orc(100);
        dragon = new Dragon();
        fireball = new Fireball();
        warlock = new Warlock("Melvin", 100, dragon, fireball);
    }

    @Test
    public void hasName(){
        assertEquals("Melvin", warlock.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, warlock.getHealthPoints(), 0.0);
    }

    @Test
    public void hasDefender(){
        assertEquals(dragon, warlock.getDefender());
    }

    @Test
    public void hasSpell(){
        assertEquals(fireball, warlock.getSpell());
    }

    @Test
    public void canCast(){
        warlock.cast(orc);
        assertEquals(60, orc.getHealthPoints(), 0.0);
    }

    @Test
    public void canDefend(){
        warlock.defend(orc);
        assertEquals(50, orc.getHealthPoints(), 0.0);
    }

    @Test
    public void canChangeDefender(){
        Ogre ogre = new Ogre();
        warlock.setDefender(ogre);
        assertEquals(ogre, warlock.getDefender());
    }

    @Test
    public void canChangeSpell(){
        Zap zap = new Zap();
        warlock.setSpell(zap);
        assertEquals(zap, warlock.getSpell());
    }
}
