package Modul3;

public class MethodParamater {
    String nama;

    public String setNama(String nama){
        return this.nama = nama;
    }

    public static void main(String[] args) {
        MethodParamater mp = new MethodParamater();
        mp.setNama("Luffy");
        System.out.println(mp.nama); // output: Luffy
    }
}
