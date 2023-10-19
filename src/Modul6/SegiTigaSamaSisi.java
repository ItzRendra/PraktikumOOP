package Modul6;

public class SegiTigaSamaSisi extends SegiTiga{
    protected double sisi, tinggi;

    protected void hitungLuas(double sisi, double tinggi){
        luas = (sisi*tinggi)/2;
        System.out.println("Luas Segitiga : " + luas);
    }

    protected void hitungKeliling(double sisi){
        keliling = 3 * sisi;
        System.out.println("Keliling Segitiga : " + keliling);
    }

    public static void main(String[] args) {
        SegiTigaSamaSisi stsm = new SegiTigaSamaSisi();
        stsm.hitungLuas(12,12);
        stsm.hitungKeliling(4);
    }
}


