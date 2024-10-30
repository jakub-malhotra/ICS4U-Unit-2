/*
* This is the main code that runs with the Vehicle Class.
*
* @author  Mr Coxall
* @version 1.0
* @since   20240-01-01
*/

/**
* This is the Main program.
*/
final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if instantiation is attempted
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // MultipleStringLiterals & MagicNumbers
        final String statusString = "Status:";
        final String newSpeedString = "New speed: ";
        final String newColorString = "New color: ";
        final String changingColorString = "Changing color:";
        final int fourConst = 4;
        final int twoHundredEightyFourConst = 284;
        final int tenConst = 10;
        final int threeHundredTwentyConst = 320;
        final int oneHundredConst = 100;
        final int fortyFiveConst = 45;
        final int fiveConst = 5;

        System.out.println("Created Ford focus");
        final Vehicle fordFocus = new Vehicle("white", "B40-C4RR0",
            fourConst, twoHundredEightyFourConst);

        System.out.println(statusString);
        fordFocus.status();

        System.out.println("Accelerating, 10 of power for 10 sec.");
        fordFocus.accelerate(tenConst, tenConst);
        System.out.println(newSpeedString + fordFocus.getSpeed());

        System.out.println("Changing colour to black:");
        fordFocus.setColor("black");
        System.out.println(newColorString + fordFocus.getColor());

        System.out.println("");

        // New Ferrari
        System.out.println("Created a Ferrari");
        final Vehicle ferrari = new Vehicle("red", "VHD-35HU", 2,
            threeHundredTwentyConst);

        System.out.println(statusString);
        ferrari.status();

        System.out.println("Accelerating, 100 of power for 4 sec.");
        ferrari.accelerate(oneHundredConst, fourConst);
        System.out.println(newSpeedString + ferrari.getSpeed());

        System.out.println("Breaking, 10 of power for 10 sec.");
        ferrari.brake(tenConst, tenConst);
        System.out.println(newSpeedString + ferrari.getSpeed());

        System.out.println(changingColorString);
        ferrari.setColor("racing red!");
        System.out.println(newColorString + ferrari.getColor());

        System.out.println("");

        // New Citroen Ami
        System.out.println("Created a Citroen Ami");
        final Vehicle citroenAmi = new Vehicle("blue", "FS-695-DQ",
            fiveConst, fortyFiveConst);

        System.out.println(statusString);
        citroenAmi.status();

        System.out.println("Accelerating, 5 of power for 10 sec.");
        citroenAmi.accelerate(fiveConst, tenConst);
        System.out.println(newSpeedString + citroenAmi.getSpeed());

        System.out.println("Breaking, 2 of power for 10 sec.");
        citroenAmi.brake(2, tenConst);
        System.out.println(newSpeedString + citroenAmi.getSpeed());

        System.out.println(changingColorString);
        citroenAmi.setColor("purple");
        System.out.println(newColorString + citroenAmi.getColor());

        System.out.println("\nDone.");
    }
}
