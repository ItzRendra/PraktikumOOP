package Modul9.Ruang;

public abstract class BangunRuang {
    public abstract double volume(){}
    public abstract double luas(){}

    public double getVol(){
        return this.volume();
    }

    public double getLp(){
        return this.luas();
    }

    public String getName(){
    }

    public void printRuang(){
        System.out.println(
            "\nVolume ruang "+getName()+" = " + getVol() +
            "\nLuas Permukaan Ruang "+getName()+" = " + getLp()
        );
    }
}
