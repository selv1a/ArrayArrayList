package bagian1.array;

public class HitungGenap {
    public static void main(String[] args) {
        // 3. Diberikan array angka
        int[] angka = {4, 8, 15, 16, 23, 42};
        
        int jumlahGenap = 0; // Variabel counter
        
        // Loop untuk memeriksa setiap angka
        for (int num : angka) {
            // Jika sisa bagi dengan 2 adalah 0, maka bilangan genap
            if (num % 2 == 0) {
                jumlahGenap++; // Naikkan counter jika genap
            }
        }
        
        // Tampilkan hasil
        System.out.println("Banyaknya angka genap di dalam array: " + jumlahGenap);
    }
}
