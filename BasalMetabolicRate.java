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

    // Rumus BMR: BMR = 370 + (21.6 * (berat * (1 - bfp)))
    private void calculateBMR() {
        double berat = Person.getBerat();
        double bfpDecimal = bfp.getBFP() / 100.0; 

        this.bmrValue = 370 + (21.6 * (berat * (1 - bfpDecimal)));
    }

    // view BMR
    public void viewBMR() {
        System.out.printf("Basal Metabolic Rate (BMR): %.2f kkal/hari\n", bmrValue);
    }


    public double getBMR() {
        return bmrValue;
    }

    
    public BodyFatPercentage getBFPRI() { 
        return bfp;
    }

    // get Person info
    public Person getPersonInfo() {
        return Person;
    }
}