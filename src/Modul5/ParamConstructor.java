package Modul5;

public class ParamConstructor {
    String nama = "raka", nim = "L200224246";
    int semester = 3;

    public ParamConstructor(String nama, String nim, int semester){
        // this.nama = nama;
        // this.nim  = nim ;
        // this.semester = semester;
        System.out.println("Nama : " + nama + "\nNIM : " + nim + "\nSemester : " + semester);
    }

    public void info(){
        System.out.println("Nama : " +  nama + "\nNIM : " + nim + "\nSEMESTER : " + semester);
    }
}
