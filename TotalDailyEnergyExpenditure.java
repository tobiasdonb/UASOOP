// TotalDailyEnergyExpenditure.java
public class TotalDailyEnergyExpenditure {
    private Person Person;
    private BasalMetabolicRate bmr;
    private double faktorAktivitas; // Activity factor
    private double tdeeValue;

    public TotalDailyEnergyExpenditure(Person Person, BasalMetabolicRate bmr, double faktorAktivitas) {
        this.Person = Person;
        this.bmr = bmr;
        this.faktorAktivitas = faktorAktivitas;
        calculateTDEE();
    }

    // Private method to calculate TDEE
    // Rumus TDEE: BMR * faktor aktivitas
    private void calculateTDEE() {
        this.tdeeValue = bmr.getBMR() * faktorAktivitas;
    }

    // Method to view TDEE
    public void viewTDEE() {
        System.out.printf("Total Daily Energy Expenditure (TDEE): %.2f kkal/hari\n", tdeeValue);
    }

    // Method to get TDEE value
    public double getTDEE() {
        return tdeeValue;
    }

    // Method to get BMR (as per table)
    public BasalMetabolicRate getBMR() {
        return bmr;
    }

    // Method to get activity factor (as per table)
    public double getAktivitas() { // Corrected method name from getAktivitas
        return faktorAktivitas;
    }
}