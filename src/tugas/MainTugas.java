// Nama: Ajeng Siti Nurazizah
// NPM: 2410010628
package tugas;

public class MainTugas {

    public static void main(String[] args) {
        // 4. Menyimpan daftar nama mata kuliah dalam array String ukuran tetap (Poin 4)
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Basis Data", "Rekayasa Perangkat Lunak"};
        
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // Membuat objek KelasKuliah (Poin 3)
        KelasKuliah kelas = new KelasKuliah();

        // Menambahkan minimal 5 objek Mahasiswa (Poin 3)
        System.out.println("=== INPUT DATA MAHASISWA AWAL ===");
        kelas.tambahMahasiswa(new Mahasiswa("Ahmad", "2410010001", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "2410010002", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2410010003", 72.5));
        kelas.tambahMahasiswa(new Mahasiswa("Dedi", "2410010004", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "2410010005", 90.0));
        System.out.println();

        // Menampilkan semua data mahasiswa
        System.out.println("=== DATA MAHASISWA ===");
        kelas.tampilkanSemua();

        // 5. Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus (Poin 5)
        System.out.printf("Rata-rata Nilai Kelas : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println("Total Data            : " + kelas.getJumlahData() + " mahasiswa");
        System.out.println();

        // 6. Menambahkan satu objek Mahasiswa baru ke dalam koleksi (Poin 6)
        System.out.println("=== PENAMBAHAN DATA BARU ===");
        kelas.tambahMahasiswa(new Mahasiswa("Fahri", "2410010006", 65.0));
        System.out.println();

        // Menampilkan kembali jumlah data terbaru setelah ditambah (Poin 6)
        System.out.println("=== DATA TERBARUsetelah UPDATE ===");
        kelas.tampilkanSemua();
        System.out.println("Jumlah Data Terbaru   : " + kelas.getJumlahData() + " mahasiswa");
        System.out.printf("Rata-rata Nilai Baru  : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Lulus Terbaru  : " + kelas.jumlahLulus());
    }
}