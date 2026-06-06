package bagian2.arraylist;

import java.util.ArrayList;

public class CariTerbesar {
    public static void main(String[] args) {
        // 2. Buat ArrayList berisi 5 angka
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(24);
        angka.add(87);
        angka.add(12);
        angka.add(65);
        angka.add(43);
        
        // Ambil elemen pertama sebagai acuan nilai terbesar awal
        int terbesar = angka.get(0);
        
        // Telusuri seluruh elemen menggunakan enhanced for-loop
        for (int num : angka) {
            if (num > terbesar) {
                terbesar = num; // Update nilai terbesar jika ditemukan yang lebih besar
            }
        }
        
        // Tampilkan hasil
        System.out.println("Daftar angka: " + angka);
        System.out.println("Nilai terbesar di dalam ArrayList: " + terbesar);
    }
}
