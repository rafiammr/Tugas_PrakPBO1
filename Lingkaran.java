/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1pbo;

/**
 *
 * @author Ammar
 */
public class Lingkaran implements MenghitungBidang {
    private double jari2;
    
    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }
    
    //getter encapsulasi jari2
    public double getjari2(){
        return jari2;
    }
    
    //setter encapsulasi jari2
    public void setjari2(double jari2){
        this.jari2 = jari2;
    }
    
    @Override
    public double hitungLuas() {
        return (Math.PI*(jari2*jari2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double hitungKeliling() {
        return (2*Math.PI*jari2); //To change body of generated methods, choose Tools | Templates.
    }
    
}
