package Modul6;

public class SegitigaSamakaki extends BangunDatar {
    double sisiMiring;
    double alas;
    double tinggi;

  public SegitigaSamakaki(double alas, double tinggi){
    this.alas = alas;
    this.tinggi = tinggi;
    this.sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
  }

  public void hitungKeliling(){
    this.keliling = this.alas+(this.sisiMiring*2);
  }

  public void hitungLuas(){
    this.luas = (this.alas * this.tinggi)/2;
  }
}
