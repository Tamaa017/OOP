package Modul6;

public class Programmer extends Pegawai {
    public static void main(String[] args) {
        double lemburPerjam = 50000;
        double gajiPerbulan;
        Programmer a = new Programmer();
        gajiPerbulan = a.gajiPokok + lemburPerjam;
        System.out.println("gajiPerbulan: " + gajiPerbulan); 
    }
}


