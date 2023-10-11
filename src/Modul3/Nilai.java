package Modul3;

public class Nilai {
int nilaiUTS = 80, nilaiUAS = 84, nilaiTugas = 70;
// double nilaiUTS, nilaiUAS, nilaiTugas, nilaiTotal;    
    public int UTS(){
        return nilaiUTS;
    }

    public int UAS(){
        return nilaiUAS;
    }

    public int TUGAS(){
        return nilaiTugas;
    }

    void nilai (int nilaiUTS,int nilaiUAS,int nilaiTugas){
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiTugas = nilaiTugas;
    }

    // void nilai (int nilaiUTS,int nilaiUAS,int nilaiTugas){
    //     this.nilaiUTS = nilaiUTS;
    //     this.nilaiUAS = nilaiUAS;
    //     this.nilaiTugas = nilaiTugas;
    // }

    void nilaiTotal(double nilaiTotal) {
        nilaiTotal = (nilaiUTS+nilaiUAS+nilaiTugas)/3;
        System.out.println("Nilai Total : " + nilaiTotal);
    }


    public static void main(String[] args) {
        Nilai n = new Nilai();
        System.out.println("Nilai Total : " + (n.UTS() + n.UAS() + n.TUGAS())/3);
        n.nilai(80, 95,76 );
        n.nilaiTotal(0);
        
    }
}