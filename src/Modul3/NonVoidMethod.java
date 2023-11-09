package Modul3;

public class NonVoidMethod {
    String nama = "raka";
    int nim = 246;

    public String getNama(){
        return nama;
    }

    public int getNim(){
        return nim;
    }

    public int setNim(int nim){
        return this.nim = nim;
    }

    void info(){
        System.out.println(
            "Nama : " + nama + "\n" +
            "NIM : " + nim + "\n" 
        );
    }
    
    public static void main(String[] args) {
        NonVoidMethod nvm = new NonVoidMethod();
            //    nvm.info();
            nvm.getNama();
            nvm.getNim();
    }
}
