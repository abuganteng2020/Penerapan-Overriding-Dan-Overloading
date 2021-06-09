/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMAD
 */
public class Anjing extends Hewan {
    //overriding method
    void Berjalan() {
        System.out.println("Anjing Berjalan");
    }

    public static void main(String args[]) {

        //Membuat objek anjing
        Anjing anjing = new Anjing();

        //Objek anjing menggunakan method bergerak()
        anjing.Berjalan();
    }
    
}
