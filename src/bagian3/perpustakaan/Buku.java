package bagian3.perpustakaan;

public class Buku {
    // Atribut: data yang dimiliki setiap buku
    private String judul;
    private String penulis;
    private boolean dipinjam;
    private int tahunTerbit; // Tambahan atribut baru (Poin 2)

    // Constructor: disesuaikan dengan tambahan tahunTerbit (Poin 2)
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false; // buku baru dianggap tersedia
    }

    // Getter: cara membaca atribut dari luar class
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    // Getter untuk tahunTerbit (Poin 2)
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Method untuk mengubah status pinjam
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Mengembalikan keterangan buku dengan format tahun terbit (Poin 2)
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " (" + tahunTerbit + ") oleh " + penulis + " [" + status + "]";
    }
}