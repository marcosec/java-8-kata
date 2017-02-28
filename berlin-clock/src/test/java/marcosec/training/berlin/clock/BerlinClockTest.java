package marcosec.training.berlin.clock;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by marco on 2/28/17.
 */
public class BerlinClockTest {

    private BerlinClock berlinClock = new BerlinClock();

    @Test
    public void secondsShouldLightYellowEveryTwoSeconds()
    {
        assertEquals("Y",berlinClock.getSeconds(2));
        assertEquals("O",berlinClock.getSeconds(1));
    }

    @Test
    public void topHoursShouldHaveFourLamps()
    {
        assertEquals(4,berlinClock.getTopHours(4).length());
    }

    @Test
    public void topHoursShouldLightRedLampForEveryFiveHours()
    {
        assertEquals("OOOO",berlinClock.getTopHours(4));
        assertEquals("ROOO",berlinClock.getTopHours(5));
        assertEquals("RROO",berlinClock.getTopHours(11));
        assertEquals("RRRR",berlinClock.getTopHours(23));
    }

    @Test
    public void bottomHoursShouldHaveFourLamps()
    {
        assertEquals(4,berlinClock.getBottomHours(4).length());
    }

    @Test
    public void topHoursShouldLightRedLampForEveryHourLeftFromTopHours()
    {
        assertEquals("OOOO",berlinClock.getBottomHours(5));
        assertEquals("ROOO",berlinClock.getBottomHours(11));
        assertEquals("RRRR",berlinClock.getBottomHours(24));
    }

    @Test
    public void topMinutesShouldHaveElevenLamps()
    {
        assertEquals(11, berlinClock.getTopMinutes(4).length());
    }

    @Test
    public void topMinutesShouldLightYellowEveryFiveMinutes()
    {
        assertEquals("OOOOOOOOOOO",berlinClock.getTopMinutes(0));
        assertEquals("YYOOOOOOOOO",berlinClock.getTopMinutes(14));
        assertEquals("YYRYOOOOOOO",berlinClock.getTopMinutes(21));
        assertEquals("YYRYYRYYROO",berlinClock.getTopMinutes(45));
    }

    @Test
    public void bottomMinutesShouldHaveFourLamps()
    {
        assertEquals(4, berlinClock.getBottomMinutes(4).length());
    }

    @Test
    public void bottomMinutesShouldLightYellowEveryMinuteLeftFromTopMinutes()
    {
        assertEquals("OOOO",berlinClock.getBottomMinutes(0));
        assertEquals("YOOO",berlinClock.getBottomMinutes(11));
        assertEquals("YYYO",berlinClock.getBottomMinutes(23));
        assertEquals("YYYY",berlinClock.getBottomMinutes(54));
    }

    @Test
    public void testPrintTime()
    {
        String[] berlinClockTime = berlinClock.convertTime("13:41:50");
        String[] expected = new String[] {"Y","RROO","RRRO","YYRYYRYYOOO","YOOO"};
        for (int i = 0; i < expected.length; i++)
        {
            assertEquals(expected[i], berlinClockTime[i]);
        }
    }
}
