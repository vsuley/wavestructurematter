import Computer.AmplitudeSum;
import Computer.ConfigurableConstants;
import Model.Proton;
import Model.SpatialLocation;
import Utilities.Logger;

public class Main {

    public static void main(String[] args) {

        Logger logger = new Logger();
        Proton proton = new Proton();

        double xStart = ConfigurableConstants.RangeStart;
        double xEnd = ConfigurableConstants.RangeEnd;
        SpatialLocation candidateLocation = new SpatialLocation(xStart, 0,0);

        logger.StartLogging();
        while(candidateLocation.X < xEnd) {

            double resultantField = 0;
            resultantField = AmplitudeSum.GetAmpSumSansMotion(proton.getConstituentParticles(), candidateLocation);
            logger.Log(resultantField);

            candidateLocation.X += ConfigurableConstants.DistanceStepSize;
        }
        logger.StopLogging();
    }
}
