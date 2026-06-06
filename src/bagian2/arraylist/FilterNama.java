package bagian2.arraylist;

import java.util.ArrayList;

public class FilterNama {
    public static void main(String[] args) {
        // 3. Buat ArrayList dan tambah 6 nama
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Ahmad");
        daftarNama.add("Budi");
        daftarNama.add("Anisa");
        daftarNama.add("Citra");
        daftarNama.add("Aris");
        daftarNama.add("Dedi");
        
        System.out.println("Nama yang diawali dengan huruf 'A':");
        
        // Telusuri dan filter nama
        for (String nama : daftarNama) {
            // Memeriksa apakah nama diawali dengan huruf "A"
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}
