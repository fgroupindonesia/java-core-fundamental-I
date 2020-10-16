/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental I
 *  with FGroupIndonesia team.
 */
package sesi04;

/**
 *
 * @author ASUS
 */
public class LangkahPraktis {
    
    public static void main(String[] args) {
        
        int bensin = 10;
        int jamSaatIni = 1;
        
        if(bensin<10){
            System.out.println("Hati-hati bensin kurang dari 10 liter!");
        }
        
        if(jamSaatIni>3){
            System.out.println("Boleh memulai acara...");;
        }else{
            System.out.println("Belum saatnya acara...");;
        }
        
        switch (bensin){
            case 5:
                System.out.println("Bensin full!");;
                break;
            case 3:
                System.out.println("Hati-hati bensin hampir habis");;
                
            default:
                System.out.println("mesin berjalan dengan baik...");;
                
        }
        
        if(bensin == 10){
            System.out.println("Out of Tank!");;
        }
        
    }
    
}
