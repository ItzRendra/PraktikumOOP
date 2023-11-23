package Modul9.Latihan;

public class JajarGenjang extends MethodAbstrak{
    int alas, tinggi;

    public JajarGenjang(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int luas(){
        return (alas * tinggi)/2;
    }

    public int keliling(){
        return 4*alas;
    }

    // public int getLuas(){
    //     return luas();
    // }

    // public int getKell(){
    //     return keliling();
    // }
}
