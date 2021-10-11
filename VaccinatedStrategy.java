package busTicketingSystem;

public class VaccinatedStrategy implements TicketingStrategy {
    protected int covidCharge = 100;

    @Override
    public double calculate(double price) {
        System.out.println("Generating a ticket for a " + Types.VA.label);
        return price + covidCharge;
    }
}
