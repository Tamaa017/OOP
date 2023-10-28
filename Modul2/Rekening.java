package Modul2;

public class Rekening {
    int saldo = 0;
    int nomor_rekening = 0;
    String nama;

    public void cek_saldo(){
        System.out.println("Saldo : " + saldo);
    }

    public void menabung(){
        saldo += 100000;
        System.out.println("Isi saldo berhasil \n Saldo anda sekarang : " + saldo);
    }

    public void menarik(){
        saldo -= 50000;
        System.out.println("Pengambilan berhasil \n Saldo anda sekarang : " + saldo);
    }

    public void transfer(){
        saldo += 50000;
        System.out.println("Transfer berhasil \n anda telah transfer sebesar 50000 \n saldo anda sekarang : " + saldo);
    }

    public int getSaldo(int saldo) {
        return this.saldo = saldo;
    }

    public int getNomor_rekening(int nomor_rekening) {
        return this.nomor_rekening = nomor_rekening;
    }

    public String getNama(String nama) {
        return this.nama = nama;
    }
}
