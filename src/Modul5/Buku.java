package Modul5;

public class Buku {
    String pengarang, judulBuku;
    int cetakanKe;
    double hargaJual;

    public Buku(){
        System.out.println(
            "Pengarang Buku : Raka\n" + 
            "Judul Buku : Buku Bagus\n" +
            "Cetakan Ke : 2\n" + 
            "Harga Jual : 77.000" 
        );
    }

    public Buku(int cetakanKe){
        // this.cetakanKe = cetakanKe;
        System.out.println(
            "Cetakan ke : " + cetakanKe + "\n"
        );
    }

    public Buku(String judulBuku, double hargaJual){
        // this.cetakanKe = cetakanKe;
        System.out.println(
            "Judul Buku : " + judulBuku + "\n" +
            "Harga Buku : " + hargaJual + "\n"
        );
    }

    public Buku(String pengarang, String judulBuku){
        // this.pengarang = pengarang;
        // this.judulBuku = judulBuku;
        System.out.println(
            "Pengarang Buku : " + pengarang + "\n" +
            "judul Buku : " + judulBuku + "\n"
        );
    }

    public Buku(String pengarang, String judulBuku, int cetakanKe, double hargaJual){
        // this.pengarang = pengarang;
        // this.judulBuku = judulBuku;
        // this.cetakanKe = cetakanKe;
        // this.hargaJual = hargaJual;

        System.out.println("Pengarang : " + pengarang + "\nJudul Buku : " + judulBuku +
        "\nCetakan ke : "+ cetakanKe +"\nHarga Jual : "+ hargaJual + "\n");
    }
    void infoBuku(){
        System.out.println("Pengarang : " + pengarang + "\nJudul Buku : " + judulBuku +
        "\nCetakan ke : "+ cetakanKe +"\nHarga Jual : "+ hargaJual + "\n");
    }

    
}
