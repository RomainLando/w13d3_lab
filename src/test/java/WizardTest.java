import Enemies.Troll;
import Spells.Fireball;
import Spells.Zap;
import characters.Wizard;
import defence.Dragon;
import defence.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Troll troll;
    Ogre ogre;
    Zap zap;

    @Before
    public void before(){
        troll = new Troll(100);
        ogre = new Ogre();
        zap = new Zap();
        wizard = new Wizard("Merlin", 100, ogre, zap);
    }

    @Test
    public void hasName(){
        assertEquals("Merlin", wizard.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, wizard.getHealthPoints(), 0.0);
    }

    @Test
    public void hasDefender(){
        assertEquals(ogre, wizard.getDefender());
    }

    @Test
    public void hasSpell(){
        assertEquals(zap, wizard.getSpell());
    }

    @Test
    public void canCast(){
        wizard.cast(troll);
        assertEquals(80, troll.getHealthPoints(), 0.0);
    }

    @Test
    public void canDefend(){
        wizard.defend(troll);
        assertEquals(60, troll.getHealthPoints(), 0.0);
    }

    @Test
    public void canChangeDefender(){
        Dragon dragon = new Dragon();
        wizard.setDefender(dragon);
        assertEquals(dragon, wizard.getDefender());
    }

    @Test
    public void canChangeSpell(){
        Fireball fireball = new Fireball();
        wizard.setSpell(fireball);
        assertEquals(fireball, wizard.getSpell());
    }
}
