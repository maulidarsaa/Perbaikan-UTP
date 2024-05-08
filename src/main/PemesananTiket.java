/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Maulidar Rohmatus S
 */
class PemesananTiket { // mendefinisikan kelas PemesananTiket
    private String namaPemesan; // mendeklarasikan variabel instance namaPemesan
    private TiketKonser tiket; // mendeklarasikan variabel instance tiket
    
    public PemesananTiket(String namaPemesan, TiketKonser tiket) { // konstruktor untuk kelas PemesananTiket
        this.namaPemesan = namaPemesan; // menginisialisasi nama pemesan
        this.tiket = tiket; // menginisialisasi objek tiket
    }
    
    public void tampilkanDetailPesanan() { // method untuk menampilkan detail pesanan
        String kodePesanan = Main.generateKodeBooking(); // mendapatkan kode pesanan
        String tanggalPesanan = Main.getCurrentDate(); // mendapatkan tanggal pesanan
        double totalHarga = tiket.getHarga(); // mendapatkan total harga tiket
        
        System.out.println("\n----- Detail Pemesanan -----"); // menampilkan header detail pesanan
        System.out.println("Nama Pemesan: " + namaPemesan); // menampilkan nama pemesan
        System.out.println("Kode Booking: " + kodePesanan); // menampilkan kode pesanan
        System.out.println("Tanggal Pesanan: " + tanggalPesanan); // menampilkan tanggal pesanan
        System.out.println("Tiket yang Dipesan: " + tiket.getNamaTiket()); // menampilkan info tiket
        System.out.println("Total Harga: " + totalHarga + " USD"); // menampilkan total harga
    }
}