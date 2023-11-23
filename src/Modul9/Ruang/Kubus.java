package Modul9.Ruang;

public class Kubus extends BangunRuang{
    String name  = "Kubus";
    double sisi;

    public Kubus(double sisi){
        this.sisi = sisi;
    }

    public double volume(){
        return sisi*sisi*sisi;
    }

    public double luas(){
        return 6 * sisi * sisi;
    }

    public String getName(){
        return name;
    }
}
