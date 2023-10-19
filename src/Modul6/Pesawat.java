package Modul6;

public class Pesawat extends Kendaraan{
    String fuel = "Avtur", maskapai = "Garuda";
    int jendela = 20;
    

    void infoKendaraan(){
        System.out.println(
            "Maskapai Pesawat : " + maskapai +
            "\nBahan Bakar Pesawat : "+ fuel +
            "\nJumlah Pintu : " + pintu +
            "\nJumlah Roda : " + roda +
            "\nJumlah Jendela : " + jendela +"\n"
        );
    }
    public static void main(String[] args) {
        Pesawat p = new Pesawat();
        System.out.println(p.harga);
        p.infoKendaraan();
    }
}
