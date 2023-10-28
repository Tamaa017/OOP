package Modul6.Tess;

public class Kendaraan {
    double roda = 4;
    int tahunBeli = 2010;
    int tahunJual = 2008;
    int bensin = 5000;

    public void printInpo(){
        System.out.println("Kendaraan");
        System.out.println("dibeli pada tahun: " + tahunBeli);
        System.out.println("dijual pada tahun: " + tahunJual);
        System.out.println("isi tangki bensin sebanyak: " + bensin + " liter");
        System.out.println("memiliki roda: " + roda);
        System.out.println("Konsumsi bensin: " + bensin + "\n");
    }
}
