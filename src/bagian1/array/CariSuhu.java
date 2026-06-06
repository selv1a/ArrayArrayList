package bagian1.array;

public class CariSuhu {
    public static void main(String[] args) {
        // 1. Buat array berisi 6 suhu harian
        double[] suhuHarian = {28.5, 31.2, 25.0, 33.4, 29.8, 26.7};
        
        // Inisialisasi nilai max dan min dengan elemen pertama array
        double suhuTertinggi = suhuHarian[0];
        double suhuTerendah = suhuHarian[0];
        
        // Loop untuk membandingkan setiap elemen
        for (int i = 1; i < suhuHarian.length; i++) {
            if (suhuHarian[i] > suhuTertinggi) {
                suhuTertinggi = suhuHarian[i];
            }
            if (suhuHarian[i] < suhuTerendah) {
                suhuTerendah = suhuHarian[i];
            }
        }
        
        // Tampilkan hasil
        System.out.println("Suhu Tertinggi: " + suhuTertinggi + "°C");
        System.out.println("Suhu Terendah : " + suhuTerendah + "°C");
    }
}
