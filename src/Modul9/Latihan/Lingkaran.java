package Modul9.Latihan;

public class Lingkaran extends MethodAbstrak{
    int rad;

    public Lingkaran(int rad){
        this.rad = rad;
    }

    public int luas(){
        return 22/7 * rad * rad;
    }

    public int keliling(){
        return 2 * 22/7 *rad;
    }

    public int getLuas(){
        return luas();
    }

    public int getKell(){
        return keliling();
    }

}
