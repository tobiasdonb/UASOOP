// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Input Data Pengguna ---");
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Umur (tahun): ");
        int umur = scanner.nextInt();

        System.out.print("Masukkan Berat (kg): ");
        double berat = scanner.nextDouble();

        System.out.print("Masukkan Tinggi (cm): ");
        double tinggi = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Masukkan Jenis Kelamin (Pria/Wanita): ");
        String jenisKelamin = scanner.nextLine();

        System.out.print("Masukkan Lingkar Pinggang (cm): ");
        double lingkarPinggang = scanner.nextDouble();

        System.out.print("Masukkan Lingkar Pinggul (cm): ");
        double lingkarPinggul = scanner.nextDouble();

        System.out.print("Masukkan Lingkar Leher (cm): ");
        double lingkarLeher = scanner.nextDouble();

        // Create User object
        User user = new User(nama, umur, berat, tinggi, jenisKelamin,
                             lingkarPinggang, lingkarPinggul, lingkarLeher);

        // View User Info
        user.viewUserInfo();
        System.out.println();

        // Calculate and view Body Fat Percentage
        BodyFatPercentage bfp = new BodyFatPercentage(user);
        bfp.viewBFP();
        System.out.println("BFP value obtained directly: " + bfp.getBFP());
        System.out.println();

        // Calculate and view Basal Metabolic Rate
        BasalMetabolicRate bmr = new BasalMetabolicRate(user, bfp);
        bmr.viewBMR();
        System.out.println("BMR value obtained directly: " + bmr.getBMR());
        System.out.println();

        // Input activity factor for TDEE
        System.out.print("Masukkan Faktor Aktivitas (e.g., 1.2 for sedentary, 1.375 for light activity): ");
        double faktorAktivitas = scanner.nextDouble();

        // Calculate and view Total Daily Energy Expenditure
        TotalDailyEnergyExpenditure tdee = new TotalDailyEnergyExpenditure(user, bmr, faktorAktivitas);
        tdee.viewTDEE();
        System.out.println("TDEE value obtained directly: " + tdee.getTDEE());
        System.out.println();

        // Calculate and view Body Mass Index
        BodyMassIndex bmi = new BodyMassIndex(user);
        bmi.viewBMI();
        System.out.println("BMI value obtained directly: " + bmi.getBMI());
        System.out.println();

        scanner.close();
    }
}