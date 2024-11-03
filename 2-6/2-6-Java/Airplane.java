/*
 * Class representing an airplane with basic functionality.
 *
 * @author  Jakub Malhotra
 * @version 1.0
 * @since   2024-10-29
 */

public class Airplane {

    /**
     * The speed of the airplane.
     */
    private int speed;

    /**
     * Gets the speed of the airplane.
     *
     * @return The current speed of the airplane.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the speed of the airplane.
     *
     * @param newSpeed - The new speed to set for the airplane.
     */
    public void setSpeed(final int newSpeed) {
        this.speed = newSpeed;
    }
}
