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
            int input = sc.nextInt();
            // switch (lampu.statusLampu) {
            //     case 0:
            //         lampu.matikanLampu();0
            //     case 1:
            //         lampu.hidupkanLampu();
            //     case 2:
            //         lampu.redupkanLampu();
            //     default:
            //     System.out.println("input error");
            //         break;
            // }
            if(input == 0){
                lampu.matikanLampu();
                lampu.setSaklar(input);
            }
            else if (input == 1) {
                lampu.hidupkanLampu();
                lampu.setSaklar(input);
            }
            else if (input == 2) {
                lampu.redupkanLampu();
                lampu.setSaklar(input);
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
