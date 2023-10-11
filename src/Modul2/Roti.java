
package Modul2;

public class Roti {
    String warna;
    String rasa;
    int berat;
    double harga;
    String merek;
    
    void beriWarna(String warnaRoti){
        warna = warnaRoti;
    }
    
    void beriRasa(String rasaRoti){
        rasa = rasaRoti;
    }
    
    void timbangBerat (int beratRoti){
        berat = beratRoti;
    }
    
    void hargaJual(double hargaRoti){
        harga = hargaRoti;
    }

    void beriMerek(String merekRoti){
        merek = merekRoti;
    }
    
    void infoRoti(){
       System.out.println(
        "Merek Roti : " + merek + "\n" +"Warna Roti : " + warna + "\n" + 
        "Rasa Roti : " + rasa + "\n" + "Berat Roti : "+ berat + "gr" + 
        "\n" + "Harga roti : Rp. " + harga + "\n"
        );
        
       
}
}