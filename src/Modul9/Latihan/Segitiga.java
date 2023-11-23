package Modul9.Latihan;

public class Segitiga extends MethodAbstrak{
    int alas, tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int luas(){
        return (alas * tinggi) / 2;
    }

    public int keliling(){
        return 3 * alas;
    }

    public int getLuas(){
        return luas();
    }

    public int getKell(){
        return keliling();
    }
}
