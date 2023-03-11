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

import java.util.Scanner;
//class main
public class Tugas1PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        
        do {
            System.out.println("\t\t\t\t\tMenu");
            System.out.println("1. Menghitung luas dan keliling persegi panjang, volume dan luas permukaan balok");
            System.out.println("2. Menghitung luas dan keliling lingkaran, volume dan luas permukaan tabung");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            pilih = input.nextInt();

            switch (pilih) {//switch case untuk pilih menu
                case 1: //menu1 itu untuk perhitungan balok dan persegi panjang
                    System.out.println("----------------------------------------");
                    System.out.print("Masukkan panjang\t\t: ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan lebar\t\t: ");
                    double lebar = input.nextDouble();
                    System.out.print("Masukkan tinggi\t\t: ");
                    double tinggi = input.nextDouble();
                    System.out.println("-----------------HASIL------------------");
                    Balok menu1 = new Balok(panjang, lebar, tinggi);
                    System.out.println("Luas persegi panjang\t: " + menu1.hitungLuas());
                    System.out.println("Keliling persegi panjang\t: " + menu1.hitungKeliling());

                    System.out.println("Volume balok\t\t: " + menu1.hitungVolume());
                    System.out.println("Luas permukaan balok\t: " + menu1.hitungLuasPermukaan());
                    System.out.println("----------------------------------------");
                    System.out.println(" ");
                    break;


                case 2: //menu2 itu untuk perhitungan tabung dan lingkaran
                    System.out.println("----------------------------------------");
                    System.out.print("Masukkan jari-jari\t: ");
                    double jari2 = input.nextDouble();
                    System.out.print("Masukkan tinggi tabung\t: ");
                    double tinggitabung = input.nextDouble();
                    System.out.println("-----------------HASIL------------------");
                    Tabung menu2 = new Tabung(jari2, tinggitabung);
                    System.out.println("Luas lingkaran\t\t: " + menu2.hitungLuas());
                    System.out.println("Keliling lingkaran\t: " + menu2.hitungKeliling());

                    System.out.println("Volume tabung\t\t: " + menu2.hitungVolume());
                    System.out.println("Luas permukaan tabung\t: " + menu2.hitungLuasPermukaan());
                    System.out.println("----------------------------------------");
                    System.out.println(" ");
                    break;

                case 3: //keluar program
                    System.out.println("----------------------------------------");
                    System.out.println("Terima kasih Telah Mengakses Tugasku!");
                    System.out.println("----------------------------------------");
                    System.out.println(" ");
                    break;

                default:
                    System.out.println("----------------------------------------");
                    System.out.println("Pilihan Tidak Ada");
                    System.out.println("----------------------------------------");
                    System.out.println(" ");
                    break;
            }

        } while (pilih != 3);// TODO code application logic here
    }
    
}
