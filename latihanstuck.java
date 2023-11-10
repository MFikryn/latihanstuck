import java.util.Stack;
public class latihanstuck {
    public static void main(String[] args) {
        Stack<String> piringKotor = new Stack<>();
        Stack<String> piringBersih = new Stack<>();
        // Menambahkan piring kotor ke tumpukan piring kotor
        piringKotor.push("Piring 1");
        piringKotor.push("Piring 2");
        piringKotor.push("Piring 3");
        // Menampilkan jumlah piring sebelum pencucian
        System.out.println("Jumlah piring kotor sebelum pencucian: " +
piringKotor.size());
        System.out.println("Jumlah piring bersih sebelum pencucian: " +
piringBersih.size());
        // Memulai proses pencucian piring
        while (!piringKotor.isEmpty()) {
            String piring = piringKotor.pop();
            System.out.println("Mencuci piring: " + piring);
            // Memindahkan piring yang sudah dicuci ke tumpukan piring bersih
            piringBersih.push(piring);
        }
        // Menampilkan jumlah piring setelah pencucian
        System.out.println("\nJumlah piring kotor setelah pencucian: " +
piringKotor.size());
        System.out.println("Jumlah piring bersih setelah pencucian: " +
piringBersih.size());
        // Menampilkan daftar piring yang sudah dicuci
        System.out.println("\nDaftar piring bersih yang telah dicuci:");
        while (!piringBersih.isEmpty()) {
            System.out.println(piringBersih.pop());
        }
    }
}