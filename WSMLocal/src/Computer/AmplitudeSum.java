package Computer;

import Model.SpatialLocation;
import Model.WaveParticle;

/**
 * Created by vsuley on 11/15/2014.
 */
public class AmplitudeSum {

    public static double GetAmpSumSansMotion(WaveParticle[] particles, SpatialLocation location){

        double amplitudeSum = 0;

        for(WaveParticle p : particles){

            double distance = p.Center.GetDistanceTo(location);
            double x = 2.0 * PhysicsConstants.Pi * distance / PhysicsConstants.ElectronWavelength;
            double y = PhysicsConstants.ElectronAmplitude * Math.sin(x) / x;

            amplitudeSum += y;
        }

        return amplitudeSum;
    }
}
