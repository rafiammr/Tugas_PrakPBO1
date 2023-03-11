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
public class PersegiPanjang implements MenghitungBidang{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    //getter encapsulasi panjang
    public double getpanjang(){
        return panjang;
    }
    
    //getter encapsulasi lebar
    public double getlebar(){
        return lebar;
    }
    
    //setter encapsulasi panjang
    public void setpanjang(double panjang){
        this.panjang = panjang;
    }
    
    //setter encapsulasi lebar
    public void setlebar(double lebar){
        this.lebar = lebar;
    }
    
    @Override
    public double hitungLuas(){
        return panjang * lebar; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double hitungKeliling(){
        return 2 * (panjang + lebar);
    }    
    
}
