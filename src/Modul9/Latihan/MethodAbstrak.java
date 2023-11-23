package Modul9.Latihan;

public abstract class MethodAbstrak {
    public abstract int luas();
    public abstract int keliling();

    public int getLuas(){
        return this.luas();
    }

    public int getKell(){
        return this.keliling();
    }

    public void printShape(){
        System.out.println(
            "\nLuas     = " + getLuas()
        + "\nKeliling = " + getKell());
    }
}
