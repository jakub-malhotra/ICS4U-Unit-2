/*
 * Class representing a jet with specific speed multiplier functionality.
 * Extends the Airplane class to inherit basic airplane properties.
 *
 * @author jakub-malhotra
 * @version 1.0
 * @since   2024-10-29
 */

public class Jet extends Airplane {

    /**
     * Multiplier used to increase the speed of the jet.
     */
    private static final int MULTIPLIER = 2;

    /**
     * Creates a new Jet instance.
     */
    public Jet() {
        super();
    }

    /**
     * Sets the speed of the jet, applying the multiplier to the input speed.
     *
     * @param speed - The base speed to set, which will be multiplied.
     */
    public void setSpeed(final int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
     * Accelerates the jet by doubling its current speed.
     */
    public void accelerate() {
        super.setSpeed(getSpeed() * MULTIPLIER);
    }
}
