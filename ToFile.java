import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by carbo_000 on 3/10/2015.
 */
public class ToFile implements OptionStrategy {

    private PrintWriter write;
    private int blockCounter = 2;

    public void typeExecution(int value) {
        try {
            write = new PrintWriter("mario.txt","UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < value; i++) {

            for (int j = value; j > blockCounter-1; j--) {
                write.print(" ");
            }

            for (int k = 0; k < blockCounter; k++) {
                write.print("#");
            }
            blockCounter++;
            write.println();
        }
        write.close();
    }
}
