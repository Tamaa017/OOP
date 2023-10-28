package Modul3;

public class Pegawai {
    String nama;
    int nip;
    double gaji;
    
    void getNama(String namapegawai){
        nama = namapegawai;
    }

    void getNIP(int nippegawai){
        nip = nippegawai;
    }

    void getGaji(double gajipegawai){
        gaji = gajipegawai;
    }

    void pegawaiInfo(){
        System.out.println("Nama pegawai : " + nama + "\n" +
        "NIP pegawai : " + nip + "\n" +
        "Gaji pegawai : Rp. " + gaji + "\n");
    }
}

class PegawaiDemo{
    public static void main(String[] args){
        Pegawai pgwai1 = new Pegawai();
        Pegawai pgwai2 = new Pegawai();
        Pegawai pgwai3 = new Pegawai();
        Pegawai pgwai4 = new Pegawai();
        Pegawai pgwai5 = new Pegawai();

        pgwai1.getNama("Bayu");
        pgwai1.getNIP(200201);
        pgwai1.getGaji(4000000);
        pgwai1.pegawaiInfo();

        pgwai2.getNama("Akmal");
        pgwai2.getNIP(200202);
        pgwai2.getGaji(5000000);
        pgwai2.pegawaiInfo();

        pgwai3.getNama("Annisa");
        pgwai3.getNIP(200203);
        pgwai3.getGaji(6000000);
        pgwai3.pegawaiInfo();

        pgwai4.getNama("Aulia");
        pgwai4.getNIP(200204);
        pgwai4.getGaji(8000000);
        pgwai4.pegawaiInfo();

        pgwai5.getNama("Vita");
        pgwai5.getNIP(200205);
        pgwai5.getGaji(7000000);
        pgwai5.pegawaiInfo();
    }
}
