/*
 * Program to use Airplane and Jet classes.
 *
 * @author  Jakub Malhotra
 * @version 1.0
 * @since   2024-10-29
 */

/**
 * This is the FlyTest program that demonstrates
 * the functionality of the Airplane and Jet classes.
 */
public class FlyTest {

    /**
     * The main() method to execute the program.
     *
     * @param args No command-line arguments used
     */
    public static void main(String[] args) {
        Airplane biplane = new Airplane();
        biplane.setSpeed(212);
        System.out.println(biplane.getSpeed());

        Jet boeing = new Jet();
        boeing.setSpeed(422);
        System.out.println(boeing.getSpeed());

        int x = 0;
        while (x < 4) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());

            if (boeing.getSpeed() > 5000) {
                biplane.setSpeed(biplane.getSpeed() * 2);
            } else {
                boeing.accelerate();
            }
            x++;
        }
        System.out.println(biplane.getSpeed());
    }
}
