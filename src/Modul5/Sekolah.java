package Modul5;

public class Sekolah {
    String guru, kelas;
    int jumlahMurid;

    public Sekolah(){
        System.out.println("default constructor\n" + 
        "Nama Guru : Antok \n" +
        "Kelas   : X \n" +
        "Jumlah Murid : 30");//default constructor
    }

    // public Sekolah(String guru){
    //     this.guru = guru;

    // }

    // public Sekolah(String guru, String kelas){
    //     this.guru = guru;
    //     this.kelas = kelas;
    // }

    public Sekolah(String guru, String kelas, int jumlahMurid){
        this.guru=guru; 
        this.kelas=kelas;
        this.jumlahMurid=jumlahMurid;
    }

    void info(){
        System.out.println(
            "Nama Guru : " + guru +
            "\nkelas : " + kelas +
            "\nJumlahMurid : " +  jumlahMurid + "\n"
        );
    }
}
