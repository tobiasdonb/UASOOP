// BodyMassIndex.java
public class BodyMassIndex {
    private User user;
    private double bmiValue;

    public BodyMassIndex(User user) {
        this.user = user;
        calculateBMI();
    }

    // Private method to calculate BMI
    // Rumus BMI: berat / (tinggi)^2 (tinggi in meters)
    private void calculateBMI() {
        double berat = user.getBerat(); // in kg
        double tinggiInMeters = user.getTinggi() / 100.0; // Convert cm to meters

        if (tinggiInMeters > 0) {
            this.bmiValue = berat / (tinggiInMeters * tinggiInMeters);
        } else {
            System.err.println("Tinggi badan tidak valid untuk perhitungan BMI.");
            this.bmiValue = 0.0;
        }
    }

    // Method to view BMI
    public void viewBMI() {
        System.out.printf("Body Mass Index (BMI): %.2f\n", bmiValue);
    }

    // Method to get BMI value
    public double getBMI() {
        return bmiValue;
    }

    // Method to get user info (as per table)
    public User getUserInfo() {
        return user;
    }
}