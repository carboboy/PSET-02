/**
 * Created by carbo_000 on 3/10/2015.
 */
public class OutputContext {

    private OptionStrategy strategy;
    private int value;

    public void setOptionStrategy(OptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void typeExecution(int value) {

        StringBuilder sb = new StringBuilder(value * value);
        int blockCounter = 2;

        for(int i = 0; i < value; i++) {

            for(int j = value; j > blockCounter-1; j--) {
                sb.append(" ");
            }

            for(int k = 0;  k < blockCounter; k++) {
                sb.append("#");
            }
            blockCounter++;
            sb.append("\n");
        }
        strategy.typeExecution(sb);
    }
}
