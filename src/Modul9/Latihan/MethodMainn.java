package Modul9.Latihan;

public class MethodMainn {
    public static void main(String[] args) {
        persegi p =  new persegi(56);
        PersegiPanjang pp = new PersegiPanjang(3, 5);
        JajarGenjang jg =  new JajarGenjang(4, 7);
        Lingkaran l = new Lingkaran(8);
        Segitiga s = new Segitiga(6, 9);
        p.printShape();
        pp.printShape();
        jg.printShape();
        l.printShape();
        s.printShape();

    }
}
