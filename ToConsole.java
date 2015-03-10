/**
 * Created by carbo_000 on 3/10/2015.
 */
public class ToConsole implements OptionStrategy {

    private int blockCounter = 2;

    public void typeExecution(int value) {

        for(int i = 0; i < value; i++) {

            for(int j = value; j > blockCounter-1; j--) {
                System.out.print(" ");
            }

            for(int k = 0;  k < blockCounter; k++) {
                System.out.print("#");
            }
            blockCounter++;
            System.out.println();
        }
    }
}
