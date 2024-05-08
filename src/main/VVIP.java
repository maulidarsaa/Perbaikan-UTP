/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Maulidar Rohmatus S
 */
class VVIP extends TiketKonser { // mendefinisikan kelas VVIP yang merupakan turunan dari kelas TiketKonser
    public VVIP() { // konstruktor untuk kelas VVIP
        this.namaTiket = "UNLIMITED EXPERIENCE"; // menginisialisasi nama tiket VVIP
    }
    
    @Override
    public double getHarga() { // mendefinisikan method untuk mendapatkan harga tiket
        return 11000000; // mengembalikan harga tiket VVIP
    }
}
