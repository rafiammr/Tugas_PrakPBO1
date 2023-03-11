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
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double tinggitabung;
    
    public Tabung(double jari2, double tinggitabung) {
        super(jari2);
        this.tinggitabung = tinggitabung;
    }
    
    //getter encapsulasi tinggitabung
    public double gettinggitabung() {//encapsulasi
        return tinggitabung;
    }
    
    //setter encapsulasi tinggitabung
    public void settinggitabung(double tinggitabung) {//encapsulasi
        this.tinggitabung = tinggitabung;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double hitungVolume() {
        return (Math.PI*(super.getjari2()*super.getjari2())*tinggitabung); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double hitungLuasPermukaan() {
        return (2*Math.PI*super.getjari2()*tinggitabung)+(2*Math.PI*(super.getjari2()*super.getjari2())); //To change body of generated methods, choose Tools | Templates.
    }

//super.getjari2() untuk mengambil private dari parents
    
}
