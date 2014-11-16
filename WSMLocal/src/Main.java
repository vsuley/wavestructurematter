import Computer.AmplitudeSum;
import Computer.ConfigurableConstants;
import Model.Proton;
import Model.SpatialLocation;
import Utilities.Logger;

public class Main {

    public static void main(String[] args) {

        Logger logger = new Logger();
        Proton proton = new Proton();

        double rangeStart = 1e-11;
        double rangeStop = 1e-13;

        SpatialLocation candidateLocation = new SpatialLocation(rangeStart, 0,0);

        for (int i = 0; i < 100; i++) {

            double resultantField = 0;
            resultantField = AmplitudeSum.GetAmpSumSansMotion(proton.getConstituentParticles(), candidateLocation);
            logger.Log(resultantField);

            candidateLocation.X += ConfigurableConstants.DistanceStepSize;
        }
    }
}
