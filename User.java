// User.java
import java.time.LocalDate;

public class User {
    private String nama;
    private int umur;
    private double berat; // in kg
    private double tinggi; // in cm
    private String jenisKelamin; // "Pria" or "Wanita"
    private double lingkarPinggang; // in cm
    private double lingkarPinggul; // in cm
    private double lingkarLeher; // in cm
    private LocalDate recapDate; // Date of data entry/update

    public User(String nama, int umur, double berat, double tinggi, String jenisKelamin,
                double lingkarPinggang, double lingkarPinggul, double lingkarLeher) {
        this.nama = nama;
        this.umur = umur;
        this.berat = berat;
        this.tinggi = tinggi;
        this.jenisKelamin = jenisKelamin;
        this.lingkarPinggang = lingkarPinggang;
        this.lingkarPinggul = lingkarPinggul;
        this.lingkarLeher = lingkarLeher;
        this.recapDate = LocalDate.now(); // Sets the current date upon creation
    }

    // Getters
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public double getBerat() {
        return berat;
    }

    public double getTinggi() {
        return tinggi;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public double getLingkarPinggang() {
        return lingkarPinggang;
    }

    public double getLingkarPinggul() {
        return lingkarPinggul;
    }

    public double getLingkarLeher() {
        return lingkarLeher;
    }

    public LocalDate getRecapDate() {
        return recapDate;
    }

    // Methods as per table
    public void viewUserInfo() {
        System.out.println("--- User Information ---");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Lingkar Pinggang: " + lingkarPinggang + " cm");
        System.out.println("Lingkar Pinggul: " + lingkarPinggul + " cm");
        System.out.println("Lingkar Leher: " + lingkarLeher + " cm");
        System.out.println("Tanggal Rekap: " + recapDate);
    }

    // This method allows updating user information
    public void editUserInfo(String nama, int umur, double berat, double tinggi, String jenisKelamin,
                             double lingkarPinggang, double lingkarPinggul, double lingkarLeher) {
        this.nama = nama;
        this.umur = umur;
        this.berat = berat;
        this.tinggi = tinggi;
        this.jenisKelamin = jenisKelamin;
        this.lingkarPinggang = lingkarPinggang;
        this.lingkarPinggul = lingkarPinggul;
        this.lingkarLeher = lingkarLeher;
        this.recapDate = LocalDate.now(); // Update recap date on edit
        System.out.println("User information updated successfully.");
    }
}