/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Maulidar Rohmatus S
 */
class CAT8 extends TiketKonser { // mendefinisikan kelas CAT8 yang merupakan turunan dari kelas TiketKonser
    public CAT8() { // konstruktor untuk kelas CAT8
        this.namaTiket = "CAT 8"; // menginisialisasi nama tiket CAT8
    }
    
    @Override
    public double getHarga() { // mendefinisikan method untuk mendapatkan harga tiket
        return 1000000; // mengembalikan harga tiket CAT8
    }
}
