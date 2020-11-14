/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan50.energikinetik;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Energi Kinetic
 */

public class PBOIF210119056Latihan50EnergiKinetik {

    public static void main(String[] args) {
        Kecepatan Kecepatan=new Kecepatan();
        
        Kecepatan.setMassa(0.145);
        Kecepatan.setKecepatan(25);
        System.out.println("Sebuah bola baseball dengan massa 145 g dilempar dengan kecepatan 25m/s");
        System.out.println("a. Berapakah energi kinetiknya ? : "+Math.round(Kecepatan.energiKinetik(Kecepatan.getMassa(), 
                                                                                                     Kecepatan.getKecepatan())));
        System.out.println("b. Berapakah usaha nya? : "+Math.round(Kecepatan.usaha(Kecepatan.getKecepatan(),
                                                                                    Kecepatan.getEK())));
}
}
