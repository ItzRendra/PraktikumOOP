package Modul10;

import java.util.Scanner;

public class AplikasiLampu {
    public static void main(String[] args) {
        int stop = 9;
        Lampu lampu = new Lampu();
        Scanner sc = new Scanner(System.in);
        lampu.statusLampu = lampu.setSaklar(0);

        while (stop == 9) {
            System.out.println("========================="+
            "\nStatus lampu = " + lampu.statusLampu + "\nKetikkan" +
            "\n0 untuk mematikan lampu \n1 untuk menyalakan lampu \n2 untuk meredupkan lampu");
            lampu.setSaklar(sc.nextInt());
            if(lampu.statusLampu == 0){
                lampu.matikanLampu();
            }
            else if (lampu.statusLampu == 1) {
                lampu.hidupkanLampu();
            }
            else if (lampu.statusLampu == 2) {
                lampu.redupkanLampu();
            }
            else{
                System.out.println("perintah tidak di ketahui");
                break;
            }
        System.out.println("=========================\n" + 
            "tekan 9 untuk melanjutkan");
        stop = sc.nextInt();
        }
        
    }
}
