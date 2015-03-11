/**
 * Created by carbo_000, Ryan Modica, on 3/10/2015.
 * Second PSet of Mario.java. It uses the concept of the Strategy Pattern Design
 */

import java.util.Scanner;

public class Mario {

    public static void main(String[] varArgs) {

        int value = 0;
        int height = 0;

        Scanner scan = new Scanner(System.in);
        OutputContext output = new OutputContext();

        System.out.print("Which option you want for the result?\nEnter '1' for Console\nEnter '2' for Text File\n");
        System.out.print("Option: ");
        value = scan.nextInt();
        System.out.print("Height: ");
        height = scan.nextInt();

        if(value == 1 && height > 0 && height < 25) {
            output.setOptionStrategy(new ToConsole());
            output.typeExecution(height);
        } else if(value == 2 && height > 0 && height < 25) {
            output.setOptionStrategy(new ToFile());
            output.typeExecution(height);
        } else {
            System.out.println("Run again with proper values and the height can be only be between 1 to 24");
        }
    }
}
