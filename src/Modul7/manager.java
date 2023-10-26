package Modul7;

public class manager extends Karyawan{
    private float jamKerja = 7.5f;

    // private float jamKerja(){
    //     return jamKerja;
    // }

    private float getGajiManager(){
        return getGaji() * 2;

    }

    private void setJamKerja(float jamKerja){
        this.jamKerja = jamKerja;
    }

    private float getJamKerja(){
        return jamKerja;
    }

    manager(String nama, float gaji, int usia){
        setNama(nama);
        setGaji(gaji);
        setUsia(usia);
    }

    void infoManager(){
        System.out.println(
            "Nama : "+ getNama() + 
            "\nGaji : Rp."+ String.format("%,.0f",getGajiManager()) +
            "\nUmur : "+ getUsia() + "\n"
        );
    }
}
