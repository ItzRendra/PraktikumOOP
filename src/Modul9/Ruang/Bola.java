package Modul9.Ruang;

public class Bola extends BangunRuang{
    String name = "Bola";
    double r;

    public Bola(double r){
        this.r = r;
    }

    public double volume() {
        return 4*Math.PI*r*r*r;
    }

    public double luas() {
        return 4*Math.PI*r*r;
    }

    public String getName(){
        return name;
    }
}
