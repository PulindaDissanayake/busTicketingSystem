package busTicketingSystem;

import java.util.Locale;
import java.util.Scanner;


class TicketingStrategyDemo {
    public static void main(String[] args) {
        int ticketType;
        double distanceInKm;

        System.out.println("--------------------------------------------");
        System.out.println("***SPECIAL BUS TICKETING SYSTEM - COVID***");
        System.out.println("--------------------------------------------");

        // Scanning for distance
        Scanner scanOne = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter distance in KM: ");
        distanceInKm = scanOne.nextDouble();

        System.out.println("--------------------------------------------");

        // Scanning for ticket type
        Scanner scanTwo = new Scanner(System.in);
        System.out.println("Enter Type :\n" + "1 for Not Vaccinated Adult\n" + "2 for Not Vaccinated Child\n"
                + "3 for Vaccinated Adult\n" + "4 for Vaccinated Child\n");

        ticketType = scanTwo.nextInt();

        // Generating the price of standard ticket price using distance
        double standardTicketPrice = getStandardTicketPrice(distanceInKm);
        scanOne.close();

        // Generating the type of the ticket using the entered type
        TicketingStrategy ticketingStrategy = getStrategyType(ticketType);
        scanTwo.close();

        System.out.println("--------------------------------------------");
        Context context = new Context(ticketingStrategy);
        System.out
                .println("Ticket price (with covid situation) is = Rs." + context.executeStrategy(standardTicketPrice));
        System.out.println("--------------------------------------------");

    }

    public static double getStandardTicketPrice(double distance) {
        if (distance <= 100) {
            return distance * 1.5;
        } else if (distance > 100 && distance <= 200) {
            return distance * 2;
        } else {
            return distance * 3;
        }
    }

    public static TicketingStrategy getStrategyType(int ticketType) {
        TicketingStrategy ticketingStrategy = null;

        if (ticketType == 1) {
            ticketingStrategy = new NotVaccinatedStrategy();
        } else if (ticketType == 2) {
            ticketingStrategy = new UNotVaccinatedStrategy();
        } else if (ticketType == 3) {
            ticketingStrategy = new VaccinatedStrategy();
        } else if (ticketType == 4) {
            ticketingStrategy = new UVaccinatedStrategy();
        } else {
            System.out.println("Invalid Type");
        }

        return ticketingStrategy;
    }
}
