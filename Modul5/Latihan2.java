package Modul5;

public class Latihan2 {
    String namaPengarang;
    String judulbuku;
    int tahunTerbit;
    int Cetakanke;
    double hargaJual;

    public Latihan2(){
        System.out.println("System Berhasil Dijalankan");
    }

    public Latihan2(String namaPengarang, String judulbuku, int tahunTerbit, int Cetakanke, int hargaJual){
        this.namaPengarang = namaPengarang;
        this.judulbuku = judulbuku;
        this.tahunTerbit = tahunTerbit;
        this.Cetakanke = Cetakanke;
        this.hargaJual = hargaJual;
    }

    public Latihan2(String judulbuku, int tahunTerbit, double hargaJual) {
        this.judulbuku = judulbuku;
        this.tahunTerbit = tahunTerbit;
        this.hargaJual = hargaJual;
    }    
    
    public void info(){
        System.out.println("Nama Pengarang : " + namaPengarang + "\nBerjudul : " + judulbuku + "\nTahun Terbit : " +tahunTerbit + "\nHarga Jual : Rp. " +hargaJual + "\nCetakan Ke: " + Cetakanke + "\n");
    }
}
