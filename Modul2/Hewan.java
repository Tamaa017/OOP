package Modul2;

public class Hewan {
    String nama;
    int kaki;
    String makanan;
    String jenis;

    void beriNama(String namaHewan) {
        nama = namaHewan;
    }

    void jumlahKaki(int kakiHewan) {
        kaki = kakiHewan;
    }

    void jenisMakanan(String makananApa) {
        makanan = makananApa;
    }

    void gantiJenis(String jenisHewan) {
        jenis = jenisHewan;
    }

    void infoHewan() {
        System.out.println(
                "Nama Hewan :" + nama + "\n" +
                        "Kaki Hewan :" + kaki + "\n" +
                        "Makan Apa :" + makanan + "\n" +
                        "Jenis Hewan :" + jenis);
    }
}

class HewanProgram {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();

        hewan1.beriNama("Tiger");
        hewan1.jumlahKaki(4);
        hewan1.jenisMakanan("Meat");
        hewan1.gantiJenis("Carnivore");
        hewan1.infoHewan();

        hewan2.beriNama("Buffalo");
        hewan2.jumlahKaki(4);
        hewan2.jenisMakanan("Grass");
        hewan2.gantiJenis("Herbivore");
        hewan2.infoHewan();
    }
}
