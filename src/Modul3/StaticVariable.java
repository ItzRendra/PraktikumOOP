package Modul3;

public class StaticVariable {
    public static String akreditasi;
    public static final String jurusan = "Informatika";
    String nama = "Raka"; 

    void firstMethod(){
        System.out.println(jurusan);
    }

    void secondMethod(){
        System.out.println("Akreditasi : " + akreditasi);
    }
}
