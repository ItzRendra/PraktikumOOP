package Modul9.Ruang;

public class Main {
    public static void main(String[] args) {
        Balok b = new Balok(5,6, 7);
        Bola bo =  new Bola(45);
        Kubus ku = new Kubus(53);
        Kerucut ke = new Kerucut(12, 53);
        Prisma p = new Prisma(22, 53, 12);
        b.printRuang();
        bo.printRuang();
        ku.printRuang();
        ke.printRuang();
        p.printRuang();
    }
}
