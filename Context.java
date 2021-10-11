package busTicketingSystem;

public class Context {
    private TicketingStrategy strategy;

    public Context(TicketingStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double num) {
        return strategy.calculate(num);
    }
}