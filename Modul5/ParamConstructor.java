package Modul5;

public class ParamConstructor {
    String name, nim;
    int semester;

    public ParamConstructor(String name, String nim, int semester){
        this.name = name;
        this.nim = nim;
        this.semester = semester;
    }

    public void info(){
        System.out.println("Nama : " + name + "\nNim : " + nim + "\nSemester : " +semester);
    }
}
