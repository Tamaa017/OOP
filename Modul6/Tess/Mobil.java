package Modul6.Tess;

public class Mobil extends Kendaraan {
        double jarak = 10;
        String jenisBensin = "Pertalite";
        int bensin = 7000;

        public void printInpo(){
            System.out.println("Mobil");
            System.out.println("Berjenis " + jenisBensin);
            System.out.println("Mobil sudah menempuh sejauh: " + jarak);
            System.out.println("dibeli pada tahun: " + tahunBeli);
            System.out.println("beroda: " + roda);
            System.out.println("Konsumsi bensin: " + bensin + "\n");
        }
}
