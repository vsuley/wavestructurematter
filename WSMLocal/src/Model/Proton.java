package Model;

import Computer.PhysicsConstants;

/**
 * Created by vsuley on 11/15/2014.
 */
public class Proton {

    WaveParticle[] constituentParticles;

    public Proton() {

        constituentParticles = new WaveParticle[4];

        constituentParticles[0] =
                new WaveParticle(
                        new SpatialLocation(
                                10.0 * PhysicsConstants.ElectronWavelength,
                                10.0 * PhysicsConstants.ElectronWavelength,
                                10.0 * PhysicsConstants.ElectronWavelength)
                );

        constituentParticles[1] =
                new WaveParticle(
                        new SpatialLocation(
                                -10.0 * PhysicsConstants.ElectronWavelength,
                                -10.0 * PhysicsConstants.ElectronWavelength,
                                10.0 * PhysicsConstants.ElectronWavelength)
                );

        constituentParticles[2] =
                new WaveParticle(
                        new SpatialLocation(
                                -10.0 * PhysicsConstants.ElectronWavelength,
                                10.0 * PhysicsConstants.ElectronWavelength,
                                -10.0 * PhysicsConstants.ElectronWavelength)
                );

        constituentParticles[3] =
                new WaveParticle(
                        new SpatialLocation(
                                10.0 * PhysicsConstants.ElectronWavelength,
                                -10.0 * PhysicsConstants.ElectronWavelength,
                                -10.0 * PhysicsConstants.ElectronWavelength)
                );
    }

    public WaveParticle[] getConstituentParticles() {
        return constituentParticles;
    }
}
