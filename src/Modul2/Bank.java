package Modul2;

public class Bank {
    double saldo;
    double no_rekening;

    Bank(double saldo, double no_rekening){
        this.saldo = saldo;
        this.no_rekening = no_rekening;
    }

    void cekSaldo(){
        System.out.println("Jumlah saldo anda : " + saldo);
    }

    void menabung(double tabung){
        saldo = saldo + tabung;
        System.out.println("Selamat anda berhasil menabung!" + "\n" + "Jumlah saldo anda : " + saldo);
    }

    void menarik(double tarik){
        saldo = saldo - tarik;
        System.out.println("Selamat anda berhasil menarik uang!" + "\n" + "Jumlah saldo anda : " + saldo);
    }

    void transfer(double pindah){
        saldo = saldo - pindah;
        System.out.println("Selamat anda berhasil melakukan transfer!" + "\n" + "Jumlah saldo anda : " + saldo);
    }
}
