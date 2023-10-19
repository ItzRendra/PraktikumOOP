package Modul6;

public class SegiTiga extends BangunDatar{
    protected double alas, tinggi;

    protected void hitungLuas(double alas, double tinggi){
        luas = (alas*tinggi)/2;
        System.out.println("Luas Segitiga :" + luas);
    }

    protected void hitungKeliling(double alas){
        keliling = 3 * alas;
        System.out.println("Keliling Segitiga : " + keliling);
    }

    public static void main(String[] args) {
        SegiTiga s = new SegiTiga();
        s.hitungLuas(5, 9);
        s.hitungKeliling(7);
    }
}
