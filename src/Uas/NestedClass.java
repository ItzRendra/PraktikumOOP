package Uas;

public class NestedClass {
    String judul = "";
    String pengarang = "";

    public void info(){
        System.out.println(judul + " : " + pengarang);
    }

    NestedClass(String j, String p){
        this.judul = j;
        this.pengarang = p ;
    }

    static class StockBuku{
        static int stock = 0;
    }

    class Access{
        StockBuku add;
        public void addStock(int s){
            add.stock = add.stock + s;
        }

        int getStock(){
            return add.stock;
        }

    }

    public static void main(String[] args) {
        NestedClass nc = new NestedClass("UAS PRAKTIKUM OOP", "RAKA RENDRA FAYANTO | L200224246");
        Access a = nc.new Access();
        nc.info();
        a.addStock(4);
        System.out.println("Judul buku                : " + nc.judul);
        System.out.println("Nama Pengarang            : " + nc.pengarang);
        System.out.println("Stok Buku saat ini adalah : " + a.getStock());
       
    }
}
