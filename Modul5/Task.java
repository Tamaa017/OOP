package Modul5;

public class Task {
    String name, description;
    int tahun, semester;

    public Task(String name, int semester, String description, int tahun) {
        this.name = name;
        this.semester = semester;
        this.description = description;
        this.tahun = tahun;
    }

    public void info(){
        System.out.println("Constructor tanpa Parameter!!!\n" + "Nama : " + name + 
        "\nSemester : " + semester + "\nDeskripsi : " + description + "\nSejak tahun : " +tahun + "\n");
    }
}
