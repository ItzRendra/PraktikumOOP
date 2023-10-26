package Modul7;

public class KaryawanDemo {
    public static void main(String[] args) {
        Karyawan k = new Karyawan();
        k.setNama("raka");
        k.setGaji(500000);
        k.setUsia(19);

        System.out.println(k.getGaji() + k.getNama() + k.getUsia());
    }
}
