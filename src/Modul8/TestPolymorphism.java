package Modul8;

public class TestPolymorphism {
    public static void main(String[] args) {
        kucing k = new kucing();k.beriNama("TOM");
        Anjing a = new Anjing();a.beriNama("BULL");
        
        System.out.println(
            k.panggilNama()+k.Perilaku()+a.panggilNama()+a.Perilaku()
        );
    }
    
    
}
