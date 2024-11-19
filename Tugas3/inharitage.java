/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas3;

/**
 *
 * @author Lenovo
 */
public class inharitage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        kendaraan merk = new kendaraan ();
        mobil box = new mobil ();
        motor pit = new motor ();
        sepeda ontel = new sepeda ();
        
        merk.maju();
        box.maju();
        pit.maju();
        ontel.berjalan();
    }
}
