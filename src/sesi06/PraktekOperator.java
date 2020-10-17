/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental I
 *  with FGroupIndonesia team.
 */
package sesi06;

import sesi05.MasakanIkan;

/**
 *
 * @author ASUS
 */
public class PraktekOperator {
    
    boolean rasaPedas = true;
    boolean rasaAsin = true;
    
    String status;
    int harga = 0, minOrder = 10, bonus = 0;
    
    public static void main(String[] args) {
        PraktekOperator eksekusi = new PraktekOperator();
        eksekusi.penentuanHarga();
        
        String pendapatMasyarakat = eksekusi.getStatus();
        
        System.out.println("Ternyata Masyarakat menilai... " + pendapatMasyarakat);
        
        int nilaiBonus = eksekusi.calculateBonus(true);
        System.out.println("Nilai Bonus didapat ialah : "+ nilaiBonus);
        
        MasakanIkan masak = new MasakanIkan();
        masak.hitungHarga();
        
        
    }
    
    public int calculateBonus(boolean staff){
    
        if(harga > 1000 && minOrder == 10){
            bonus = 3;
        }
        
        if(staff==true){
            bonus--;
        }else{
            bonus++;
        }
        
        
        return bonus;
    }
    
    public String getStatus(){
    
        return status;
    }
    
    public void penentuanHarga(){
    
        // jika rasanya Pedas tapi tidak asin
        // maka harganya menjadi 500
        if(rasaPedas == true && rasaAsin == false){
            harga = 500;
        }
        
        // jika Pedas dan Asin
        // maka harganya 2000
        if(rasaPedas == true && rasaAsin == true){

            harga = 2000;
            
        }
        
        if(harga<700){
            status = "murah";
        }else{
            status = "mahal";
        }
        
        System.out.println("Ternyata harganya ialah " + harga);
        System.out.println("Status makanan : "+ status);
        
    
    
    }
    
}
