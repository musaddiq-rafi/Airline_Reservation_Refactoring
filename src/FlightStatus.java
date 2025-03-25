
public enum FlightStatus {
    SCHEDULED("As Per Schedule"),
    DELAYED("Delayed"),
    CANCELLED("Cancelled");

    private final String displayText;

    FlightStatus(String displayText) {
        this.displayText = displayText;
    }

    public String getDisplayText() {
        return displayText;
    }
}