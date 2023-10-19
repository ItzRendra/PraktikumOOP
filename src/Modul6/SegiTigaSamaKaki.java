package Modul6;

public class SegiTigaSamaKaki extends SegiTiga {
    protected double sisiMiring, tinggi;
    
    protected void hitungLuas(double sisiMiring, double tinggi){
        // super.hitungLuas(sisiMiring, tinggi);
        luas = (sisiMiring*tinggi)/2;
        System.out.println("Luas Segitiga : " + luas);
    }

    protected void hitungKeliling(double sisiMiring){
        keliling = 3 * sisiMiring;
        System.out.println("Keliling Segitiga : " + keliling);
    }

    public static void main(String[] args) {
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.hitungLuas(12.0, 4.5);
        stsk.hitungKeliling(7);
    }
}
