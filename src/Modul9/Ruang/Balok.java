package Modul9.Ruang;

public class Balok extends BangunRuang{
    double p, l, t;
    String name = "Balok";

    public Balok(double p, double l, double t) {
    this.p = p;
    this.l = l;
    this.t = t;
    }

    public double volume(){
        return p * l * t;
    }

    public double luas(){
        return 2* (p*l + p*t + t*l);
    }

    public String getName(){
        return name;
    }
}
