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
        scanner.nextLine(); 

        System.out.print("Masukkan Jenis Kelamin (Pria/Wanita): ");
        String jenisKelamin = scanner.nextLine();

        System.out.print("Masukkan Lingkar Pinggang (cm): ");
        double lingkarPinggang = scanner.nextDouble();

        System.out.print("Masukkan Lingkar Pinggul (cm): ");
        double lingkarPinggul = scanner.nextDouble();

        System.out.print("Masukkan Lingkar Leher (cm): ");
        double lingkarLeher = scanner.nextDouble();

        // objek Person
        Person Person = new Person(nama, umur, berat, tinggi, jenisKelamin,
                             lingkarPinggang, lingkarPinggul, lingkarLeher);

        // View Person Info
        Person.viewPersonInfo();
        System.out.println();

        // kalkulasi dan view Body Fat Percentage
        BodyFatPercentage bfp = new BodyFatPercentage(Person);
        bfp.viewBFP();
        System.out.println();

        // kalkulasi dan view Basal Metabolic Rate
        BasalMetabolicRate bmr = new BasalMetabolicRate(Person, bfp);
        bmr.viewBMR();
        System.out.println();

        // Input activity factor untuk TDEE
        System.out.print(
                "Masukkan Faktor Aktivitas (1.2 minim gerak, 1.375 Aktivitas ringan, 1.4-1.5  Aktivitas sedang, 1.75 for Aktivitas berat): ");
        System.out.print("Faktor Aktivitas: ");
        double faktorAktivitas = scanner.nextDouble();

        // kalkulasi dan view Total Daily Energy Expenditure
        TotalDailyEnergyExpenditure tdee = new TotalDailyEnergyExpenditure(Person, bmr, faktorAktivitas);
        tdee.viewTDEE();
        System.out.println();

        // kalkulasi dan view Body Mass Index
        BodyMassIndex bmi = new BodyMassIndex(Person);
        bmi.viewBMI();
        System.out.println();

        scanner.close();
    }
}