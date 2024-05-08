/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Maulidar Rohmatus S
 */
abstract class TiketKonser implements HargaTiket{ // mendefinisikan kelas abstrak TiketKonser yang mengimplementasikan interface HargaTiket
    protected String namaTiket; // mendeklarasikan variabel instance namaTiket yang dapat diakses oleh kelas turunannya
    
    public String getNamaTiket() { // mendefinisikan method untuk mendapatkan nama tiket
        return namaTiket; // mengembalikan nama tiket
    }
}
