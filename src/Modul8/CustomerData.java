package Modul8;

public class CustomerData {
    String nama,alamat,pekerjaan,ttl;
    float gaji;

    public CustomerData(){
        System.out.println("ini adalah default constructor dari customer data");
    }

    public CustomerData(String nama){
        this.nama = nama;System.out.println(this.nama);
    }

    public CustomerData(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }

    public CustomerData(String nama, String alamat, String pekerjaan){
        this.nama = nama;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
    }

    public CustomerData(String nama, String alamat, String pekerjaan, String ttl){
        this.nama = nama;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
        this.ttl = ttl;
    }

    public CustomerData(String nama, String alamat, String pekerjaan, String ttl, float gaji){
        this.nama = nama;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
        this.ttl = ttl;
        this.gaji = gaji;
    }
}
