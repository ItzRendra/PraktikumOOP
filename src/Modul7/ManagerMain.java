package Modul7;

public class ManagerMain {
    public static void main(String[] args) {
        manager m = new manager("arkan", 1500000, 24);
        manager m1 = new manager("rangga", 8000000, 21);
        manager m2 = new manager("aksal", 6000000, 22);
        manager m3 = new manager("raka", 9999999, 20);
        manager m4 = new manager("Briva", 8981231, 22);
        // System.out.println(m.getNama() + "\n" + m.getGajiManager() + "\n" + m.getUsia() + "\n");
        m.infoManager();
        m1.infoManager();
        m2.infoManager();
        m3.infoManager();
        m4.infoManager();
    }
}
