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
public class AktifitasPasarChefJaya {

    String namaTokoDestinasi;
    double diskon;
    double quantityBeli;
    String namaBarangBeli;
    double hargaAwal, hargaSatuan, pembayaran;
    double saldo;
    String hariKunjungan;

    public static void main(String[] args) {
        AktifitasPasarChefJaya kunjungan = new AktifitasPasarChefJaya();

        // baru nyampe area parkir
        kunjungan.hariKunjungan = "senin";
        kunjungan.namaTokoDestinasi = "area parkir";
        kunjungan.namaBarangBeli = "karcis";
        kunjungan.hargaSatuan = 5000;
        kunjungan.quantityBeli = 1;

        kunjungan.mulaiBayar();

        // didalam toko bahan kue
        kunjungan.namaTokoDestinasi = "toko bahan kue";
        kunjungan.namaBarangBeli = "tepung 1/4";
        kunjungan.hargaSatuan = 2000;
        kunjungan.quantityBeli = 1;

        kunjungan.mulaiBayar();

        kunjungan.namaBarangBeli = "mentega 1/4";
        kunjungan.hargaSatuan = 5000;
        kunjungan.quantityBeli = 1;

        kunjungan.mulaiBayar();
        kunjungan.melangkahKeToko();

        kunjungan.namaTokoDestinasi = "toko ayam";
        kunjungan.namaBarangBeli = "ayam 1kg";
        kunjungan.hargaSatuan = 25000;
        kunjungan.quantityBeli = 1;

        kunjungan.mulaiBayar();

        kunjungan.namaBarangBeli = "dada";
        kunjungan.hargaSatuan = 15000;
        kunjungan.quantityBeli = 4;

        kunjungan.mulaiBayar();
        kunjungan.melangkahKeToko();

        kunjungan.namaTokoDestinasi = "toko perkakas dapur";
        kunjungan.namaBarangBeli = "sendok garpu 2set";
        kunjungan.hargaSatuan = 50000;
        kunjungan.quantityBeli = 2;

        kunjungan.mulaiBayar();

        kunjungan.namaBarangBeli = "panci";
        kunjungan.hargaSatuan = 25000;
        kunjungan.quantityBeli = 1;

        kunjungan.mulaiBayar();
        //kunjungan.melangkahKeToko();

    }

    public void mulaiBayar() {

        System.out.println("Sampai di " + namaTokoDestinasi);
        System.out.println("Pembelian ");
        System.out.println("nama :" + namaBarangBeli);
        System.out.println("quantity :" + quantityBeli);

        if (hariKunjungan.equalsIgnoreCase("jumat") || hariKunjungan.equalsIgnoreCase("sabtu")) {

            // diskon disini
            if (namaTokoDestinasi.equalsIgnoreCase("toko ayam")) {
                diskon = 0.35;
            } else if (namaTokoDestinasi.equalsIgnoreCase("toko bahan kue")) {
                diskon = 0.10;
            } else if (namaTokoDestinasi.equalsIgnoreCase("toko perkakas dapur")) {
                diskon = 0.50;
            }

            hargaAwal = hargaSatuan * quantityBeli;
            System.out.println("Pembayaran :" + hargaAwal);

            pembayaran = hargaAwal - (hargaAwal * diskon);
            System.out.println("Setelah Diskon:" + pembayaran);

        } else {
            System.out.println("Maaf hari " + hariKunjungan + " tidak ada diskon!");

            hargaAwal = hargaSatuan * quantityBeli;
            System.out.println("Pembayaran :" + hargaAwal);
        }

    }

    public void melangkahKeToko() {
        for (int x = 5; x >= 0; x--) {
            System.out.println("berjalan sejenak... " + x + " menit.");
        }
    }

}
