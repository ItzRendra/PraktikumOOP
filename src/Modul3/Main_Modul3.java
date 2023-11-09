package Modul3;

public class Main_Modul3 {
    
    // public static void main(String[] args) {
    //     LocalVariable raka = new LocalVariable();
    //     raka.beratBadan();
    //     raka.hitungUsia();
    // }

    public static void main(String[] args) {
        StaticVariable.akreditasi =  "B" ;
        StaticVariable sv = new StaticVariable();
        sv.firstMethod();
        sv.secondMethod();
        
        
       
    }

    // public static void main(String[] args) {
    //     NonVoidVariable p = new NonVoidVariable();
    //     System.out.println("nama : " + p.getNama() + "\n " + "NIM : " + p.getNim()); // error, karena method ini bukan void (return type
    // }

    // public static void main(String[] args) {
    //     Pegawai p = new Pegawai();
    //     p.dataPegawai("arkan", 000, 4000000);

    // }
    
}
