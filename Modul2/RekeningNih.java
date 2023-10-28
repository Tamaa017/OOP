package Modul2;

public class RekeningNih {
    public static void main(String[] args){
        Rekening rekening1 = new Rekening();
        rekening1.getNama("Jason");
        rekening1.getNomor_rekening(123456789);
        System.out.println("Nama nasabah: "+ rekening1.nama);
        System.out.println("Nomor Rekening: "+ rekening1.nomor_rekening);
        rekening1.getSaldo(100000);
        rekening1.cek_saldo();
        rekening1.menabung();
        rekening1.menarik();
        rekening1.transfer();

        Rekening rekening2 = new Rekening();
        rekening2.getNama("Akmal");
        rekening2.getNomor_rekening(123456789);
        System.out.println("Nama nasabah: "+ rekening2.nama);
        System.out.println("Nomor Rekening: "+ rekening2.nomor_rekening);
        rekening2.getSaldo(100000);
        rekening2.cek_saldo();
        rekening2.menabung();
        rekening2.menarik();
        rekening2.transfer();
    }
}
