
package Pertemuan5;

import java.util.Scanner;

public class Latihan29 {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String RED_BG = "\u001B[41m";
    public static final String GREEN_BG = "\u001B[42m";
    public static final String YELLOW_BG = "\u001B[43m";
    public static final String BLUE_BG = "\u001B[44m";
    public static final String PURPLE_BG = "\u001B[45m";
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(RED + "YUK " + GREEN + "CEK " + YELLOW + "KEPRIBADIANMU " + CYAN+ "DARI " + PURPLE + "WARNA " + BLUE + "FAVORITMU\n" + RESET);

        // Display color boxes
        System.out.println(RED_BG + "\t     MERAH       \t" + RESET);
        System.out.println(GREEN_BG + "\t     HIJAU       \t" + RESET);
        System.out.println(YELLOW_BG + "\t     KUNING       \t" + RESET);
        System.out.println(BLUE_BG + "\t     BIRU        \t" + RESET);
        System.out.println(PURPLE_BG + "\t     UNGU        \t\n" + RESET);

        System.out.print("PILIH WARNA FAVORITMU : " + RESET);
        String warnaFavorit = scanner.nextLine().toUpperCase();

        System.out.print("NAMA KAMU : " + RESET);
        String nama = scanner.nextLine();

        System.out.println("\n===HASIL TEST KEPRIBADIAN " + nama.toUpperCase() + "===");

        // Print personality based on chosen color with simulated "color box" effect
        switch (warnaFavorit) {
            case "MERAH":
                System.out.println("Warna Favoritmu adalah" + RED + " MERAH" + RESET);
                System.out.println("1. Periang,");
                System.out.println("2. Pemberani,");
                System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
                System.out.println("4. Menyukai tantangan,");
                System.out.println("5. Kurang sabar,");
                System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
                System.out.println("7. Memiliki energi kehangatan dan cinta.");
                break;
            case "HIJAU":
                System.out.println("Warna Favoritmu adalah" + GREEN + " HIJAU" + RESET);
                System.out.println("1. Romantis,");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                System.out.println("3. Teguh pada prinsip,");
                System.out.println("4. Menginginkan kesempurnaan,");
                System.out.println("5. Mudah cemburu,");
                System.out.println("6. Mudah merasa iri,");
                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
                break;
            case "KUNING":
                System.out.println("Warna Favoritmu adalah" + YELLOW +" KUNING" + RESET);
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                System.out.println("3. Periang,");
                System.out.println("4. Senang menolong,");
                System.out.println("5. Lincah dan aktif,");
                System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
                System.out.println("7. Loyal,");
                System.out.println("8. Hangat,");
                System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
                System.out.println("10. Cenderung penakut.");
                break;
            case "BIRU":
                System.out.println("Warna Favoritmu adalah" + BLUE + " BIRU" + RESET);
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
                System.out.println("4. Dinamis,");
                System.out.println("5. Senang berbagi,");
                System.out.println("6. Bersahabat,");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
                break;
            case "UNGU":
                System.out.println("Warna Favoritmu adalah" + PURPLE + " UNGU" + RESET);
                System.out.println("1. Optimis,");
                System.out.println("2. Tidak pernah ragu,");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
                System.out.println("4. Memiliki ambisi yang besar,");
                System.out.println("5. Memiliki empati yang besar,");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
                break;
            default:
                System.out.println("Oops.. Belum teridentifikasi");
        }

        scanner.close();
    }
}
