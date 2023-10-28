package Modul6;

public class SegitigaSamasisi extends BangunDatar {
    double sisi;
    double alas;

  public SegitigaSamasisi(double sisi) {
    this.sisi = sisi;
    this.alas = this.sisi;
  }

  public void hitungKeliling(){
    this.luas =  sisi*2;
  }

  public void hitungLuas(){
    this.luas = (Math.sqrt(4)*sisi*sisi)/4;
  }
}
