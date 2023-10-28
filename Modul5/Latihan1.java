package Modul5;

public class Latihan1 {
    String name;
    String nim;
    String alamat;

    public Latihan1(String name, String nim, String alamat){
        this.name = name;
        this.nim = nim;
        this.alamat = alamat;
    }

    public void info(){
        System.out.println("Default Constructor!!!" + "\nNama : " + name + "\nNim : " + nim + "\nAlamat : " +alamat);
    }
}
