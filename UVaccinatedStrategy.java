package busTicketingSystem;

public class UVaccinatedStrategy extends VaccinatedStrategy {
    @Override
    public double calculate(double price) {
        System.out.println("Generating a ticket for a " + Types.VC.label);
        double ticketPrice = price + covidCharge;
        return (ticketPrice) / 2;
    }
}
