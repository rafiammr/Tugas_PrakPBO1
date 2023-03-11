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
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public double gettinggi(){
        return tinggi;
    }
    
    public void settinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume(){
        return super.getpanjang()*super.getlebar()*tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2* ((super.getpanjang()*super.getlebar()) + (super.getpanjang()*tinggi) + (super.getlebar()*tinggi)); //To change body of generated methods, choose Tools | Templates.
    }
    
//super.getpanjang() untuk mengambil private dari parents
//super.getlebar() untuk mengambil private dari parents
    
}
