/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Maulidar Rohmatus S
 */
class FESTIVAL extends TiketKonser { // mendefinisikan kelas FESTIVAL yang merupakan turunan dari kelas TiketKonser
    public FESTIVAL() { // konstruktor untuk kelas FESTIVAL
        this.namaTiket = "FESTIVAL"; // menginisialisasi nama tiket FESTIVAL
    }
    
    @Override
    public double getHarga() { // mendefinisikan method untuk mendapatkan harga tiket
        return 2000000; // mengembalikan harga tiket FESTIVAL
    }
}
