package Modul2;

public class Hewan {
    String nama;
    int kaki;
    String makanan;
    String type;

    Hewan(String nama, int kaki, String makanan, String type){
        this.nama = nama;
        this.type = type;
        this.makanan = makanan;
        this.kaki = kaki;

    }

    void info(){
        System.out.println(
            "Nama Hewan : " + nama + "\n" + 
            "Jumlah Kaki : " + kaki + "\n" +
            "Makanan : " + makanan + "\n" +
            "Type Hewan : " + type + "\n"

        );
    }
}
