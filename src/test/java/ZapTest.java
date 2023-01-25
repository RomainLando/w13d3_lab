import Spells.Zap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZapTest {

    Zap heal;

    @Before
    public void before(){
        heal = new Zap();
    }

    @Test
    public void canCastEffect(){
        assertEquals(20, heal.cast(), 0.0);
    }
}
