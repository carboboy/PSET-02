import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by carbo_000 on 3/10/2015.
 */
public class ToFile implements OptionStrategy {

    private PrintWriter write;

    public void typeExecution(StringBuilder sb) {
        try {
            write = new PrintWriter("mario.txt","UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        write.print(sb);

        write.close();
    }
}
