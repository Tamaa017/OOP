package Modul3;

public class Nilai {
    private double nilaiUTS, nilaiUAS, nilaiTugas;
    private double nilaiTotal = 0;

    public void setUTS(double nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public void setUAS(double nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

    public void setTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public double getTotal() {
        nilaiTotal = (nilaiUTS + nilaiUAS + nilaiTugas) / 3;
        System.out.println("Nilai Total : " + nilaiTotal);
        return nilaiTotal;
    }
}

class NilaiNih {
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        nilai.setUTS(88);
        nilai.setUAS(90);
        nilai.setTugas(78);

        double total = nilai.getTotal();
        System.out.println("Total: " + total);
    }
}
