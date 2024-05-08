/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Maulidar Rohmatus S
 */
class CAT1 extends TiketKonser { // mendefinisikan kelas CAT1 yang merupakan turunan dari kelas TiketKonser
    public CAT1() { // konstruktor untuk kelas CAT1
        this.namaTiket = "CAT 1"; // menginisialisasi nama tiket CAT1
    }
    
    @Override
    public double getHarga() { // mendefinisikan method untuk mendapatkan harga tiket
        return 5000000; // mengembalikan harga tiket CAT1
    }
}
