package Modul2;

public class RotiDemo {
    public static void main(String[] args) {

        Roti roti1 = new Roti();
        roti1.beriMerek("Aoka");
        roti1.beriWarna("Hijau");
        roti1.beriRasa("Pandan");
        roti1.timbangBerat(30);
        roti1.hargaJual(6000);
        roti1.infoRoti();
        
        Roti roti2 = new Roti();
        roti2.beriMerek("Holland");
        roti2.beriWarna("Merah");
        roti2.beriRasa("Stroberi");
        roti2.timbangBerat(40);
        roti2.hargaJual(7000);
        roti2.infoRoti();
        
        Roti roti3 = new Roti();
        roti3.beriMerek("Joglo");
        roti3.beriWarna("Coklat");
        roti3.beriRasa("Coklat");
        roti3.timbangBerat(50);
        roti3.hargaJual(10000);
        roti3.infoRoti();
        
        Roti roti4 = new Roti();
        roti4.beriMerek("Virgin");
        roti4.beriWarna("Vanila");
        roti4.beriRasa("Susu");
        roti4.timbangBerat(36);
        roti4.hargaJual(5000);
        roti4.infoRoti();
    }
}
