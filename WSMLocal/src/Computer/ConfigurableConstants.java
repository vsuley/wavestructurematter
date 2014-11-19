package Computer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by vsuley on 11/15/2014.
 */
public class ConfigurableConstants {

    public static double DistanceStepSize;
    public static double AmplitudeMaxThreshold;
    public static double AmplitudeMinThreshold;
    public static double RangeStart;
    public static double RangeEnd;

    static {
        try {
            Properties prop = new Properties();
            InputStream  inputStream = new FileInputStream("config.properties");

            prop.load(inputStream);

            DistanceStepSize = Double.parseDouble(prop.getProperty("DistanceStepSize"));
            AmplitudeMaxThreshold = Double.parseDouble(prop.getProperty("AmplitudeMaxThreshold"));
            AmplitudeMinThreshold = Double.parseDouble(prop.getProperty("AmplitudeMinThreshold"));
            RangeStart = Double.parseDouble(prop.getProperty("RangeStart"));
            RangeEnd = Double.parseDouble(prop.getProperty("RangeEnd"));

            System.out.println(DistanceStepSize);
            System.out.println(AmplitudeMaxThreshold);
            System.out.println(AmplitudeMinThreshold);
            System.out.println(RangeStart);
            System.out.println(RangeEnd);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
