/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental I
 *  with FGroupIndonesia team.
 */
package sesi03;

/**
 *
 * @author ASUS
 */
public class PetualanganChefJaya {
    
    int uangCash = 750000;
    int airPersediaan = 20;
    int tangkiBensin = 50;
    String jenisMobil = "Chevrolet, roda 4";
    String destinasi = null;
    
    public static void main(String[] args) {
        
        PetualanganChefJaya exercise = new PetualanganChefJaya();
        exercise.pergiKeSekolah();
        exercise.pergiKePasar();
        exercise.pergiKeBengkelBan();
        exercise.pergiKePomBensin();
        exercise.pergiKePeternakan();
        
    }
    
     public void pergiKeBengkelBan(){
        destinasi = "bengkel ban";
        tangkiBensin = 50;
        uangCash = 500000;
        airPersediaan = 14;
        
        System.out.println("Sekarang pergi ke " + destinasi);
        System.out.println("Bensin terkini :" + tangkiBensin);
        System.out.println("Air :" + airPersediaan);
        System.out.println("Uang :" + uangCash);
        
        mesinBerjalan();
    }
    
     public void pergiKePasar(){
        destinasi = "pasar";
         tangkiBensin = 20;
        uangCash = 600000;
        airPersediaan = 15;
        
        System.out.println("Sekarang pergi ke " + destinasi);
        System.out.println("Bensin terkini :" + tangkiBensin);
        System.out.println("Air :" + airPersediaan);
        System.out.println("Uang :" + uangCash);
        
        mesinBerjalan();
    }
    
     public void pergiKePomBensin(){
        destinasi = "pom bensin";
        tangkiBensin = 45;
        uangCash = 300000;
        airPersediaan = 13;
        
        System.out.println("Sekarang pergi ke " + destinasi);
        System.out.println("Bensin terkini :" + tangkiBensin);
        System.out.println("Air :" + airPersediaan);
        System.out.println("Uang :" + uangCash);
        
        mesinBerjalan();
    }
    
    public void pergiKePeternakan(){
        destinasi = "peternakan";
        tangkiBensin = 25;
        uangCash = 250000;
        airPersediaan = 5;
        
        System.out.println("Sekarang pergi ke " + destinasi);
        System.out.println("Bensin terkini :" + tangkiBensin);
        System.out.println("Air :" + airPersediaan);
        System.out.println("Uang :" + uangCash);
        
        mesinBerjalan();
    }
    
    public void pergiKeSekolah(){
        destinasi = "sekolah";
        tangkiBensin = 49;
        uangCash = 700000;
        airPersediaan = 20;
        
        System.out.println("Sekarang pergi ke " + destinasi);
        System.out.println("Bensin terkini :" + tangkiBensin);
        System.out.println("Air :" + airPersediaan);
        System.out.println("Uang :" + uangCash);
        
        mesinBerjalan();
    }
    
    public void mesinBerjalan(){
        
        for(int x=1; x<8; x++){
            System.out.println("mobil berjalan... brrrm!");
        }
        
    }
    
    
}
