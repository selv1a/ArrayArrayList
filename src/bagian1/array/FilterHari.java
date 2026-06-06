package bagian1.array;

public class FilterHari {
    public static void main(String[] args) {
        // 2. Buat array String berisi 5 nama hari
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        System.out.println("Hari yang memiliki lebih dari 5 huruf:");
        
        // Loop untuk memeriksa panjang karakter setiap hari
        for (String namaHari : hari) {
            // Memeriksa apakah jumlah huruf lebih dari 5
            if (namaHari.length() > 5) {
                System.out.println("- " + namaHari);
            }
        }
    }
}
