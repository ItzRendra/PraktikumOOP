package Modul4;
//Main untuk Modul 4
public class Main {
    // private String nama;
    // private int umur;
    
    // void setNama(String Nama){
    //     this.nama = Nama;
    //     System.out.println(this.nama);

    public static void main(String[] args) {
        // PrivateModifier p = new PrivateModifier();
        // p.printInfo();
        // p.nama = "raka";
        // System.out.println(p.nama);


        // DefaultModifier dm = new DefaultModifier();
        // dm.kurang();


        // ProtectedModifier pm =  new ProtectedModifier();
        // pm.sendMassage();
        // pm.printInfo();


        PublicModifier pp = new PublicModifier();
        pp.kali();
        pp.tambah();
        pp.bagi();
        pp.kurang();
        pp.rata_rata();
    }
 
}
