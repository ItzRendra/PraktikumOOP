package Modul9.Ruang;

public class Prisma extends BangunRuang{
    String name = "Prisma";
    double t,ta,pa;

    public Prisma(double t, double ta, double pa){
        this.t = t;
        this.ta = ta;
        this.pa = pa;
    }

    public double volume(){
        return t * ta* pa /2;
    }

    public double luas(){
        return (pa* t)*3 + (ta * pa);
    }

    public String getName(){
        return name;
    }
}
