package busTicketingSystem;

public class UNotVaccinatedStrategy extends NotVaccinatedStrategy {
    @Override
    public double calculate(double price) {
        System.out.println("Generating a ticket for a " + Types.NVC.label);
        double ticketPrice = price + covidCharge;
        return ticketPrice * notVaccinatedPenalty / 2;
    }
}
