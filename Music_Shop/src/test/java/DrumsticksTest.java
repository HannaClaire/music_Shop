import org.junit.Before;
import org.junit.Test;
import vendor.DrumSticks;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Wood", 10,15);
    }

    @Test
    public void hasMarkup(){
        assertEquals(5, drumSticks.calculateMarkup(10, 15));
    }
}
