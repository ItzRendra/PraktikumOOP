package Modul9.Ruang;

public class Kerucut extends BangunRuang{
    String name = "Kerucut";
    double t, r;

    public Kerucut(double t, double r){
        this.t = t;
        this.r = r;
    }

    public double volume(){
        return (Math.PI * Math.pow(this.t, 2)) * this.r;
    }

    public double luas(){
        return (Math.PI* Math.pow((this.t + this.r), 2));
    }

    public String getName(){
        return name;
    }
}
