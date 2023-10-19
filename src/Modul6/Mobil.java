package Modul6;

public class Mobil extends Kendaraan {
    String fuel = "Bensin", merek = "BMW";

    void infoKendaraan(){
        System.out.println(
            "Merek Mobil : " + merek +
            "\nBahan Bakar Mobil : "+ fuel +
            "\nJumlah Pintu : " + pintu +
            "\nJumlah Roda : " + roda +
            "\nJumlah Jendela : " + jendela + "\n"
        );
    }
    public static void main(String[] args) {
        Mobil m =  new Mobil();
        System.out.println(m.roda);
    }
}

