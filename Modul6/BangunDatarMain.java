package Modul6;

public class BangunDatarMain {
  public static void main(String[] args) {
    System.out.println("Persegi");
    Persegi kotak = new Persegi(50);
    kotak.hitungKeliling();
    kotak.hitungLuas();
    kotak.info();

    System.out.println("\nPersegi Panjang");
    PersegiPanjang pp = new PersegiPanjang(150, 80);
    pp.hitungLuas();
    pp.hitungKeliling();
    pp.info();

    System.out.println("\nSegiTiga Sama kaki");
    SegitigaSamakaki smk = new SegitigaSamakaki(30, 40);
    smk.hitungKeliling();
    smk.hitungLuas();
    smk.info();

    System.out.println("\nSegiTiga Sama sisi");
    SegitigaSamasisi sms = new SegitigaSamasisi(30);
    sms.hitungKeliling();
    sms.hitungLuas();
    sms.info();
  }
}
