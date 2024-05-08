/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Maulidar Rohmatus S
 */
class VIP extends TiketKonser { // mendefinisikan kelas VIP yang merupakan turunan dari kelas TiketKonser
    public VIP() { // konstruktor untuk kelas VIP
        this.namaTiket = "VIP"; // menginisialisasi nama tiket VIP
    }
    
    @Override
    public double getHarga() { // mendefinisikan method untuk mendapatkan harga tiket
        return 8000000; // mengembalikan harga tiket VIP
    }
}
