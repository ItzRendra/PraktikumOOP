package Modul8;

public class Pet {
    private String nama;

    public void beriNama(String newName){
        this.nama = newName;
    }

    public String panggilNama(){
        return this.nama;
    }

    public String Perilaku(){
        return "\nHewan Penurut";
    }



    public static void main(String[] args) {
        Pet p = new Pet();
        p.beriNama("Kucing");
        System.out.println(p.panggilNama()+p.Perilaku());
    }
}
