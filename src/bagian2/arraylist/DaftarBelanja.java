package bagian2.arraylist;

import java.util.ArrayList;

public class DaftarBelanja {
    public static void main(String[] args) {
        // 1. Buat ArrayList untuk daftar belanja
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        // Tambah 4 item
        daftarBelanja.add("Minyak Goreng"); // Indeks 0
        daftarBelanja.add("Beras");         // Indeks 1 (Item ke-2)
        daftarBelanja.add("Telur");         // Indeks 2
        daftarBelanja.add("Gula");          // Indeks 3
        
        // Hapus item ke-2 (indeks 1)
        daftarBelanja.remove(1);
        
        // Tampilkan isi list
        System.out.println("Isi daftar belanja setelah dihapus: " + daftarBelanja);
        
        // Tampilkan jumlah akhir menggunakan .size()
        System.out.println("Jumlah akhir item: " + daftarBelanja.size());
    }
}
