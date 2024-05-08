/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Maulidar Rohmatus S
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // membuat objek scanner untuk input dari pengguna
        try {
            System.out.println("Selamat datang di Pemesanan Tiket!"); // menampilkan pesan selamat datang
            System.out.print("Masukkan nama pemesan: "); // meminta input nama pemesan
            String namaPemesan = scanner.nextLine(); // membaca nama pemesan dari input pengguna

            System.out.println("Pilih jenis tiket:"); // menampilkan pilihan jenis tiket
            System.out.println("1. CAT 8");
            System.out.println("2. CAT 1");
            System.out.println("3. FESTIVAL");
            System.out.println("4. VIP");
            System.out.println("5. UNLIMITED EXPERIENCE");
            System.out.print("Masukkan pilihan: "); // meminta input pilihan tiket
            int pilihan = scanner.nextInt(); // membaca pilihan tiket dari input pengguna

            TiketKonser tiket; // mendeklarasikan variabel untuk menyimpan objek TiketKonser yang dipilih
            switch (pilihan) { // memilih jenis tiket berdasarkan input pengguna
                case 1:
                    tiket = new CAT8(); // membuat objek CAT8 jika pilihan adalah 1
                    break;
                case 2:
                    tiket = new CAT1(); // membuat objek CAT1 jika pilihan adalah 2
                    break;
                case 3:
                    tiket = new FESTIVAL(); // membuat objek FESTIVAL jika pilihan adalah 3
                    break;
                case 4:
                    tiket = new VIP(); // membuat objek VIP jika pilihan adalah 4
                    break;
                case 5:
                    tiket = new VVIP(); // mmbuat objek VVIP jika pilihan adalah 5
                    break;
                default:
                    System.out.println("Pilihan tidak valid"); // menampilkan pesan jika pilihan tidak valid
                    return; // Keluar dari program
            }

            PemesananTiket pesanan = new PemesananTiket(namaPemesan, tiket); // membuat objek PemesananTiket
            pesanan.tampilkanDetailPesanan(); // menampilkan detail pesanan
        } finally {
            scanner.close(); // menutup scanner setelah penggunaan selesai
        }
    }
    
    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan kode pesanan atau kode booking
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String generateKodeBooking() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }
    
    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan waktu terkini
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}
