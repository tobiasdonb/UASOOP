// BodyMassIndex.java
public class BodyMassIndex {
    private Person Person;
    private double bmiValue;

    public BodyMassIndex(Person Person) {
        this.Person = Person;
        calculateBMI();
    }

    // Rumus BMI: berat / (tinggi)^2 (tinggi in meters)
    private void calculateBMI() {
        double berat = Person.getBerat(); // kg
        double tinggiInMeters = Person.getTinggi() / 100.0; // Convert cm ke meter

        if (tinggiInMeters > 0) {
            this.bmiValue = berat / (tinggiInMeters * tinggiInMeters);
        } else {
            System.err.println("Tinggi badan tidak valid untuk perhitungan BMI.");
            this.bmiValue = 0.0;
        }
    }

    // view BMI
    public void viewBMI() {
        System.out.printf("Body Mass Index (BMI): %.2f\n", bmiValue);
    }

    // get BMI value
    public double getBMI() {
        return bmiValue;
    }

    // get Person info 
    public Person getPersonInfo() {
        return Person;
    }
}