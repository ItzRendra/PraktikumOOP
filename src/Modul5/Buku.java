package Modul5;

public class Buku {
    String pengarang, judulBuku;
    int cetakanKe;
    double hargaJual;

    public Buku(String pengarang, String judulBuku, int cetakanKe, double hargaJual){
        this.pengarang = pengarang;
        this.judulBuku = judulBuku;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;

        System.out.println(pengarang + "\n" + judulBuku + cetakanKe + hargaJual);
    }
}
