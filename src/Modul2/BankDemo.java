package Modul2;

public class BankDemo {
    public static void main(String[] args) {
        Bank raka = new Bank(1000000, 12345);
        raka.menabung(575000);

        Bank raka1 = new Bank(500000, 9876);
        raka1.transfer(100000);

        Bank raka2 = new Bank(2500000, 555);
        raka2.menarik(500000);

        Bank raka3 =  new Bank(12314, 444);
        raka3.cekSaldo();
    }
}
