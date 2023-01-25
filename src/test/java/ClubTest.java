import org.junit.Before;
import org.junit.Test;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class ClubTest {

    Club club;

    @Before
    public void before(){
        club = new Club();
    }

    @Test
    public void hasDamage(){
        assertEquals(10, club.attack(), 0.0);
    }
}
