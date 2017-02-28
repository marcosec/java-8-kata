package marcosec.training.berlin.clock;

import java.util.stream.Stream;

/**
 * Created by marco on 2/28/17.
 */
public class BerlinClock
{

    public String getSeconds(int seconds)
    {
        if (seconds % 2==0)
        {
            return "Y";
        }
        return "O";
    }

    public String getTopHours(int hours)
    {
        return turnLightsOn(hours/5, 4, "R");
    }


    public String getBottomHours(int hours) {

        return turnLightsOn(hours%5, 4, "R");
    }

    public String getTopMinutes(int minutes) {

        return turnLightsOn(minutes/5, 11, "Y").replaceAll("YYY","YYR");
    }

    public String getBottomMinutes(int minutes) {
        return turnLightsOn(minutes % 5, 4, "Y");
    }

    public String[] convertTime(String time) {
        int[] timeSplits = Stream.of(time.split(":")).mapToInt(Integer::parseInt).toArray();
        return new String[]{
            getSeconds(timeSplits[2]),
            getTopHours(timeSplits[0]),
            getBottomHours(timeSplits[0]),
            getTopMinutes(timeSplits[1]),
            getBottomMinutes(timeSplits[1]),
        };
    }
    private String turnLightsOn(int lightsOn, int lamps, String lightColor) {
        StringBuilder sb = new StringBuilder("");
        for (int index = 0; index<lightsOn; index++) {
            sb.append(lightColor);
        }
        for (int index = 0; index < (lamps -lightsOn); index++) {
            sb.append("O");
        }
        return sb.toString();
    }

}
