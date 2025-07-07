// BodyFatPercentage.java
public class BodyFatPercentage {
    private User user;
    private double bfpValue; // To store the calculated BFP

    public BodyFatPercentage(User user) {
        this.user = user;
        calculateBFP(); // Calculate BFP when an object is created
    }

    // Private method to calculate BFP based on gender
    private void calculateBFP() {
        double waist = user.getLingkarPinggang();
        double neck = user.getLingkarLeher();
        double height = user.getTinggi(); // in cm
        String gender = user.getJenisKelamin();

        double bodyDensity;
        if (gender.equalsIgnoreCase("Pria")) {
            // Formula for men
            double logWaistNeck = Math.log10(waist - neck);
            double logHeight = Math.log10(height);
            bodyDensity = 1.0324 - 0.19077 * logWaistNeck + 0.15456 * logHeight;
        } else if (gender.equalsIgnoreCase("Wanita")) {
            double lingkarPinggul = user.getLingkarPinggul();
            // Formula for women (Navy method adapted)
            // Note: The original Navy method for women typically includes hip circumference.
            // If you have a specific formula for women you prefer, replace this.
            // This is a common one:
            double logWaistHipNeck = Math.log10(waist + lingkarPinggul - neck);
            double logHeight = Math.log10(height);
            bodyDensity = 1.247 - 0.107 * logWaistHipNeck + 0.098 * logHeight; // Example female formula, adjust if needed
        } else {
            System.err.println("Jenis kelamin tidak valid untuk perhitungan BFP.");
            this.bfpValue = 0.0; // Set to 0 or throw an exception for invalid gender
            return;
        }

        this.bfpValue = (495 / bodyDensity) - 450;
    }

    // Method to view BFP
    public void viewBFP() {
        System.out.printf("Persentase Lemak Tubuh (BFP): %.2f%%\n", bfpValue);
    }

    // Method to get BFP value
    public double getBFP() {
        return bfpValue;
    }

    // Method to get user info (as per table)
    public User getUserInfo() {
        return user;
    }
}