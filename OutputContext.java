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
        strategy.typeExecution(value);
    }
}
