/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental I
 *  with FGroupIndonesia team.
 */
package sesi02;

/**
 *
 * @author ASUS
 */
public class Masakan {
    
    final int NOMOR_SERI = 29192;
    String namaHewan;
    String jenisHewan;
    int ketebalanSayap;
    double ketebalanPaha;
    double panjangDada;
    
    public void prepare(){
    // disini mulai mempersiapkan nilai
    /* pemberian nilai lengkap */
        jenisHewan = "kalkun";
        panjangDada = 5;
        ketebalanSayap = 2;
        ketebalanPaha = 2;
    
    }
    
    public void masak(){
    // penyusutan terjadi pada seluruh 
    // organ 
        panjangDada = 4.7;
        ketebalanSayap = 1;
        ketebalanPaha = 1.9;
    }
    
}
