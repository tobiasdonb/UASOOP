// BodyFatPercentage.java
public class BodyFatPercentage {
    private Person Person;
    private double bfpValue; 

    public BodyFatPercentage(Person Person) {
        this.Person = Person;
        calculateBFP();
    }

    // Hitung BFP berdasarkan jenis kelamin
    private void calculateBFP() {
        double waist = Person.getLingkarPinggang();
        double neck = Person.getLingkarLeher();
        double height = Person.getTinggi(); // in cm
        String gender = Person.getJenisKelamin();

        double bodyDensity;
        if (gender.equalsIgnoreCase("Pria")) {
            // Rumus pria
            double logWaistNeck = Math.log10(waist - neck);
            double logHeight = Math.log10(height);
            bodyDensity = 1.0324 - 0.19077 * logWaistNeck + 0.15456 * logHeight;
        } else if (gender.equalsIgnoreCase("Wanita")) {
            // Rumus wanita
            double lingkarPinggul = Person.getLingkarPinggul();
            double logWaistHipNeck = Math.log10(waist + lingkarPinggul - neck);
            double logHeight = Math.log10(height);
            bodyDensity = 1.247 - 0.107 * logWaistHipNeck + 0.098 * logHeight; 
        } else {
            System.err.println("Jenis kelamin tidak valid untuk perhitungan BFP.");
            this.bfpValue = 0.0;
            return;
        }

        this.bfpValue = (495 / bodyDensity) - 450;
    }

    // view BFP
    public void viewBFP() {
        System.out.printf("Persentase Lemak Tubuh (BFP): %.2f%%\n", bfpValue);
    }

    // get BFP value
    public double getBFP() {
        return bfpValue;
    }

    // get Person info
    public Person getPersonInfo() {
        return Person;
    }
}