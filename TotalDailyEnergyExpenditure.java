// TotalDailyEnergyExpenditure.java
// total
public class TotalDailyEnergyExpenditure {
    private Person Person;
    private BasalMetabolicRate bmr;
    private double faktorAktivitas;
    private double tdeeValue;

    public TotalDailyEnergyExpenditure(Person Person, BasalMetabolicRate bmr, double faktorAktivitas) {
        this.Person = Person;
        this.bmr = bmr;
        this.faktorAktivitas = faktorAktivitas;
        calculateTDEE();
    }

    // Rumus TDEE: BMR * faktor aktivitas
    private void calculateTDEE() {
        this.tdeeValue = bmr.getBMR() * faktorAktivitas;
    }

    // view TDEE
    public void viewTDEE() {
        System.out.printf("Total Daily Energy Expenditure (TDEE): %.2f kkal/hari\n", tdeeValue);
    }

    // Method to get TDEE value
    public double getTDEE() {
        return tdeeValue;
    }

    // get BMR
    public BasalMetabolicRate getBMR() {
        return bmr;
    }

    // get activity factor
    public double getAktivitas() { 
        return faktorAktivitas;
    }
}