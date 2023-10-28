package Modul7;

public class KaryawanMain {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setgaji(10000);
        m1.setNama("Steven");
        m1.setUsia(30);
        System.out.println("Nama : " + m1.getNama() + "\nGaji : Rp."+m1.getGajiManager()+
        " per bulan" + "\nUsia : "+m1.getUsia()+" tahun");
    
        Manager m2 = new Manager();
        m2.setgaji(5000);
        m2.setNama("Andy");
        m2.setUsia(44);
        System.out.println("\nNama : " + m2.getNama() + "\nGaji : Rp."+m2.getGajiManager()+
        " per bulan" + "\nUsia : "+m2.getUsia()+" tahun");

        Manager m3 = new Manager();
        m3.setgaji(50000);
        m3.setNama("Nopal");
        m3.setUsia(21);
        System.out.println("\nNama : " + m3.getNama() + "\nGaji :  Rp." + m3.getGajiManager()+
        " per bulan" + "\nUsia : " + m3.getUsia() + " tahun");

        Manager m4 = new Manager();
        m4.setgaji(320000);
        m4.setNama("Jason");
        m4.setUsia(32);
        System.out.println("\nNama : " + m4.getNama() + "\nGaji : " + m4.getGajiManager()+
        " per bulan" + "\nUsia : " + m4.getUsia() + " tahun");

        Manager m5 = new Manager();
        m5.setgaji(430000);
        m5.setNama("Akira");
        m5.setUsia(22);
        System.out.println("\nNama : " + m5.getNama() + "\nGaji : " + m5.getGajiManager()+
        " per bulan" + "\nUsia : " + m5.getUsia() + " tahun");
      }
}
