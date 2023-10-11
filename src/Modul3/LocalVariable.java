package Modul3;

public class LocalVariable {
    int usia = 26; //Global Variable

    public void hitungUsia(){
        int usia = 0;
        int tahunSekarang = 2019;
        int tahunLahir = 1993;

        usia = tahunSekarang - tahunLahir;
        System.out.println("usia saya : " + usia);
        
    }

    public void beratBadan(){
        int beratBadan = 0;
        int beratLahir = 5;

        beratBadan = beratLahir + (usia*2);
        System.out.println("Berat badan Saya : " + beratBadan);
    }

}



