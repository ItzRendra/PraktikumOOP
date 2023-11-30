package Modul10;

public class Lampu implements ActivityLampu{
    public int statusLampu;

    @Override
    public void matikanLampu(){
        if(statusLampu == 0){
            System.out.println("Lampu sudah dalam kondisi mati");
        }
        else {
            statusLampu = 0;
            System.out.println("Lampu sudah dimatikan");
        }
    }

    @Override
    public void hidupkanLampu(){
        if (statusLampu == 1) {
            System.out.println("Lampu sudah dalam kondisi hidup");
        }
        else {
            statusLampu = 1 ;
            System.out.println("Lampu sudah dihidupkan");
        }
    }

    @Override
    public void redupkanLampu(){
        if (statusLampu == 2) {
            System.out.println("Lampu sudah dalam kondisi redup");
        }
        else{
            statusLampu = 2;
            System.out.println("Lampu sudah diredupkan");
        }
    }

    public int setSaklar(int saklar){
        return statusLampu = saklar;
    }

    public int getStatus(){
        return statusLampu;
    }
}
