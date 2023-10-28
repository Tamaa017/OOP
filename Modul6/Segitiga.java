package Modul6;

public class Segitiga extends BangunDatar{
    double alas;
  double tinggi;

  public void hitungKeliling(){
    this.keliling = this.alas*3;
  }
  
  public void hitungLuas(){
    this.luas = (this.alas*this.tinggi)/2 ;
  }
}
