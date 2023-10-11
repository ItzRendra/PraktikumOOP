package Modul2;

public class Cat {
    String nama;
    int umur;
    double bulu;

    Cat (String nama, int umur, double bulu){
        this.nama = nama;
        this.bulu = bulu;
        this.umur = umur;
    }

    void meong(){
        System.out.println("meong.... kucing mu yang bernama : " + nama +" sedang mengeong");
        bulu = bulu - (umur*2);
        System.out.println("kucing mu mennggaruk kepalanya dan jumlah bulunya sekarang : " + bulu);        
        
    }
    
    void umur(){
        System.out.println(umur);
    }


}
