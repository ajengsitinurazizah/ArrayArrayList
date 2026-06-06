package bagian3.perpustakaan;

public class MainPerpustakaan {

    public static void main(String[] args) {
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();
        
        // Membuat objek Buku dengan menyertakan tahun terbit (Poin 2)
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tambahBuku(new Buku("Anak Semua Bangsa", "Pramoedya Ananta Toer", 1981)); 

        perpus.tampilkanKoleksi();
        System.out.println();
        
        // Skenario 1: Pinjam Buku
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println();
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();
        
        // Skenario 2: Menguji Fitur Pengembalian (Poin 1)
        System.out.println("--- Menguji Fitur Pengembalian ---");
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println();
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();
        
        // Skenario 3: Menguji Fitur Cari Penulis (Poin 3)
        System.out.println("--- Menguji Fitur Cari Penulis ---");
        perpus.cariPenulis("Pramoedya");
        System.out.println();
        perpus.cariPenulis("Andrea Hirata");
    }
}