package busTicketingSystem;

public class NotVaccinatedStrategy implements TicketingStrategy {
    protected double notVaccinatedPenalty = 1.5;
    protected int covidCharge = 100;

    @Override
    public double calculate(double price) {
        System.out.println("Generating a ticket for a " + Types.NVA.label);
        double ticketPrice = price + covidCharge;
        return ticketPrice * notVaccinatedPenalty;
    }
}