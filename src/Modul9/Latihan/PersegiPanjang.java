package Modul9.Latihan;

public class PersegiPanjang extends MethodAbstrak{
    int panjang, lebar;

    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luas(){
        return panjang * lebar;
    }

    public int keliling(){
        return 2 * (panjang + lebar);
    }

    public int getLuas(){
        return luas();
    }

    public int getKell(){
        return keliling();
    }
}
