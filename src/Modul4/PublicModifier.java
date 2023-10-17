package Modul4;

public class PublicModifier {
    public int a = 2;
    public int b = 5;
    public int c = 9;

    public void kali(){
        int d = a*b*c;
        System.out.println("Hasil Kali : "+d);
    }

    public void tambah(){
        System.out.println("Hasil Tambah : " + (a+b+c));
    }

    public void kurang(){
        System.out.println("Hasil Kurang : " + (c-b-a));
    }

    public void bagi(){
        System.out.println("Hasil Bagi : " + (c/a));
    }

    public void rata_rata(){
        System.out.println("Rata-Ratanya : " + ((a+b+c)/3));
    }
}
