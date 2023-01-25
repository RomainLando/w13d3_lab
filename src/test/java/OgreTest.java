import defence.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    Ogre ogre;

    @Before
    public void before(){
        ogre = new Ogre();
    }

    @Test
    public void canDefend(){
        assertEquals(40, ogre.defend(), 0.0);
    }
}
