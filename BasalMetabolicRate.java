// BasalMetabolicRate.java
public class BasalMetabolicRate {
    private Person Person;
    private BodyFatPercentage bfp;
    private double bmrValue;

    public BasalMetabolicRate(Person Person, BodyFatPercentage bfp) {
        this.Person = Person;
        this.bfp = bfp;
        calculateBMR();
    }

    // Private method to calculate BMR
    // Rumus BMR: BMR = 370 + (21.6 * (berat * (1 - bfp)))
    private void calculateBMR() {
        double berat = Person.getBerat(); // in kg
        double bfpDecimal = bfp.getBFP() / 100.0; // Convert BFP percentage to decimal

        this.bmrValue = 370 + (21.6 * (berat * (1 - bfpDecimal)));
    }

    // Method to view BMR
    public void viewBMR() {
        System.out.printf("Basal Metabolic Rate (BMR): %.2f kkal/hari\n", bmrValue);
    }

    // Method to get BMR value
    public double getBMR() {
        return bmrValue;
    }

    // Method to get BFP (as per table)
    public BodyFatPercentage getBFPRI() { // Renamed from getBFPRi to getBFPRI as in table
        return bfp;
    }

    // Method to get Person info (as per table)
    public Person getPersonInfo() {
        return Person;
    }
}