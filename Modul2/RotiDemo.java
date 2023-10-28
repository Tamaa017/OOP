package Modul2;

public class RotiDemo {
    public static void main (String[] args) {
        Roti roti = new Roti();
        roti.beriWarna("Hijau");
        roti.beriRasa("Pandan");
        roti.timbangBerat(30);
        roti.hargaJual(6000);
        roti.infoRoti();

        Roti roti2 = new Roti();
        roti2.beriWarna("Coklat");
        roti2.beriRasa("Coklat");
        roti2.timbangBerat(40);
        roti2.hargaJual(5000);
        roti2.infoRoti();

        Roti roti3 = new Roti();
        roti3.beriWarna("Ungu");
        roti3.beriRasa("Blueberry");
        roti3.timbangBerat(35);
        roti3.hargaJual(8000);
        roti3.infoRoti();

        Roti roti4 = new Roti();
        roti4.beriWarna("Merah");
        roti4.beriRasa("Strawberry");
        roti4.timbangBerat(45);
        roti4.hargaJual(10000);
        roti4.infoRoti();
    }
}
