package Modul9.Latihan;

public class persegi extends MethodAbstrak{
    int sisi = 5;

    public persegi(){

    }
    
    public persegi(int sisi){
        this.sisi = sisi;
    }

    public int luas(){
        return sisi * sisi;
    }

    public int keliling(){
        return 4*sisi;
    }

    public int getLuas(){
        return luas();
    }

    public int getKell(){
        return keliling();
    }
}
