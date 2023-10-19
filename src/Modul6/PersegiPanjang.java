package Modul6;

public class PersegiPanjang extends BangunDatar{
    protected int panjang;
    protected double lebar;

    protected void hitungLuas(int panjang , double lebar){
        luas = (panjang * lebar);
        System.out.println("Luas Persegi Panjang : " + luas);
    }

    protected void hitungKeliling(int panjang, double lebar){
        keliling = 2*(panjang+lebar);
        System.out.println("Keliling Persegi Panjang : " + keliling);
    }
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.hitungLuas(12, 10);
        pp.hitungKeliling(12, 10);
    }
}
