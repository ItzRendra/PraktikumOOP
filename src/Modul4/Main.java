package Modul4;
// import Modul4.PrivateModifier;
/**
 *
 * @author Personal
 */
public class Main {
    // private String nama;
    // private int umur;
    
    // void setNama(String Nama){
    //     this.nama = Nama;
    //     System.out.println(this.nama);

    public static void main(String[] args) {
        PrivateModifier p = new PrivateModifier();
        p.printInfo();
        p.nama = "raka";
        System.out.println(p.nama);
        // DefaultModifier dm = new DefaultModifier();
        // dm.kurang();
    }
 
}
