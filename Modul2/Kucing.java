package Modul2;

public class Kucing {
    int umur;
    String warnaBulu;

    public void meong() {
        System.out.println("Meong! Saya adalah kucing berwarna " + warnaBulu + "Dan saya berumur " + umur + " tahun");
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }
}

class programKucing{
    public static void main (String[] args){
        Kucing kucing = new Kucing();
        kucing.setUmur(3);
        kucing.setWarnaBulu("oren");
        kucing.meong();
    }
}
