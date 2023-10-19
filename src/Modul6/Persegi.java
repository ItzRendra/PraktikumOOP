package Modul6;

public class Persegi extends BangunDatar {
    protected double sisi;

    protected void hitungLuas(double sisi){
        luas = sisi * sisi;
        System.out.println("Luas Persegi : " + luas);
    }

    protected void hitungKeliling(double sisi){
        super.hitungKeliling(sisi);
        keliling = 4 * sisi;
        System.out.println("Keliling Persegi : " + keliling);
    }
    public static void main(String[] args) {
        Persegi p = new Persegi();
        p.hitungKeliling(6);
        p.hitungLuas(6);
    }
}
