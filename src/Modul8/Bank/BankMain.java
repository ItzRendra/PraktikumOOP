package Modul8.Bank;

public class BankMain {
    public static void main(String[] args) {
        Bank b = new Bank();    
        BankPasar bp = new BankPasar();
        BankPribadi bp1 = new BankPribadi();
        BankUmum bu = new BankUmum();
        BankSyariah bs =  new BankSyariah();

        b.rasioBunga();
        bp.rasioBunga();
        bp1.rasioBunga();
        bu.rasioBunga();
        bs.rasioBunga();
    }
    
}
