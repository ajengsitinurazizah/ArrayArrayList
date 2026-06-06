package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> koleksiBuku;

    public Perpustakaan() {
        koleksiBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("=== Koleksi Perpustakaan ===");
        for (Buku b : koleksiBuku) {
            System.out.println(b.info());
        }
    }

    public void pinjamBuku(String judul) {
        for (Buku b : koleksiBuku) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                if (!b.isDipinjam()) {
                    b.setDipinjam(true);
                    System.out.println("Berhasil meminjam buku: " + judul);
                    return;
                } else {
                    System.out.println("Buku '" + judul + "' sedang dipinjam.");
                    return;
                }
            }
        }
        System.out.println("Buku '" + judul + "' tidak ditemukan.");
    }

    // 1. Method untuk mengembalikan buku (Poin 1)
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksiBuku) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                if (b.isDipinjam()) {
                    b.setDipinjam(false);
                    System.out.println("Berhasil mengembalikan buku: " + judul);
                    return;
                } else {
                    System.out.println("Buku '" + judul + "' sebenarnya tidak sedang dipinjam.");
                    return;
                }
            }
        }
        System.out.println("Buku '" + judul + "' tidak ditemukan.");
    }

    // 3. Method mencari buku berdasarkan nama penulis (Poin 3)
    public void cariPenulis(String penulis) {
        System.out.println("=== Hasil Pencarian Penulis: " + penulis + " ===");
        boolean ditemukan = false;
        for (Buku b : koleksiBuku) {
            if (b.getPenulis().toLowerCase().contains(penulis.toLowerCase())) {
                System.out.println("- " + b.info());
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada buku yang ditemukan dari penulis tersebut.");
        }
    }

    public int jumlahTersedia() {
        int count = 0;
        for (Buku b : koleksiBuku) {
            if (!b.isDipinjam()) {
                count++;
            }
        }
        return count;
    }
}