import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi Variabel main
        String nama = "";
        int umur = 0;
        double berat = 0;
        double tinggi = 0;
        String jenisKelamin = "";
        double lingkarPinggang = 0;
        double lingkarPinggul = 0;
        double lingkarLeher = 0;
        Person person = null;
        BodyFatPercentage bfp = null;
        BasalMetabolicRate bmr = null;
        TotalDailyEnergyExpenditure tdee = null;
        BodyMassIndex bmi = null;
        double faktorAktivitas = 0;

        // Menu Pilihan
        int choice;
        do {
            // Menampilkan menu
            System.out.println("\n--- Kalkulator Kesehatan ---");
            System.out.println("1. Input data Pasien");
            System.out.println("2. Lihat data Pasien");
            System.out.println("3. Body Fat Percentage");
            System.out.println("4. Basal Metabolic Rate");
            System.out.println("5. Total Daily Energy Expenditure");
            System.out.println("6. Body Mass Index");
            System.out.println("7. Lihat Semua data");
            System.out.println("8. Keluar");
            System.out.print("Masukkan pilihan Anda (1-8): ");

            // Membaca pilihan pengguna
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            // Memproses pilihan
            switch (choice) {
                case 1:
                    for (int i = 0; i < 50; ++i)
                        System.out.println(); // Untuk Clear Screen
                    System.out.println("\n--- Input Data Pengguna ---");
                    System.out.print("Masukkan Nama: ");
                    nama = scanner.nextLine();

                    System.out.print("Masukkan Umur (tahun): ");
                    umur = scanner.nextInt();

                    System.out.print("Masukkan Berat (kg): ");
                    berat = scanner.nextDouble();

                    System.out.print("Masukkan Tinggi (cm): ");
                    tinggi = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Masukkan Jenis Kelamin (Pria/Wanita): ");
                    jenisKelamin = scanner.nextLine();

                    System.out.print("Masukkan Lingkar Pinggang (cm): ");
                    lingkarPinggang = scanner.nextDouble();

                    System.out.print("Masukkan Lingkar Pinggul (cm): ");
                    lingkarPinggul = scanner.nextDouble();

                    System.out.print("Masukkan Lingkar Leher (cm): ");
                    lingkarLeher = scanner.nextDouble();

                    System.out.print(
                            "Masukkan Faktor Aktivitas (1.2 minim gerak, 1.375 Aktivitas ringan, 1.4-1.5 Aktivitas sedang, 1.75 for Aktivitas berat): ");
                    faktorAktivitas = scanner.nextDouble();

                    // Membuat Person object
                    person = new Person(nama, umur, berat, tinggi, jenisKelamin,
                            lingkarPinggang, lingkarPinggul, lingkarLeher);

                    // Mengkalkulasi semua data
                    bfp = new BodyFatPercentage(person);
                    bmr = new BasalMetabolicRate(person, bfp);
                    tdee = new TotalDailyEnergyExpenditure(person, bmr, faktorAktivitas);
                    bmi = new BodyMassIndex(person);

                    for (int i = 0; i < 50; ++i)
                        System.out.println();
                    System.out.println("Data pasien berhasil diinput!");
                    scanner.nextLine();
                    break;

                case 2:
                    for (int i = 0; i < 50; ++i)
                        System.out.println(); // Untuk Clear Screen
                    if (person != null) {
                        person.viewPersonInfo();
                    } else {
                        System.out.println("Silakan input data pasien terlebih dahulu (pilihan 1)");
                    }
                    scanner.nextLine();
                    break;

                case 3:
                    for (int i = 0; i < 50; ++i)
                        System.out.println(); // Untuk Clear Screen
                    if (person != null) {
                        bfp = new BodyFatPercentage(person);
                        bfp.viewBFP();
                    } else {
                        System.out.println("Silakan input data pasien terlebih dahulu (pilihan 1)");
                    }
                    scanner.nextLine();
                    break;

                case 4:
                    for (int i = 0; i < 50; ++i)
                        System.out.println(); // Untuk Clear Screen
                    if (person != null) {
                        if (bfp == null) {
                            bfp = new BodyFatPercentage(person);
                        }
                        bmr = new BasalMetabolicRate(person, bfp);
                        bmr.viewBMR();
                    } else {
                        System.out.println("Silakan input data pasien terlebih dahulu (pilihan 1)");
                    }
                    scanner.nextLine();
                    break;

                case 5:
                    for (int i = 0; i < 50; ++i)
                        System.out.println(); // Untuk Clear Screen
                    if (person != null) {
                        if (bfp == null) {
                            bfp = new BodyFatPercentage(person);
                        }
                        if (bmr == null) {
                            bmr = new BasalMetabolicRate(person, bfp);
                        }

                        tdee = new TotalDailyEnergyExpenditure(person, bmr, faktorAktivitas);
                        tdee.viewTDEE();
                    } else {
                        System.out.println("Silakan input data pasien terlebih dahulu (pilihan 1)");
                    }
                    scanner.nextLine();
                    break;

                case 6:
                    for (int i = 0; i < 50; ++i)
                        System.out.println(); // Untuk Clear Screen
                    if (person != null) {
                        bmi = new BodyMassIndex(person);
                        bmi.viewBMI();
                    } else {
                        System.out.println("Silakan input data pasien terlebih dahulu (pilihan 1)");
                    }
                    scanner.nextLine();
                    break;

                case 7:
                for (int i = 0; i < 50; ++i) System.out.println(); // Untuk Clear Screen
                    if (person != null) {
                        System.out.println("--- Surat keterangan rekap data Pasien ---\n");
                        person.viewPersonInfo();
                        System.out.println("----------------------------------------");
                        System.out.println("\n--- Data Kesehatan ---");
                        if (bfp != null) {
                            bfp.viewBFP();
                        }
                        if (bmr != null) {
                            bmr.viewBMR();
                        }
                        if (tdee != null) {
                            tdee.viewTDEE();
                        }
                        if (bmi != null) {
                            bmi.viewBMI();
                        }
                    } else {
                        System.out.println("Silakan input data pasien terlebih dahulu (pilihan 1)");
                    }
                    System.out.println("\n\nTekan enter untuk kembali ke menu...");
                    scanner.nextLine();
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan angka antara 1 dan 8.");
            }

        } while (choice != 8); // Pilih 8 untuk keluar

        scanner.close();
    }
}