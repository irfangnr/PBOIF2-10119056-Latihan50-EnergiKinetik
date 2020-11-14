/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan50.energikinetik;

/**
 *
 * @author ACER
 */
public class Kecepatan{
//    EK = \frac{1}{2}m \cdot v^2
    private double massa;
    private double kecepatan;
    private double EK;
    
    public double getMassa() {
        return massa;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getEK() {
        return EK;
    }
    

    public void setMassa(double massa) {
        this.massa = massa;
    }
    public double getKecepatan() {
        return kecepatan;
    }

    double energiKinetik(double parMassa, double parKecepatan){
        EK=0.5*massa*(kecepatan*kecepatan);
        return EK;
    }

    double usaha(double v1, double v2){
        return 0.5*massa*(v2*v2-v1*v1);
    }
}

