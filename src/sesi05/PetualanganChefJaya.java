/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental I
 *  with FGroupIndonesia team.
 */
package sesi05;

/**
 *
 * @author ASUS
 */
public class PetualanganChefJaya {
    
    String namaKendaraan = "Mobil Roda 4, Chevrollet";
    int isiTangki = 50;
    int persediaanAir = 20;
    int jumlahCash = 750000;
    String destinasi = "";
    
    public void pergiKePasar(){
        // perubahan terjadi disini
        destinasi = "pasar";
        isiTangki = 20;
        persediaanAir = 15;
        jumlahCash = 600000;
        // output akan menyesuaikan
        
        System.out.println("Tujuan ke " + destinasi);
        System.out.println("Tangki saat ini : "+ isiTangki);
        System.out.println("Persediaan Air : " + persediaanAir);
        System.out.println("Cash : "+ jumlahCash);
        
        mesinBerjalan();
    }
    
    public void pergiKeSekolah(){
        // perubahan terjadi disini
        destinasi = "sekolah";
        isiTangki = 49;
        persediaanAir = 20;
        jumlahCash = 700000;
        // output akan menyesuaikan
        
        System.out.println("Tujuan ke " + destinasi);
        System.out.println("Tangki saat ini : "+ isiTangki);
        System.out.println("Persediaan Air : " + persediaanAir);
        System.out.println("Cash : "+ jumlahCash);
        
        mesinBerjalan();
    }
    
    public void pergiKeBengkelBan(){
        // perubahan terjadi disini
        destinasi = "bengkel ban";
        isiTangki = 45;
        persediaanAir = 14;
        jumlahCash = 500000;
        // output akan menyesuaikan
        
        System.out.println("Tujuan ke " + destinasi);
        System.out.println("Tangki saat ini : "+ isiTangki);
        System.out.println("Persediaan Air : " + persediaanAir);
        System.out.println("Cash : "+ jumlahCash);
        
        mesinBerjalan();
    }
    
    public void pergiKePomBensin(){
        // perubahan terjadi disini
        destinasi = "pom bensin";
        isiTangki = 50;
        persediaanAir = 13;
        jumlahCash = 300000;
        // output akan menyesuaikan
        
        System.out.println("Tujuan ke " + destinasi);
        System.out.println("Tangki saat ini : "+ isiTangki);
        System.out.println("Persediaan Air : " + persediaanAir);
        System.out.println("Cash : "+ jumlahCash);
        
        mesinBerjalan();
    }
    
    public void pergiKePeternakan(){
        // perubahan terjadi disini
        destinasi = "peternakan";
        isiTangki = 25;
        persediaanAir = 5;
        jumlahCash = 250000;
        // output akan menyesuaikan
        
        System.out.println("Tujuan ke " + destinasi);
        System.out.println("Tangki saat ini : "+ isiTangki);
        System.out.println("Persediaan Air : " + persediaanAir);
        System.out.println("Cash : "+ jumlahCash);
        
        mesinBerjalan();
    }
        
    public void mesinBerjalan(){
        
        for(int x=0; x<8; x++){
            System.out.println("Mesin berjalan... brmm.. berrmm...!");
        }
        
    }
    
    public static void main(String[] args) {
        PetualanganChefJaya ex3 = new PetualanganChefJaya();
        ex3.pergiKeSekolah();
        ex3.pergiKePasar();
        ex3.pergiKeBengkelBan();
        ex3.pergiKePomBensin();
        ex3.pergiKePeternakan();
        
    }
    
}
