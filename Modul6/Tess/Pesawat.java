package Modul6.Tess;

public class Pesawat extends Kendaraan{
        double jarak = 250;
        String jenisBensin = "Avtur";
        int bensin = 6000;

        public void printInporter(){
            System.out.println("Pesawat");
            System.out.println("Berjenis: " + jenisBensin);
            System.out.println("Sudah menempuh sejauh: " + jarak);
            System.out.println("diluncurkan pada tahun: " + tahunBeli);
            System.out.println("beroda: " + roda);
            System.out.println("Konsumsi bensin: " + bensin + "\n");
        }

}