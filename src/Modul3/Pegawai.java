package Modul3;

public class Pegawai {
    String nama;
    int nip;
    double gaji;

    public String getNama(){
        return this.nama;
    }

    public int nip(){
        return this.nip;
    }

    public double gaji(){
        return this.gaji;
    }

    public void info(){
        System.out.println(
            "Nama Pegawai : " + getNama() + "\n" +
            "NIP Pegawai : " + nip() + "\n" +
            "Gaji Peagawai : " + gaji() + "\n"
        );
    }

    void dataPegawai(String nama, int nip, double gaji){
        // this.nama = nama;
        // this.nip = nip;
        // this.gaji =  gaji;

        System.out.println(
            "Nama Pegawai : " + nama +"\n" +
            "Nip Pegawai : " + nip + "\n" +
            "Gaji Pegawai : " + gaji + "\n"
        );
    }
}
