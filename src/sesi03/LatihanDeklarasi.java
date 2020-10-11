/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi03;

import sesi02.Manusia;


/**
 *
 * @author ASUS
 */
public class LatihanDeklarasi {
    
    // deklarasi di dalam Class
    double hargaKendaraan = 245.88;
    int jumlahKendaraan = 33;
    
    
    public static void main(String[] args) {
        
        // kode laindisini
        /*for(int x=1; x<19;x++){
            System.out.println("OK sekarang " + x);
        }*/
        
        int nomor =1;
        do{
            
            System.out.println("Antrian ke "+nomor);
            nomor++;
        } while(nomor<20);
        
        
        
    }
    
    public void cobaAksesKelasLain(){
    
        Manusia orangLain = new Manusia();
        orangLain.running();
        orangLain.kicking();
        
    }
    
    public void prepareData(){
    
        jumlahKendaraan = 40;
        hargaKendaraan = 500;
    
        int kodeSeri = 9133;
        
    }
    
    public void reset(){
    
        jumlahKendaraan=50;
        hargaKendaraan=700;
        
        
    }
    
    
    
    
}
