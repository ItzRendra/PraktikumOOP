package Modul4_tes;

// import Modul4.DefaultModifier;
import Modul4.PublicModifier;

public class DefaultAccess {
    public static void main(String[] args) {
    
        PublicModifier pp = new PublicModifier();
        pp.bagi();
        pp.tambah();
        pp.bagi();
        pp.kurang();
        pp.rata_rata();

        // DefaultModifier dm = new DefaultModifier();
        // dm.jumlah();
    }
    
}
