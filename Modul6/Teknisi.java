package Modul6;

public class Teknisi extends Pegawai {
    public static void main(String[] args) {
        double lemburPerjam = 40000;
        double gajiPerbulan;
        Teknisi a = new Teknisi();
        gajiPerbulan = a.gajiPokok + lemburPerjam; 
        System.out.println("gajiPerbulan: " + gajiPerbulan);
    }
}
