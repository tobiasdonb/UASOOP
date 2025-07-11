// Person.java
import java.time.LocalDate;

public class Person {
    private String nama;
    private int umur;
    private double berat; // kg
    private double tinggi; // cm
    private String jenisKelamin; // "Pria" atau "Wanita"
    private double lingkarPinggang; // cm
    private double lingkarPinggul; // cm
    private double lingkarLeher; // cm
    private LocalDate recapDate; // rekap

    public Person(String nama, int umur, double berat, double tinggi, String jenisKelamin,
                double lingkarPinggang, double lingkarPinggul, double lingkarLeher) {
        this.nama = nama;
        this.umur = umur;
        this.berat = berat;
        this.tinggi = tinggi;
        this.jenisKelamin = jenisKelamin;
        this.lingkarPinggang = lingkarPinggang;
        this.lingkarPinggul = lingkarPinggul;
        this.lingkarLeher = lingkarLeher;
        this.recapDate = LocalDate.now(); // waktu input data
    }

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

    public void viewPersonInfo() {
        System.out.println("--- Informasi Pasien ---");
        System.out.println("Nama            : " + nama);
        System.out.println("Umur            : " + umur + " tahun");
        System.out.println("Berat           : " + berat + " kg");
        System.out.println("Tinggi          : " + tinggi + " cm");
        System.out.println("Jenis Kelamin   : " + jenisKelamin);
        System.out.println("Lingkar Pinggang: " + lingkarPinggang + " cm");
        System.out.println("Lingkar Pinggul : " + lingkarPinggul + " cm");
        System.out.println("Lingkar Leher   : " + lingkarLeher + " cm");
        System.out.println("Tanggal Rekap   : " + recapDate);
    }

    public void editPersonInfo(String nama, int umur, double berat, double tinggi, String jenisKelamin,
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
        System.out.println("Person information updated successfully.");
    }
}