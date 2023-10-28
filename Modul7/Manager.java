package Modul7;

public class Manager extends Karyawan{
    private float jamKerja = 7.5f;

    public float jamKerja(){
        return jamKerja;
    }
    
    public void setjamKerja (float jamKerja){
        this.jamKerja = jamKerja;
    }

    public float getGajiManager() {
        return getGaji() *2;
    }

  public static void main(String[] args) {
    Manager m1 = new Manager();
    System.out.println("Jam kerja manager : " + m1.jamKerja() + "\nGaji manager : Rp."+m1.getGajiManager());
  }
}
