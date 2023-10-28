package Modul3;

public class LocalVariable {
    private int usia;
    public void hitunganUsia() {
        int tahunSekarang = 2019;
        int tahunLahir = 1993;

        usia = tahunSekarang - tahunLahir;
        System.out.println("Usia saya : " + usia);
    }

    void beratBadan() {
        int beratLahir = 3;
        int beratBadan = beratLahir + (usia / 2);
        System.out.println("Berat badan saya : " + beratBadan);
    }

    public static void main(String[] args) {
        LocalVariable test = new LocalVariable();
        test.hitunganUsia();
        test.beratBadan();
    }
}
