package tugas;

public class Mahasiswa {
    // Atribut (Poin 1)
    private String nama;
    private String npm;
    private double nilai;

    // Constructor (Poin 1)
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // Getter (Poin 1)
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }

    // Method lulus() jika nilai >= 60 (Poin 1)
    public boolean lulus() {
        return this.nilai >= 60;
    }
}