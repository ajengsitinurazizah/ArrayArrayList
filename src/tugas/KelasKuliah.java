package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // Menyimpan ArrayList Mahasiswa (Poin 2)
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public KelasKuliah() {
        daftarMahasiswa = new ArrayList<>();
    }

    // Method tambahMahasiswa (Poin 2)
    public void tambahMahasiswa(Mahasiswa msh) {
        daftarMahasiswa.add(msh);
        System.out.println("Berhasil menambahkan mahasiswa: " + msh.getNama());
    }

    // Method hitungRataRata (Poin 2)
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Mahasiswa msh : daftarMahasiswa) {
            total += msh.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Method jumlahLulus (Poin 2)
    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa msh : daftarMahasiswa) {
            if (msh.lulus()) {
                count++;
            }
        }
        return count;
    }

    // Method menampilkan jumlah total data mahasiswa di dalam list (Poin 6)
    public int getJumlahData() {
        return daftarMahasiswa.size();
    }

    // Method tampilkanSemua (Poin 2)
    public void tampilkanSemua() {
        System.out.println("-------------------------------------------------");
        System.out.printf("%-15s %-20s %-10s %-10s\n", "NPM", "Nama", "Nilai", "Status");
        System.out.println("-------------------------------------------------");
        for (Mahasiswa msh : daftarMahasiswa) {
            String status = msh.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.printf("%-15s %-20s %-10.2f %-10s\n", msh.getNpm(), msh.getNama(), msh.getNilai(), status);
        }
        System.out.println("-------------------------------------------------");
    }
}