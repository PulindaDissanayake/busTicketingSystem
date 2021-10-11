package busTicketingSystem;

enum Types {
    NVA("Not Vaccinated Adult"), NVC("Not Vaccinated Child"), VA("Vaccinated Adult"), VC("Vaccinated Child");

    public final String label;

    private Types(String label) {
        this.label = label;
    }
}